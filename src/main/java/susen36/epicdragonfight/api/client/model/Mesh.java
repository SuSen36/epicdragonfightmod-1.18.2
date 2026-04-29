package susen36.epicdragonfight.api.client.model;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public class Mesh {
	final float[] positions;
	final float[] uvs;
	final float[] noramls;
	final List<VertexIndicator> vertexIndicators;

	public Mesh(float[] positions, float[] noramls, float[] uvs, int[] animationIndices, int[] drawingIndices, int[] vCounts) {
		this.positions = positions;
		this.noramls = noramls;
		this.uvs = uvs;
		this.vertexIndicators = VertexIndicator.create(drawingIndices, vCounts, animationIndices);
	}
}