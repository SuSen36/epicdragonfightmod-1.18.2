package susen36.epicdragonfight.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.EnderDragonRenderer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import susen36.epicdragonfight.api.animation.Joint;
import susen36.epicdragonfight.api.client.model.ClientModel;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Models;

import java.util.Map;

@Mixin(value = EnderDragonRenderer.DragonModel.class)
public abstract class MixinEnderDragonModel {
	@Shadow
	@Final
	private ModelPart head;

	@Shadow
	@Final
	private ModelPart jaw;

	@Shadow
	@Final
	private ModelPart body;

	@Shadow
	@Final
	private ModelPart leftWing;

	@Shadow
	@Final
	private ModelPart leftWingTip;

	@Shadow
	@Final
	private ModelPart leftFrontLeg;

	@Shadow
	@Final
	private ModelPart leftFrontLegTip;

	@Shadow
	@Final
	private ModelPart leftFrontFoot;

	@Shadow
	@Final
	private ModelPart leftRearLeg;

	@Shadow
	@Final
	private ModelPart leftRearLegTip;

	@Shadow
	@Final
	private ModelPart leftRearFoot;

	@Shadow
	@Final
	private ModelPart rightWing;

	@Shadow
	@Final
	private ModelPart rightWingTip;

	@Shadow
	@Final
	private ModelPart rightFrontLeg;

	@Shadow
	@Final
	private ModelPart rightFrontLegTip;

	@Shadow
	@Final
	private ModelPart rightFrontFoot;

	@Shadow
	@Final
	private ModelPart rightRearLeg;

	@Shadow
	@Final
	private ModelPart rightRearLegTip;

	@Shadow
	@Final
	private ModelPart rightRearFoot;

	@Shadow
	private EnderDragon entity;

	@Shadow
	private float a;

	@Shadow @Final private ModelPart neck;

	@Shadow protected abstract void renderSide(PoseStack p_173978_, VertexConsumer p_173979_, int p_173980_, int p_173981_, float p_173982_, ModelPart p_173983_, ModelPart p_173984_, ModelPart p_173985_, ModelPart p_173986_, ModelPart p_173987_, ModelPart p_173988_, ModelPart p_173989_, float p_173990_);

	@Unique
	private static final String[] NECK_JOINT_NAMES = {"neck", "neck2", "neck3", "neck4", "neck5"};

	@Unique
	private static final String[] TAIL_JOINT_NAMES = {
		"neck_tail_1", "neck_tail_2", "neck_tail_3", "neck_tail_4",
		"neck_tail_5", "neck_tail_6", "neck_tail_7", "neck_tail_8",
		"neck_tail_9", "neck_tail_10", "neck_tail_11", "neck_tail_12"
	};

	@Inject(method = "renderToBuffer", at = @At("HEAD"), cancellable = true)
	public void renderToBuffer(PoseStack poseStack, VertexConsumer consumer, int packedLight, int overlayCoord, float r, float g, float b, float alpha, CallbackInfo cir) {
		if (this.entity instanceof IDragonPatch dragonPatch) {
			this.renderAnimated(poseStack, consumer, packedLight, overlayCoord, alpha, dragonPatch);
			cir.cancel();
		}
	}

	@Unique
	private void renderAnimated(PoseStack poseStack, VertexConsumer consumer, int packedLight, int overlayCoord,float alpha, IDragonPatch dragonPatch) {
		ClientModel model = Models.getClientModels().dragon;
		Armature armature = model.getArmature();
		Map<String, Joint> jointMap = armature.getJointByNameMap();

		OpenMatrix4f[] poses = this.getPoseMatrices(dragonPatch, armature, this.a);

		this.applyPoseToPart(this.jaw, poses, jointMap, "jaw", jointMap.get("head").getAnimatedTransform());
		this.applyPoseToPart(this.body, poses, jointMap, "body");
		this.applyPoseToPart(this.leftWing, poses, jointMap, "left_wing");
		this.applyPoseToPart(this.leftWingTip, poses, jointMap, "left_wing_tip", jointMap.get("left_wing").getAnimatedTransform());
		this.applyPoseToPart(this.rightWing, poses, jointMap, "right_wing");
		this.applyPoseToPart(this.rightWingTip, poses, jointMap, "right_wing_tip", jointMap.get("right_wing").getAnimatedTransform());
		this.applyPoseToPart(this.leftFrontLeg, poses, jointMap, "left_front_leg");
		this.applyPoseToPart(this.leftFrontLegTip, poses, jointMap, "left_front_leg_tip", jointMap.get("left_front_leg").getAnimatedTransform());
		this.applyPoseToPart(this.leftFrontFoot, poses, jointMap, "left_front_foot", jointMap.get("left_front_leg_tip").getAnimatedTransform());
		this.applyPoseToPart(this.leftRearLeg, poses, jointMap, "left_hind_leg");
		this.applyPoseToPart(this.leftRearLegTip, poses, jointMap, "left_hind_leg_tip", jointMap.get("left_hind_leg").getAnimatedTransform());
		this.applyPoseToPart(this.leftRearFoot, poses, jointMap, "left_hind_foot", jointMap.get("left_hind_leg_tip").getAnimatedTransform());
		this.applyPoseToPart(this.rightFrontLeg, poses, jointMap, "right_front_leg");
		this.applyPoseToPart(this.rightFrontLegTip, poses, jointMap, "right_front_leg_tip", jointMap.get("right_front_leg").getAnimatedTransform());
		this.applyPoseToPart(this.rightFrontFoot, poses, jointMap, "right_front_foot", jointMap.get("right_front_leg_tip").getAnimatedTransform());
		this.applyPoseToPart(this.rightRearLeg, poses, jointMap, "right_hind_leg");
		this.applyPoseToPart(this.rightRearLegTip, poses, jointMap, "right_hind_leg_tip", jointMap.get("right_hind_leg").getAnimatedTransform());
		this.applyPoseToPart(this.rightRearFoot, poses, jointMap, "right_hind_foot", jointMap.get("right_hind_leg_tip").getAnimatedTransform());

		float flapTime = Mth.lerp(this.a, this.entity.oFlapTime, this.entity.flapTime);

		for (int i = 0; i < 5; i++) {
			this.applyPoseToPart(this.neck, poses, jointMap, NECK_JOINT_NAMES[i]);
			this.neck.render(poseStack, consumer, packedLight, overlayCoord, 1.0F, 1.0F, 1.0F, alpha);
		}

		this.applyPoseToPart(this.head, poses, jointMap, "head");
		this.head.render(poseStack, consumer, packedLight, overlayCoord, 1.0F, 1.0F, 1.0F, alpha);

		poseStack.pushPose();
		poseStack.translate(0.0F, 1.0F, 0.0F);
		float bodyZRot = dragonPatch.getOriginal().dragonDeathTime > 0 ? 0.0F : Mth.rotWrap((float)(this.entity.getLatencyPos(5, this.a)[0] - this.entity.getLatencyPos(10, this.a)[0]));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(-bodyZRot * 1.5F));
		poseStack.translate(0.0F, -1.0F, 0.0F);
		this.body.zRot = 0.0F;
		this.body.render(poseStack, consumer, packedLight, overlayCoord, 1.0F, 1.0F, 1.0F, alpha);

