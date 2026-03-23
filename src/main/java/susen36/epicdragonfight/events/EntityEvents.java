package susen36.epicdragonfight.events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingKnockBackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import susen36.epicdragonfight.EpicDragonFight;
	import susen36.epicdragonfight.world.capabilities.DragonFightCapabilities;
import susen36.epicdragonfight.world.capabilities.entitypatch.MobPatch;

@Mod.EventBusSubscriber(modid= EpicDragonFight.MODID)
public class EntityEvents {
	@SuppressWarnings("unchecked")
	@SubscribeEvent
	public static void spawnEvent(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		
		if (entity instanceof Mob mobEntity) {
			MobPatch<Mob> entitypatch = (MobPatch<Mob>) mobEntity.getCapability(DragonFightCapabilities.CAPABILITY_ENTITY, null).orElse(null);

			if (entitypatch != null && !entitypatch.isInitialized()) {
				entitypatch.onJoinWorld(mobEntity, event);
			}
		}

		if(entity instanceof EnderMan) {
			if (entity.level.dimension() == Level.END) {
				if (entity.position().horizontalDistanceSqr() < 40000) {
					event.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent
	public static void updateEvent(LivingUpdateEvent event) {
		MobPatch<?> entitypatch = (MobPatch<?>) event.getEntityLiving().getCapability(DragonFightCapabilities.CAPABILITY_ENTITY, null).orElse(null);

		if (entitypatch != null && entitypatch.getOriginal() != null) {
			entitypatch.tick(event);
		}
	}

	@SubscribeEvent
	public static void knockBackEvent(LivingKnockBackEvent event) {
		MobPatch<?> cap = (MobPatch<?>) event.getEntityLiving().getCapability(DragonFightCapabilities.CAPABILITY_ENTITY).orElse(null);

		if (cap != null) {
			event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void hurtEvent(LivingHurtEvent event) {
		LivingEntity hitEntity = event.getEntityLiving();
		if ((hitEntity instanceof EnderDragon)) {
				if (hitEntity.level.dimension() == Level.END) {
					if (hitEntity.position().horizontalDistanceSqr() < 40000) {
						event.setAmount(event.getAmount()*0.8f);
					}
					event.setAmount(event.getAmount());
				}
		}
	}

	@SubscribeEvent
	public static void sizingEvent(EntityEvent.Size event) {
		if (event.getEntity() instanceof EnderDragon) {
			event.setNewSize(EntityDimensions.scalable(3.5F, 4.5F));
		}
	}

	@SubscribeEvent
	public static void deathEvent(LivingDeathEvent event) {
		MobPatch<?> entitypatch = (MobPatch<?>)event.getEntityLiving().getCapability(DragonFightCapabilities.CAPABILITY_ENTITY, null).orElse(null);
		if (entitypatch != null) {
			entitypatch.onDeath();
		}
	}

}