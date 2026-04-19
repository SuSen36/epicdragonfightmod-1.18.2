package susen36.epicdragonfight.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
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
}