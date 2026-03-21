package susen36.epicdragonfight.client.renderer.patched.entity;

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
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.AnimationPlayer;
import susen36.epicdragonfight.api.client.animation.Layer;
import susen36.epicdragonfight.api.client.model.ClientModel;
import susen36.epicdragonfight.api.client.model.ClientModels;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.client.renderer.DragonFightRenderTypes;
import susen36.epicdragonfight.client.renderer.LightningRenderHelper;
import susen36.epicdragonfight.world.capabilities.entitypatch.boss.enderdragon.DragonCrystalLinkPhase;
import susen36.epicdragonfight.world.capabilities.entitypatch.boss.enderdragon.EnderDragonPatch;
import susen36.epicdragonfight.world.capabilities.entitypatch.boss.enderdragon.PatchedPhases;

@OnlyIn(Dist.CLIENT)
public class PEnderDragonRenderer extends PatchedEntityRenderer<EnderDragon, EnderDragonPatch, EnderDragonRenderer> {
	
	@Override
	public void render(EnderDragon entityIn, EnderDragonPatch entitypatch, EnderDragonRenderer renderer, MultiBufferSource buffer, PoseStack poseStack, int packedLight, float partialTicks) {
		ClientModel model = entitypatch.getEntityModel(ClientModels.LOGICAL_CLIENT);
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
			VertexConsumer builder2 = buffer.getBuffer(DragonFightRenderTypes.eyes(new ResourceLocation("textures/entity/enderdragon/dragon_eyes.png")));
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
		}

		DragonPhaseInstance currentPhase = entityIn.getPhaseManager().getCurrentPhase();
		if (currentPhase.getPhase() == PatchedPhases.CRYSTAL_LINK) {
			this.renderForceField(entityIn, (DragonCrystalLinkPhase)currentPhase, buffer, poseStack, partialTicks);
		}
		
