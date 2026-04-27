import re
import os
import glob

def clean_scientific_notation_in_file(file_path):
    """清理文件中的科学计数法极小值"""
    print(f"处理文件: {file_path}")
    
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    def replace_small_scientific(match):
        full_match = match.group(0)
        try:
            value = float(full_match)
            if abs(value) < 1e-04:
                return '0.0'
            return full_match
        except ValueError:
            return full_match
    
    pattern = r'-?(?:\d+\.?\d*|\.\d+)[eE][+-]?\d+'
    new_content = re.sub(pattern, replace_small_scientific, content)
    
    if content != new_content:
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(new_content)
        print(f"  [OK] Cleaned scientific notation")
    else:
        print(f"  [SKIP] No changes needed")

def main():
    base_dir = r"c:\Users\Administrator\Desktop\VANIILLLA\MODIFIY\epicdragonfightmod-1.18.2\src\main\resources\assets\epicdragonfight\animmodels"
    
    # 处理模型文件
    model_file = os.path.join(base_dir, "dragon.json")
    if os.path.exists(model_file):
        clean_scientific_notation_in_file(model_file)
    
    # 处理所有动画文件
    anim_dir = os.path.join(base_dir, "animations")
    anim_files = glob.glob(os.path.join(anim_dir, "*.json"))
    
    print(f"\n找到 {len(anim_files)} 个动画文件")
    
    for anim_file in anim_files:
        clean_scientific_notation_in_file(anim_file)
    
    print("\n清理完成!")

if __name__ == "__main__":
    main()
