package susen36.epicdragonfight.api.client.model;

import java.util.List;
import java.util.Map;

import org.apache.commons.compress.utils.Lists;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.joml.Vector4f;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

@OnlyIn(Dist.CLIENT)
public class Mesh {
	final float[] positions;
	final float[] uvs;
	final float[] noramls;
	final float[] weights;
	final List<VertexIndicator> vertexIndicators;
	
	public Mesh(float[] positions, float[] noramls, float[] uvs, int[] animationIndices, float[] weights, int[] drawingIndices, int[] vCounts) {
		this.positions = positions;
		this.noramls = noramls;
		this.uvs = uvs;
		this.weights = weights;
		this.vertexIndicators = VertexIndicator.create(drawingIndices, vCounts, animationIndices);
	}

}