package susen36.epicdragonfight.api.animation;

import com.google.common.collect.Maps;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.types.DynamicAnimation;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Animations;

import java.util.Map;

public class Animator {
	private final AnimationPlayer animationPlayer = new AnimationPlayer();
	protected final Map<LivingMotions, StaticAnimation> livingAnimations = Maps.newHashMap();
	protected IDragonPatch entitypatch;
	private LivingMotions currentMotion = LivingMotions.IDLE;
	private LivingMotions prevMotion = LivingMotions.IDLE;

	public static Animator getAnimator(IDragonPatch entitypatch) {
		return new Animator(entitypatch);
	}

	private Animator(IDragonPatch entitypatch) {
		this.entitypatch = entitypatch;
	}

	public void init() {
		StaticAnimation idleMotion = this.livingAnimations.getOrDefault(this.currentMotion, Animations.DUMMY_ANIMATION);
		this.animationPlayer.setPlayAnimation(idleMotion);
	}

	public void playAnimation(StaticAnimation nextAnimation, float convertTimeModifier) {
		this.animationPlayer.getAnimation().end(this.entitypatch, this.animationPlayer.isEnd());
		nextAnimation.begin(this.entitypatch);
		nextAnimation.putOnPlayer(this.animationPlayer);
	}

	public void playAnimation(int namespaceId, int id, float convertTimeModifier) {
		this.playAnimation(EpicDragonFight.getInstance().animationManager.findAnimationById(namespaceId, id), convertTimeModifier);
	}

	public void reserveAnimation(StaticAnimation nextAnimation) {
		this.animationPlayer.getAnimation().end(this.entitypatch, this.animationPlayer.isEnd());
		nextAnimation.begin(this.entitypatch);
		nextAnimation.putOnPlayer(this.animationPlayer);
	}

	public void tick() {
		this.animationPlayer.tick(this.entitypatch);
		this.animationPlayer.getAnimation().tick(this.entitypatch);
		this.entitypatch.updateEntityState();

		if (this.animationPlayer.isEnd() && !this.animationPlayer.getAnimation().isRepeat() && this.currentMotion != LivingMotions.DEATH) {
			this.playAnimation(getLivingAnimation(this.currentMotion), 0.0F);
		}
	}

	public void poseTick() {}

	public EntityState getEntityState() {
		return this.animationPlayer.getAnimation().getState(this.animationPlayer.getElapsedTime());
	}

	public AnimationPlayer getPlayerFor(DynamicAnimation playingAnimation) {
		return this.animationPlayer;
	}

	public void addLivingAnimation(LivingMotions livingMotion, StaticAnimation animation) {
		this.livingAnimations.put(livingMotion, animation);
	}

	public void resetMotions() {
		this.livingAnimations.clear();
	}

	public StaticAnimation getLivingAnimation(LivingMotions motion) {
		return this.livingAnimations.getOrDefault(motion, Animations.DUMMY_ANIMATION);
	}

	public LivingMotions getCurrentLivingMotion() {
		return this.currentMotion;
	}

	public void setCurrentLivingMotion(LivingMotions motion) {
		this.currentMotion = motion;
	}

	public void updateMotionFrom(IDragonPatch patch) {
		this.prevMotion = this.currentMotion;
		LivingMotions target = patch.getCurrentLivingMotion();

		if (this.prevMotion != target && !this.getEntityState().inaction()) {
			if (this.livingAnimations.containsKey(target)) {
				this.playAnimation(this.livingAnimations.get(target), 0.0F);
			}
			this.currentMotion = target;
		}
	}
}