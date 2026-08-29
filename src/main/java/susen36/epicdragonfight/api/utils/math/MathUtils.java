package susen36.epicdragonfight.api.utils.math;

import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.util.Mth;

public class MathUtils {
	public static OpenMatrix4f getModelMatrixIntegral(float prevPosX, float posX, float prevPosY, float posY, float prevPosZ, float posZ, float prevPitch, float pitch, float prevYaw, float yaw, float partialTick, float scaleX, float scaleY, float scaleZ) {
		OpenMatrix4f modelMatrix = new OpenMatrix4f();
		Vector3f entityPosition = new Vector3f(-(prevPosX + (posX - prevPosX) * partialTick), ((prevPosY + (posY - prevPosY) * partialTick)), -(prevPosZ + (posZ - prevPosZ) * partialTick));
		float pitchDegree = lerpBetween(prevPitch, pitch, partialTick);
		float yawDegree = lerpBetween(prevYaw, yaw, partialTick);
		modelMatrix.translate(entityPosition).rotateDeg(-yawDegree, Vector3f.YP).rotateDeg(-pitchDegree, Vector3f.XP).scale(scaleX, scaleY, scaleZ);
		return modelMatrix;
	}

	public static float lerpBetween(float f1, float f2, float zero2one) {
		float f = Mth.wrapDegrees(f2 - f1);
		return f1 + zero2one * f;
	}
	
	public static float rotlerp(float from, float to, float limit) {
		float f = Mth.wrapDegrees(to - from);
		
		if (f > limit) {
			f = limit;
		}
		
		if (f < -limit) {
			f = -limit;
		}
		
		float f1 = from + f;
		
		while (f1 >= 180.0F) {
			f1 -= 360.0F;
		}
		
		while (f1 <= -180.0F) {
			f1 += 360.0F;
		}
		
		return f1;
	}

	
	public static double getAngleBetween(Vector3f a, Vector3f b) {
		double cos = (a.x * b.x + a.y * b.y + a.z * b.z);
		return Math.acos(cos);
	}

	public static Vector3f lerpVector(Vector3f start, Vector3f end, float weight) {
		float x = start.x + (end.x - start.x) * weight;
		float y = start.y + (end.y - start.y) * weight;
		float z = start.z + (end.z - start.z) * weight;
		return new Vector3f(x, y, z);
	}
	
	public static void setQuaternion(Quaternion quat, float x, float y, float z, float w) {
		quat.i = x;
		quat.j = y;
		quat.k = z;
		quat.r = w;
	}

	public static Quaternion lerpQuaternion(Quaternion from, Quaternion to, float weight) {
		float fromX = from.i();
		float fromY = from.j();
		float fromZ = from.k();
		float fromW = from.r();
		float toX = to.i();
		float toY = to.j();
		float toZ = to.k();
		float toW = to.r();
		float resultX;
		float resultY;
		float resultZ;
		float resultW;
		float dot = fromW * toW + fromX * toX + fromY * toY + fromZ * toZ;
		float blendI = 1f - weight;
		
		if (dot < 0) {
			resultW = blendI * fromW + weight * -toW;
			resultX = blendI * fromX + weight * -toX;
			resultY = blendI * fromY + weight * -toY;
			resultZ = blendI * fromZ + weight * -toZ;
		} else {
			resultW = blendI * fromW + weight * toW;
			resultX = blendI * fromX + weight * toX;
			resultY = blendI * fromY + weight * toY;
			resultZ = blendI * fromZ + weight * toZ;
		}
		
		Quaternion result = new Quaternion(resultX, resultY, resultZ, resultW);
		normalizeQuaternion(result);
		return result;
	}
	
	private static void normalizeQuaternion(Quaternion quaternion) {
		float f = quaternion.i() * quaternion.i() + quaternion.j() * quaternion.j() + quaternion.k() * quaternion.k() + quaternion.r() * quaternion.r();
		if (f > 1.0E-6F) {
			float f1 = fastInvSqrt(f);
			setQuaternion(quaternion, quaternion.i() * f1, quaternion.j() * f1, quaternion.k() * f1, quaternion.r() * f1);
		} else {
			setQuaternion(quaternion, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}

	private static float fastInvSqrt(float number) {
		float f = 0.5F * number;
		int i = Float.floatToIntBits(number);
		i = 1597463007 - (i >> 1);
		number = Float.intBitsToFloat(i);
		return number * (1.5F - f * number * number);
	}
}
