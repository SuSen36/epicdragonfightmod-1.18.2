package susen36.epicdragonfight.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EndCrystalRenderer;
import net.minecraft.client.renderer.entity.EnderDragonRenderer;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import susen36.epicdragonfight.client.renderer.DragonFightRenderTypes;
import susen36.epicdragonfight.entitypatch.IEndCrystalPatch;

@Mixin(EndCrystalRenderer.class)
public abstract class MixinEndCrystalRenderer {
	@Inject(at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;popPose()V", ordinal = 0, shift = At.Shift.BEFORE), method = "render(Lnet/minecraft/world/entity/boss/enderdragon/EndCrystal;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V")
	private void renderCrystalShield(EndCrystal enderCrystal, float yRot, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight, CallbackInfo ci) {
		if (!(enderCrystal instanceof IEndCrystalPatch patch) || !patch.hasShield()) return;

		float pulseScale = 1.0F + ((float)Math.sin((enderCrystal.tickCount + partialTicks) * 0.15F) * 0.08F);

		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(enderCrystal.tickCount * 2.0F + partialTicks * 2.0F));
		poseStack.scale(pulseScale * 1.2F, pulseScale * 1.2F, pulseScale * 1.2F);

		RenderSystem.setShaderTexture(0, EnderDragonRenderer.CRYSTAL_BEAM_LOCATION);
		VertexConsumer shieldBuilder = buffer.getBuffer(DragonFightRenderTypes.forceField(EnderDragonRenderer.CRYSTAL_BEAM_LOCATION));

		float uvOffset = (enderCrystal.tickCount + partialTicks) * 0.02F;
		this.renderSphereShield(poseStack, shieldBuilder, uvOffset, packedLight);
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

				int color1 = (int)(ringProgress1 * 255);
				int color2 = (int)(ringProgress2 * 255);

				builder.vertex(matrix4f, x1, y1, z1).color(color1, color1, color1, 255).uv(u1, v1).uv2(packedLight).endVertex();
				builder.vertex(matrix4f, x2, y1, z2).color(color1, color1, color1, 255).uv(u2, v1).uv2(packedLight).endVertex();
				builder.vertex(matrix4f, x3, y2, z3).color(color2, color2, color2, 255).uv(u2, v2).uv2(packedLight).endVertex();
				builder.vertex(matrix4f, x4, y2, z4).color(color2, color2, color2, 255).uv(u1, v2).uv2(packedLight).endVertex();
			}
		}
	}
}
