import json
import os
import struct
import base64

BASE_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
INPUT_FILE = os.path.join(BASE_DIR, "src", "main", "resources", "assets", "epicdragonfight", "animmodels", "dragon.json")
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

def triangles_to_quads(indices):
    num_values = len(indices)
    if num_values % 9 != 0:
        raise ValueError(f"Index count ({num_values}) must be divisible by 9 (3 verts x 3 attrs per tri)")
    num_tris = num_values // 9
    tris = []
    for i in range(num_tris):
        offset = i * 9
        tris.append([
            (indices[offset], indices[offset + 1], indices[offset + 2]),
            (indices[offset + 3], indices[offset + 4], indices[offset + 5]),
            (indices[offset + 6], indices[offset + 7], indices[offset + 8]),
        ])
    quads = []
    for i in range(0, len(tris), 2):
        if i + 1 < len(tris):
            quads.extend(merge_tri_pair(tris[i], tris[i + 1]))
        else:
            quads.extend(tris[i])
            quads.append(tris[i][-1])
    result = []
    for v in quads:
        result.extend(v)
    return result

def merge_tri_pair(tri_a, tri_b):
    set_a = {v[0] for v in tri_a}
    set_b = {v[0] for v in tri_b}
    shared_pos = set_a & set_b
    if len(shared_pos) != 2:
        print(f"Warning: tri pair shares {len(shared_pos)} pos indices, expected 2")
        return tri_a + tri_b[:1]
    unique_a_vert = None
    unique_b_vert = None
    shared_list = []
    for v in tri_a:
        if v[0] in shared_pos:
            shared_list.append(v)
        else:
            unique_a_vert = v
    for v in tri_b:
        if v[0] not in shared_pos:
            unique_b_vert = v
    idx_a = tri_a.index(unique_a_vert)
    s0 = tri_a[(idx_a + 1) % 3]
    s1 = tri_a[(idx_a + 2) % 3]
    return [unique_a_vert, s0, unique_b_vert, s1]

def write_file(filepath, content):
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(content)

