import struct
import re
import os
import math

PROJECT_ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
MODEL_DATA_FILE = os.path.join(PROJECT_ROOT, "src", "main", "java", "susen36", "epicdragonfight", "gameasset", "DragonModelData.java")
ANIM_DATA_FILE = os.path.join(PROJECT_ROOT, "src", "main", "java", "susen36", "epicdragonfight", "gameasset", "DragonAnimationData.java")
OUTPUT_FILE = ANIM_DATA_FILE

def f32(x):
    return struct.unpack('f', struct.pack('f', x))[0]

def format_f(v):
    v = f32(v)
    if v == 0.0:
        return "0.0F"
    if math.isinf(v) or math.isnan(v):
        raise ValueError(f"Invalid float: {v}")
    s = f"{v:.8g}"
    if '.' not in s and 'e' not in s and 'E' not in s:
        s += ".0"
    if 'e' in s:
        s = s.replace('e', 'E')
    return s + "F"

class OpenMatrix4f:
    __slots__ = ('m00','m01','m02','m03','m10','m11','m12','m13','m20','m21','m22','m23','m30','m31','m32','m33')

    def __init__(self):
        self.set_identity()

    def set_identity(self):
        self.m00 = f32(1.0); self.m01 = f32(0.0); self.m02 = f32(0.0); self.m03 = f32(0.0)
        self.m10 = f32(0.0); self.m11 = f32(1.0); self.m12 = f32(0.0); self.m13 = f32(0.0)
        self.m20 = f32(0.0); self.m21 = f32(0.0); self.m22 = f32(1.0); self.m23 = f32(0.0)
        self.m30 = f32(0.0); self.m31 = f32(0.0); self.m32 = f32(0.0); self.m33 = f32(1.0)

    @staticmethod
    def from_float_buffer(arr16):
        m = OpenMatrix4f()
        m.m00 = f32(arr16[0]);  m.m01 = f32(arr16[1]);  m.m02 = f32(arr16[2]);  m.m03 = f32(arr16[3])
        m.m10 = f32(arr16[4]);  m.m11 = f32(arr16[5]);  m.m12 = f32(arr16[6]);  m.m13 = f32(arr16[7])
        m.m20 = f32(arr16[8]);  m.m21 = f32(arr16[9]);  m.m22 = f32(arr16[10]); m.m23 = f32(arr16[11])
        m.m30 = f32(arr16[12]); m.m31 = f32(arr16[13]); m.m32 = f32(arr16[14]); m.m33 = f32(arr16[15])
        return m

    def transpose(self):
        t01 = self.m10; t02 = self.m20; t03 = self.m30
        t10 = self.m01; t12 = self.m21; t13 = self.m31
        t20 = self.m02; t21 = self.m12; t23 = self.m32
        t30 = self.m03; t31 = self.m13; t32 = self.m23
        self.m01 = t01; self.m02 = t02; self.m03 = t03
        self.m10 = t10; self.m12 = t12; self.m13 = t13
        self.m20 = t20; self.m21 = t21; self.m23 = t23
        self.m30 = t30; self.m31 = t31; self.m32 = t32
        return self

    def mul_front(self, other):
        result = OpenMatrix4f.mul(other, self)
        self.m00=result.m00; self.m01=result.m01; self.m02=result.m02; self.m03=result.m03
        self.m10=result.m10; self.m11=result.m11; self.m12=result.m12; self.m13=result.m13
        self.m20=result.m20; self.m21=result.m21; self.m22=result.m22; self.m23=result.m23
        self.m30=result.m30; self.m31=result.m31; self.m32=result.m32; self.m33=result.m33
        return self

    @staticmethod
    def mul(left, right):
        dest = OpenMatrix4f()
        dest.m00 = f32(left.m00*right.m00 + left.m10*right.m01 + left.m20*right.m02 + left.m30*right.m03)
        dest.m01 = f32(left.m01*right.m00 + left.m11*right.m01 + left.m21*right.m02 + left.m31*right.m03)
        dest.m02 = f32(left.m02*right.m00 + left.m12*right.m01 + left.m22*right.m02 + left.m32*right.m03)
        dest.m03 = f32(left.m03*right.m00 + left.m13*right.m01 + left.m23*right.m02 + left.m33*right.m03)
        dest.m10 = f32(left.m00*right.m10 + left.m10*right.m11 + left.m20*right.m12 + left.m30*right.m13)
        dest.m11 = f32(left.m01*right.m10 + left.m11*right.m11 + left.m21*right.m12 + left.m31*right.m13)
        dest.m12 = f32(left.m02*right.m10 + left.m12*right.m11 + left.m22*right.m12 + left.m32*right.m13)
        dest.m13 = f32(left.m03*right.m10 + left.m13*right.m11 + left.m23*right.m12 + left.m33*right.m13)
        dest.m20 = f32(left.m00*right.m20 + left.m10*right.m21 + left.m20*right.m22 + left.m30*right.m23)
        dest.m21 = f32(left.m01*right.m20 + left.m11*right.m21 + left.m21*right.m22 + left.m31*right.m23)
        dest.m22 = f32(left.m02*right.m20 + left.m12*right.m21 + left.m22*right.m22 + left.m32*right.m23)
        dest.m23 = f32(left.m03*right.m20 + left.m13*right.m21 + left.m23*right.m22 + left.m33*right.m23)
        dest.m30 = f32(left.m00*right.m30 + left.m10*right.m31 + left.m20*right.m32 + left.m30*right.m33)
        dest.m31 = f32(left.m01*right.m30 + left.m11*right.m31 + left.m21*right.m32 + left.m31*right.m33)
        dest.m32 = f32(left.m02*right.m30 + left.m12*right.m31 + left.m22*right.m32 + left.m32*right.m33)
        dest.m33 = f32(left.m03*right.m30 + left.m13*right.m31 + left.m23*right.m32 + left.m33*right.m33)
        return dest

    @staticmethod
    def _det3x3(t00, t01, t02, t10, t11, t12, t20, t21, t22):
        return f32(t00*(t11*t22 - t12*t21) + t01*(t12*t20 - t10*t22) + t02*(t10*t21 - t11*t20))

    def determinant(self):
        f  = f32(self.m00 * ((self.m11*self.m22*self.m33 + self.m12*self.m23*self.m31 + self.m13*self.m21*self.m32) - self.m13*self.m22*self.m31 - self.m11*self.m23*self.m32 - self.m12*self.m21*self.m33))
        f -= f32(self.m01 * ((self.m10*self.m22*self.m33 + self.m12*self.m23*self.m30 + self.m13*self.m20*self.m32) - self.m13*self.m22*self.m30 - self.m10*self.m23*self.m32 - self.m12*self.m20*self.m33))
        f += f32(self.m02 * ((self.m10*self.m21*self.m33 + self.m11*self.m23*self.m30 + self.m13*self.m20*self.m31) - self.m13*self.m21*self.m30 - self.m10*self.m23*self.m31 - self.m11*self.m20*self.m33))
        f -= f32(self.m03 * ((self.m10*self.m21*self.m32 + self.m11*self.m22*self.m30 + self.m12*self.m20*self.m31) - self.m12*self.m21*self.m30 - self.m10*self.m22*self.m31 - self.m11*self.m20*self.m32))
        return f

    @staticmethod
    def invert(src):
        det = src.determinant()
        if det == 0:
            return None
        di = f32(1.0 / det)
        d3 = OpenMatrix4f._det3x3
        t00 =  f32( d3(src.m11,src.m12,src.m13, src.m21,src.m22,src.m23, src.m31,src.m32,src.m33))
        t01 = f32(-d3(src.m10,src.m12,src.m13, src.m20,src.m22,src.m23, src.m30,src.m32,src.m33))
        t02 = f32( d3(src.m10,src.m11,src.m13, src.m20,src.m21,src.m23, src.m30,src.m31,src.m33))
        t03 = f32(-d3(src.m10,src.m11,src.m12, src.m20,src.m21,src.m22, src.m30,src.m31,src.m32))
        t10 = f32(-d3(src.m01,src.m02,src.m03, src.m21,src.m22,src.m23, src.m31,src.m32,src.m33))
        t11 = f32( d3(src.m00,src.m02,src.m03, src.m20,src.m22,src.m23, src.m30,src.m32,src.m33))
        t12 = f32(-d3(src.m00,src.m01,src.m03, src.m20,src.m21,src.m23, src.m30,src.m31,src.m33))
        t13 = f32( d3(src.m00,src.m01,src.m02, src.m20,src.m21,src.m22, src.m30,src.m31,src.m32))
        t20 = f32( d3(src.m01,src.m02,src.m03, src.m11,src.m12,src.m13, src.m31,src.m32,src.m33))
        t21 = f32(-d3(src.m00,src.m02,src.m03, src.m10,src.m12,src.m13, src.m30,src.m32,src.m33))
        t22 = f32( d3(src.m00,src.m01,src.m03, src.m10,src.m11,src.m13, src.m30,src.m31,src.m33))
        t23 = f32(-d3(src.m00,src.m01,src.m02, src.m10,src.m11,src.m12, src.m30,src.m31,src.m32))
        t30 = f32(-d3(src.m01,src.m02,src.m03, src.m11,src.m12,src.m13, src.m21,src.m22,src.m23))
        t31 = f32( d3(src.m00,src.m02,src.m03, src.m10,src.m12,src.m13, src.m20,src.m22,src.m23))
        t32 = f32(-d3(src.m00,src.m01,src.m03, src.m10,src.m11,src.m13, src.m20,src.m21,src.m23))
        t33 = f32( d3(src.m00,src.m01,src.m02, src.m10,src.m11,src.m12, src.m20,src.m21,src.m22))
        dest = OpenMatrix4f()
        dest.m00=f32(t00*di); dest.m11=f32(t11*di); dest.m22=f32(t22*di); dest.m33=f32(t33*di)
        dest.m01=f32(t10*di); dest.m10=f32(t01*di); dest.m20=f32(t02*di); dest.m02=f32(t20*di)
        dest.m12=f32(t21*di); dest.m21=f32(t12*di); dest.m03=f32(t30*di); dest.m30=f32(t03*di)
        dest.m13=f32(t31*di); dest.m31=f32(t13*di); dest.m32=f32(t23*di); dest.m23=f32(t32*di)
        return dest

    @staticmethod
    def create_rotator_deg(angle_deg, axis_x, axis_y, axis_z):
        angle = math.radians(angle_deg)
        c = f32(math.cos(angle))
        s = f32(math.sin(angle))
        oneminusc = f32(1.0 - c)
        xy = f32(axis_x * axis_y)
        yz = f32(axis_y * axis_z)
        xz = f32(axis_x * axis_z)
        xs = f32(axis_x * s)
        ys = f32(axis_y * s)
        zs = f32(axis_z * s)
        f00 = f32(axis_x*axis_x*oneminusc + c)
        f01 = f32(xy*oneminusc + zs)
        f02 = f32(xz*oneminusc - ys)
        f10 = f32(xy*oneminusc - zs)
        f11 = f32(axis_y*axis_y*oneminusc + c)
        f12 = f32(yz*oneminusc + xs)
        f20 = f32(xz*oneminusc + ys)
        f21 = f32(yz*oneminusc - xs)
        f22 = f32(axis_z*axis_z*oneminusc + c)
        src = OpenMatrix4f()
        dest = OpenMatrix4f()
        t00 = f32(src.m00*f00 + src.m10*f01 + src.m20*f02)
        t01 = f32(src.m01*f00 + src.m11*f01 + src.m21*f02)
        t02 = f32(src.m02*f00 + src.m12*f01 + src.m22*f02)
        t03 = f32(src.m03*f00 + src.m13*f01 + src.m23*f02)
        t10 = f32(src.m00*f10 + src.m10*f11 + src.m20*f12)
        t11 = f32(src.m01*f10 + src.m11*f11 + src.m21*f12)
        t12 = f32(src.m02*f10 + src.m12*f11 + src.m22*f12)
        t13 = f32(src.m03*f10 + src.m13*f11 + src.m23*f12)
        dest.m20 = f32(src.m00*f20 + src.m10*f21 + src.m20*f22)
        dest.m21 = f32(src.m01*f20 + src.m11*f21 + src.m21*f22)
        dest.m22 = f32(src.m02*f20 + src.m12*f21 + src.m22*f22)
        dest.m23 = f32(src.m03*f20 + src.m13*f21 + src.m23*f22)
        dest.m00=t00; dest.m01=t01; dest.m02=t02; dest.m03=t03
        dest.m10=t10; dest.m11=t11; dest.m12=t12; dest.m13=t13
        dest.m30=f32(0.0); dest.m31=f32(0.0); dest.m32=f32(0.0); dest.m33=f32(1.0)
        return dest

    def to_translation(self):
        return (self.m30, self.m31, self.m32)

    def to_quaternion(self):
        diagonal = f32(self.m00 + self.m11 + self.m22)
        if diagonal > 0:
            w4 = f32(math.sqrt(diagonal + 1.0) * 2.0)
            w = f32(w4 / 4.0)
            x = f32((self.m21 - self.m12) / w4)
            y = f32((self.m02 - self.m20) / w4)
            z = f32((self.m10 - self.m01) / w4)
        elif self.m00 > self.m11 and self.m00 > self.m22:
            x4 = f32(math.sqrt(1.0 + self.m00 - self.m11 - self.m22) * 2.0)
            w = f32((self.m21 - self.m12) / x4)
            x = f32(x4 / 4.0)
            y = f32((self.m01 + self.m10) / x4)
            z = f32((self.m02 + self.m20) / x4)
        elif self.m11 > self.m22:
            y4 = f32(math.sqrt(1.0 + self.m11 - self.m00 - self.m22) * 2.0)
            w = f32((self.m02 - self.m20) / y4)
            x = f32((self.m01 + self.m10) / y4)
            y = f32(y4 / 4.0)
            z = f32((self.m12 + self.m21) / y4)
        else:
            z4 = f32(math.sqrt(1.0 + self.m22 - self.m00 - self.m11) * 2.0)
            w = f32((self.m10 - self.m01) / z4)
            x = f32((self.m02 + self.m20) / z4)
            y = f32((self.m12 + self.m21) / z4)
            z = f32(z4 / 4.0)
        return (x, y, z, w)

    def to_scale(self):
        v0x = self.m00; v0y = self.m01; v0z = self.m02
        v1x = self.m10; v1y = self.m11; v1z = self.m12
        v2x = self.m20; v2y = self.m21; v2z = self.m22
        sx = f32(math.sqrt(v0x*v0x + v0y*v0y + v0z*v0z))
        sy = f32(math.sqrt(v1x*v1x + v1y*v1y + v1z*v1z))
        sz = f32(math.sqrt(v2x*v2x + v2y*v2y + v2z*v2z))
        return (sx, sy, sz)

    def to_euler_degrees(self):
        qx, qy, qz, qw = self.to_quaternion()
        sinr_cosp = 2.0 * (qw * qx + qy * qz)
        cosr_cosp = 1.0 - 2.0 * (qx * qx + qy * qy)
        roll = math.degrees(math.atan2(sinr_cosp, cosr_cosp))
        sinp = 2.0 * (qw * qy - qz * qx)
        if abs(sinp) >= 1.0:
            pitch = math.degrees(math.copysign(math.pi / 2, sinp))
        else:
            pitch = math.degrees(math.asin(sinp))
        siny_cosp = 2.0 * (qw * qz + qx * qy)
        cosy_cosp = 1.0 - 2.0 * (qy * qy + qz * qz)
        yaw = math.degrees(math.atan2(siny_cosp, cosy_cosp))
        return (f32(roll), f32(pitch), f32(yaw))

