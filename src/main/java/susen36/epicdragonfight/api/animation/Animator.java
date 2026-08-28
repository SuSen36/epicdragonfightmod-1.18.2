package susen36.epicdragonfight.api.animation;

import com.google.common.collect.Maps;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.types.DynamicAnimation;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

import java.util.Map;

public abstract class Animator {
	protected Pose prevPose = new Pose();
	protected Pose currentPose = new Pose();
	protected final Map<LivingMotions, StaticAnimation> livingAnimations = Maps.newHashMap();
	
	protected IDragonPatch entitypatch;
	
	public abstract void playAnimation(StaticAnimation nextAnimation, float convertTimeModifier);
	public abstract void tick();
	/** Standby until the current animation is completely end. Mostly used for link two animations having the same last & first keyframe pose **/
	public abstract void reserveAnimation(StaticAnimation nextAnimation);
	public abstract EntityState getEntityState();
	/** Give a null value as a parameter to get an animation that is highest priority on client **/
	public abstract AnimationPlayer getPlayerFor(DynamicAnimation playingAnimation);
	public abstract void init();
	public abstract void poseTick();
	
	public final void playAnimation(int namespaceId, int id, float convertTimeModifier) {
		this.playAnimation(EpicDragonFight.getInstance().animationManager.findAnimationById(namespaceId, id), convertTimeModifier);
	}

	
	public Pose getPose(float partialTicks) {
		return Pose.interpolatePose(this.prevPose, this.currentPose, partialTicks);
	}


	public void addLivingAnimation(LivingMotions livingMotion, StaticAnimation animation) {
		this.livingAnimations.put(livingMotion, animation);
	}

	public void resetMotions() {
		this.livingAnimations.clear();
	}
}