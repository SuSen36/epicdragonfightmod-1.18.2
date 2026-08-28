import json
import math
import os

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
ANIM_DIR = os.path.join(BASE_DIR, "参考文件", "assets", "epicdragonfight", "animmodels", "animations")
OUTPUT_FILE = os.path.join(BASE_DIR, "src", "main", "java", "susen36", "epicdragonfight", "gameasset", "DragonAnimationData.java")

# 骨骼层级：每个骨骼到其父骨骼的映射，root 无父骨骼
BONE_PARENT = {
    "root": None,
    "right_hind_leg": "root",
    "right_hind_leg_tip": "right_hind_leg",
    "right_hind_foot": "right_hind_leg_tip",
    "left_hind_leg": "root",
    "left_hind_leg_tip": "left_hind_leg",
    "left_hind_foot": "left_hind_leg_tip",
    "body": "root",
    "neck_tail_1": "body",
    "neck_tail_2": "neck_tail_1",
    "neck_tail_3": "neck_tail_2",
    "neck_tail_4": "neck_tail_3",
    "neck_tail_5": "neck_tail_4",
    "neck_tail_6": "neck_tail_5",
    "neck_tail_7": "neck_tail_6",
    "neck_tail_8": "neck_tail_7",
    "neck_tail_9": "neck_tail_8",
    "neck_tail_10": "neck_tail_9",
    "neck_tail_11": "neck_tail_10",
    "neck_tail_12": "neck_tail_11",
    "right_front_leg": "body",
    "right_front_leg_tip": "right_front_leg",
    "right_front_foot": "right_front_leg_tip",
    "left_front_leg": "body",
    "left_front_leg_tip": "left_front_leg",
    "left_front_foot": "left_front_leg_tip",
    "right_wing": "body",
    "right_wing_tip": "right_wing",
    "left_wing": "body",
    "left_wing_tip": "left_wing",
    "neck": "body",
    "neck2": "neck",
    "neck3": "neck2",
    "neck4": "neck3",
    "neck5": "neck4",
    "head": "neck5",
    "upperJaw": "head",
    "jaw": "head",
}

def read_json(filepath):
    with open(filepath, 'r', encoding='utf-8-sig') as f:
        return json.load(f)

def to_camel_case(snake_str):
    components = snake_str.split('_')
    return ''.join(x.title() for x in components)

# ---------------------------------------------------------------------------
# 4x4 矩阵工具（列优先）
# ---------------------------------------------------------------------------

def flat_to_mat4(flat):
    """16 元素列优先数组 → 4x4 行优先列表"""
    return [[flat[col * 4 + row] for col in range(4)] for row in range(4)]

def mat4_to_flat(mat):
    """4x4 行优先列表 → 16 元素列优先数组"""
    flat = [0.0] * 16
    for row in range(4):
        for col in range(4):
            flat[col * 4 + row] = mat[row][col]
    return flat

def mat4_mul(a, b):
    """4x4 矩阵乘法 result = a * b"""
    return [[sum(a[i][k] * b[k][j] for k in range(4)) for j in range(4)] for i in range(4)]

def mat4_invert(mat):
    """高斯-约当消元法求 4x4 逆矩阵"""
    n = 4
    aug = [row[:] + [1.0 if i == j else 0.0 for j in range(n)] for i, row in enumerate(mat)]
    for col in range(n):
        pivot_row = max(range(col, n), key=lambda r: abs(aug[r][col]))
        if abs(aug[pivot_row][col]) < 1e-12:
            raise ValueError("Matrix is not invertible")
        aug[col], aug[pivot_row] = aug[pivot_row], aug[col]
        pivot = aug[col][col]
        for j in range(2 * n):
            aug[col][j] /= pivot
        for row in range(n):
            if row != col:
                factor = aug[row][col]
                for j in range(2 * n):
                    aug[row][j] -= factor * aug[col][j]
    return [row[n:] for row in aug]

def apply_correction(flat_data):
    """Blender Z-up → Minecraft Y-up 坐标系修正：M * CT"""
    M = flat_to_mat4(flat_data)
    CT = [
        [1, 0,  0, 0],
        [0, 0, -1, 0],
        [0, 1,  0, 0],
        [0, 0,  0, 1]
    ]
    result = mat4_mul(M, CT)
    return mat4_to_flat(result)

