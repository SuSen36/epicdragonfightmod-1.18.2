package susen36.epicdragonfight.client.events.engine;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.client.forgeevent.RenderEnderDragonEvent;
import susen36.epicdragonfight.client.renderer.patched.entity.PEnderDragonRenderer;
import susen36.epicdragonfight.client.renderer.patched.entity.PatchedEntityRenderer;
import susen36.epicdragonfight.world.entitypatch.IDragonPatch;

@OnlyIn(Dist.CLIENT)
public class RenderEngine {
	private PatchedEntityRenderer dragonRenderer;

	public RenderEngine() {
		Events.renderEngine = this;
	}

	public void registerRenderer() {
		this.dragonRenderer = new PEnderDragonRenderer();
	}

	@Mod.EventBusSubscriber(modid = EpicDragonFight.MODID, value = Dist.CLIENT)
	public static class Events {
		static RenderEngine renderEngine;

		@SubscribeEvent
		public static void renderEnderDragonEvent(RenderEnderDragonEvent event) {
			if (event.getEntity() instanceof IDragonPatch dragonPatch) {
				event.setCanceled(true);
				renderEngine.dragonRenderer.render(event.getEntity(), dragonPatch, event.getRenderer(), event.getBuffers(), event.getPoseStack(), event.getLight(), event.getPartialRenderTick());
			}
		}
	}
}
