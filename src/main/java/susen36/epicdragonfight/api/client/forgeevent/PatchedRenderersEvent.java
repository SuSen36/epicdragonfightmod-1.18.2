package susen36.epicdragonfight.api.client.forgeevent;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.event.IModBusEvent;
import susen36.epicdragonfight.client.renderer.patched.entity.PatchedEntityRenderer;

import java.util.Map;
import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
@SuppressWarnings("rawtypes")
public abstract class PatchedRenderersEvent extends Event implements IModBusEvent {
	public static class Add extends PatchedRenderersEvent {
		private Map<EntityType<?>, Supplier<PatchedEntityRenderer>> entityRendererProvider;

		public Add(Map<EntityType<?>, Supplier<PatchedEntityRenderer>> entityRendererProvider) {
			this.entityRendererProvider = entityRendererProvider;
		}

	}
}