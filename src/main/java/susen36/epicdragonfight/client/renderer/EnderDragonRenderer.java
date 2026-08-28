package susen36.epicdragonfight.client.renderer;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import susen36.epicdragonfight.client.model.EnderDragonModel;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.enderdragon.DragonCrystalLinkPhase;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedPhases;

public class EnderDragonRenderer extends LivingEntityRenderer<EnderDragon,EnderDragonModel> {
	public static final ResourceLocation CRYSTAL_BEAM_LOCATION = new ResourceLocation("textures/entity/end_crystal/end_crystal_beam.png");
	private static final ResourceLocation DRAGON_EXPLODING_LOCATION = new ResourceLocation("textures/entity/enderdragon/dragon_exploding.png");
	private static final ResourceLocation DRAGON_LOCATION = new ResourceLocation("textures/entity/enderdragon/dragon.png");
	private static final ResourceLocation DRAGON_EYES_LOCATION = new ResourceLocation("textures/entity/enderdragon/dragon_eyes.png");
	private static final RenderType RENDER_TYPE = RenderType.entityCutoutNoCull(DRAGON_LOCATION);
	private static final RenderType DECAL = RenderType.entityDecal(DRAGON_LOCATION);
	private static final RenderType EYES = RenderType.eyes(DRAGON_EYES_LOCATION);
	private static final RenderType BEAM = RenderType.entitySmoothCutout(CRYSTAL_BEAM_LOCATION);
	private static final float HALF_SQRT_3 = (float)(Math.sqrt(3.0D) / 2.0D);

	public EnderDragonRenderer(EntityRendererProvider.Context context) {
		super(context,new EnderDragonModel(context.bakeLayer(EnderDragonModel.DRAGON)),1);
	}