# ---------------------------------------------------------------------------
# 矩阵分解/合成（用于插值）
# ---------------------------------------------------------------------------

def mat4_to_trs(mat):
    """4x4 矩阵 → (translation, quaternion(wxyz), scale)"""
    tx, ty, tz = mat[0][3], mat[1][3], mat[2][3]

    sx = math.sqrt(mat[0][0] ** 2 + mat[1][0] ** 2 + mat[2][0] ** 2)
    sy = math.sqrt(mat[0][1] ** 2 + mat[1][1] ** 2 + mat[2][1] ** 2)
    sz = math.sqrt(mat[0][2] ** 2 + mat[1][2] ** 2 + mat[2][2] ** 2)

    # 避免除零
    sx = sx if sx > 1e-12 else 1.0
    sy = sy if sy > 1e-12 else 1.0
    sz = sz if sz > 1e-12 else 1.0

    rot = [[mat[0][0] / sx, mat[0][1] / sy, mat[0][2] / sz],
           [mat[1][0] / sx, mat[1][1] / sy, mat[1][2] / sz],
           [mat[2][0] / sx, mat[2][1] / sy, mat[2][2] / sz]]

    trace = rot[0][0] + rot[1][1] + rot[2][2]
    if trace > 0:
        s = 0.5 / math.sqrt(trace + 1.0)
        w = 0.25 / s
        x = (rot[2][1] - rot[1][2]) * s
        y = (rot[0][2] - rot[2][0]) * s
        z = (rot[1][0] - rot[0][1]) * s
    elif rot[0][0] > rot[1][1] and rot[0][0] > rot[2][2]:
        s = 2.0 * math.sqrt(1.0 + rot[0][0] - rot[1][1] - rot[2][2])
        w = (rot[2][1] - rot[1][2]) / s
        x = 0.25 * s
        y = (rot[0][1] + rot[1][0]) / s
        z = (rot[0][2] + rot[2][0]) / s
    elif rot[1][1] > rot[2][2]:
        s = 2.0 * math.sqrt(1.0 + rot[1][1] - rot[0][0] - rot[2][2])
        w = (rot[0][2] - rot[2][0]) / s
        x = (rot[0][1] + rot[1][0]) / s
        y = 0.25 * s
        z = (rot[1][2] + rot[2][1]) / s
    else:
        s = 2.0 * math.sqrt(1.0 + rot[2][2] - rot[0][0] - rot[1][1])
        w = (rot[1][0] - rot[0][1]) / s
        x = (rot[0][2] + rot[2][0]) / s
        y = (rot[1][2] + rot[2][1]) / s
        z = 0.25 * s

    return (tx, ty, tz), (w, x, y, z), (sx, sy, sz)


def trs_to_mat4(translation, quaternion, scale):
    """(translation, quaternion(wxyz), scale) → 4x4 矩阵"""
    tx, ty, tz = translation
    w, x, y, z = quaternion
    sx, sy, sz = scale

    xx = x * x; yy = y * y; zz = z * z
    xy = x * y; xz = x * z; yz = y * z
    wx = w * x; wy = w * y; wz = w * z

    rot = [
        [1 - 2 * (yy + zz), 2 * (xy - wz), 2 * (xz + wy), 0],
        [2 * (xy + wz), 1 - 2 * (xx + zz), 2 * (yz - wx), 0],
        [2 * (xz - wy), 2 * (yz + wx), 1 - 2 * (xx + yy), 0],
        [0, 0, 0, 1]
    ]

    # 应用缩放
    for i in range(3):
        for j in range(3):
            rot[i][j] *= [sx, sy, sz][j]

    # 设置平移
    rot[0][3] = tx
    rot[1][3] = ty
    rot[2][3] = tz

    return rot


def lerp_vec3(a, b, t):
    return (a[0] + (b[0] - a[0]) * t,
            a[1] + (b[1] - a[1]) * t,
            a[2] + (b[2] - a[2]) * t)


