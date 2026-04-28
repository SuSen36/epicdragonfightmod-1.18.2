package susen36.epicdragonfight.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderingTool {
	public static void drawQuad(PoseStack poseStack, VertexConsumer vertexBuilder, Vector3f pos, float size, float r, float g, float b) {
		vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y, pos.z - size).color(r, g, b, 1.0F).endVertex();
	}
	
	public static void drawCube(PoseStack poseStack, VertexConsumer vertexBuilder, Vector3f pos, float size, float r, float g, float b) {
		vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y - size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y - size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y - size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y - size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y + size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y + size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y + size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y + size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y + size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y + size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y - size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y - size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y + size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y + size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y - size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y - size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y + size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y + size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y - size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y - size, pos.z - size).color(r, g, b, 1.0F).endVertex();
        
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y + size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y + size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x - size, pos.y - size, pos.z + size).color(r, g, b, 1.0F).endVertex();
        vertexBuilder.vertex(poseStack.last().pose(), pos.x + size, pos.y - size, pos.z + size).color(r, g, b, 1.0F).endVertex();
	}

	public static void drawLine(PoseStack poseStack, VertexConsumer vertexBuilder, Vector3f from, Vector3f to, float r, float g, float b) {
		Matrix4f matrix = poseStack.last().pose();
		Matrix3f normal = poseStack.last().normal();
		float dx = to.x - from.x;
		float dy = to.y - from.y;
		float dz = to.z - from.z;
		float len = (float)Math.sqrt(dx * dx + dy * dy + dz * dz);
		float nx = len > 0.001F ? dx / len : 0.0F;
		float ny = len > 0.001F ? dy / len : 1.0F;
		float nz = len > 0.001F ? dz / len : 0.0F;
		vertexBuilder.vertex(matrix, from.x, from.y, from.z).color(r, g, b, 1.0F).normal(normal, nx, ny, nz).endVertex();
		vertexBuilder.vertex(matrix, to.x, to.y, to.z).color(r, g, b, 1.0F).normal(normal, nx, ny, nz).endVertex();
	}
}