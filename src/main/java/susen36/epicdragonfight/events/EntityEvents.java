package susen36.epicdragonfight.events;

import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import susen36.epicdragonfight.EpicDragonFight;

@Mod.EventBusSubscriber(modid= EpicDragonFight.MODID)
public class EntityEvents {
	@SubscribeEvent
	@SuppressWarnings("removal")
	public static void sizingEvent(EntityEvent.Size event) {
		if (event.getEntity() instanceof EnderDragon) {
			event.setNewSize(EntityDimensions.scalable(3.5F, 4.5F));
		}
	}
}