def nlerp_quat(a, b, t):
    """归一化线性插值四元数，确保最短路径"""
    w1, x1, y1, z1 = a
    w2, x2, y2, z2 = b

    dot = w1 * w2 + x1 * x2 + y1 * y2 + z1 * z2
    if dot < 0:
        w2, x2, y2, z2 = -w2, -x2, -y2, -z2

    rw = w1 + (w2 - w1) * t
    rx = x1 + (x2 - x1) * t
    ry = y1 + (y2 - y1) * t
    rz = z1 + (z2 - z1) * t

    length = math.sqrt(rw * rw + rx * rx + ry * ry + rz * rz)
    if length > 1e-12:
        rw /= length; rx /= length; ry /= length; rz /= length
    return (rw, rx, ry, rz)


def interpolate_matrix(times, matrices, target_time):
    """在指定时间点插值出矩阵（线性插值 TRS）"""
    if target_time <= times[0]:
        return matrices[0]
    if target_time >= times[-1]:
        return matrices[-1]

    for i in range(len(times) - 1):
        if times[i] <= target_time <= times[i + 1]:
            t_range = times[i + 1] - times[i]
            if t_range < 1e-12:
                return matrices[i]
            frac = (target_time - times[i]) / t_range

            t1, q1, s1 = mat4_to_trs(flat_to_mat4(matrices[i]))
            t2, q2, s2 = mat4_to_trs(flat_to_mat4(matrices[i + 1]))

            t_interp = lerp_vec3(t1, t2, frac)
            q_interp = nlerp_quat(q1, q2, frac)
            s_interp = lerp_vec3(s1, s2, frac)

            result_mat = trs_to_mat4(t_interp, q_interp, s_interp)
            return mat4_to_flat(result_mat)

    return matrices[-1]


def strip_parent_transform(child_times, child_mats, parent_times, parent_mats):
    """
    对子骨骼每个关键帧，剥离父骨骼变换：
      child_local[t] = inv(parent[t]) * child_raw[t]
    返回新的局部空间矩阵列表。
    """
    result = []
    for i, t in enumerate(child_times):
        parent_mat = interpolate_matrix(parent_times, parent_mats, t)
        parent_mat4 = flat_to_mat4(parent_mat)
        inv_parent = mat4_invert(parent_mat4)

        child_mat4 = flat_to_mat4(child_mats[i])
        local_mat4 = mat4_mul(inv_parent, child_mat4)

        result.append(mat4_to_flat(local_mat4))
    return result


# ---------------------------------------------------------------------------
# 动画转换主函数
# ---------------------------------------------------------------------------

def convert_animation(anim_name, anim_data):
    joints = anim_data["animation"]
    lines = []

    method_name = to_camel_case(anim_name)
    lines.append(f"    public static void load{method_name}(StaticAnimation animation) {{")
    lines.append(f"        Armature armature = animation.getModel().getArmature();")
    lines.append(f"")

    # 第 1 步：收集所有骨骼的原始数据（补齐到 16 元素）
    raw_bone_data = {}
    for joint_data in joints:
        name = joint_data["name"]
        times = joint_data["time"]
        transforms = []
        for transform in joint_data["transform"]:
            padded = transform + [0.0, 0.0, 0.0, 1.0] if len(transform) < 16 else transform
            transforms.append(padded)
        raw_bone_data[name] = {"times": times, "mats": transforms}

    # 第 2 步：对所有骨骼应用坐标系修正（Blender → Minecraft）
    corrected_data = {}
    for name, data in raw_bone_data.items():
        corrected_mats = [apply_correction(mat) for mat in data["mats"]]
        corrected_data[name] = {"times": data["times"], "mats": corrected_mats}

    # 第 3 步：对非 root 骨骼剥离父变换
    final_data = {}
    for name, data in corrected_data.items():
        parent = BONE_PARENT.get(name)
        if parent is None or parent not in corrected_data:
            final_data[name] = data
        else:
            parent_data = corrected_data[parent]
            stripped_mats = strip_parent_transform(
                data["times"], data["mats"],
                parent_data["times"], parent_data["mats"]
            )
            final_data[name] = {"times": data["times"], "mats": stripped_mats}

    # 第 4 步：生成 Java 代码
    for joint_data in joints:
        joint_name = joint_data["name"]
        final = final_data[joint_name]
        times = final["times"]
        transforms = final["mats"]

        safe_joint = joint_name.replace(" ", "_")
        times_var = f"{method_name}_{safe_joint}_times"
        transforms_var = f"{method_name}_{safe_joint}_transforms"

        lines.append(f"        {{")
        lines.append(f"            float[] {times_var} = {{")
        times_str = ", ".join(f"{t}F" for t in times)
        lines.append(f"                {times_str}")
        lines.append(f"            }};")
        lines.append(f"")

        lines.append(f"            float[] {transforms_var} = new float[]{{")
        for mat in transforms:
            mat_str = ", ".join(f"{v}F" for v in mat)
            lines.append(f"                {mat_str},")
        lines.append(f"            }};")
        lines.append(f"")

        lines.append(f"            Joint joint = armature.searchJointByName(\"{joint_name}\");")
        lines.append(f"            if (joint == null) {{")
        lines.append(f"                throw new IllegalArgumentException(\"[EpicDragonFight] Can't find the joint {joint_name} in animation data \" + animation);")
        lines.append(f"            }}")
        lines.append(f"            TransformSheet sheet = getTransformSheet({times_var}, {transforms_var}, OpenMatrix4f.invert(joint.getLocalTrasnform(), null));")
        lines.append(f"            animation.addSheet(\"{joint_name}\", sheet);")
        lines.append(f"            animation.setTotalTime({times_var}[{times_var}.length - 1]);")
        lines.append(f"        }}")
        lines.append(f"")

    lines.append(f"    }}")
    return "\n".join(lines)


