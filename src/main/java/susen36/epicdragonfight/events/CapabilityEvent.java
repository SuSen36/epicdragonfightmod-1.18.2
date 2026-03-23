package susen36.epicdragonfight.events;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.world.capabilities.DragonFightCapabilities;
import susen36.epicdragonfight.world.capabilities.entitypatch.MobPatch;
import susen36.epicdragonfight.world.capabilities.provider.ProviderEntity;

@Mod.EventBusSubscriber(modid= EpicDragonFight.MODID)
public class CapabilityEvent {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SubscribeEvent
	public static void attachEntityCapability(AttachCapabilitiesEvent<Entity> event) {
		Entity entity = event.getObject();
		
		if (entity.getCapability(DragonFightCapabilities.CAPABILITY_ENTITY).orElse(null) == null) {
			ProviderEntity prov = new ProviderEntity(entity);
			if (prov.hasCapability()) {
				MobPatch entityCap = prov.getCapability(DragonFightCapabilities.CAPABILITY_ENTITY).orElse(null);
				if (entity instanceof Mob mobEntity) {
					entityCap.onConstructed(mobEntity);
				}
				event.addCapability(new ResourceLocation(EpicDragonFight.MODID, "entity_cap"), prov);
			}
		}
	}
}