CORRECTION = OpenMatrix4f.create_rotator_deg(-90.0, 1.0, 0.0, 0.0)

def parse_model_data(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    joint_transforms = {}
    joint_is_root = {}
    methods = re.findall(
        r'private static Joint build(\w+)\(Map<String, Joint> jointMap\)\s*\{(.*?)\n    \}',
        content, re.DOTALL
    )
    for method_name, body in methods:
        name_match = re.search(r'new Joint\("([^"]+)"', body)
        if not name_match:
            continue
        joint_name = name_match.group(1)
        transform_match = re.search(r'float\[\]\s+transform\s*=\s*new float\[\]\{([^}]+)\}', body)
        if not transform_match:
            continue
        vals_str = transform_match.group(1)
        vals = [float(v.strip().rstrip('Ff')) for v in vals_str.split(',') if v.strip()]
        if len(vals) < 16:
            while len(vals) < 16:
                vals.append(0.0)
            vals[15] = 1.0
        joint_transforms[joint_name] = vals[:16]
        joint_is_root[joint_name] = 'mulFront(CORRECTION)' in body
    return joint_transforms, joint_is_root

def compute_inv_local_transform(joint_name, joint_transforms, joint_is_root):
    arr16 = [f32(v) for v in joint_transforms[joint_name]]
    local_matrix = OpenMatrix4f.from_float_buffer(arr16)
    local_matrix.transpose()
    if joint_is_root.get(joint_name, False):
        local_matrix.mul_front(CORRECTION)
    inv_local = OpenMatrix4f.invert(local_matrix)
    if inv_local is None:
        raise ValueError(f"Cannot invert local transform for joint {joint_name}")
    return inv_local

def parse_load_by_name(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    name_to_method = {}
    for m in re.finditer(r'case\s+"([^"]+)"\s*:\s*(load\w+)\(animation\)', content):
        anim_name = m.group(1)
        method_name = m.group(2)
        name_to_method[anim_name] = method_name
    return name_to_method

def parse_animation_data(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        content = f.read()
    animations = []
    method_pattern = re.compile(
        r'public static void (load\w+)\(StaticAnimation animation\)\s*\{(.*?)\n    \}',
        re.DOTALL
    )
    for m in method_pattern.finditer(content):
        method_name = m.group(1)
        body = m.group(2)
        joints = []
        armature_match = re.search(r'Armature armature\s*=\s*animation\.getModel\(\)\.getArmature\(\);', body)
        if not armature_match:
            continue
        body_after_armature = body[armature_match.end():]
        time_arrays = {}
        for tm in re.finditer(r'float\[\]\s+(t\d+)\s*=\s*\{\s*([^}]+)\}', body_after_armature):
            var_name = tm.group(1)
            vals_str = tm.group(2)
            vals = [float(v.strip().rstrip('Ff')) for v in vals_str.split(',') if v.strip()]
            time_arrays[var_name] = vals
        matrix_arrays = {}
        for mm in re.finditer(r'float\[\]\s+(m\d+)\s*=\s*new float\[\]\s*\{([^}]+)\}', body_after_armature):
            var_name = mm.group(1)
            vals_str = mm.group(2)
            vals = [float(v.strip().rstrip('Ff')) for v in vals_str.split(',') if v.strip()]
            matrix_arrays[var_name] = vals
        add_joint_pattern = re.compile(
            r'addJoint\(armature,\s*animation,\s*"([^"]+)",\s*(t\d+),\s*(m\d+),\s*(true|false)\)'
        )
        for aj in add_joint_pattern.finditer(body_after_armature):
            joint_name = aj.group(1)
            t_var = aj.group(2)
            m_var = aj.group(3)
            correct = aj.group(4) == 'true'
            times = time_arrays.get(t_var, [])
            matrices = matrix_arrays.get(m_var, [])
            joints.append({
                'name': joint_name,
                'times': times,
                'matrices': matrices,
                'correct': correct
            })
        total_time_match = re.search(r'animation\.setTotalTime\((\w+)\[', body_after_armature)
        total_time_var = total_time_match.group(1) if total_time_match else None
        animations.append({
            'method_name': method_name,
            'joints': joints,
            'total_time_var': total_time_var
        })
    return animations

def prebake_joint(joint_info, inv_local_transforms):
    joint_name = joint_info['name']
    times = joint_info['times']
    matrices = joint_info['matrices']
    correct = joint_info['correct']
    inv_local = inv_local_transforms.get(joint_name)
    if inv_local is None:
        raise ValueError(f"No invLocalTransform for joint {joint_name}")
    trs_data = []
    valid_times = []
    for i in range(len(times)):
        ts = times[i]
        if ts < 0:
            continue
        valid_times.append(ts)
        mat12 = matrices[i*12 : (i+1)*12]
        if len(mat12) < 12:
            mat12 = mat12 + [0.0] * (12 - len(mat12))
        arr16 = [f32(v) for v in mat12] + [f32(0.0), f32(0.0), f32(0.0), f32(1.0)]
        matrix = OpenMatrix4f.from_float_buffer(arr16)
        matrix.transpose()
        if correct:
            matrix.mul_front(CORRECTION)
        matrix.mul_front(inv_local)
        tx, ty, tz = matrix.to_translation()
        rx, ry, rz = matrix.to_euler_degrees()
        trs_data.append((tx, ty, tz, rx, ry, rz))
    return valid_times, trs_data

def to_camel_case(snake_str):
    return ''.join(x.title() for x in snake_str.split('_'))

def generate_java(animations, prebaked_data, name_to_method):
    all_methods = []
    method_to_name = {v: k for k, v in name_to_method.items()}
    anim_names = []
    anim_method_names = []
    for anim_idx, anim in enumerate(animations):
        method_name = anim['method_name']
        original_name = method_to_name.get(method_name, method_name.replace('load', '', 1)[0].lower() + method_name.replace('load', '', 1)[1:])
        anim_names.append(original_name)
        anim_method_names.append(method_name)
        baked = prebaked_data[anim_idx]
        lines = []
        lines.append(f"    public static void {method_name}(StaticAnimation animation) {{")
        for joint_idx, joint in enumerate(anim['joints']):
            times, trs_list = baked[joint_idx]
            t_var = f"t{joint_idx}"
            d_var = f"d{joint_idx}"
            times_str = ", ".join(format_f(t) for t in times)
            lines.append(f"        float[] {t_var} = {{")
            lines.append(f"            {times_str}")
            lines.append(f"        }};")
            lines.append(f"")
            lines.append(f"        float[] {d_var} = new float[]{{")
            trs_rows = []
            for trs in trs_list:
                row_str = ", ".join(format_f(v) for v in trs)
                trs_rows.append(f"            {row_str},")
            lines.append("\n".join(trs_rows))
            lines.append(f"        }};")
            lines.append(f"")
            lines.append(f"        addJoint(animation, \"{joint['name']}\", {t_var}, {d_var});")
            lines.append(f"")
        if anim['total_time_var']:
            last_t_var = f"t{len(anim['joints'])-1}"
            lines.append(f"        animation.setTotalTime({last_t_var}[{last_t_var}.length - 1]);")
        lines.append(f"    }}")
        all_methods.append("\n".join(lines))
    load_by_name_cases = []
    for anim_name, method_name in zip(anim_names, anim_method_names):
        load_by_name_cases.append(f'            case "{anim_name}": {method_name}(animation); break;')
    java_code = f"""package susen36.epicdragonfight.gameasset;

import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import susen36.epicdragonfight.api.animation.JointTransform;
import susen36.epicdragonfight.api.animation.Keyframe;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.utils.math.QuatHelper;

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

    private static void addJoint(StaticAnimation animation, String name, float[] times, float[] trs) {{
        List<Keyframe> keyframeList = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {{
            if (times[i] < 0) {{
                continue;
            }}
            int offset = i * 6;
            JointTransform transform = new JointTransform(
                new Vector3f(trs[offset], trs[offset + 1], trs[offset + 2]),
                QuatHelper.eulerDegrees(trs[offset + 3], trs[offset + 4], trs[offset + 5]),
                new Vector3f(1.0F, 1.0F, 1.0F)
            );
            keyframeList.add(new Keyframe(times[i], transform));
        }}
        animation.addSheet(name, new TransformSheet(keyframeList));
    }}
}}"""
    return java_code

def main():
    print("Parsing DragonModelData.java for joint local transforms...")
    joint_transforms, joint_is_root = parse_model_data(MODEL_DATA_FILE)
    print(f"  Found {len(joint_transforms)} joints")

    print("Computing inverse local transforms...")
    inv_local_transforms = {}
    for jname in joint_transforms:
        inv_local_transforms[jname] = compute_inv_local_transform(jname, joint_transforms, joint_is_root)
        is_root = " (root)" if joint_is_root.get(jname, False) else ""
        print(f"  {jname}{is_root}: OK")

    print("\nParsing DragonAnimationData.java for animation data...")
    name_to_method = parse_load_by_name(ANIM_DATA_FILE)
    animations = parse_animation_data(ANIM_DATA_FILE)
    print(f"  Found {len(animations)} animations, {len(name_to_method)} name mappings")

    print("\nPre-baking transforms...")
    prebaked_data = []
    total_keyframes = 0
    for anim in animations:
        anim_baked = []
        for joint in anim['joints']:
            times, trs_list = prebake_joint(joint, inv_local_transforms)
            anim_baked.append((times, trs_list))
            total_keyframes += len(times)
        prebaked_data.append(anim_baked)
        print(f"  {anim['method_name']}: {len(anim['joints'])} joints")
    print(f"  Total keyframes pre-baked: {total_keyframes}")

    print("\nGenerating DragonAnimationData.java...")
    java_code = generate_java(animations, prebaked_data, name_to_method)

    with open(OUTPUT_FILE, 'w', encoding='utf-8') as f:
        f.write(java_code)

    print(f"  Written to: {OUTPUT_FILE}")
    print("\nDone! The new DragonAnimationData.java uses pre-baked TRS data with Euler angles.")
    print("Format per keyframe: tx, ty, tz, rx, ry, rz (6 floats)")
    print("Removed: Quaternion (4 floats) and Scale (3 floats)")

if __name__ == "__main__":
    main()
