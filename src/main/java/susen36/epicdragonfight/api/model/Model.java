package susen36.epicdragonfight.api.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import com.mojang.math.Vector4f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.client.model.Mesh;
import susen36.epicdragonfight.api.client.model.VertexIndicator;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.gameasset.DragonModelData;

public class Model {
	protected Armature armature;
	protected Mesh mesh;

	public Model() {
	}

	public void loadArmatureData() {
		this.armature = DragonModelData.createArmature();
	}

	public Armature getArmature() {
		return this.armature;
	}

	public Mesh getMesh() {
		return this.mesh;
	}

	public void loadMeshAndProperties() {
		this.mesh = DragonModelData.createMesh();
	}

	@OnlyIn(Dist.CLIENT)
	public void drawAnimatedModel(PoseStack posetStack, VertexConsumer builder, int packedLightIn, float r, float g, float b, float a, int overlayCoord, OpenMatrix4f[] poses) {
		Matrix4f matrix4f = posetStack.last().pose();
		Matrix3f matrix3f = posetStack.last().normal();
		OpenMatrix4f[] posesNoTranslation = new OpenMatrix4f[poses.length];
		Mesh mesh = this.getMesh();

		for (int i = 0; i < poses.length; i++) {
			posesNoTranslation[i] = poses[i].removeTranslation();
		}

		for (VertexIndicator vi : mesh.vertexIndicators) {
			int pos = vi.position * 3;
			int norm = vi.normal * 3;
			int uv = vi.uv * 2;
			Vector4f position = new Vector4f(mesh.positions[pos], mesh.positions[pos + 1], mesh.positions[pos + 2], 1.0F);
			Vector4f normal = new Vector4f(mesh.noramls[norm], mesh.noramls[norm + 1], mesh.noramls[norm + 2], 1.0F);
			Vector4f transformedPos = OpenMatrix4f.transform(poses[vi.joint], position, null);
			Vector4f transformedNorm = OpenMatrix4f.transform(posesNoTranslation[vi.joint], normal, null);

			Vector4f posVec = new Vector4f(transformedPos.x, transformedPos.y, transformedPos.z, 1.0F);
			Vector3f normVec = new Vector3f(transformedNorm.x, transformedNorm.y, transformedNorm.z);
			posVec.transform(matrix4f);
			normVec.transform(matrix3f);
			builder.vertex(posVec.x, posVec.y, posVec.z, r, g, b, a, mesh.uvs[uv], mesh.uvs[uv + 1], overlayCoord, packedLightIn, normVec.x, normVec.y, normVec.z);
		}
	}
}