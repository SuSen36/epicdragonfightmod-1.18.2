package susen36.epicdragonfight.world.capabilities.provider;

import com.google.common.collect.Maps;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.fml.ModLoader;
import net.minecraftforge.registries.ForgeRegistries;
import susen36.epicdragonfight.api.forgeevent.EntityPatchRegistryEvent;
import susen36.epicdragonfight.world.capabilities.DragonFightCapabilities;
import susen36.epicdragonfight.world.capabilities.entitypatch.MobPatch;
import susen36.epicdragonfight.world.capabilities.entitypatch.enderdragon.EnderDragonPatch;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class ProviderEntity implements ICapabilityProvider, NonNullSupplier<MobPatch<?>> {
	private static final Map<EntityType<?>, Function<Entity, Supplier<MobPatch<?>>>> CAPABILITIES = Maps.newHashMap();
	private static final Map<EntityType<?>, Function<Entity, Supplier<MobPatch<?>>>> CUSTOM_CAPABILITIES = Maps.newHashMap();
	
	public static void registerEntityPatches() {
		Map<EntityType<?>, Function<Entity, Supplier<MobPatch<?>>>> registry = Maps.newHashMap();
			registry.put(EntityType.ENDER_DRAGON, (entityIn) -> {
			if (entityIn instanceof EnderDragon) {
				return EnderDragonPatch::new;
			}
			return () -> null;
		});
	    EntityPatchRegistryEvent entitypatchRegistryEvent = new EntityPatchRegistryEvent(registry);
		ModLoader.get().postEvent(entitypatchRegistryEvent);

		CAPABILITIES.putAll(registry);
	}
	
	public static void registerEntityPatchesClient() {
		CAPABILITIES.put(EntityType.PLAYER, (entityIn) -> () -> null);
	}

	public static Function<Entity, Supplier<MobPatch<?>>> get(String registryName) {
		ResourceLocation rl = new ResourceLocation(registryName);
		EntityType<?> entityType = ForgeRegistries.ENTITY_TYPES.getValue(rl);
		return CAPABILITIES.get(entityType);
	}
	
	private MobPatch<?> capability;

	public ProviderEntity(Entity entity) {
		Function<Entity, Supplier<MobPatch<?>>> provider = CUSTOM_CAPABILITIES.getOrDefault(entity.getType(), CAPABILITIES.get(entity.getType()));
		
		if (provider != null) {
			this.capability = provider.apply(entity).get();
		}
	}
	
	public boolean hasCapability() {
		return capability != null;
	}
	
	@Override
	public MobPatch<?> get() {
		return this.capability;
	}
	
	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
		return DragonFightCapabilities.CAPABILITY_ENTITY.orEmpty(cap, LazyOptional.of(() -> this.capability));
	}
}