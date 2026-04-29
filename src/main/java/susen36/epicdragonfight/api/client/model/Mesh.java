package susen36.epicdragonfight.api.client.model;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public class Mesh {
	public final float[] positions;
	public final float[] uvs;
	public final float[] noramls;
	public final List<VertexIndicator> vertexIndicators;

	public Mesh(float[] positions, float[] noramls, float[] uvs, int[] animationIndices, int[] drawingIndices, int[] vcounts) {
		this.positions = positions;
		this.noramls = noramls;
		this.uvs = uvs;
		this.vertexIndicators = VertexIndicator.create(drawingIndices, animationIndices);
	}
}