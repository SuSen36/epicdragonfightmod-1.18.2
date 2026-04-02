package susen36.epicdragonfight.events;

import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import susen36.epicdragonfight.EpicDragonFight;

@Mod.EventBusSubscriber(modid= EpicDragonFight.MODID)
public class EntityEvents {

	//@SubscribeEvent
	//public static void knockBackEvent(LivingKnockBackEvent event) {
	//	IDragonPatch cap = (IDragonPatch) event.getEntityLiving().getCapability(DragonFightCapabilities.CAPABILITY_ENTITY).orElse(null);
	//
	//	if (cap != null) {
	//		event.setCanceled(true);
	//	}
	//}

	@SubscribeEvent
	public static void sizingEvent(EntityEvent.Size event) {
		if (event.getEntity() instanceof EnderDragon) {
			event.setNewSize(EntityDimensions.scalable(3.75F, 4.25F));
		}
	}

}