def main():
    anim_files = sorted([f for f in os.listdir(ANIM_DIR) if f.endswith('.json')])

    all_methods = []
    anim_names = []

    for anim_file in anim_files:
        anim_name = anim_file.replace('.json', '')
        filepath = os.path.join(ANIM_DIR, anim_file)
        print(f"Converting: {anim_file}")

        anim_data = read_json(filepath)
        method_code = convert_animation(anim_name, anim_data)
        all_methods.append(method_code)
        anim_names.append(anim_name)

    load_by_name_cases = []
    for anim_name in anim_names:
        method_name = to_camel_case(anim_name)
        load_by_name_cases.append(f'            case "{anim_name}": load{method_name}(animation); break;')

    java_code = f"""package susen36.epicdragonfight.gameasset;

import susen36.epicdragonfight.api.animation.Joint;
import susen36.epicdragonfight.api.animation.JointTransform;
import susen36.epicdragonfight.api.animation.Keyframe;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

public class DragonAnimationData {{

{chr(10).join(all_methods)}
    public static void loadByName(String name, StaticAnimation animation) {{
        switch (name) {{
{chr(10).join(load_by_name_cases)}
            default: throw new IllegalArgumentException("[EpicDragonFight] Unknown animation: " + name);
        }}
    }}

    private static TransformSheet getTransformSheet(float[] times, float[] transformMatrix, OpenMatrix4f invLocalTransform) {{
        List<Keyframe> keyframeList = new ArrayList<>();

        for (int i = 0; i < times.length; i++) {{
            float timeStamp = times[i];
            if (timeStamp < 0) {{
                continue;
            }}

            float[] matrixElements = new float[16];
            System.arraycopy(transformMatrix, i * 16, matrixElements, 0, 16);

            OpenMatrix4f matrix = new OpenMatrix4f().load(FloatBuffer.wrap(matrixElements));
            matrix.transpose();

            matrix.mulFront(invLocalTransform);

            JointTransform transform = new JointTransform(matrix.toTranslationVector(), matrix.toQuaternion(), matrix.toScaleVector());
            keyframeList.add(new Keyframe(timeStamp, transform));
        }}

        return new TransformSheet(keyframeList);
    }}
}}"""

    with open(OUTPUT_FILE, 'w', encoding='utf-8') as f:
        f.write(java_code)

    print(f"\nGenerated: {OUTPUT_FILE}")
    print(f"Total animations converted: {len(anim_names)}")
    for name in anim_names:
        method_name = to_camel_case(name)
        print(f"  {name} -> load{method_name}()")


if __name__ == "__main__":
    main()