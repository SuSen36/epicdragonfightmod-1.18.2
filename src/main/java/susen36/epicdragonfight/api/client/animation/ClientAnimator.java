package susen36.epicdragonfight.api.client.animation;

import com.google.common.collect.Maps;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.*;
import susen36.epicdragonfight.api.animation.types.DynamicAnimation;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Animations;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class ClientAnimator extends Animator {
	public static Animator getAnimator(IDragonPatch entitypatch) {
        return entitypatch.getOriginal().level.isClientSide() ? new ClientAnimator(entitypatch):null;
	}

	private final Map<LivingMotions, StaticAnimation> compositeLivingAnimations;
	private final Map<LivingMotions, StaticAnimation> defaultLivingAnimations;
	private final Map<LivingMotions, StaticAnimation> defaultCompositeLivingAnimations;
	public final Layer.BaseLayer baseLayer;
	private LivingMotions currentMotion;
	private LivingMotions currentCompositeMotion;

	public ClientAnimator(IDragonPatch entitypatch) {
		this.entitypatch = entitypatch;
		this.currentMotion = LivingMotions.IDLE;
		this.currentCompositeMotion = LivingMotions.IDLE;
		this.compositeLivingAnimations = Maps.newHashMap();
		this.defaultLivingAnimations = Maps.newHashMap();
		this.defaultCompositeLivingAnimations = Maps.newHashMap();
		this.baseLayer = new Layer.BaseLayer(null);
	}

	/** Play an animation by animation instance **/
	@Override
	public void playAnimation(StaticAnimation nextAnimation, float convertTimeModifier) {
		Layer layer = nextAnimation.getLayerType() == Layer.LayerType.BASE_LAYER ? this.baseLayer : this.baseLayer.compositeLayers.get(nextAnimation.getPriority());
		layer.paused = false;
		layer.playAnimation(nextAnimation, this.entitypatch, convertTimeModifier);
	}

	@Override
	public void reserveAnimation(StaticAnimation nextAnimation) {
		this.baseLayer.paused = false;
		this.baseLayer.nextAnimation = nextAnimation;
		this.baseLayer.playAnimationInstant(nextAnimation, this.entitypatch);
	}

	@Override
	public void addLivingAnimation(LivingMotions livingMotion, StaticAnimation animation) {
		Layer.LayerType layerType = animation.getLayerType();

		switch (layerType) {
			case BASE_LAYER:
				this.addBaseLivingAnimation(livingMotion, animation);
				break;
			case COMPOSITE_LAYER:
				this.addCompositeLivingAnimation(livingMotion, animation);
				break;
		}
	}

	protected void addBaseLivingAnimation(LivingMotions livingMotion, StaticAnimation animation) {
		this.livingAnimations.put(livingMotion, animation);

		if (livingMotion == this.currentMotion) {
			EntityState state = this.getEntityState();

			if (!state.inaction()) {
				this.playAnimation(animation, 0.0F);
			}
		}
	}

	protected void addCompositeLivingAnimation(LivingMotions livingMotion, StaticAnimation animation) {
		if (animation != null) {
			this.compositeLivingAnimations.put(livingMotion, animation);

			if (livingMotion == this.currentCompositeMotion) {
				EntityState state = this.getEntityState();

				if (!state.inaction()) {
					this.playAnimation(animation, 0.0F);
				}
			}
		}
	}

	public void setCurrentMotionsAsDefault() {
        this.defaultLivingAnimations.putAll(this.livingAnimations);
        this.defaultCompositeLivingAnimations.putAll(this.compositeLivingAnimations);
	}

	@Override
	public void resetMotions() {
		super.resetMotions();
		this.compositeLivingAnimations.clear();
        this.livingAnimations.putAll(this.defaultLivingAnimations);
        this.compositeLivingAnimations.putAll(this.defaultCompositeLivingAnimations);
	}

	public StaticAnimation getLivingMotion(LivingMotions motion) {
		return this.livingAnimations.getOrDefault(motion, Animations.DUMMY_ANIMATION);
	}

	public StaticAnimation getCompositeLivingMotion(LivingMotions motion) {
		return this.compositeLivingAnimations.getOrDefault(motion, Animations.DUMMY_ANIMATION);
	}

	@Override
	public void init() {
		this.entitypatch.initAnimator(this);
		StaticAnimation idleMotion = this.livingAnimations.get(this.currentMotion);
		this.baseLayer.playAnimationInstant(idleMotion, this.entitypatch);
	}

	@Override
	public void poseTick() {
		this.prevPose = this.currentPose;
		this.currentPose = this.getComposedLayerPose(1.0F);
	}

	@Override
	public void tick() {
		this.baseLayer.update(this.entitypatch);
		this.poseTick();

		if (this.baseLayer.animationPlayer.isEnd() && this.baseLayer.nextAnimation == null && this.currentMotion != LivingMotions.DEATH) {
			this.entitypatch.updateMotion(false);
			this.baseLayer.playAnimation(this.getLivingMotion(this.entitypatch.getCurrentLivingMotion()), this.entitypatch, 0.0F);
		}

		if (!this.compareCompositeMotion(this.entitypatch.getCurrentCompositeMotion())) {
			if (this.compositeLivingAnimations.containsKey(this.entitypatch.getCurrentCompositeMotion())) {
				this.playAnimation(this.getCompositeLivingMotion(this.entitypatch.getCurrentCompositeMotion()), 0.0F);
			} else {
				this.getCompositeLayer(Layer.Priority.MIDDLE).off(this.entitypatch);
			}
		}

		if (!this.compareMotion(this.entitypatch.getCurrentLivingMotion())) {
			if (this.livingAnimations.containsKey(this.entitypatch.getCurrentLivingMotion())) {
				this.baseLayer.playAnimation(this.getLivingMotion(this.entitypatch.getCurrentLivingMotion()), this.entitypatch, 0.0F);
			}
		}

		this.currentMotion = this.entitypatch.getCurrentLivingMotion();
		this.currentCompositeMotion = this.entitypatch.getCurrentCompositeMotion();
	}

	public Layer getCompositeLayer(Layer.Priority priority) {
		return this.baseLayer.compositeLayers.get(priority);
	}

	public Pose getComposedLayerPose(float partialTicks) {
		Pose composedPose = new Pose();
		Pose currentBasePose = this.baseLayer.animationPlayer.getCurrentPose(this.entitypatch, partialTicks);

		for (Map.Entry<String, JointTransform> transformEntry : currentBasePose.getJointTransformData().entrySet()) {
			composedPose.putJointData(transformEntry.getKey(), transformEntry.getValue());
		}

		for (Layer.Priority priority : this.baseLayer.baserLayerPriority.uppers()) {
			Layer compositeLayer = this.baseLayer.compositeLayers.get(priority);

			if (!compositeLayer.isDisabled()) {
				Pose layerPose = compositeLayer.animationPlayer.getCurrentPose(this.entitypatch, compositeLayer.paused ? 1.0F : partialTicks);

				for (Map.Entry<String, JointTransform> transformEntry : layerPose.getJointTransformData().entrySet()) {
					composedPose.getJointTransformData().put(transformEntry.getKey(), transformEntry.getValue());
				}
			}
		}

		return composedPose;
	}

	public Pose getComposedLayerPoseBelow(Layer.Priority priorityLimit, float partialTicks) {
		Pose composedPose = this.baseLayer.animationPlayer.getCurrentPose(this.entitypatch, partialTicks);

		for (Layer.Priority priority : priorityLimit.lowers()) {
			Layer compositeLayer = this.baseLayer.compositeLayers.get(priority);

			if (!compositeLayer.isDisabled()) {
				Pose layerPose = compositeLayer.animationPlayer.getCurrentPose(this.entitypatch, compositeLayer.paused ? 1.0F : partialTicks);

				for (Map.Entry<String, JointTransform> transformEntry : layerPose.getJointTransformData().entrySet()) {
					composedPose.getJointTransformData().put(transformEntry.getKey(), transformEntry.getValue());
				}
			}
		}

		return composedPose;
	}

	public boolean compareMotion(LivingMotions motion) {
        return this.currentMotion == motion;
	}

	public boolean compareCompositeMotion(LivingMotions motion) {
		return this.currentCompositeMotion == motion;
	}

	public void resetMotion() {
		this.currentMotion = LivingMotions.IDLE;
		this.entitypatch.setCurrentLivingMotion(LivingMotions.IDLE);
	}

	public void resetCompositeMotion() {
		this.currentCompositeMotion = LivingMotions.NONE;
		this.entitypatch.setCurrentCompositeMotion(LivingMotions.NONE);
	}

	@Override
	public AnimationPlayer getPlayerFor(DynamicAnimation playingAnimation) {
		for (Layer layer : this.baseLayer.compositeLayers.values()) {
			if (layer.animationPlayer.getAnimation().equals(playingAnimation)) {
				return layer.animationPlayer;
			}
		}

		return this.baseLayer.animationPlayer;
	}

	public IDragonPatch getOwner() {
		return this.entitypatch;
	}

	@Override
	public EntityState getEntityState() {
		return this.baseLayer.animationPlayer.getAnimation().getState(this.baseLayer.animationPlayer.getElapsedTime());
	}
}