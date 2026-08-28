#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
将 DragonAnimationData.java 的 addSheet() 4x4 矩阵格式自动转换为原版
Minecraft AnimationDefinition 关键帧动画数据类。

转换要点：
- addSheet("jointName", getTransformSheet(tVar, dVar, ...)) 中的 4x4 矩阵
  (16 floats per frame, row-major, 标准未转置矩阵) 分解为 translation + rotation (Euler 度)
- 原始矩阵 M 是含 bind pose 的局部总变换，而原版 ModelPart 的默认姿势是
  rest pose（零旋转，如翅膀直接横向建模），因此必须先左乘 bind pose 的逆：
  delta = invBind @ M，与 Epic Fight getTransformSheet 的净效果一致
- 关节名 -> EnderDragonModel ModelPart 名映射
- upperJaw 在原版模型中无对应 part，直接丢弃
- 平移使用 posVec (tx, ty, tz)，行优先索引 mat[3], mat[7], mat[11]
- 旋转使用 degreeVec (度转弧度)，行优先索引 3x3 子矩阵（标准读取）
- 使用 LINEAR 插值
"""
import os
import re
import math

SRC = os.path.join(os.path.dirname(__file__), "..", "src", "main", "java",
                   "susen36", "epicdragonfight", "gameasset", "DragonAnimationData.java")
MODEL_DATA = os.path.join(os.path.dirname(__file__), "..", "src", "main", "java",
                          "susen36", "epicdragonfight", "gameasset", "DragonModelData.java")
OUT = os.path.join(os.path.dirname(__file__), "..", "src", "main", "java",
                   "susen36", "epicdragonfight", "gameasset", "DragonAnimKeyFrames.java")

# armature 关节 -> EnderDragonModel ModelPart 名称映射
BONE_MAP = {
    "root": "root",
    "body": "body",
    "neck": "neck1", "neck2": "neck2", "neck3": "neck3", "neck4": "neck4", "neck5": "neck5",
    "head": "head",
    "jaw": "jaw",
    # upperJaw 无对应 model part, 不列入映射(生成时丢弃)
    "left_wing": "left_wing", "left_wing_tip": "left_wing_tip",
    "right_wing": "right_wing", "right_wing_tip": "right_wing_tip",
    "left_front_leg": "front_left_leg", "left_front_leg_tip": "front_left_shin", "left_front_foot": "front_left_foot",
    "right_front_leg": "front_right_leg", "right_front_leg_tip": "front_right_shin", "right_front_foot": "front_right_foot",
    "left_hind_leg": "back_left_leg", "left_hind_leg_tip": "back_left_shin", "left_hind_foot": "back_left_foot",
    "right_hind_leg": "back_right_leg", "right_hind_leg_tip": "back_right_shin", "right_hind_foot": "back_right_foot",
}
for _i in range(1, 13):
    BONE_MAP["neck_tail_%d" % _i] = "tail%d" % _i

# 需要循环播放的动画
LOOPING = {"idle", "fly", "walk"}


def parse_arrays(method_body):
    """解析 float[] var = { ... }; / float[] var = new float[]{ ... }; 得到 var->数值列表"""
    arrays = {}
    pattern = re.compile(r'float\[\]\s+(\w+)\s*=\s*(?:new\s+float\[\])?\s*\{([^}]*)\};')
    for m in pattern.finditer(method_body):
        name = m.group(1)
        vals = []
        for tok in m.group(2).split(","):
            tok = tok.strip()
            if not tok:
                continue
            tok = tok.rstrip("fF")
            vals.append(float(tok))
        arrays[name] = vals
    return arrays


def parse_methods(content):
    """按 loadXxx 方法块切分，返回 [(方法名, 方法体)]"""
    methods = []
    pat = re.compile(r'public static void (load\w+)\(StaticAnimation animation\) \{')
    for m in pat.finditer(content):
        name = m.group(1)
        start = m.end() - 1  # 指向 '{'
        depth = 0
        i = start
        while i < len(content):
            c = content[i]
            if c == '{':
                depth += 1
            elif c == '}':
                depth -= 1
                if depth == 0:
                    break
            i += 1
        methods.append((name, content[start:i + 1]))
    return methods


def parse_bind_poses(model_data_content):
    """解析 DragonModelData.java 中各关节的 bind pose 16 float 行优先矩阵"""
    binds = {}
    pat = re.compile(r'new float\[\]\{([^}]+)\}.*?Joint\("(\w+)"', re.DOTALL)
    for m in pat.finditer(model_data_content):
        vals = []
        for tok in m.group(1).split(","):
            tok = tok.strip()
            if tok:
                vals.append(float(tok.rstrip("fF")))
        if len(vals) == 16:
            binds[m.group(2)] = vals
        else:
            print("  [warn] bind pose %s 元素数 %d != 16" % (m.group(2), len(vals)))
    return binds


def invert_rigid(mat):
    """行优先4x4刚体矩阵（旋转部分正交）的解析逆，避免通用求逆的数值开销"""
    t = (mat[3], mat[7], mat[11])
    out = [0.0] * 16
    # 转置旋转块：Rt[i][j] = R[j][i]
    rt = ((mat[0], mat[4], mat[8]),
          (mat[1], mat[5], mat[9]),
          (mat[2], mat[6], mat[10]))
    out[0], out[1], out[2] = rt[0]
    out[4], out[5], out[6] = rt[1]
    out[8], out[9], out[10] = rt[2]
    out[3] = -(rt[0][0] * t[0] + rt[0][1] * t[1] + rt[0][2] * t[2])
    out[7] = -(rt[1][0] * t[0] + rt[1][1] * t[1] + rt[1][2] * t[2])
    out[11] = -(rt[2][0] * t[0] + rt[2][1] * t[1] + rt[2][2] * t[2])
    out[15] = 1.0
    return out


def mat4_mul(a, b):
    """标准行优先4x4乘法 a @ b"""
    out = [0.0] * 16
    for i in range(4):
        for j in range(4):
            s = 0.0
            for k in range(4):
                s += a[i * 4 + k] * b[k * 4 + j]
            out[i * 4 + j] = s
    return out


def camel_to_snake(s):
    """CamelCase -> snake_case, e.g. BackjumpMove -> backjump_move, Attack1 -> attack1"""
    result = []
    for i, c in enumerate(s):
        if c.isupper() and i > 0:
            prev = s[i - 1]
            if prev.islower() or (prev.isdigit() and i + 1 < len(s) and s[i + 1].islower()):
                result.append('_')
            elif prev.isupper() and (i + 1 >= len(s) or s[i + 1].islower()):
                result.append('_')
        result.append(c.lower())
    return ''.join(result)


def snake_to_camel(s):
    """snake_case -> camelCase, e.g. backjump_move -> backJumpMove, idle -> idle"""
    parts = s.split('_')
    return parts[0] + ''.join(p.capitalize() for p in parts[1:])


def fmt(v):
    """Java float 字面量，保留 6 位小数"""
    if isinstance(v, float):
        rounded = round(v, 6)
        # 处理 -0.0 → 0.0
        if rounded == 0.0:
            return "0.0F"
        return "%rF" % rounded
    return str(v)


def extract_euler_xyz(mat):
    """
    从 4x4 行优先标准矩阵的 16 元素数组中提取 XYZ 欧拉角(度)。
    基于标准（非转置）矩阵直接提取：
      Row 0: mat[0..3], Row 1: mat[4..7], Row 2: mat[8..11], Row 3: mat[12..15]
    Minecraft ModelPart 的旋转顺序是 Z->Y->X，即 R = Rz * Ry * Rx。
    标准旋转矩阵 R 的对应元素为：
      R[2][0] = mat[8] = -sin(y)
      R[2][1] = mat[9] = sin(x)cos(y)
      R[2][2] = mat[10] = cos(x)cos(y)
      R[1][0] = mat[4] = sin(z)cos(y)
      R[0][0] = mat[0] = cos(z)cos(y)
    返回 (rx, ry, rz) 角度制
    """
    # 归一化列向量以消除缩放影响 (M = R * S, 缩放提取自列的模长)
    col0_len = math.sqrt(mat[0]*mat[0] + mat[4]*mat[4] + mat[8]*mat[8])
    col1_len = math.sqrt(mat[1]*mat[1] + mat[5]*mat[5] + mat[9]*mat[9])
    col2_len = math.sqrt(mat[2]*mat[2] + mat[6]*mat[6] + mat[10]*mat[10])

    # 提取第一列需要的元素
    if col0_len > 1e-12:
        n00 = mat[0] / col0_len
        n10 = mat[4] / col0_len
        n20 = mat[8] / col0_len
    else:
        n00, n10, n20 = 1.0, 0.0, 0.0

    # 提取第二列需要的元素
    if col1_len > 1e-12:
        n21 = mat[9] / col1_len
    else:
        n21 = 0.0

    # 提取第三列需要的元素
    if col2_len > 1e-12:
        n22 = mat[10] / col2_len
    else:
        n22 = 1.0

    # 从 R 提取欧拉角 (R = Rz * Ry * Rx)
    # R[2][0] = -sin(y) → sin(y) = -R[2][0]
    sy = -n20
    sy = max(-1.0, min(1.0, sy))
    ry = math.asin(sy)  # yaw (Y轴)

    eps = 1e-6
    if abs(math.cos(ry)) > eps:
        # R[2][1] / R[2][2] = (sin(x)cos(y)) / (cos(x)cos(y)) = tan(x)
        rx = math.atan2(n21, n22)  # pitch (X轴)
        # R[1][0] / R[0][0] = (sin(z)cos(y)) / (cos(z)cos(y)) = tan(z)
        rz = math.atan2(n10, n00)  # roll (Z轴)
    else:
        # 万向锁 (Gimbal lock: cos(y) ≈ 0)
        rx = 0.0
        rz = 0.0

    # 弧度转度
    rx_deg = math.degrees(rx)
    ry_deg = math.degrees(ry)
    rz_deg = math.degrees(rz)

    return (rx_deg, ry_deg, rz_deg)


def extract_translation(mat):
    """
    从 4x4 行优先矩阵中提取平移。
    Epic Fight 的 OpenMatrix4f 使用行优先存储:
      Row 0: mat[0..3], Row 1: mat[4..7], Row 2: mat[8..11], Row 3: mat[12..15]
    平移位于第 4 列: Row 0 col 3, Row 1 col 3, Row 2 col 3
    mat: 16 个 float 的行优先矩阵
    返回 (tx, ty, tz)
    """
    # 行优先: 平移在每行的第 4 个元素
    return (mat[3], mat[7], mat[11])


def gen_animation(method_name, body, arrays, bind_poses):
    """返回 (动画内部名, AnimationDefinition 数据 或 None)"""
    method_name_no_load = method_name[len("load"):]  # loadIdle -> Idle
    anim_key = camel_to_snake(method_name_no_load)  # Idle -> idle, BackjumpMove -> backjump_move

    # 匹配 addSheet("jointName", getTransformSheet(tVar, dVar, ...))
    joints = []
    pat = re.compile(
        r'animation\.addSheet\("([^"]+)",\s*getTransformSheet\((\w+),\s*(\w+),'
    )
    for m in pat.finditer(body):
        joints.append((m.group(1), m.group(2), m.group(3)))

    # 每个 part 收集 pos/rot 关键帧(仅非负时间)
    pos_kf = {}   # part -> [(t, (x,y,z))]
    rot_kf = {}   # part -> [(t, (rx,ry,rz))]
    max_time = 0.0

    for bone, tv, dv in joints:
        part = BONE_MAP.get(bone)
        if part is None:
            continue  # upperJaw 等无对应 part, 丢弃
        times = arrays.get(tv)
        if times is None:
            print("  [warn] 未找到 time array %s in %s" % (tv, method_name))
            continue
        data = arrays.get(dv)
        if data is None:
            print("  [warn] 未找到 data array %s in %s" % (dv, method_name))
            continue

        # 确定步长: 16 或 15 元素
        stride = 16
        if len(data) % 15 == 0 and len(data) % 16 != 0:
            stride = 15

        for i, t in enumerate(times):
            if t < 0:
                continue
            off = i * stride
            if off + 16 > len(data):
                break

            # 补齐到 16 元素
            mat = list(data[off:off + stride])
            if stride == 15:
                mat.append(1.0)

            # delta = invBind @ M，扣除 bind pose 得到相对 rest pose 的增量
            bind = bind_poses.get(bone)
            if bind is not None:
                mat = mat4_mul(invert_rigid(bind), mat)
            else:
                print("  [warn] %s: 关节 %s 无 bind pose，按原始矩阵处理" % (method_name, bone))

            # 提取平移和旋转
            tx, ty, tz = extract_translation(mat)
            rx, ry, rz = extract_euler_xyz(mat)

            pos_kf.setdefault(part, []).append((t, (tx, ty, tz)))
            rot_kf.setdefault(part, []).append((t, (rx, ry, rz)))
            if t > max_time:
                max_time = t

    if not pos_kf:
        return anim_key, None

    build_method = "build" + snake_to_camel(anim_key)[:1].upper() + snake_to_camel(anim_key)[1:]
    lines = []
    lines.append("	private static final AnimationDefinition DRAGON_%s =" % anim_key.upper())
    lines.append("			%s();" % build_method)
    lines.append("")
    return anim_key, (pos_kf, rot_kf, max_time, lines)


def main():
    with open(SRC, "r", encoding="utf-8") as f:
        content = f.read()

    methods = parse_methods(content)
    if not methods:
        raise SystemExit("[error] 未解析到 load 方法")

    with open(MODEL_DATA, "r", encoding="utf-8") as f:
        bind_poses = parse_bind_poses(f.read())
    print("[ok] 解析到 %d 个关节的 bind pose" % len(bind_poses))

    block_map = {}
    for name, body in methods:
        if name == "loadByName":
            continue  # 跳过调度方法
        arrays = parse_arrays(body)
        key, data = gen_animation(name, body, arrays, bind_poses)
        if data is not None:
            block_map[key] = data
            print("  [ok] %s -> %s (%d parts, %.3f sec)" % (name, key, len(data[0]), data[2]))
        else:
            print("  [skip] %s -> %s (no position keyframes)" % (name, key))

    if not block_map:
        raise SystemExit("[error] 未生成任何动画")

    out = []
    out.append("package susen36.epicdragonfight.gameasset;")
    out.append("")
    out.append("import net.minecraft.client.animation.AnimationChannel;")
    out.append("import net.minecraft.client.animation.AnimationDefinition;")
    out.append("import net.minecraft.client.animation.Keyframe;")
    out.append("import net.minecraft.client.animation.KeyframeAnimations;")
    out.append("import net.minecraftforge.api.distmarker.Dist;")
    out.append("import net.minecraftforge.api.distmarker.OnlyIn;")
    out.append("")
    out.append("@OnlyIn(Dist.CLIENT)")
    out.append("public class DragonAnimKeyFrames {")
    out.append("")

    # 字段声明
    for key in block_map:
        for decl_line in block_map[key][3]:
            out.append(decl_line)
    out.append("	")

    # build 方法
    for key, (pos_kf, rot_kf, length, _decl) in block_map.items():
        looping = key.lower() in LOOPING
        build_method = "build" + snake_to_camel(key)[:1].upper() + snake_to_camel(key)[1:]
        out.append("	private static AnimationDefinition %s() {" % build_method)
        out.append("		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(%s);" % fmt(round(length, 6)))
        for part in sorted(pos_kf.keys()):
            # POSITION 通道
            out.append("		builder.addAnimation(\"%s\", new AnimationChannel(AnimationChannel.Targets.POSITION," % part)
            kf_lines = [("				new Keyframe(%s, KeyframeAnimations.posVec(%s, %s, %s), AnimationChannel.Interpolations.LINEAR)" % (
                fmt(t), fmt(tx), fmt(ty), fmt(tz))) for t, (tx, ty, tz) in pos_kf[part]]
            out.append(",\n".join(kf_lines))
            out.append("		));")
            # ROTATION 通道(度 -> 弧度)
            out.append("		builder.addAnimation(\"%s\", new AnimationChannel(AnimationChannel.Targets.ROTATION," % part)
            kf_lines = [("				new Keyframe(%s, KeyframeAnimations.degreeVec(%s, %s, %s), AnimationChannel.Interpolations.LINEAR)" % (
                fmt(t), fmt(rx), fmt(ry), fmt(rz))) for t, (rx, ry, rz) in rot_kf[part]]
            out.append(",\n".join(kf_lines))
            out.append("		));")
        if looping:
            out.append("		builder.looping();")
        out.append("		return builder.build();")
        out.append("	}")
        out.append("")

    # 按名称查找
    out.append("	public static AnimationDefinition get(String animationName) {")
    out.append("		switch (animationName) {")
    for key in block_map:
        out.append("			case \"%s\": return DRAGON_%s;" % (key.lower(), key.upper()))
    out.append("			default: throw new IllegalArgumentException(\"[EpicDragonFight] Unknown animation: \" + animationName);")
    out.append("		}")
    out.append("	}")
    out.append("}")

    out_path = os.path.abspath(OUT)
    with open(out_path, "w", encoding="utf-8", newline="") as f:
        f.write("\n".join(out))
    print("\n[ok] 已生成 %s (%d 个动画)" % (out_path, len(block_map)))


if __name__ == "__main__":
    main()