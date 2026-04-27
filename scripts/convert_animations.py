import json
import os

ANIM_DIR = os.path.join(os.path.dirname(os.path.abspath(__file__)), "src", "main", "resources", "assets", "epicdragonfight", "animmodels", "animations")
OUTPUT_FILE = os.path.join(os.path.dirname(os.path.abspath(__file__)), "src", "main", "java", "susen36", "epicdragonfight", "gameasset", "DragonAnimationData.java")

def read_json(filepath):
    with open(filepath, 'r', encoding='utf-8-sig') as f:
        return json.load(f)

def to_camel_case(snake_str):
    components = snake_str.split('_')
    return ''.join(x.title() for x in components)

def convert_animation(anim_name, anim_data):
    joints = anim_data["animation"]
    lines = []

    method_name = to_camel_case(anim_name)
    lines.append(f"    public static void load{method_name}(StaticAnimation animation) {{")
    lines.append(f"        Armature armature = animation.getModel().getArmature();")
    lines.append(f"        boolean root = true;")
    lines.append(f"")

    for joint_data in joints:
        joint_name = joint_data["name"]
        times = joint_data["time"]
        transforms = joint_data["transform"]

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
        for ti, transform in enumerate(transforms):
            padded = transform + [0.0, 0.0, 0.0, 1.0] if len(transform) < 16 else transform
            mat_str = ", ".join(f"{v}F" for v in padded)
            lines.append(f"                {mat_str},")
        lines.append(f"            }};")
        lines.append(f"")

        lines.append(f"            Joint joint = armature.searchJointByName(\"{joint_name}\");")
        lines.append(f"            if (joint == null) {{")
        lines.append(f"                throw new IllegalArgumentException(\"[EpicDragonFight] Can't find the joint {joint_name} in animation data \" + animation);")
        lines.append(f"            }}")
        lines.append(f"            TransformSheet sheet = getTransformSheet({times_var}, {transforms_var}, OpenMatrix4f.invert(joint.getLocalTrasnform(), null), root);")
        lines.append(f"            animation.addSheet(\"{joint_name}\", sheet);")
        lines.append(f"            animation.setTotalTime({times_var}[{times_var}.length - 1]);")
        lines.append(f"            root = false;")
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

import com.mojang.math.Vector3f;
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
    private static final OpenMatrix4f CORRECTION = OpenMatrix4f.createRotatorDeg(-90.0F, Vector3f.XP);

{chr(10).join(all_methods)}
    public static void loadByName(String name, StaticAnimation animation) {{
        switch (name) {{
{chr(10).join(load_by_name_cases)}
            default: throw new IllegalArgumentException("[EpicDragonFight] Unknown animation: " + name);
        }}
    }}

    private static TransformSheet getTransformSheet(float[] times, float[] transformMatrix, OpenMatrix4f invLocalTransform, boolean correct) {{
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

            if (correct) {{
                matrix.mulFront(CORRECTION);
            }}

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
