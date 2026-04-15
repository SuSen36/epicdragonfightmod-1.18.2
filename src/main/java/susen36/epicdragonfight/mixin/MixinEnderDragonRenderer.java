package susen36.epicdragonfight.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import com.mojang.math.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EndCrystalRenderer;
import net.minecraft.client.renderer.entity.EnderDragonRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import susen36.epicdragonfight.api.animation.AnimationPlayer;
import susen36.epicdragonfight.api.client.animation.Layer;
import susen36.epicdragonfight.api.client.model.ClientModel;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.client.renderer.DragonFightRenderTypes;
import susen36.epicdragonfight.client.renderer.LightningRenderHelper;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.enderdragon.DragonCrystalLinkPhase;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedPhases;
import susen36.epicdragonfight.gameasset.Models;

@Mixin(value = EnderDragonRenderer.class)
public abstract class MixinEnderDragonRenderer{
	@Inject(at = @At(value = "HEAD"), method = "render(Lnet/minecraft/world/entity/boss/enderdragon/EnderDragon;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", cancellable = true)
	private void epicfight_render(EnderDragon enderdragon, float yRot, float partialTicks, PoseStack poseStack, MultiBufferSource multiSourceBuffer, int packedLight, CallbackInfo ci) {
		if (enderdragon instanceof IDragonPatch dragonPatch) {
			this.render(enderdragon,dragonPatch, multiSourceBuffer,poseStack,packedLight,partialTicks);
			ci.cancel();
		}
	}

	private void render(EnderDragon entityIn, IDragonPatch entitypatch, MultiBufferSource buffer, PoseStack poseStack, int packedLight, float partialTicks) {
		ClientModel model = Models.LOGICAL_CLIENT.dragon;
		Armature armature = model.getArmature();
		poseStack.pushPose();
		this.mulPoseStack(poseStack, armature, entityIn, entitypatch, partialTicks);
		OpenMatrix4f[] poses = this.getPoseMatrices(entitypatch, armature, partialTicks);
		poses[0] = OpenMatrix4f.rotate(-90.0F, Vector3f.XP, poses[0], null);

		if (entityIn.dragonDeathTime > 0) {
			poseStack.translate(entityIn.getRandom().nextGaussian() * 0.08D, 0.0D, entityIn.getRandom().nextGaussian() * 0.08D);
			float deathTimeProgression = ((float) entityIn.dragonDeathTime + partialTicks) / 200.0F;

			VertexConsumer builder = buffer.getBuffer(DragonFightRenderTypes.dragonExplosionAlphaTriangles(EnderDragonRenderer.DRAGON_EXPLODING_LOCATION));
			model.drawAnimatedModel(poseStack, builder, packedLight, 1.0F, 1.0F, 1.0F, deathTimeProgression, OverlayTexture.NO_OVERLAY, poses);
			VertexConsumer builder2 = buffer.getBuffer(DragonFightRenderTypes.entityDecalTriangles(EnderDragonRenderer.DRAGON_LOCATION));
			model.drawAnimatedModel(poseStack, builder2, packedLight, 1.0F, 1.0F, 1.0F, 1.0F, this.getOverlayCoord(entityIn), poses);
		} else {
			VertexConsumer builder = buffer.getBuffer(DragonFightRenderTypes.animatedModel(EnderDragonRenderer.DRAGON_LOCATION));
			model.drawAnimatedModel(poseStack, builder, packedLight, 1.0F, 1.0F, 1.0F, 1.0F, this.getOverlayCoord(entityIn), poses);
			VertexConsumer builder2 = buffer.getBuffer(DragonFightRenderTypes.eyeGlow(new ResourceLocation("textures/entity/enderdragon/dragon_eyes.png")));
			model.drawAnimatedModel(poseStack, builder2, packedLight, 1.0F, 1.0F, 1.0F, 1.0F, OverlayTexture.NO_OVERLAY,poses);
		}

		if (Minecraft.getInstance().getEntityRenderDispatcher().shouldRenderHitBoxes()) {
			for (Layer.Priority priority : Layer.Priority.HIGHEST.lowers()) {
				AnimationPlayer animPlayer = entitypatch.getClientAnimator().getCompositeLayer(priority).animationPlayer;
				float playTime = animPlayer.getPrevElapsedTime() + (animPlayer.getElapsedTime() - animPlayer.getPrevElapsedTime()) * partialTicks;
				animPlayer.getAnimation().renderDebugging(poseStack, buffer, entitypatch, playTime, partialTicks);
			}
		}

		poseStack.popPose();

		if (entityIn.nearestCrystal != null) {
			float x = (float)(entityIn.nearestCrystal.getX() - Mth.lerp(partialTicks, entityIn.xo, entityIn.getX()));
			float y = (float)(entityIn.nearestCrystal.getY() - Mth.lerp(partialTicks, entityIn.yo, entityIn.getY()));
			float z = (float)(entityIn.nearestCrystal.getZ() - Mth.lerp(partialTicks, entityIn.zo, entityIn.getZ()));
			poseStack.pushPose();
			EnderDragonRenderer.renderCrystalBeams(x, y + EndCrystalRenderer.getY(entityIn.nearestCrystal, partialTicks), z, partialTicks, entityIn.tickCount, poseStack, buffer, packedLight);
			poseStack.popPose();
		}

		if (entityIn.dragonDeathTime > 0) {
			float deathTimeProgression = ((float) entityIn.dragonDeathTime + partialTicks) / 200.0F;
			VertexConsumer lightningBuffer = buffer.getBuffer(RenderType.lightning());
			int density = (int)((deathTimeProgression + deathTimeProgression * deathTimeProgression) / 2.0F * 60.0F);
			float f7 = Math.min(deathTimeProgression > 0.8F ? (deathTimeProgression - 0.8F) / 0.2F : 0.0F, 1.0F);

			poseStack.pushPose();
			LightningRenderHelper.renderCyclingLight(lightningBuffer, poseStack, 255, 0, 255, density, 1.0F, deathTimeProgression, f7);
			poseStack.popPose();
		}else {
			DragonPhaseInstance currentPhase = entityIn.getPhaseManager().getCurrentPhase();

			if (entitypatch.getShieldEndEffectAge() < 10) {
				float progression = ((float)entitypatch.getShieldEndEffectAge() + partialTicks) / 10.0F;
				VertexConsumer lightningBuffer = buffer.getBuffer(RenderType.lightning());

				poseStack.pushPose();
				LightningRenderHelper.renderFlashingLight(lightningBuffer, poseStack, 255, 0, 255, 15, 1.0F, progression);
				poseStack.popPose();
			}
			if (currentPhase.getPhase() == PatchedPhases.CRYSTAL_LINK) {
				this.renderForceField(entityIn, (DragonCrystalLinkPhase)currentPhase, buffer, poseStack, partialTicks, packedLight);
			}
		}

	}

