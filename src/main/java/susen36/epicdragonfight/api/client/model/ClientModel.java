package susen36.epicdragonfight.api.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import susen36.epicdragonfight.api.model.JsonModelLoader;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

@OnlyIn(Dist.CLIENT)
public class ClientModel extends Model {
	protected Mesh mesh;
	protected RenderProperties properties;
	
	public ClientModel(ResourceLocation location) {
		this(location, null);
	}
	
	public ClientModel(ResourceLocation location, Mesh mesh) {
		super(location);
		this.mesh = mesh;
		this.properties = RenderProperties.DEFAULT;
	}
	
	public boolean loadMeshAndProperties(ResourceManager resourceManager) {
		JsonModelLoader loader = new JsonModelLoader(resourceManager, this.getLocation());
		
		if (loader.isValidSource()) {
			ResourceLocation parent = loader.getParent();
			
			if (parent == null) {
				this.mesh = loader.getMesh();
			} else {
				throw new IllegalStateException("Parent models are not supported in this simplified implementation");
			}
			
			this.properties = loader.getRenderProperties();
			
			return true;
		}
		
		return false;
	}
	
	public RenderProperties getProperties() {
		return this.properties;
	}
	
	public Mesh getMesh() {
		return this.mesh;
	}


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
			Vector4f totalPos = new Vector4f(0.0F, 0.0F, 0.0F, 0.0F);
			Vector4f totalNorm = new Vector4f(0.0F, 0.0F, 0.0F, 0.0F);

			for (int i = 0; i < vi.joint.size(); i++) {
				int jointIndex = vi.joint.get(i);
				int weightIndex = vi.weight.get(i);
				float weight = mesh.weights[weightIndex];
				Vector4f transformedPos = OpenMatrix4f.transform(poses[jointIndex], position, null);
				transformedPos.mul(weight);
				totalPos.add(transformedPos.x, transformedPos.y, transformedPos.z, transformedPos.w);
				Vector4f transformedNorm = OpenMatrix4f.transform(posesNoTranslation[jointIndex], normal, null);
				transformedNorm.mul(weight);
				totalNorm.add(transformedNorm.x, transformedNorm.y, transformedNorm.z, transformedNorm.w);
			}

			Vector4f posVec = new Vector4f(totalPos.x, totalPos.y, totalPos.z, 1.0F);
			Vector3f normVec = new Vector3f(totalNorm.x, totalNorm.y, totalNorm.z);
			posVec.mul(matrix4f);
			normVec.mul(matrix3f);
			builder.vertex(posVec.x, posVec.y, posVec.z, r, g, b, a, mesh.uvs[uv], mesh.uvs[uv + 1], overlayCoord, packedLightIn, normVec.x, normVec.y, normVec.z);
		}
	}

	public static class RenderProperties {
		public static final RenderProperties DEFAULT = RenderProperties.builder().build();
		
		boolean isTransparent;
		
		public RenderProperties(Builder builder) {
			this.isTransparent = builder.isTransparent;
		}
		
		public boolean isTransparent() {
			return this.isTransparent;
		}
		
		public static Builder builder() {
			return new Builder();
		}
		
		public static class Builder {
			boolean isTransparent = false;
			
			public Builder transparency(boolean isTransparent) {
				this.isTransparent = isTransparent;
				return this;
			}
			
			public RenderProperties build() {
				return new RenderProperties(this);
			}
		}
	}
}