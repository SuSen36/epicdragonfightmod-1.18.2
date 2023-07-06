package susen36.epicdragonfight.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

@OnlyIn(Dist.CLIENT)
public class LightningRenderHelper {
	private static final float HALF_SQRT_3 = (float)(Math.sqrt(3.0D) / 2.0D);
	
	private static void vertex01(VertexConsumer vertexConsumer, Matrix4f matrix4f, int alpha) {
		vertexConsumer.vertex(matrix4f, 0.0F, 0.0F, 0.0F).color(255, 255, 255, alpha).endVertex();
	}
	
	private static void vertex2(VertexConsumer vertexConsumer, Matrix4f matrix4f, float height, float width, int rCol, int gCol, int bCol) {
		vertexConsumer.vertex(matrix4f, -HALF_SQRT_3 * width, height, -0.5F * width).color(rCol, gCol, bCol, 0).endVertex();
	}
	
	private static void vertex3(VertexConsumer vertexConsumer, Matrix4f matrix4f, float height, float width, int rCol, int gCol, int bCol) {
		vertexConsumer.vertex(matrix4f, HALF_SQRT_3 * width, height, -0.5F * width).color(rCol, gCol, bCol, 0).endVertex();
	}
	
	private static void vertex4(VertexConsumer vertexConsumer, Matrix4f matrix4f, float width, float height, int rCol, int gCol, int bCol) {
		vertexConsumer.vertex(matrix4f, 0.0F, width, 1.0F * height).color(rCol, gCol, bCol, 0).endVertex();
	}
	
	public static void renderCyclingLight(VertexConsumer vertexConsumer, PoseStack poseStack, int rCol, int gCol, int bCol, int density, float size, float progression, float repeater) {
		Matrix4f matrix4f = poseStack.last().pose();
		Random random = new Random(123);
		
		for (int i = 0; (float)i < density; ++i) {
			poseStack.mulPose(Vector3f.XP.rotationDegrees(random.nextFloat() * 360.0F));
			poseStack.mulPose(Vector3f.YP.rotationDegrees(random.nextFloat() * 360.0F));
			poseStack.mulPose(Vector3f.ZP.rotationDegrees(random.nextFloat() * 360.0F));
			poseStack.mulPose(Vector3f.XP.rotationDegrees(random.nextFloat() * 360.0F));
			poseStack.mulPose(Vector3f.YP.rotationDegrees(random.nextFloat() * 360.0F));
			poseStack.mulPose(Vector3f.ZP.rotationDegrees(random.nextFloat() * 360.0F + progression * 90.0F));
			float height = (random.nextFloat() * 20.0F + 5.0F + repeater * 10.0F) * size;
			float width = (random.nextFloat() * 2.0F + 1.0F + repeater * 2.0F) * size;
			float randomf = random.nextFloat();
			float alpha = ((float)Math.sin((randomf + progression) * Math.PI) + 1.0F) * 0.5F;
			int j = (int)(255.0F * (alpha));
			
			vertex01(vertexConsumer, matrix4f, j);
			vertex2(vertexConsumer, matrix4f, height, width, rCol, gCol, bCol);
			vertex3(vertexConsumer, matrix4f, height, width, rCol, gCol, bCol);
			vertex01(vertexConsumer, matrix4f, j);
			vertex3(vertexConsumer, matrix4f, height, width, rCol, gCol, bCol);
			vertex4(vertexConsumer, matrix4f, height, width, rCol, gCol, bCol);
			vertex01(vertexConsumer, matrix4f, j);
			vertex4(vertexConsumer, matrix4f, height, width, rCol, gCol, bCol);
			vertex2(vertexConsumer, matrix4f, height, width, rCol, gCol, bCol);
		}
	}
}