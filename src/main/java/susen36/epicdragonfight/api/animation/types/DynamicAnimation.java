package susen36.epicdragonfight.api.animation.types;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.*;
import susen36.epicdragonfight.api.animation.property.AnimationProperty;
import susen36.epicdragonfight.api.client.animation.JointMask.BindModifier;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.client.renderer.DragonFightRenderTypes;
import susen36.epicdragonfight.client.renderer.RenderingTool;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Animations;

import java.util.*;

public abstract class DynamicAnimation {
	protected Map<String, TransformSheet> jointTransforms;
	protected final boolean isRepeat;
	protected final float convertTime;
	protected float totalTime = 0.0F;
	
	public DynamicAnimation() {
		this(0.15F, false);
	}
	
	public DynamicAnimation(float convertTime, boolean isRepeat) {
		this.jointTransforms = new HashMap<>();
		this.isRepeat = isRepeat;
		this.convertTime = convertTime;
	}
	
	public void addSheet(String jointName, TransformSheet sheet) {
		this.jointTransforms.put(jointName, sheet);
	}

	
	public Pose getPoseByTime(IDragonPatch entitypatch, float time, float partialTicks) {
		Pose pose = new Pose();
		
		for (String jointName : this.jointTransforms.keySet()) {
			if (!entitypatch.isLogicalClient() || this.isJointEnabled(entitypatch, jointName)) {
				pose.putJointData(jointName, this.jointTransforms.get(jointName).getInterpolatedTransform(time));
			}
		}
		
		this.modifyPose(pose, entitypatch, time);
		
		return pose;
	}
	
	/** Modify the pose which also modified in link animation. **/
	protected void modifyPose(Pose pose, IDragonPatch entitypatch, float time) {
	}
	
	public void setLinkAnimation(Pose pose1, float convertTimeModifier, IDragonPatch entitypatch, LinkAnimation dest) {
		if (!entitypatch.isLogicalClient()) {
			pose1 = Animations.DUMMY_ANIMATION.getPoseByTime(entitypatch, 0.0F, 1.0F);
		}
		
		float totalTime = convertTimeModifier >= 0.0F ? convertTimeModifier + this.convertTime : this.convertTime;
		boolean isNeg = convertTimeModifier < 0.0F;
		float nextStart = isNeg ? -convertTimeModifier : 0.0F;
		
		if (isNeg) {
			dest.startsAt = nextStart;
		}
		
		dest.getTransfroms().clear();
		dest.setTotalTime(totalTime);
		dest.setNextAnimation(this);
		
		Map<String, JointTransform> data1 = pose1.getJointTransformData();
		Map<String, JointTransform> data2 = this.getPoseByTime(entitypatch, nextStart, 1.0F).getJointTransformData();
		
		for (String jointName : data1.keySet()) {
			if (data1.containsKey(jointName) && data2.containsKey(jointName)) {
				Keyframe[] keyframes = new Keyframe[2];
				keyframes[0] = new Keyframe(0.0F, data1.get(jointName));
				keyframes[1] = new Keyframe(totalTime, data2.get(jointName));
				TransformSheet sheet = new TransformSheet(keyframes);
				dest.addSheet(jointName, sheet);
			}
		}
	}
	
	public void putOnPlayer(AnimationPlayer player) {
		player.setPlayAnimation(this);
	}
	
	public void begin(IDragonPatch entitypatch) {}
	public void tick(IDragonPatch entitypatch) {}
	public void end(IDragonPatch entitypatch, boolean isEnd) {}
	public void linkTick(IDragonPatch entitypatch, LinkAnimation linkAnimation) {}
	
	public boolean isJointEnabled(IDragonPatch entitypatch, String joint) {
		return this.jointTransforms.containsKey(joint);
	}
	
	public BindModifier getBindModifier(IDragonPatch entitypatch, String joint) {
		return null;
	}
	
	public EntityState getState(float time) {
		return EntityState.DEFAULT;
	}
	
	public Map<String, TransformSheet> getTransfroms() {
		return this.jointTransforms;
	}
	
	public float getPlaySpeed(IDragonPatch entitypatch) {
		return 1.0F;
	}
	
	public DynamicAnimation getRealAnimation() {
		return this;
	}
	
	public void setTotalTime(float totalTime) {
		this.totalTime = totalTime;
	}
	
	public float getTotalTime() {
		return this.totalTime - 0.001F;
	}
	
	public float getConvertTime() {
		return this.convertTime;
	}
	
	public boolean isRepeat() {
		return this.isRepeat;
	}
	
	public boolean canBePlayedReverse() {
		return false;
	}
	
	public int getNamespaceId() {
		return -1;
	}
	
	public int getId() {
		return -1;
	}
	
	public <V> Optional<V> getProperty(AnimationProperty<V> propertyType) {
		return Optional.empty();
	}
	
	public boolean isMainFrameAnimation() {
		return false;
	}
	
	public boolean isReboundAnimation() {
		return false;
	}
	
	public boolean isMetaAnimation() {
		return false;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void renderDebugging(PoseStack poseStack, MultiBufferSource buffer, IDragonPatch entitypatch, float playTime, float partialTicks, OpenMatrix4f[] poses, Armature armature) {
		Joint rootJoint = armature.getJointHierarcy();
		List<Vector3f> jointPositions = new ArrayList<>();
		List<int[]> connections = new ArrayList<>();
		this.collectJointData(rootJoint, poses, jointPositions, connections, -1);

		VertexConsumer quadBuilder = buffer.getBuffer(DragonFightRenderTypes.debugQuads());
		for (int i = 0; i < jointPositions.size(); i++) {
			RenderingTool.drawCube(poseStack, quadBuilder, jointPositions.get(i), 0.2F, 0.0F, 1.0F, 0.0F);
		}

		VertexConsumer lineBuilder = buffer.getBuffer(RenderType.lines());
		for (int[] conn : connections) {
			RenderingTool.drawLine(poseStack, lineBuilder, jointPositions.get(conn[0]), jointPositions.get(conn[1]), 0.0F, 1.0F, 0.0F);
		}
	}

	@OnlyIn(Dist.CLIENT)
	private void collectJointData(Joint joint, OpenMatrix4f[] poses, List<Vector3f> positions, List<int[]> connections, int parentIndex) {
		OpenMatrix4f pose = poses[joint.getId()];
		if (pose == null) {
			return;
		}

		Vector3f pos = new Vector3f(pose.m30, -pose.m31, pose.m32);

		int currentIndex = positions.size();
		positions.add(pos);

		if (parentIndex >= 0) {
			connections.add(new int[]{parentIndex, currentIndex});
		}

		for (Joint subJoint : joint.getSubJoints()) {
			this.collectJointData(subJoint, poses, positions, connections, currentIndex);
		}
	}
}