		float f1 = (float)(Math.sin(flapTime * ((float)Math.PI * 2F) - 1.0F) + 1.0D);
		f1 = (f1 * f1 + f1 * 2.0F) * 0.05F;
		this.renderSide(poseStack, consumer, packedLight, overlayCoord, f1, this.leftWing, this.leftFrontLeg, this.leftFrontLegTip, this.leftFrontFoot, this.leftRearLeg, this.leftRearLegTip, this.leftRearFoot, alpha);
		this.renderSide(poseStack, consumer, packedLight, overlayCoord, f1, this.rightWing, this.rightFrontLeg, this.rightFrontLegTip, this.rightFrontFoot, this.rightRearLeg, this.rightRearLegTip, this.rightRearFoot, alpha);
		poseStack.popPose();

		for (int j = 0; j < 12; j++) {
			this.applyPoseToPart(this.neck, poses, jointMap, TAIL_JOINT_NAMES[j]);
			this.neck.render(poseStack, consumer, packedLight, overlayCoord, 1.0F, 1.0F, 1.0F, alpha);
		}
	}

	@Unique
	private OpenMatrix4f[] getPoseMatrices(IDragonPatch entitypatch, Armature armature, float partialTicks) {
		armature.initializeTransform();
		entitypatch.getClientAnimator().setPoseToModel(partialTicks);

		return armature.getJointTransforms();
	}

	@Unique
	private void applyPoseToPart(ModelPart part, OpenMatrix4f[] poses, Map<String, Joint> jointMap, String jointName) {
		this.applyPoseToPart(part, poses, jointMap, jointName, null);
	}

	@Unique
	private void applyPoseToPart(ModelPart part, OpenMatrix4f[] poses, Map<String, Joint> jointMap, String jointName, OpenMatrix4f parentAnimTransform) {
		Joint joint = jointMap.get(jointName);
		if (joint == null) {
			return;
		}

		OpenMatrix4f animTransform = joint.getAnimatedTransform();
		if (parentAnimTransform != null) {
			OpenMatrix4f parentInv = new OpenMatrix4f();
			OpenMatrix4f.invert(parentAnimTransform, parentInv);
			OpenMatrix4f relative = OpenMatrix4f.mul(parentInv, animTransform, null);
			part.x = relative.m30 * 16.0F;
			part.y = relative.m31 * 16.0F;
			part.z = relative.m32 * 16.0F;
		} else {
			part.x = animTransform.m30 * 16.0F;
			part.y = animTransform.m31 * 16.0F;
			part.z = animTransform.m32 * 16.0F;
		}

		Quaternion quat = poses[joint.getId()].toQuaternion();
		quat.normalize();

		float qx = quat.i();
		float qy = quat.j();
		float qz = quat.k();
		float qw = quat.r();

		float sinX = 2.0F * (qw * qx + qy * qz);
		float cosX = 1.0F - 2.0F * (qx * qx + qy * qy);
		part.xRot = (float)Mth.atan2(sinX, cosX);

		float sinY;
		float sinYClamp = 2.0F * (qw * qy - qz * qx);
		if (Math.abs(sinYClamp) >= 1.0F) {
			sinY = sinYClamp >= 0.0F ? (float)Math.PI / 2.0F : -(float)Math.PI / 2.0F;
		} else {
			sinY = (float)Math.asin(sinYClamp);
		}
		part.yRot = sinY;

		float sinZ = 2.0F * (qw * qz + qx * qy);
		float cosZ = 1.0F - 2.0F * (qy * qy + qz * qz);
		part.zRot = (float)Mth.atan2(sinZ, cosZ);
	}
}
