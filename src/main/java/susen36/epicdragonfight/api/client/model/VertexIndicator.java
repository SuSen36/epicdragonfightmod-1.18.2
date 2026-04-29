package susen36.epicdragonfight.api.client.model;

import com.google.common.collect.Lists;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public class VertexIndicator {
	public static List<VertexIndicator> create(int[] drawingIndices, int[] vCounts, int[] jointIds) {
		List<VertexIndicator> vertexIndicators = Lists.newArrayList();

		for (int i = 0; i < drawingIndices.length / 3; i++) {
			int k = i * 3;
			int position = drawingIndices[k];
			int uv = drawingIndices[k + 1];
			int normal = drawingIndices[k + 2];
			vertexIndicators.add(new VertexIndicator(position, uv, normal, jointIds[position]));
		}

		return vertexIndicators;
	}

	public final int position;
	public final int uv;
	public final int normal;
	public final int joint;

	public VertexIndicator(int position, int uv, int normal, int joint) {
		this.position = position;
		this.uv = uv;
		this.normal = normal;
		this.joint = joint;
	}
}