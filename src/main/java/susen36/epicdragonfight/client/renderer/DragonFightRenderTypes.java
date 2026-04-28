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
	private DragonFightRenderTypes(String p_173178_, VertexFormat p_173179_, Mode p_173180_, int p_173181_, boolean p_173182_, boolean p_173183_, Runnable p_173184_, Runnable p_173185_) {
		super(p_173178_, p_173179_, p_173180_, p_173181_, p_173182_, p_173183_, p_173184_, p_173185_);
	}

	private static final RenderType DEBUG_QUADS = create(EpicDragonFight.MODID + ":debug_quad", DefaultVertexFormat.POSITION_COLOR, Mode.QUADS, 256, false, false,
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
				.setOverlayState(OVERLAY)
				.createCompositeState(true);
		return create(EpicDragonFight.MODID + ":force_field", DefaultVertexFormat.POSITION_COLOR_TEX_LIGHTMAP, Mode.TRIANGLES, 256, true, false, state);
	});

	public static RenderType debugQuads() {
		return DEBUG_QUADS;
	}

	public static RenderType forceField(ResourceLocation locationIn) {
		return FORCE_FIELD.apply(locationIn);
	}
}