package susen36.epicdragonfight.mixin;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.level.levelgen.feature.SpikeFeature;
import susen36.epicdragonfight.entitypatch.IEndCrystalPatch;

@Mixin(EndCrystal.class)
public abstract class MixinEndCrystal implements IEndCrystalPatch {
	@Unique
	private static final EntityDataAccessor<Boolean> DATA_HAS_SHIELD = SynchedEntityData.defineId(EndCrystal.class, EntityDataSerializers.BOOLEAN);

	@Inject(at = @At(value = "HEAD"), method = "defineSynchedData", remap = true)
	private void epicfight_defineSynchedData(CallbackInfo ci) {
		EndCrystal self = (EndCrystal)((Object)this);
		self.getEntityData().define(DATA_HAS_SHIELD, false);
	}

	@Override
	public EndCrystal getSelf() {
		return (EndCrystal)((Object)this);
	}

	@Override
	public boolean hasShield() {
		return getSelf().getEntityData().get(DATA_HAS_SHIELD);
	}

	@Override
	public void setHasShield(boolean shield) {
		getSelf().getEntityData().set(DATA_HAS_SHIELD, shield);
	}

	@Inject(at = @At(value = "HEAD"), method = "tick", cancellable = false)
	private void epicfight_tick(CallbackInfo ci) {
		EndCrystal self = (EndCrystal)((Object)this);

		if (self.level.isClientSide()) return;

		boolean shouldHaveShield = false;

		List<EnderDragon> dragons = new ArrayList<>();
		self.level.getEntities().get(EntityType.ENDER_DRAGON, dragons::add);

		if (!dragons.isEmpty() && dragons.stream().anyMatch(dragon -> !dragon.isDeadOrDying()) && dragons.stream().noneMatch(dragon -> dragon.nearestCrystal == self)) {
			for (SpikeFeature.EndSpike spike : SpikeFeature.getSpikesForLevel((ServerLevel) self.level)) {
				if (spike.getTopBoundingBox().contains(self.position())) {
					shouldHaveShield = true;
					break;
				}
			}
		}

		self.getEntityData().set(DATA_HAS_SHIELD, shouldHaveShield);
	}

	@Inject(at = @At(value = "HEAD"), method = "hurt", cancellable = true)
	private void epicfight_hurt(DamageSource damagesource, float amount, CallbackInfoReturnable<Boolean> info) {
		EndCrystal self = (EndCrystal)((Object)this);

		if (self.level.isClientSide()) return;

		if (hasShield()) {
			info.setReturnValue(false);
			info.cancel();
		}
	}
}
