package susen36.epicdragonfight.client.renderer;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.Mode;
import net.minecraft.Util;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.EpicDragonFight;

import java.util.function.Function;

@OnlyIn(Dist.CLIENT)
public class DragonFightRenderTypes extends RenderType {
	private DragonFightRenderTypes(String name, VertexFormat format, Mode mode, int bufferSize, boolean useDelegate, boolean sortOnUpload, Runnable setupState, Runnable teardownState) {
		super(name, format, mode, bufferSize, useDelegate, sortOnUpload, setupState, teardownState);
	}

	private static final RenderType DEBUG_QUADS = create("debug_quad", DefaultVertexFormat.POSITION_COLOR, Mode.QUADS, 256, false, false,
			CompositeState.builder()
				.setShaderState(POSITION_COLOR_SHADER)
				.setLayeringState(VIEW_OFFSET_Z_LAYERING)
				.setTransparencyState(NO_TRANSPARENCY)
				.setWriteMaskState(COLOR_DEPTH_WRITE)
				.setCullState(NO_CULL)
				.createCompositeState(false)
	);

	private static final Function<ResourceLocation, RenderType> FORCE_FIELD = Util.memoize((textureLocation) -> {
		CompositeState state = CompositeState.builder()
				.setShaderState(POSITION_COLOR_TEX_LIGHTMAP_SHADER)
				.setTextureState(new TextureStateShard(textureLocation, false, false))
				.setTransparencyState(TRANSLUCENT_TRANSPARENCY)
				.setCullState(NO_CULL)
				.setLightmapState(LIGHTMAP)
				.createCompositeState(true);
		return create(EpicDragonFight.MODID + ":force_field", DefaultVertexFormat.POSITION_COLOR_TEX_LIGHTMAP, Mode.QUADS, 256, true, false, state);
	});

	public static RenderType debugQuads() {
		return DEBUG_QUADS;
	}

	public static RenderType forceField(ResourceLocation locationIn) {
		return FORCE_FIELD.apply(locationIn);
	}
}