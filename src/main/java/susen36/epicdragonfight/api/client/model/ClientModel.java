package susen36.epicdragonfight.api.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.gameasset.DragonPartModel;

@OnlyIn(Dist.CLIENT)
public class ClientModel extends Model {
	protected DragonPartModel partModel;

	public ClientModel(ResourceLocation location) {
		super(location);
	}

	public void loadMeshAndProperties(ResourceManager resourceManager) {
		this.partModel = DragonPartModel.bake();
	}

	public DragonPartModel getPartModel() {
		return this.partModel;
	}

	public void drawAnimatedModel(PoseStack poseStack, VertexConsumer builder, int packedLightIn, float r, float g, float b, float a, int overlayCoord, OpenMatrix4f[] poses) {
		this.drawAnimatedModel(poseStack, builder, packedLightIn, r, g, b, a, overlayCoord, poses, null);
	}

	public void drawAnimatedModel(PoseStack poseStack, VertexConsumer builder, int packedLightIn, float r, float g, float b, float a, int overlayCoord, OpenMatrix4f[] poses, Armature armature) {
		if (this.partModel != null && armature != null) {
			this.partModel.renderWithPoses(poseStack, builder, packedLightIn, overlayCoord, r, g, b, a, poses, armature);
		}
	}
}