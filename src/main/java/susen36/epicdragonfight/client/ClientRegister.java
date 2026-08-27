package susen36.epicdragonfight.client;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.gameasset.EnderDragonModel;
import susen36.epicdragonfight.gameasset.EnderDragonRenderer;

@Mod.EventBusSubscriber(modid = EpicDragonFight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientRegister {
	@SubscribeEvent
	public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(EnderDragonModel.LAYER_LOCATION, EnderDragonModel::createBodyLayer);
	}

	@SubscribeEvent
	public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityType.ENDER_DRAGON, EnderDragonRenderer::new);
	}
}