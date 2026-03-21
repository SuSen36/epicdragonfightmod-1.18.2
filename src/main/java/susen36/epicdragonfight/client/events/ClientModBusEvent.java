package susen36.epicdragonfight.client.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.EntityRenderersEvent.RegisterRenderers;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.client.ClientEngine;

@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid= EpicDragonFight.MODID, value=Dist.CLIENT, bus=EventBusSubscriber.Bus.MOD)
public class ClientModBusEvent {

	@SubscribeEvent
	public static void reloadEvent(EntityRenderersEvent.AddLayers event) {
		ClientEngine.instance.renderEngine.registerRenderer();
	}
}