	@Override
	public void render(EnderDragon dragon, float yRot, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
		//poseStack.pushPose();
		//float f = (float)dragon.getLatencyPos(7, partialTicks)[0];
		//float f1 = (float)(dragon.getLatencyPos(5, partialTicks)[1] - dragon.getLatencyPos(10, partialTicks)[1]);
		//poseStack.mulPose(Vector3f.YP.rotationDegrees(-f));
		//poseStack.mulPose(Vector3f.XP.rotationDegrees(f1 * 10.0F));
		//boolean flag = dragon.hurtTime > 0;
		//if (dragon.dragonDeathTime > 0) {
		//	float deathProgression = (float)dragon.dragonDeathTime / 200.0F;
		//	VertexConsumer explodeConsumer = buffer.getBuffer(RenderType.dragonExplosionAlpha(DRAGON_EXPLODING_LOCATION));
		//	this.model.renderToBuffer(poseStack, explodeConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, deathProgression);
		//	VertexConsumer decalConsumer = buffer.getBuffer(DECAL);
		//	this.model.renderToBuffer(poseStack, decalConsumer, packedLight, OverlayTexture.pack(0.0F, flag), 1.0F, 1.0F, 1.0F, 1.0F);
		//} else {
		//	VertexConsumer entityConsumer = buffer.getBuffer(RENDER_TYPE);
		//	this.model.renderToBuffer(poseStack, entityConsumer, packedLight, OverlayTexture.pack(0.0F, flag), 1.0F, 1.0F, 1.0F, 1.0F);
		//}

		//VertexConsumer eyesConsumer = buffer.getBuffer(EYES);
		//this.model.renderToBuffer(poseStack, eyesConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

		if (dragon instanceof IDragonPatch dragonPatch) {
			if (dragon.dragonDeathTime > 0) {
				float deathTimeProgression = ((float)dragon.dragonDeathTime + partialTicks) / 200.0F;
				VertexConsumer lightningBuffer = buffer.getBuffer(RenderType.lightning());
				int density = (int)((deathTimeProgression + deathTimeProgression * deathTimeProgression) / 2.0F * 60.0F);
				float f7 = Math.min(deathTimeProgression > 0.8F ? (deathTimeProgression - 0.8F) / 0.2F : 0.0F, 1.0F);

				poseStack.pushPose();
				LightningRenderHelper.renderCyclingLight(lightningBuffer, poseStack, 255, 0, 255, density, 1.0F, deathTimeProgression, f7);
				poseStack.popPose();
			} else {
				if (dragonPatch.getShieldEndEffectAge() < 10) {
					float progression = ((float)dragonPatch.getShieldEndEffectAge() + partialTicks) / 10.0F;
					VertexConsumer lightningBuffer = buffer.getBuffer(RenderType.lightning());
					poseStack.pushPose();
					LightningRenderHelper.renderFlashingLight(lightningBuffer, poseStack, 255, 0, 255, 15, 1.0F, progression);
					poseStack.popPose();
				}
				DragonPhaseInstance currentPhase = dragon.getPhaseManager().getCurrentPhase();
				if (currentPhase.getPhase() == PatchedPhases.CRYSTAL_LINK) {
					this.renderForceField(dragon, (DragonCrystalLinkPhase)currentPhase, buffer, poseStack, partialTicks, packedLight);
				}
			}
		}

		if (dragon.dragonDeathTime > 0) {
			float f5 = ((float)dragon.dragonDeathTime + partialTicks) / 200.0F;
			float f7 = Math.min(f5 > 0.8F ? (f5 - 0.8F) / 0.2F : 0.0F, 1.0F);
			java.util.Random random = new java.util.Random(432L);
			VertexConsumer vertexconsumer2 = buffer.getBuffer(RenderType.lightning());
			poseStack.pushPose();
			poseStack.translate(0.0F, -1.0F, -2.0F);

			for(int i = 0; (float)i < (f5 + f5 * f5) / 2.0F * 60.0F; ++i) {
				poseStack.mulPose(Vector3f.XP.rotationDegrees(random.nextFloat() * 360.0F));
				poseStack.mulPose(Vector3f.YP.rotationDegrees(random.nextFloat() * 360.0F));
				poseStack.mulPose(Vector3f.ZP.rotationDegrees(random.nextFloat() * 360.0F));
				poseStack.mulPose(Vector3f.XP.rotationDegrees(random.nextFloat() * 360.0F));
				poseStack.mulPose(Vector3f.YP.rotationDegrees(random.nextFloat() * 360.0F));
				poseStack.mulPose(Vector3f.ZP.rotationDegrees(random.nextFloat() * 360.0F + f5 * 90.0F));
				float f3 = random.nextFloat() * 20.0F + 5.0F + f7 * 10.0F;
				float f4 = random.nextFloat() * 2.0F + 1.0F + f7 * 2.0F;
				Matrix4f matrix4f = poseStack.last().pose();
				int j = (int)(255.0F * (1.0F - f7));
				vertex01(vertexconsumer2, matrix4f, j);
				vertex2(vertexconsumer2, matrix4f, f3, f4);
				vertex3(vertexconsumer2, matrix4f, f3, f4);
				vertex01(vertexconsumer2, matrix4f, j);
				vertex3(vertexconsumer2, matrix4f, f3, f4);
				vertex4(vertexconsumer2, matrix4f, f3, f4);
				vertex01(vertexconsumer2, matrix4f, j);
				vertex4(vertexconsumer2, matrix4f, f3, f4);
				vertex2(vertexconsumer2, matrix4f, f3, f4);
			}
			poseStack.popPose();
		}

		//poseStack.popPose();

		if (dragon.nearestCrystal != null) {
			poseStack.pushPose();
			float f6 = (float)(dragon.nearestCrystal.getX() - Mth.lerp((double)partialTicks, dragon.xo, dragon.getX()));
			float f8 = (float)(dragon.nearestCrystal.getY() - Mth.lerp((double)partialTicks, dragon.yo, dragon.getY()));
			float f9 = (float)(dragon.nearestCrystal.getZ() - Mth.lerp((double)partialTicks, dragon.zo, dragon.getZ()));
			renderCrystalBeams(f6, f8 + getCrystalY(dragon.nearestCrystal, partialTicks), f9, partialTicks, dragon.tickCount, poseStack, buffer, packedLight);
			poseStack.popPose();
		}

		super.render(dragon, yRot, partialTicks, poseStack, buffer, packedLight);
	}

	private static float getCrystalY(EndCrystal crystal, float partialTicks) {
		float f = (float)crystal.time + partialTicks;
		float f1 = Mth.sin(f * 0.2F) / 2.0F + 0.5F;
		f1 = (f1 * f1 + f1) * 0.4F;
		return f1 - 1.4F;
	}