		if (entitypatch.shieldEndEffectAge < 10) {
			float progression = ((float)entitypatch.shieldEndEffectAge + partialTicks) / 10.0F;
			VertexConsumer lightningBuffer = buffer.getBuffer(RenderType.lightning());
			
			poseStack.pushPose();
			LightningRenderHelper.renderFlashingLight(lightningBuffer, poseStack, 255, 0, 255, 15, 1.0F, progression);
			poseStack.popPose();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void mulPoseStack(PoseStack matStack, Armature armature, EnderDragon entityIn, EnderDragonPatch entitypatch, float partialTicks) {
		OpenMatrix4f modelMatrix;
		
		if (!entitypatch.isGroundPhase() || entitypatch.getOriginal().dragonDeathTime > 0) {
			float f = (float)entityIn.getLatencyPos(7, partialTicks)[0];
		    float f1 = (float)(entityIn.getLatencyPos(5, partialTicks)[1] - entityIn.getLatencyPos(10, partialTicks)[1]);
		    float f2 = entitypatch.getOriginal().dragonDeathTime > 0 ? 0.0F : (float)Mth.rotWrap((entityIn.getLatencyPos(5, partialTicks)[0] - entityIn.getLatencyPos(10, partialTicks)[0]));
			modelMatrix = MathUtils.getModelMatrixIntegral(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f1, f1, f, f, partialTicks, 1.0F, 1.0F, 1.0F).rotateDeg(-f2 * 1.5F, Vector3f.ZP);
		} else {
			modelMatrix = entitypatch.getModelMatrix(partialTicks).scale(-1.0F, 1.0F, -1.0F);
		}
		
        OpenMatrix4f transpose = new OpenMatrix4f(modelMatrix).transpose();
        MathUtils.translateStack(matStack, modelMatrix);
        MathUtils.rotateStack(matStack, transpose);
        MathUtils.scaleStack(matStack, transpose);
	}

	protected int getOverlayCoord(EnderDragon entity) {
		DragonPhaseInstance currentPhase = entity.getPhaseManager().getCurrentPhase();
		float chargingTick = DragonCrystalLinkPhase.CHARGING_TICK;
		float progression = currentPhase.getPhase() == PatchedPhases.CRYSTAL_LINK ? (chargingTick - (float)((DragonCrystalLinkPhase)currentPhase).getChargingCount()) / chargingTick : 0.0F;

		return OverlayTexture.pack(OverlayTexture.u(progression), OverlayTexture.v(entity.hurtTime > 5 || entity.deathTime > 0));
	}

	private void renderForceField(EnderDragon dragon, DragonCrystalLinkPhase phase, MultiBufferSource buffer, PoseStack poseStack, float partialTicks) {
		int chargingCount = phase.getChargingCount();
		int age = DragonCrystalLinkPhase.CHARGING_TICK - chargingCount;
		
		float scaleO = 1.0F + (float)(Math.max(30.0F - age - 1, 0.0F)) / 140.0F;
		float scale = 1.0F + (float)(Math.max(30.0F - age, 0.0F)) / 140.0F;
		float interpolatedScale = scaleO + (scale - scaleO) * partialTicks;
		
		float yawO = (dragon.tickCount - 1 + partialTicks) * 36.0F;
		float yaw = (dragon.tickCount + partialTicks) * 36.0F;
		float interpolatedYaw = yawO + (yaw - yawO) * partialTicks;

		RenderSystem.setShaderTexture(0, EnderDragonRenderer.CRYSTAL_BEAM_LOCATION);

		poseStack.pushPose();
		poseStack.translate(0.0, -2.0, 0.0);
		poseStack.mulPose(com.mojang.math.Vector3f.YP.rotationDegrees(interpolatedYaw));
		poseStack.mulPose(com.mojang.math.Vector3f.ZP.rotationDegrees(-45.0F));
		poseStack.mulPose(com.mojang.math.Vector3f.XP.rotationDegrees(0.0F));
		poseStack.scale(interpolatedScale * 8.0F, interpolatedScale * 8.0F, interpolatedScale * 8.0F);

		VertexConsumer builder = buffer.getBuffer(DragonFightRenderTypes.forceField(EnderDragonRenderer.CRYSTAL_BEAM_LOCATION));
		Matrix4f matrix4f = poseStack.last().pose();
		
		float[] positions = {-0.005531F, 1.115041F, -0.113062F, -0.222797F, 1.093616F, -0.102272F, -0.431713F, 1.030163F, -0.091897F, -0.624252F, 0.927123F, -0.082335F, -0.793013F, 0.788453F, -0.073954F, -0.931512F, 0.619483F, -0.067075F, -1.034426F, 0.426708F, -0.061964F, -1.0978F, 0.217534F, -0.058817F, -1.119199F, 0.0F, -0.057754F, -1.0978F, -0.217534F, -0.058817F, -1.034426F, -0.426708F, -0.061964F, -0.931512F, -0.619484F, -0.067075F, -0.793013F, -0.788453F, -0.073954F, -0.624252F, -0.927123F, -0.082335F, -0.431713F, -1.030164F, -0.091897F, -0.222796F, -1.093616F, -0.102272F, -0.00553F, -1.115041F, -0.113062F, 0.211736F, -1.093616F, -0.123852F, 0.420652F, -1.030163F, -0.134227F, 0.613191F, -0.927122F, -0.143789F, 0.781952F, -0.788453F, -0.15217F, 0.920451F, -0.619483F, -0.159048F, 1.023365F, -0.426707F, -0.164159F, 1.086739F, -0.217533F, -0.167306F, 1.108138F, 1e-06F, -0.168369F, 1.086739F, 0.217535F, -0.167306F, 1.023364F, 0.426709F, -0.164159F, 0.92045F, 0.619485F, -0.159048F, 0.781951F, 0.788454F, -0.15217F, 0.613189F, 0.927123F, -0.143789F, 0.42065F, 1.030164F, -0.134227F, 0.211734F, 1.093616F, -0.123852F, 0.005531F, 1.115041F, 0.109672F, -0.211735F, 1.093616F, 0.120462F, -0.420652F, 1.030163F, 0.130837F, -0.61319F, 0.927123F, 0.140399F, -0.781952F, 0.788453F, 0.14878F, -0.920451F, 0.619483F, 0.155658F, -1.023365F, 0.426708F, 0.160769F, -1.086739F, 0.217534F, 0.163917F, -1.108138F, 0.0F, 0.164979F, -1.086739F, -0.217534F, 0.163917F, -1.023365F, -0.426708F, 0.160769F, -0.920451F, -0.619484F, 0.155658F, -0.781952F, -0.788453F, 0.14878F, -0.61319F, -0.927123F, 0.140399F, -0.420652F, -1.030164F, 0.130837F, -0.211735F, -1.093616F, 0.120462F, 0.005531F, -1.115041F, 0.109672F, 0.222797F, -1.093616F, 0.098882F, 0.431714F, -1.030163F, 0.088507F, 0.624252F, -0.927122F, 0.078945F, 0.793014F, -0.788453F, 0.070564F, 0.931513F, -0.619483F, 0.063686F, 1.034427F, -0.426707F, 0.058575F, 1.0978F, -0.217533F, 0.055427F, 1.119199F, 1e-06F, 0.054365F, 1.0978F, 0.217535F, 0.055427F, 1.034426F, 0.426709F, 0.058575F, 0.931511F, 0.619485F, 0.063686F, 0.793012F, 0.788454F, 0.070564F, 0.624251F, 0.927123F, 0.078945F, 0.431712F, 1.030164F, 0.088507F, 0.222795F, 1.093616F, 0.09888F};
		float[] uvs = {-0.0F, 0.25F, 1.0F, 0.21875F, -0.0F, 0.21875F, 1.0F, 0.1875F, -0.0F, 0.1875F, 1.0F, 0.15625F, -0.0F, 0.15625F, -0.0F, 0.125F, 1.0F, 0.125F, 1.0F, 0.093743F, -0.0F, 0.093743F, -0.0F, 0.093757F, 1.0F, 0.0625F, -0.0F, 0.0625F, 1.0F, 0.03125F, -0.0F, 0.03125F, 1.0F, 0.0F, -0.0F, 0.0F, -0.0F, 1.0F, 1.0F, 0.96875F, -0.0F, 0.96875F, -0.0F, 0.9375F, 1.0F, 0.9375F, 1.0F, 0.90625F, -0.0F, 0.90625F, 1.0F, 0.875F, -0.0F, 0.875F, 1.0F, 0.843747F, -0.0F, 0.843747F, 1.0F, 0.843753F, 0.0F, 0.8125F, 1.0F, 0.8125F, 0.0F, 0.78125F, 1.0F, 0.78125F, 0.0F, 0.75F, 1.0F, 0.75F, -0.0F, 0.71875F, 1.0F, 0.71875F, -0.0F, 0.6875F, 0.999999F, 0.6875F, -0.0F, 0.65625F, 0.999999F, 0.65625F, -0.0F, 0.625F, 0.999999F, 0.625F, 0.999999F, 0.593747F, -1e-06F, 0.593747F, 1.0F, 0.5625F, 0.0F, 0.593753F, 0.0F, 0.5625F, 1.0F, 0.53125F, 0.0F, 0.53125F, 1.0F, 0.5F, -0.0F, 0.5F, 0.999999F, 0.46875F, -0.0F, 0.46875F, 0.999999F, 0.437497F, -0.0F, 0.437497F, -0.0F, 0.40625F, 1.0F, 0.374997F, 1.0F, 0.40625F, -0.0F, 0.375003F, 1.0F, 0.34375F, -0.0F, 0.3125F, 1.0F, 0.3125F, 1.0F, 0.28125F, -0.0F, 0.28125F, 1.0F, 0.25F, 1.0F, 0.093757F, 1.0F, 1.0F, 1e-06F, 0.843753F, 1.0F, 0.593753F, -0.0F, 0.34375F};
		int[] indices = {25, 0, 0, 56, 1, 0, 24, 2, 0, 24, 2, 1, 55, 3, 1, 23, 4, 1, 23, 4, 2, 54, 5, 2, 22, 6, 2, 21, 7, 3, 54, 5, 3, 53, 8, 3, 21, 7, 4, 52, 9, 4, 20, 10, 4, 20, 11, 5, 51, 12, 5, 19, 13, 5, 19, 13, 6, 50, 14, 6, 18, 15, 6, 18, 15, 7, 49, 16, 7, 17, 17, 7, 17, 18, 8, 48, 19, 8, 16, 20, 8, 15, 21, 9, 48, 19, 9, 47, 22, 9, 15, 21, 10, 46, 23, 10, 14, 24, 10, 14, 24, 11, 45, 25, 11, 13, 26, 11, 13, 26, 12, 44, 27, 12, 12, 28, 12, 12, 29, 13, 43, 30, 13, 11, 31, 13, 11, 31, 14, 42, 32, 14, 10, 33, 14, 10, 33, 15, 41, 34, 15, 9, 35, 15, 9, 35, 16, 40, 36, 16, 8, 37, 16, 8, 37, 17, 39, 38, 17, 7, 39, 17, 7, 39, 18, 38, 40, 18, 6, 41, 18, 6, 41, 19, 37, 42, 19, 5, 43, 19, 4, 44, 20, 37, 42, 20, 36, 45, 20, 3, 46, 21, 36, 47, 21, 35, 48, 21, 2, 49, 22, 35, 48, 22, 34, 50, 22, 1, 51, 23, 34, 50, 23, 33, 52, 23, 0, 53, 24, 33, 52, 24, 32, 54, 24, 31, 55, 25, 32, 54, 25, 63, 56, 25, 31, 57, 26, 62, 55, 26, 30, 56, 26, 29, 57, 27, 62, 58, 27, 61, 59, 27, 28, 60, 28, 61, 61, 28, 60, 58, 28, 27, 62, 29, 60, 61, 29, 59, 63, 29, 27, 62, 30, 58, 64, 30, 26, 65, 30, 26, 65, 31, 57, 66, 31, 25, 0, 31, 25, 0, 0, 57, 66, 0, 56, 1, 0, 24, 2, 1, 56, 1, 1, 55, 3, 1, 23, 4, 2, 55, 3, 2, 54, 5, 2, 21, 7, 3, 22, 6, 3, 54, 5, 3, 21, 7, 4, 53, 8, 4, 52, 9, 4, 20, 11, 5, 52, 67, 5, 51, 12, 5, 19, 13, 6, 51, 12, 6, 50, 14, 6, 18, 15, 7, 50, 14, 7, 49, 16, 7, 17, 18, 8, 49, 68, 8, 48, 19, 8, 15, 21, 9, 16, 20, 9, 48, 19, 9, 15, 21, 10, 47, 22, 10, 46, 23, 10, 14, 24, 11, 46, 23, 11, 45, 25, 11, 13, 26, 12, 45, 25, 12, 44, 27, 12, 12, 29, 13, 44, 69, 13, 43, 30, 13, 11, 31, 14, 43, 30, 14, 42, 32, 14, 10, 33, 15, 42, 32, 15, 41, 34, 15, 9, 35, 16, 41, 34, 16, 40, 36, 16, 8, 37, 17, 40, 36, 17, 39, 38, 17, 7, 39, 18, 39, 38, 18, 38, 40, 18, 6, 41, 19, 38, 40, 19, 37, 42, 19, 4, 44, 20, 5, 43, 20, 37, 42, 20, 3, 46, 21, 4, 70, 21, 36, 47, 21, 2, 49, 22, 3, 46, 22, 35, 48, 22, 1, 51, 23, 2, 49, 23, 34, 50, 23, 0, 53, 24, 1, 51, 24, 33, 52, 24, 31, 55, 25, 0, 53, 25, 32, 54, 25, 31, 57, 26, 0, 56, 26, 30, 58, 26, 29, 59, 26, 28, 60, 26, 27, 61, 26, 26, 62, 26, 25, 63, 26, 24, 64, 26, 23, 65, 26, 22, 66, 26, 21, 67, 26, 20, 68, 26, 19, 69, 26, 18, 70, 26, 17, 71, 26};

		for (int i = 0; i < indices.length; i += 3) {
			int posIndex = indices[i] * 3;
			int uvIndex = indices[i + 1] * 2;

			float x = positions[posIndex];
			float y = positions[posIndex + 1];
			float z = positions[posIndex + 2];

			float u = uvs[uvIndex];
			float v = uvs[uvIndex + 1];
			
			Vector4f posVec = new com.mojang.math.Vector4f(x, y, z, 1.0F);
			posVec.transform(matrix4f);
			builder.vertex(posVec.x(), posVec.y(), posVec.z()).color(1.0F, 1.0F, 1.0F, 1.0F).uv(u, v).uv2(240).endVertex();
		}

		poseStack.popPose();
	}

}