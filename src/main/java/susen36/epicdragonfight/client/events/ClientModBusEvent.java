package susen36.epicdragonfight.client.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.client.events.engine.RenderEngine;

@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid= EpicDragonFight.MODID, value=Dist.CLIENT, bus=EventBusSubscriber.Bus.MOD)
public class ClientModBusEvent {
	private static final RenderEngine renderEngine = new RenderEngine();

	@SubscribeEvent
	public static void reloadEvent(EntityRenderersEvent.AddLayers event) {
		renderEngine.registerRenderer();
	}
}