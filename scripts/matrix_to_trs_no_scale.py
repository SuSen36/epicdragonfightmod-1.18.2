import json
import math

def matrix_to_trs_no_scale(matrix_flat):
    """
    将 4x4 变换矩阵分解为 translation 和 rotation，忽略 scale
    类似于 Java 中的 JointTransform.fromMatrixNoScale()
    """
    # 构建 4x4 矩阵
    mat = [matrix_flat[i:i+4] for i in range(0, 16, 4)]
    
    # 提取 translation (第4列)
    translation = [mat[0][3], mat[1][3], mat[2][3]]
    
    # 提取 3x3 旋转部分
    m00, m01, m02 = mat[0][0], mat[0][1], mat[0][2]
    m10, m11, m12 = mat[1][0], mat[1][1], mat[1][2]
    m20, m21, m22 = mat[2][0], mat[2][1], mat[2][2]
    
    # 矩阵转四元数
    tr = m00 + m11 + m22
    
    if tr > 0:
        s = 0.5 / math.sqrt(tr + 1.0)
        qw = 0.25 / s
        qx = (m21 - m12) * s
        qy = (m02 - m20) * s
        qz = (m10 - m01) * s
    else:
        if m00 > m11 and m00 > m22:
            s = 2.0 * math.sqrt(1.0 + m00 - m11 - m22)
            qw = (m21 - m12) / s
            qx = 0.25 * s
            qy = (m01 + m10) / s
            qz = (m02 + m20) / s
        elif m11 > m22:
            s = 2.0 * math.sqrt(1.0 + m11 - m00 - m22)
            qw = (m02 - m20) / s
            qx = (m01 + m10) / s
            qy = 0.25 * s
            qz = (m12 + m21) / s
        else:
            s = 2.0 * math.sqrt(1.0 + m22 - m00 - m11)
            qw = (m10 - m01) / s
            qx = (m02 + m20) / s
            qy = (m12 + m21) / s
            qz = 0.25 * s
    
    rotation = [qx, qy, qz, qw]
    
    return {
        "translation": translation,
        "rotation": rotation
    }


# 示例用法
if __name__ == "__main__":
    # 示例矩阵（单位矩阵）
    example_matrix = [
        1.0, 0.0, 0.0, 0.0,
        0.0, 1.0, 0.0, 0.0,
        0.0, 0.0, 1.0, 0.0,
        0.0, 0.0, 0.0, 1.0
    ]
    
    result = matrix_to_trs_no_scale(example_matrix)
    print(json.dumps(result, indent=4))