	@SuppressWarnings("deprecation")
	private void mulPoseStack(PoseStack matStack, Armature armature, EnderDragon entityIn, IDragonPatch entitypatch, float partialTicks) {
		OpenMatrix4f modelMatrix;

		if (!entitypatch.isGroundPhase() || entitypatch.getOriginal().dragonDeathTime > 0) {
			float f = (float)entityIn.getLatencyPos(7, partialTicks)[0];
			float f1 = (float)(entityIn.getLatencyPos(5, partialTicks)[1] - entityIn.getLatencyPos(10, partialTicks)[1]);
			float f2 = entitypatch.getOriginal().dragonDeathTime > 0 ? 0.0F : Mth.rotWrap((entityIn.getLatencyPos(5, partialTicks)[0] - entityIn.getLatencyPos(10, partialTicks)[0]));
			modelMatrix = MathUtils.getModelMatrixIntegral(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f1, f1, f, f, partialTicks, 1.0F, 1.0F, 1.0F).rotateDeg(-f2 * 1.5F, Vector3f.ZP);
		} else {
			modelMatrix = entitypatch.getModelMatrix(partialTicks).scale(-1.0F, 1.0F, -1.0F);
		}

		OpenMatrix4f transpose = new OpenMatrix4f(modelMatrix).transpose();
		MathUtils.translateStack(matStack, modelMatrix);
		MathUtils.rotateStack(matStack, transpose);
		MathUtils.scaleStack(matStack, transpose);
	}

	private OpenMatrix4f[] getPoseMatrices(IDragonPatch entitypatch, Armature armature, float partialTicks) {
		armature.initializeTransform();
		entitypatch.getClientAnimator().setPoseToModel(partialTicks);

		return armature.getJointTransforms();
	}

	private int getOverlayCoord(EnderDragon entity) {
		DragonPhaseInstance currentPhase = entity.getPhaseManager().getCurrentPhase();
		float chargingTick = DragonCrystalLinkPhase.CHARGING_TICK;
		float progression = currentPhase.getPhase() == PatchedPhases.CRYSTAL_LINK ? (chargingTick - (float)((DragonCrystalLinkPhase)currentPhase).getChargingCount()) / chargingTick : 0.0F;

		return OverlayTexture.pack(OverlayTexture.u(progression), OverlayTexture.v(entity.hurtTime > 5 || entity.deathTime > 0));
	}