	public static void renderCrystalBeams(float p_114188_, float p_114189_, float p_114190_, float p_114191_, int p_114192_, PoseStack p_114193_, MultiBufferSource p_114194_, int p_114195_) {
		float f = Mth.sqrt(p_114188_ * p_114188_ + p_114190_ * p_114190_);
		float f1 = Mth.sqrt(p_114188_ * p_114188_ + p_114189_ * p_114189_ + p_114190_ * p_114190_);
		p_114193_.pushPose();
		p_114193_.translate(0.0F, 2.0F, 0.0F);
		p_114193_.mulPose(Vector3f.YP.rotation((float)(-Math.atan2((double)p_114190_, (double)p_114188_)) - ((float)Math.PI / 2F)));
		p_114193_.mulPose(Vector3f.XP.rotation((float)(-Math.atan2((double)f, (double)p_114189_)) - ((float)Math.PI / 2F)));
		VertexConsumer vertexconsumer = p_114194_.getBuffer(BEAM);
		float f2 = 0.0F - ((float)p_114192_ + p_114191_) * 0.01F;
		float f3 = Mth.sqrt(p_114188_ * p_114188_ + p_114189_ * p_114189_ + p_114190_ * p_114190_) / 32.0F - ((float)p_114192_ + p_114191_) * 0.01F;
		int i = 8;
		float f4 = 0.0F;
		float f5 = 0.75F;
		float f6 = 0.0F;
		PoseStack.Pose posestack$pose = p_114193_.last();
		Matrix4f matrix4f = posestack$pose.pose();
		Matrix3f matrix3f = posestack$pose.normal();

		for(int j = 1; j <= 8; ++j) {
			float f7 = Mth.sin((float)j * ((float)Math.PI * 2F) / 8.0F) * 0.75F;
			float f8 = Mth.cos((float)j * ((float)Math.PI * 2F) / 8.0F) * 0.75F;
			float f9 = (float)j / 8.0F;
			vertexconsumer.vertex(matrix4f, f4 * 0.2F, f5 * 0.2F, 0.0F).color(0, 0, 0, 255).uv(f6, f2).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
			vertexconsumer.vertex(matrix4f, f4, f5, f1).color(255, 255, 255, 255).uv(f6, f3).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
			vertexconsumer.vertex(matrix4f, f7, f8, f1).color(255, 255, 255, 255).uv(f9, f3).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
			vertexconsumer.vertex(matrix4f, f7 * 0.2F, f8 * 0.2F, 0.0F).color(0, 0, 0, 255).uv(f9, f2).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
			f4 = f7;
			f5 = f8;
			f6 = f9;
		}

		p_114193_.popPose();
	}

	@Override
	public ResourceLocation getTextureLocation(EnderDragon dragon) {
		return DRAGON_LOCATION;
	}

	protected float getWhiteOverlayProgress(EnderDragon entity, float p_114044_) {
		return super.getWhiteOverlayProgress(entity, p_114044_);
		//DragonPhaseInstance currentPhase = entity.getPhaseManager().getCurrentPhase();
		//float chargingTick = DragonCrystalLinkPhase.CHARGING_TICK;
		//float progression = currentPhase.getPhase() == PatchedPhases.CRYSTAL_LINK ? (chargingTick - (float)((DragonCrystalLinkPhase)currentPhase).getChargingCount()) / chargingTick : 0.0F;
		//return OverlayTexture.pack(OverlayTexture.u(progression), OverlayTexture.v(entity.hurtTime > 5 || entity.deathTime > 0));
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

		RenderSystem.setShaderTexture(0, CRYSTAL_BEAM_LOCATION);

		poseStack.pushPose();
		poseStack.translate(0.0, -2.0, 0.0);
		poseStack.mulPose(Vector3f.YP.rotationDegrees(interpolatedYaw));
		poseStack.scale(interpolatedScale * 8.0F, interpolatedScale * 8.0F, interpolatedScale * 8.0F);

		VertexConsumer builder = buffer.getBuffer(RenderType.entitySmoothCutout(CRYSTAL_BEAM_LOCATION));

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
			float y1 = Mth.cos(phi1) * radius;
			float y2 = Mth.cos(phi2) * radius;
			float ringRadius1 = Mth.sin(phi1) * radius;
			float ringRadius2 = Mth.sin(phi2) * radius;

			float ringProgress1 = (float)ring / rings;
			float ringProgress2 = (float)(ring + 1) / rings;

			for (int seg = 0; seg < segments; seg++) {
				float theta1 = (float)seg / segments * 2.0F * (float)Math.PI;
				float theta2 = (float)(seg + 1) / segments * 2.0F * (float)Math.PI;

				float x1 = Mth.cos(theta1) * ringRadius1;
				float z1 = Mth.sin(theta1) * ringRadius1;
				float x2 = Mth.cos(theta2) * ringRadius1;
				float z2 = Mth.sin(theta2) * ringRadius1;
				float x3 = Mth.cos(theta2) * ringRadius2;
				float z3 = Mth.sin(theta2) * ringRadius2;
				float x4 = Mth.cos(theta1) * ringRadius2;
				float z4 = Mth.sin(theta1) * ringRadius2;

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

	private static void vertex01(VertexConsumer vertexConsumer, Matrix4f matrix4f, int alpha) {
		vertexConsumer.vertex(matrix4f, 0.0F, 0.0F, 0.0F).color(255, 255, 255, alpha).endVertex();
	}

	private static void vertex2(VertexConsumer vertexConsumer, Matrix4f matrix4f, float height, float radius) {
		vertexConsumer.vertex(matrix4f, -HALF_SQRT_3 * radius, height, -0.5F * radius).color(255, 0, 255, 0).endVertex();
	}

	private static void vertex3(VertexConsumer vertexConsumer, Matrix4f matrix4f, float height, float radius) {
		vertexConsumer.vertex(matrix4f, HALF_SQRT_3 * radius, height, -0.5F * radius).color(255, 0, 255, 0).endVertex();
	}

	private static void vertex4(VertexConsumer vertexConsumer, Matrix4f matrix4f, float height, float radius) {
		vertexConsumer.vertex(matrix4f, 0.0F, height, radius).color(255, 0, 255, 0).endVertex();
	}
}