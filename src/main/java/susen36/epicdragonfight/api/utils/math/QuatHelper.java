package susen36.epicdragonfight.api.utils.math;

import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;

public class QuatHelper {
	public static Quaternion eulerDegrees(float x, float y, float z) {
		Quaternion quatX = new Quaternion(new Vector3f(1.0F, 0.0F, 0.0F), x, true);
		Quaternion quatY = new Quaternion(new Vector3f(0.0F, 1.0F, 0.0F), y, true);
		Quaternion quatZ = new Quaternion(new Vector3f(0.0F, 0.0F, 1.0F), z, true);
		quatZ.mul(quatY);
		quatZ.mul(quatX);
		return quatZ;
	}
}