	private void renderForceField(EnderDragon dragon, DragonCrystalLinkPhase phase, MultiBufferSource buffer, PoseStack poseStack, float partialTicks, int packedLight) {
		int chargingCount = phase.getChargingCount();
		int age = DragonCrystalLinkPhase.CHARGING_TICK - chargingCount;

		float scaleO = 1.0F + Math.max(30.0F - age - 1, 0.0F) / 140.0F;
		float scale = 1.0F + Math.max(30.0F - age, 0.0F) / 140.0F;
		float interpolatedScale = scaleO + (scale - scaleO) * partialTicks;

		float yawO = (dragon.tickCount - 1 + partialTicks) * 12.0F;
		float yaw = (dragon.tickCount + partialTicks) * 12.0F;
		float interpolatedYaw = yawO + (yaw - yawO) * partialTicks;

		RenderSystem.setShaderTexture(0, EnderDragonRenderer.CRYSTAL_BEAM_LOCATION);

		poseStack.pushPose();
		poseStack.translate(0.0, -2.0, 0.0);
		poseStack.mulPose(com.mojang.math.Vector3f.YP.rotationDegrees(interpolatedYaw));
		poseStack.scale(interpolatedScale * 8.0F, interpolatedScale * 8.0F, interpolatedScale * 8.0F);

		VertexConsumer builder = buffer.getBuffer(DragonFightRenderTypes.forceField(EnderDragonRenderer.CRYSTAL_BEAM_LOCATION));

		float uvOffset = (dragon.tickCount + partialTicks) * 0.02F;
		this.renderSphereShield(poseStack, builder, uvOffset, packedLight);

		poseStack.popPose();
	}

	private void renderSphereShield(PoseStack poseStack, VertexConsumer builder, float uvOffset, int packedLight) {
		Matrix4f matrix4f = poseStack.last().pose();
		int segments = 24;
		int rings = 16;
		float radius = 1.0F;

		for (int ring = 0; ring < rings; ring++) {
			float phi1 = (float)ring / rings * (float)Math.PI;
			float phi2 = (float)(ring + 1) / rings * (float)Math.PI;
			float y1 = (float)Math.cos(phi1) * radius;
			float y2 = (float)Math.cos(phi2) * radius;
			float ringRadius1 = (float)Math.sin(phi1) * radius;
			float ringRadius2 = (float)Math.sin(phi2) * radius;

			float ringProgress1 = (float)ring / rings;
			float ringProgress2 = (float)(ring + 1) / rings;

			for (int seg = 0; seg < segments; seg++) {
				float theta1 = (float)seg / segments * 2.0F * (float)Math.PI;
				float theta2 = (float)(seg + 1) / segments * 2.0F * (float)Math.PI;

				float x1 = (float)Math.cos(theta1) * ringRadius1;
				float z1 = (float)Math.sin(theta1) * ringRadius1;
				float x2 = (float)Math.cos(theta2) * ringRadius1;
				float z2 = (float)Math.sin(theta2) * ringRadius1;
				float x3 = (float)Math.cos(theta2) * ringRadius2;
				float z3 = (float)Math.sin(theta2) * ringRadius2;
				float x4 = (float)Math.cos(theta1) * ringRadius2;
				float z4 = (float)Math.sin(theta1) * ringRadius2;

				float u1 = (float)seg / segments + uvOffset;
				float u2 = (float)(seg + 1) / segments + uvOffset;
				float v1 = (float)ring / rings + uvOffset;
				float v2 = (float)(ring + 1) / rings + uvOffset;

				int color1 = (int)(128 + ringProgress1 * 127);
				int color2 = (int)(128 + ringProgress2 * 127);

				builder.vertex(matrix4f, x1, y1, z1).color(color1, color1, color1, 255).uv(u1, v1).uv2(packedLight).endVertex();
				builder.vertex(matrix4f, x2, y1, z2).color(color1, color1, color1, 255).uv(u2, v1).uv2(packedLight).endVertex();
				builder.vertex(matrix4f, x3, y2, z3).color(color2, color2, color2, 255).uv(u2, v2).uv2(packedLight).endVertex();
				builder.vertex(matrix4f, x4, y2, z4).color(color2, color2, color2, 255).uv(u1, v2).uv2(packedLight).endVertex();
			}
		}
	}
}
