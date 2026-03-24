package susen36.epicdragonfight.api.animation.types.procedural;

import org.joml.Vector3f;
import susen36.epicdragonfight.api.animation.JointTransform;
import susen36.epicdragonfight.api.animation.Keyframe;
import susen36.epicdragonfight.api.animation.TransformSheet;

public class TipPointAnimation {
	public final IKInfo ikSetter;
	private final TransformSheet animation;
	private Vector3f targetpos;
	private float time;
	private float startTime;
	private float totalTime;
	private float dt;
	private boolean isWorking;
	private boolean isTouchingGround;
	
	public TipPointAnimation(TransformSheet animation, Vector3f initpos, IKInfo ikSetter) {
		this.animation = animation;
		this.targetpos = initpos;
		this.ikSetter = ikSetter;
		this.time = 0.0F;
	}
	
	public boolean isOnWorking() {
		return this.isWorking;
	}
	
	public float getTime(float partialTicks) {
		float curTime = this.time - this.dt * (1.0F - partialTicks);
		return curTime * (this.totalTime - this.startTime) + this.startTime;
	}
	
	public void start(Vector3f targetpos, TransformSheet animation, float speed) {
		this.isWorking = true;
		this.time = 0.0F;
		this.targetpos = targetpos;
		Keyframe[] keyframes = animation.getKeyframes();
		this.startTime = keyframes[0].time();
		this.totalTime = keyframes[keyframes.length - 1].time();
		this.dt = (1.0F / (this.totalTime - this.startTime) * 0.05F) * speed;// * 0.05F;
		
		if (this.animation != animation) { 
			this.animation.readFrom(animation);
		}
	}

	public void newTargetPosition(Vector3f targetpos) {
		Vector3f dv = new Vector3f(targetpos);
		dv.sub(this.targetpos);

		this.targetpos = targetpos;
		Keyframe[] keyframes = this.animation.getKeyframes();
		float curTime = this.getTime(1.0F);
		int startFrame = 0;

		while (startFrame < keyframes.length && keyframes[startFrame].time() < curTime) {
			startFrame++;
		}

		for (int i = startFrame; i < keyframes.length; i++) {
			Vector3f translation = keyframes[i].transform().translation();
			translation.add(dv);
		}
	}
	
	public void tick() {
		this.time += this.dt;
		
		if (this.time >= 1.0F) {
			this.isWorking = false;
			this.time = 1.0F;
		}
		
		Keyframe[] keyframes = this.animation.getKeyframes();
		float curTime = this.getTime(1.0F);
		int startFrame = 0;
		
		while (keyframes[startFrame].time() < curTime) {
			startFrame++;
		}
		
		boolean[] touchGround = this.ikSetter.touchingGround;
		
		if (startFrame >= touchGround.length) {
			this.isTouchingGround = touchGround[touchGround.length - 1];
		} else if (startFrame == 0) {
			this.isTouchingGround = touchGround[0];
		} else {
			this.isTouchingGround = touchGround[startFrame - 1] && touchGround[startFrame];
		}
	}
	
	public Vector3f getTipPosition(float partialTicks) {
		return this.animation.getInterpolatedTranslation(this.getTime(partialTicks));
	}
	
	public JointTransform getTipTransform(float partialTicks) {
		return this.animation.getInterpolatedTransform(this.getTime(partialTicks));
	}
	
	public Vector3f getTargetPosition() {
		return this.targetpos;
	}
	
	public TransformSheet getAnimation() {
		return this.animation;
	}
	
	public boolean isTouchingGround() {
		return this.isTouchingGround;
	}
}
