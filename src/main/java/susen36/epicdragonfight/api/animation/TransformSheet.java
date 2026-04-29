package susen36.epicdragonfight.api.animation;

import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.util.Mth;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.util.List;

public class TransformSheet {
	private Keyframe[] keyframes;
	
	public TransformSheet(List<Keyframe> keyframeList) {
		this(keyframeList.toArray(new Keyframe[0]));
	}
	
	public TransformSheet(Keyframe[] keyframes) {
		this.keyframes = keyframes;
	}
	
	public TransformSheet() {
		this(new Keyframe[0]);
	}
	
	public JointTransform getStartTransform() {
		return this.keyframes[0].transform();
	}
	
	public Keyframe[] getKeyframes() {
		return this.keyframes;
	}
	
	public TransformSheet copyAll() {
		return this.copy(0, this.keyframes.length);
	}
	
	public TransformSheet copy(int start, int end) {
		int len = end - start;
		Keyframe[] newKeyframes = new Keyframe[len];
		
		for (int i = 0; i < len; i++) {
			Keyframe kf = this.keyframes[i + start];
			newKeyframes[i] = new Keyframe(kf);
		}
		
		return new TransformSheet(newKeyframes);
	}
	
	public TransformSheet readFrom(TransformSheet opponent) {
		if (opponent.keyframes.length != this.keyframes.length) {
			this.keyframes = new Keyframe[opponent.keyframes.length];
			
			for (int i = 0; i < this.keyframes.length; i++) {
				this.keyframes[i] = new Keyframe(0.0F, JointTransform.empty());
			}
		}
		
		for (int i = 0; i < this.keyframes.length; i++) {
			this.keyframes[i].copyFrom(opponent.keyframes[i]);
		}
		
		return this;
	}
	
	public Vector3f getInterpolatedTranslation(float currentTime) {
		InterpolationInfo interpolInfo = this.getInterpolationInfo(currentTime);
        return MathUtils.lerpVector(this.keyframes[interpolInfo.prev].transform().translation(), this.keyframes[interpolInfo.next].transform().translation(), interpolInfo.zero2One);
	}
	
	public Quaternion getInterpolatedRotation(float currentTime) {
		InterpolationInfo interpolInfo = this.getInterpolationInfo(currentTime);
        return MathUtils.lerpQuaternion(this.keyframes[interpolInfo.prev].transform().rotation(), this.keyframes[interpolInfo.next].transform().rotation(), interpolInfo.zero2One);
	}
	
	public JointTransform getInterpolatedTransform(float currentTime) {
		InterpolationInfo interpolInfo = this.getInterpolationInfo(currentTime);
        return JointTransform.interpolate(this.keyframes[interpolInfo.prev].transform(), this.keyframes[interpolInfo.next].transform(), interpolInfo.zero2One);
	}
	
	public void correctAnimationByNewPosition(Vector3f startpos, Vector3f startToEnd, Vector3f modifiedStart, Vector3f modifiedStartToEnd) {
		Keyframe[] keyframes = this.getKeyframes();
		Keyframe startKeyframe = keyframes[0];
		Keyframe endKeyframe = keyframes[keyframes.length - 1];
		float modifiedLength = (float) Math.sqrt(modifiedStartToEnd.dot(modifiedStartToEnd));
		float pitchDeg = (float) Math.toDegrees(Mth.atan2(modifiedStartToEnd.y - startToEnd.y, modifiedLength));
		Vector3f modifiedDir = modifiedStartToEnd.copy();
		modifiedDir.mul(1.0F, 0.0F, 1.0F);
		modifiedDir.normalize();
		Vector3f startDir = startToEnd.copy();
		startDir.mul(1.0F, 0.0F, 1.0F);
		startDir.normalize();
		float yawDeg = (float) Math.toDegrees(MathUtils.getAngleBetween(modifiedDir, startDir));
		
		for (Keyframe kf : keyframes) {
			float lerp = (kf.time() - startKeyframe.time()) / (endKeyframe.time() - startKeyframe.time());
			Vector3f line = MathUtils.lerpVector(new Vector3f(0F, 0F, 0F), startToEnd, lerp);
			Vector3f modifiedLine = MathUtils.lerpVector(new Vector3f(0F, 0F, 0F), modifiedStartToEnd, lerp);
			Vector3f keyTransform = kf.transform().translation();
			Vector3f startToKeyTransform = keyTransform.copy();
			startToKeyTransform.sub(startpos);
			startToKeyTransform.mul(-1.0F, 1.0F, -1.0F);
			Vector3f animOnLine = startToKeyTransform.copy();
			animOnLine.sub(line);
			OpenMatrix4f rotator = OpenMatrix4f.createRotatorDeg(pitchDeg, Vector3f.XP).mulFront(OpenMatrix4f.createRotatorDeg(yawDeg, Vector3f.YP));
			Vector3f transformedAnimOnLine = new Vector3f();
			OpenMatrix4f.transform3v(rotator, animOnLine, transformedAnimOnLine);
			Vector3f toNewKeyTransform = modifiedLine.copy();
			toNewKeyTransform.add(transformedAnimOnLine);
			keyTransform.set(modifiedStart.x + toNewKeyTransform.x, modifiedStart.y + toNewKeyTransform.y, modifiedStart.z + toNewKeyTransform.z);
		}
	}
	
	private InterpolationInfo getInterpolationInfo(float currentTime) {
		int prev = 0, next = 1;
		
		for (int i = 1; i < this.keyframes.length; i++) {
			if (currentTime <= this.keyframes[i].time()) {
				break;
			}
			
			if (this.keyframes.length > next + 1) {
				prev++;
				next++;
			} else {
				EpicDragonFight.LOGGER.error("time exceeded keyframe length. current : " + currentTime + " max : " + this.keyframes[this.keyframes.length - 1].time());
				(new IllegalArgumentException()).printStackTrace();
			}
		}
		
		float progression = bezierCurve((currentTime - this.keyframes[prev].time()) / (this.keyframes[next].time() - this.keyframes[prev].time()));
		
		return new InterpolationInfo(prev, next, progression);
	}
	
	//Blender bezier f-curve code
	private static float bezierCurve(float t) {
		
		float p1 = 0.0F;
		float p2 = 0.0F;
		float p3 = 1.0F;
		float p4 = 1.0F;
		float v1, v2, v3, v4;
		
		v1 = p1;
		v2 = 3.0f * (p2 - p1);
		v3 = 3.0f * (p1 - 2.0f * p2 + p3);
		v4 = p4 - p1 + 3.0f * (p2 - p3);
		
		return v1 + t * v2 + t * t * v3 + t * t * t * v4;
	}
	
	@Override
	public String toString() {
		return "total " + this.keyframes.length + " frames";
	}
	
	private static class InterpolationInfo {
		private final int prev;
		private final int next;
		private final float zero2One;
		
		private InterpolationInfo(int prev, int next, float zero2One) {
			this.prev = prev;
			this.next = next;
			this.zero2One = zero2One;
		}
	}
}