import json
import os
import struct
import base64

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
INPUT_FILE = os.path.join(BASE_DIR, "参考文件", "assets", "epicdragonfight", "animmodels", "dragon.json")
OUTPUT_DIR = os.path.join(BASE_DIR, "src", "main", "java", "susen36", "epicdragonfight", "gameasset")

def read_json(filepath):
    with open(filepath, 'r', encoding='utf-8-sig') as f:
        return json.load(f)

def floats_to_base64(values):
    data = struct.pack(f'<{len(values)}f', *values)
    return base64.b64encode(data).decode('ascii')

def ints_to_base64(values):
    data = struct.pack(f'<{len(values)}i', *values)
    return base64.b64encode(data).decode('ascii')

def shorts_to_base64(values):
    data = struct.pack(f'<{len(values)}h', *values)
    return base64.b64encode(data).decode('ascii')

def bytes_to_base64(values):
    data = struct.pack(f'{len(values)}b', *values)
    return base64.b64encode(data).decode('ascii')

def split_base64(b64_str, line_len=76):
    lines = []
    for i in range(0, len(b64_str), line_len):
        lines.append(b64_str[i:i+line_len])
    return "\n        + ".join(f'"{line}"' for line in lines)

def write_file(filepath, content):
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(content)

def apply_correction(flat_data):
    M = [[flat_data[col * 4 + row] for col in range(4)] for row in range(4)]
    CT = [
        [1, 0,  0, 0],
        [0, 0, -1, 0],
        [0, 1,  0, 0],
        [0, 0,  0, 1]
    ]
    result = [[sum(M[i][k] * CT[k][j] for k in range(4)) for j in range(4)] for i in range(4)]
    flat_result = [0.0] * 16
    for row in range(4):
        for col in range(4):
            flat_result[col * 4 + row] = result[row][col]
    return flat_result

def correct_positions(positions):
    corrected = []
    for i in range(0, len(positions), 3):
        x, y, z = positions[i], positions[i + 1], positions[i + 2]
        corrected.extend([x, z, -y])
    return corrected

def correct_normals(normals_float):
    corrected = []
    for i in range(0, len(normals_float), 3):
        nx, ny, nz = normals_float[i], normals_float[i + 1], normals_float[i + 2]
        corrected.extend([nx, nz, -ny])
    return corrected