def generate_mesh_data_class(data):
    vertices = data["vertices"]
    positions = vertices["positions"]["array"]
    normals_float = vertices["normals"]["array"]
    uvs = vertices["uvs"]["array"]
    indices = vertices["indices"]["array"]
    quad_indices = triangles_to_quads(indices)
    vindices = vertices["vindices"]["array"]

    positions_b64 = floats_to_base64(positions)

    normals_byte = [round(v * 127.0) for v in normals_float]
    normals_b64 = bytes_to_base64(normals_byte)

    uvs_b64 = floats_to_base64(uvs)

    indices_short = [int(v) for v in quad_indices]
    indices_b64 = shorts_to_base64(indices_short)

    joint_ids = [int(vindices[i * 2]) for i in range(len(vindices) // 2)]
    joint_ids_b64 = ints_to_base64(joint_ids)

    vertex_count = len(quad_indices) // 3

    return f"""package susen36.epicdragonfight.gameasset;

import com.mojang.math.Vector3f;
import com.mojang.math.Vector4f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.client.model.Mesh;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Base64;

@OnlyIn(Dist.CLIENT)
public class DragonMeshData {{
    private static final int VERTEX_COUNT = {vertex_count};
    private static final OpenMatrix4f CORRECTION = OpenMatrix4f.createRotatorDeg(-90.0F, Vector3f.XP);

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

    private static int[] decodeInts() {{
        byte[] bytes = Base64.getDecoder().decode(DragonMeshData.JOINT_IDS_B64.replace("\\n", ""));
        int[] result = new int[bytes.length / 4];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get(result);
        return result;
    }}

    private static int[] decodeShortsToInts() {{
        byte[] bytes = Base64.getDecoder().decode(DragonMeshData.INDICES_B64.replace("\\n", ""));
        int count = bytes.length / 2;
        int[] result = new int[count];
        java.nio.ShortBuffer sb = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        for (int i = 0; i < count; i++) {{
            result[i] = sb.get(i) & 0xFFFF;
        }}
        return result;
    }}

    private static float[] decodeNormalBytes() {{
        byte[] bytes = Base64.getDecoder().decode(DragonMeshData.NORMALS_B64.replace("\\n", ""));
        float[] result = new float[bytes.length];
        for (int i = 0; i < bytes.length; i++) {{
            result[i] = (float)(bytes[i] & 0xFF) / 127.0F;
            if (result[i] > 1.0F) result[i] -= 2.0F;
        }}
        return result;
    }}

    public static Mesh createMesh() {{
        float[] positionArray = decodeFloats(POSITIONS_B64);
        for (int i = 0; i < positionArray.length / 3; i++) {{
            int k = i * 3;
            Vector4f posVector = new Vector4f(positionArray[k], positionArray[k+1], positionArray[k+2], 1.0F);
            OpenMatrix4f.transform(CORRECTION, posVector, posVector);
            positionArray[k] = posVector.x;
            positionArray[k+1] = posVector.y;
            positionArray[k+2] = posVector.z;
        }}

        float[] normalArray = decodeNormalBytes();
        for (int i = 0; i < normalArray.length / 3; i++) {{
            int k = i * 3;
            Vector4f normVector = new Vector4f(normalArray[k], normalArray[k+1], normalArray[k+2], 1.0F);
            OpenMatrix4f.transform(CORRECTION, normVector, normVector);
            normalArray[k] = normVector.x;
            normalArray[k+1] = normVector.y;
            normalArray[k+2] = normVector.z;
        }}

        int[] drawingIndices = decodeShortsToInts();
        int[] jointIds = decodeInts();
        int[] vcounts = new int[VERTEX_COUNT];
        java.util.Arrays.fill(vcounts, 1);

        return new Mesh(positionArray, normalArray, decodeFloats(UVS_B64), jointIds, drawingIndices, vcounts);
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
        transform_str = ", ".join(f"{v}F" for v in padded)

        index = joint_names.index(name) if name in joint_names else -1

        method_name = name.title().replace("_", "")
        lines.append(f"    private static Joint build{method_name}(Map<String, Joint> jointMap) {{")
        lines.append(f"        float[] transform = new float[]{{{transform_str}}};")
        lines.append(f"        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));")
        lines.append(f"        localMatrix.transpose();")
        if is_root:
            lines.append(f"        localMatrix.mulFront(CORRECTION);")
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
import com.mojang.math.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.Joint;
import susen36.epicdragonfight.api.client.model.Mesh;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.nio.FloatBuffer;
import java.util.Map;

public class DragonModelData {{
    private static final OpenMatrix4f CORRECTION = OpenMatrix4f.createRotatorDeg(-90.0F, Vector3f.XP);

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
    quad_indices = triangles_to_quads(indices)
    indices_short = [int(v) for v in quad_indices]

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
    print(f"  indices:   {raw_indices_orig} -> {raw_indices_new}  (tri->quad merged, short vs int)")
    print(f"  vcounts:   {raw_vcounts_orig} -> {raw_vcounts_new}  (runtime generated)")
    print(f"  weights:   {raw_weights_orig} -> {raw_weights_new}  (removed, single-joint binding)")
    print(f"  vindices:  {raw_vindices_orig} -> {raw_vindices_new}  (jointId only, no weight index)")
    print(f"  TOTAL:     {total_orig} -> {total_new}  ({100 - total_new * 100 // total_orig}% saved)")

    write_file(os.path.join(OUTPUT_DIR, "DragonMeshData.java"), generate_mesh_data_class(data))
    write_file(os.path.join(OUTPUT_DIR, "DragonModelData.java"), generate_model_data_class(data))

    print(f"\nGenerated 2 files in {OUTPUT_DIR}")

if __name__ == "__main__":
    main()
