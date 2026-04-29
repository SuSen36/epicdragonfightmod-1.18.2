package susen36.epicdragonfight.api.animation;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.types.DynamicAnimation;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.LinkAnimation;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.client.animation.JointMask.BindModifier;
import susen36.epicdragonfight.api.client.animation.Layer;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Animations;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Animator {
	protected Pose prevPose = new Pose();
	protected Pose currentPose = new Pose();
	protected final Map<LivingMotions, StaticAnimation> livingAnimations = Maps.newHashMap();

	protected IDragonPatch entitypatch;

	public final AnimationPlayer animationPlayer;
	protected DynamicAnimation nextPlaying;
	private LinkAnimation linkAnimation;
	public boolean pause = false;

	private final Map<LivingMotions, StaticAnimation> compositeLivingAnimations;
	private final Map<LivingMotions, StaticAnimation> defaultLivingAnimations;
	private final Map<LivingMotions, StaticAnimation> defaultCompositeLivingAnimations;
	public final Layer.BaseLayer baseLayer;
	private LivingMotions currentMotion;
	private LivingMotions currentCompositeMotion;

	public static Animator getAnimator(IDragonPatch entitypatch) {
		return new Animator(entitypatch);
	}

	public Animator(IDragonPatch entitypatch) {
		this.entitypatch = entitypatch;
		this.linkAnimation = new LinkAnimation();
		this.animationPlayer = new AnimationPlayer();

		if (this.isLogicalClient()) {
			this.currentMotion = LivingMotions.IDLE;
			this.currentCompositeMotion = LivingMotions.IDLE;
			this.compositeLivingAnimations = Maps.newHashMap();
			this.defaultLivingAnimations = Maps.newHashMap();
			this.defaultCompositeLivingAnimations = Maps.newHashMap();
			this.baseLayer = new Layer.BaseLayer(null);
		} else {
			this.compositeLivingAnimations = null;
			this.defaultLivingAnimations = null;
			this.defaultCompositeLivingAnimations = null;
			this.baseLayer = null;
		}
	}

	public void playAnimation(StaticAnimation nextAnimation, float convertTimeModifier) {
		if (this.isLogicalClient()) {
			Layer layer = nextAnimation.getLayerType() == Layer.LayerType.BASE_LAYER ? this.baseLayer : this.baseLayer.compositeLayers.get(nextAnimation.getPriority());
			layer.paused = false;
			layer.playAnimation(nextAnimation, this.entitypatch, convertTimeModifier);
		} else {
			this.pause = false;
			this.animationPlayer.getAnimation().end(this.entitypatch, this.animationPlayer.isEnd());
			nextAnimation.begin(this.entitypatch);
			nextAnimation.setLinkAnimation(nextAnimation.getPoseByTime(this.entitypatch, 0.0F, 0.0F), convertTimeModifier, this.entitypatch, this.linkAnimation);
			this.linkAnimation.putOnPlayer(this.animationPlayer);
			this.entitypatch.updateEntityState();
			this.nextPlaying = nextAnimation;
		}
	}

	public void reserveAnimation(StaticAnimation nextAnimation) {
		if (this.isLogicalClient()) {
			this.baseLayer.paused = false;
			this.baseLayer.nextAnimation = nextAnimation;
			this.baseLayer.playAnimationInstant(nextAnimation, this.entitypatch);
		} else {
			this.pause = false;
			this.nextPlaying = nextAnimation;
		}
	}

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

	public void resetMotions() {
		this.livingAnimations.clear();
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

	public void setPoseToModel(float partialTicks) {
		Joint rootJoint = this.entitypatch.getEntityModel().getArmature().getJointHierarcy();
		this.applyPoseToJoint(rootJoint, new OpenMatrix4f(), this.getPose(partialTicks));
	}

	public void applyPoseToJoint(Joint joint, OpenMatrix4f parentTransform, Pose pose) {
		OpenMatrix4f result = pose.getOrDefaultTransform(joint.getName()).getAnimationBindedMatrix(joint, parentTransform);
		joint.setAnimatedTransform(result);

		for (Joint joints : joint.getSubJoints()) {
			this.applyPoseToJoint(joints, result, pose);
		}
	}

	public void init() {
		if (this.isLogicalClient()) {
			this.entitypatch.initAnimator(this);
			StaticAnimation idleMotion = this.livingAnimations.get(this.currentMotion);
			this.baseLayer.playAnimationInstant(idleMotion, this.entitypatch);
		}
	}

	public void poseTick() {
		this.prevPose = this.currentPose;

		if (this.isLogicalClient()) {
			this.currentPose = this.getComposedLayerPose(1.0F);
		} else {
			this.currentPose = this.animationPlayer.getCurrentPose(this.entitypatch, 1.0F);
		}
	}

	public void tick() {
		if (this.isLogicalClient()) {
			this.tickClient();
		} else {
			this.tickServer();
		}
	}

	private void tickServer() {
		if (this.pause) {
			this.entitypatch.updateEntityState();
			return;
		}

		this.animationPlayer.tick(this.entitypatch);
		this.poseTick();
		this.entitypatch.updateEntityState();
		this.animationPlayer.getAnimation().tick(this.entitypatch);

		if (this.animationPlayer.isEnd()) {
			this.animationPlayer.getAnimation().end(this.entitypatch, true);

			if (this.nextPlaying == null) {
				Animations.DUMMY_ANIMATION.putOnPlayer(this.animationPlayer);
				this.pause = true;
			} else {
				if (!(this.animationPlayer.getAnimation() instanceof LinkAnimation) && !(this.nextPlaying instanceof LinkAnimation)) {
					this.nextPlaying.begin(this.entitypatch);
				}

				this.nextPlaying.putOnPlayer(this.animationPlayer);
				this.nextPlaying = null;
			}
		}
	}

	private void tickClient() {
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
		Map<Layer.Priority, Pair<DynamicAnimation, Pose>> layerPoses = Maps.newLinkedHashMap();
		layerPoses.put(Layer.Priority.LOWEST, Pair.of(this.baseLayer.animationPlayer.getAnimation(), currentBasePose));

		for (Map.Entry<String, JointTransform> transformEntry : currentBasePose.getJointTransformData().entrySet()) {
			composedPose.putJointData(transformEntry.getKey(), transformEntry.getValue());
		}

		for (Layer.Priority priority : this.baseLayer.baserLayerPriority.uppers()) {
			Layer compositeLayer = this.baseLayer.compositeLayers.get(priority);

			if (!compositeLayer.isDisabled()) {
				Pose layerPose = compositeLayer.animationPlayer.getCurrentPose(this.entitypatch, compositeLayer.paused ? 1.0F : partialTicks);
				layerPoses.put(priority, Pair.of(compositeLayer.animationPlayer.getAnimation(), layerPose));

				for (Map.Entry<String, JointTransform> transformEntry : layerPose.getJointTransformData().entrySet()) {
					composedPose.getJointTransformData().put(transformEntry.getKey(), transformEntry.getValue());
				}
			}
		}

		Joint rootJoint = this.entitypatch.getEntityModel().getArmature().getJointHierarcy();
		this.applyBindModifier(composedPose, rootJoint, layerPoses);

		return composedPose;
	}

	public Pose getComposedLayerPoseBelow(Layer.Priority priorityLimit, float partialTicks) {
		Pose composedPose = this.baseLayer.animationPlayer.getCurrentPose(this.entitypatch, partialTicks);
		Map<Layer.Priority, Pair<DynamicAnimation, Pose>> layerPoses = Maps.newLinkedHashMap();

		for (Layer.Priority priority : priorityLimit.lowers()) {
			Layer compositeLayer = this.baseLayer.compositeLayers.get(priority);

			if (!compositeLayer.isDisabled()) {
				Pose layerPose = compositeLayer.animationPlayer.getCurrentPose(this.entitypatch, compositeLayer.paused ? 1.0F : partialTicks);
				layerPoses.put(priority, Pair.of(compositeLayer.animationPlayer.getAnimation(), layerPose));

				for (Map.Entry<String, JointTransform> transformEntry : layerPose.getJointTransformData().entrySet()) {
					composedPose.getJointTransformData().put(transformEntry.getKey(), transformEntry.getValue());
				}
			}
		}

		Joint rootJoint = this.entitypatch.getEntityModel().getArmature().getJointHierarcy();
		this.applyBindModifier(composedPose, rootJoint, layerPoses);

		return composedPose;
	}

	public void applyBindModifier(Pose result, Joint joint, Map<Layer.Priority, Pair<DynamicAnimation, Pose>> poses) {
		List<Layer.Priority> list = Lists.newArrayList(poses.keySet());
		Collections.reverse(list);

		for (Layer.Priority priority : list) {
			DynamicAnimation nowPlaying = poses.get(priority).getFirst();

			if (nowPlaying.isJointEnabled(this.entitypatch, joint.getName())) {
				BindModifier bindModifier = nowPlaying.getBindModifier(this.entitypatch, joint.getName());

				if (bindModifier != null) {
					bindModifier.modify(this, result, priority, joint, poses);
				}

				break;
			}
		}

		for (Joint subJoints : joint.getSubJoints()) {
			this.applyBindModifier(result, subJoints, poses);
		}
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

	public AnimationPlayer getPlayerFor(DynamicAnimation playingAnimation) {
		if (this.isLogicalClient()) {
			for (Layer layer : this.baseLayer.compositeLayers.values()) {
				if (layer.animationPlayer.getAnimation().equals(playingAnimation)) {
					return layer.animationPlayer;
				}
			}

			return this.baseLayer.animationPlayer;
		}

		return this.animationPlayer;
	}

	public EntityState getEntityState() {
		if (this.isLogicalClient()) {
			return this.baseLayer.animationPlayer.getAnimation().getState(this.baseLayer.animationPlayer.getElapsedTime());
		}

		return this.animationPlayer.getAnimation().getState(this.animationPlayer.getElapsedTime());
	}

	public Pose getPose(float partialTicks) {
		return Pose.interpolatePose(this.prevPose, this.currentPose, partialTicks);
	}

	public final void playAnimation(int namespaceId, int id, float convertTimeModifier) {
		this.playAnimation(EpicDragonFight.getInstance().animationManager.findAnimationById(namespaceId, id), convertTimeModifier);
	}

	public static OpenMatrix4f getBindedJointTransformByName(Pose pose, Armature armature, String jointName) {
		return getBindedJointTransformByIndex(pose, armature, armature.searchPathIndex(jointName));
	}

	public static OpenMatrix4f getBindedJointTransformByIndex(Pose pose, Armature armature, long pathIndex) {
		armature.initializeTransform();
		return getBindedJointTransformByIndexInternal(pose, armature.getJointHierarcy(), new OpenMatrix4f(), pathIndex);
	}

	private static OpenMatrix4f getBindedJointTransformByIndexInternal(Pose pose, Joint joint, OpenMatrix4f parentTransform, long pathIndex) {
		JointTransform jt = pose.getOrDefaultTransform(joint.getName());
		OpenMatrix4f result = jt.getAnimationBindedMatrix(joint, parentTransform);
		long nextIndex = pathIndex % 10;
		return nextIndex > 0 ? getBindedJointTransformByIndexInternal(pose, joint.getSubJoints().get((int)(nextIndex - 1)), result, pathIndex / 10) : result;
	}

	public IDragonPatch getOwner() {
		return this.entitypatch;
	}

	private boolean isLogicalClient() {
		return this.entitypatch.isLogicalClient();
	}
}