def generate_mesh_data_class(data):
    vertices = data["vertices"]
    positions = vertices["positions"]["array"]
    normals_float = vertices["normals"]["array"]
    uvs = vertices["uvs"]["array"]
    indices = vertices["indices"]["array"]
    vcounts = vertices["vcounts"]["array"]
    weights = vertices["weights"]["array"]
    vindices = vertices["vindices"]["array"]

    positions = correct_positions(positions)
    normals_float = correct_normals(normals_float)

    positions_b64 = floats_to_base64(positions)

    normals_byte = [round(v * 127.0) for v in normals_float]
    normals_byte = [max(-128, min(127, v)) for v in normals_byte]
    normals_b64 = bytes_to_base64(normals_byte)

    uvs_b64 = floats_to_base64(uvs)

    indices_short = [int(v) for v in indices]
    indices_b64 = shorts_to_base64(indices_short)

    joint_ids = [int(vindices[i * 2]) for i in range(len(vindices) // 2)]
    joint_ids_b64 = ints_to_base64(joint_ids)

    vertex_count = len(positions) // 3
    normal_count_float = len(normals_float) // 3
    index_count_tri = len(indices) // 3

    return f"""package susen36.epicdragonfight.gameasset;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.client.model.Mesh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Base64;

@OnlyIn(Dist.CLIENT)
public class DragonMeshData {{
    private static final int VERTEX_COUNT = {vertex_count};
    private static final int NORMAL_COUNT = {normal_count_float};
    private static final int TRIANGLE_COUNT = {index_count_tri};

    private static final String POSITIONS_B64 =
        {split_base64(positions_b64)};

    private static final String NORMALS_B64 =
        {split_base64(normals_b64)};

    private static final String UVS_B64 =
        {split_base64(uvs_b64)};

    private static final String INDICES_B64 =
        {split_base64(indices_b64)};

    private static final String JOINT_IDS_B64 =
        {split_base64(joint_ids_b64)};

    private static float[] decodeFloats(String b64) {{
        byte[] bytes = Base64.getDecoder().decode(b64.replace("\\n", ""));
        float[] result = new float[bytes.length / 4];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(result);
        return result;
    }}

    private static int[] decodeInts(String b64) {{
        byte[] bytes = Base64.getDecoder().decode(b64.replace("\\n", ""));
        int[] result = new int[bytes.length / 4];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get(result);
        return result;
    }}

    private static int[] decodeShortsToInts(String b64) {{
        byte[] bytes = Base64.getDecoder().decode(b64.replace("\\n", ""));
        int count = bytes.length / 2;
        int[] result = new int[count];
        java.nio.ShortBuffer sb = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        for (int i = 0; i < count; i++) {{
            result[i] = sb.get(i) & 0xFFFF;
        }}
        return result;
    }}

    private static float[] decodeNormalBytes(String b64) {{
        byte[] bytes = Base64.getDecoder().decode(b64.replace("\\n", ""));
        float[] result = new float[bytes.length];
        for (int i = 0; i < bytes.length; i++) {{
            result[i] = (float)(bytes[i] & 0xFF) / 127.0F;
            if (result[i] > 1.0F) result[i] -= 2.0F;
        }}
        return result;
    }}

    private static int[] expandVcounts() {{
        int[] vcounts = new int[VERTEX_COUNT];
        java.util.Arrays.fill(vcounts, 1);
        return vcounts;
    }}

    private static float[] expandWeights() {{
        float[] weights = new float[VERTEX_COUNT];
        java.util.Arrays.fill(weights, 1.0F);
        return weights;
    }}

    private static int[] expandAnimationIndices(int[] jointIds) {{
        int[] animationIndices = new int[jointIds.length * 2];
        for (int i = 0; i < jointIds.length; i++) {{
            animationIndices[i * 2] = jointIds[i];
            animationIndices[i * 2 + 1] = 0;
        }}
        return animationIndices;
    }}

    public static Mesh createMesh() {{
        float[] positionArray = decodeFloats(POSITIONS_B64);
        float[] normalArray = decodeNormalBytes(NORMALS_B64);
        int[] drawingIndices = decodeShortsToInts(INDICES_B64);
        int[] jointIds = decodeInts(JOINT_IDS_B64);
        int[] animationIndices = expandAnimationIndices(jointIds);

        return new Mesh(positionArray, normalArray, decodeFloats(UVS_B64), animationIndices, expandWeights(), drawingIndices, expandVcounts());
    }}
}}
"""

def generate_joint_builder(hierarchy, joint_names):
    lines = []

    def process_joint(joint_data, is_root=True):
        name = joint_data["name"]
        transform = joint_data["transform"]
        children = joint_data.get("children", [])

        padded = transform + [0.0, 0.0, 0.0, 1.0] if len(transform) < 16 else transform

        if is_root:
            padded = apply_correction(padded)

        transform_str = ", ".join(f"{v}F" for v in padded)

        index = joint_names.index(name) if name in joint_names else -1

        method_name = name.title().replace("_", "")
        lines.append(f"    private static Joint build{method_name}(Map<String, Joint> jointMap) {{")
        lines.append(f"        float[] transform = new float[]{{{transform_str}}};")
        lines.append(f"        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));")
        lines.append(f"        localMatrix.transpose();")
        lines.append(f"        Joint joint = new Joint(\"{name}\", {index}, localMatrix);")
        lines.append(f"        jointMap.put(\"{name}\", joint);")

        for child in children:
            child_name = child["name"]
            child_method = f"build{child_name.title().replace('_', '')}"
            lines.append(f"        joint.addSubJoint({child_method}(jointMap));")

        lines.append(f"        return joint;")
        lines.append(f"    }}")
        lines.append(f"")

        for child in children:
            process_joint(child, is_root=False)

    process_joint(hierarchy, is_root=True)
    return "\n".join(lines)

def generate_model_data_class(data):
    armature = data["armature"]
    joints = armature["joints"]
    hierarchy = armature["hierarchy"][0]

    joint_builder_code = generate_joint_builder(hierarchy, joints)

    return f"""package susen36.epicdragonfight.gameasset;

import com.google.common.collect.Maps;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.Joint;
import susen36.epicdragonfight.api.client.model.Mesh;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.nio.FloatBuffer;
import java.util.Map;

public class DragonModelData {{

    public static Armature createArmature() {{
        Map<String, Joint> jointMap = Maps.newHashMap();
        Joint rootJoint = buildRoot(jointMap);
        rootJoint.setInversedModelTransform(new OpenMatrix4f());
        return new Armature(jointMap.size(), rootJoint, jointMap);
    }}

    @OnlyIn(Dist.CLIENT)
    public static Mesh createMesh() {{
        return DragonMeshData.createMesh();
    }}

{joint_builder_code}}}
"""

def main():
    data = read_json(INPUT_FILE)

    vertices = data["vertices"]
    positions = vertices["positions"]["array"]
    normals_float = vertices["normals"]["array"]
    uvs = vertices["uvs"]["array"]
    indices = vertices["indices"]["array"]
    vcounts = vertices["vcounts"]["array"]
    weights = vertices["weights"]["array"]
    vindices = vertices["vindices"]["array"]

    joint_ids = [int(vindices[i * 2]) for i in range(len(vindices) // 2)]
    normals_byte = [round(v * 127.0) for v in normals_float]
    indices_short = [int(v) for v in indices]

    raw_positions = len(positions) * 4
    raw_normals_orig = len(normals_float) * 4
    raw_normals_new = len(normals_byte)
    raw_uvs = len(uvs) * 4
    raw_indices_orig = len(indices) * 4
    raw_indices_new = len(indices_short) * 2
    raw_vcounts_orig = len(vcounts) * 4
    raw_vcounts_new = 0
    raw_weights_orig = len(weights) * 4
    raw_weights_new = 0
    raw_vindices_orig = len(vindices) * 4
    raw_vindices_new = len(joint_ids) * 4

    total_orig = raw_positions + raw_normals_orig + raw_uvs + raw_indices_orig + raw_vcounts_orig + raw_weights_orig + raw_vindices_orig
    total_new = raw_positions + raw_normals_new + raw_uvs + raw_indices_new + raw_vcounts_new + raw_weights_new + raw_vindices_new

    print(f"=== Raw byte comparison ===")
    print(f"  positions: {raw_positions} (unchanged)")
    print(f"  normals:   {raw_normals_orig} -> {raw_normals_new}  (byte vs float)")
    print(f"  uvs:       {raw_uvs} (unchanged)")
    print(f"  indices:   {raw_indices_orig} -> {raw_indices_new}  (short vs int)")
    print(f"  vcounts:   {raw_vcounts_orig} -> {raw_vcounts_new}  (runtime generated)")
    print(f"  weights:   {raw_weights_orig} -> {raw_weights_new}  (runtime generated)")
    print(f"  vindices:  {raw_vindices_orig} -> {raw_vindices_new}  (jointId only)")
    print(f"  TOTAL:     {total_orig} -> {total_new}  ({100 - total_new * 100 // total_orig}% saved)")

    write_file(os.path.join(OUTPUT_DIR, "DragonMeshData.java"), generate_mesh_data_class(data))
    write_file(os.path.join(OUTPUT_DIR, "DragonModelData.java"), generate_model_data_class(data))

    print(f"\nGenerated 2 files in {OUTPUT_DIR}")

if __name__ == "__main__":
    main()
