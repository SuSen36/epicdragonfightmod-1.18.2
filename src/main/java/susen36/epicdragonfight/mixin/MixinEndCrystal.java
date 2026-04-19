package susen36.epicdragonfight.mixin;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.levelgen.feature.SpikeFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import susen36.epicdragonfight.entitypatch.IEndCrystalPatch;

import java.util.ArrayList;
import java.util.List;

@Mixin(EndCrystal.class)
public abstract class MixinEndCrystal implements IEndCrystalPatch {
	@Unique
	private static final EntityDataAccessor<Boolean> DATA_HAS_SHIELD = SynchedEntityData.defineId(EndCrystal.class, EntityDataSerializers.BOOLEAN);
	@Unique
	private static final EntityDataAccessor<Integer> DATA_SHIELD_HEALTH = SynchedEntityData.defineId(EndCrystal.class, EntityDataSerializers.INT);
	@Unique
	private static final EntityDataAccessor<Integer> DATA_MAX_SHIELD_HEALTH = SynchedEntityData.defineId(EndCrystal.class, EntityDataSerializers.INT);
	@Unique
	private static final EntityDataAccessor<Integer> DATA_TEMP_SHIELD_HEALTH = SynchedEntityData.defineId(EndCrystal.class, EntityDataSerializers.INT);
	@Unique
	private static final String SHIELD_HEALTH_NBT_KEY = "shield_health";
	@Unique
	private static final String MAX_SHIELD_HEALTH_NBT_KEY = "max_shield_health";
	@Unique
	private static final String TEMP_SHIELD_HEALTH_NBT_KEY = "temp_shield_health";

	@Unique
	private int shieldRecoveryTick = 0;

	@Inject(at = @At(value = "HEAD"), method = "defineSynchedData")
	private void defineSynchedData(CallbackInfo ci) {
		this.getSelf().getEntityData().define(DATA_HAS_SHIELD, false);
		this.getSelf().getEntityData().define(DATA_MAX_SHIELD_HEALTH, 20);
		this.getSelf().getEntityData().define(DATA_SHIELD_HEALTH, this.getMaxShieldHealth());
		this.getSelf().getEntityData().define(DATA_TEMP_SHIELD_HEALTH, 0);
	}

	@Override
	public boolean hasShield() {
		return getSelf().getEntityData().get(DATA_HAS_SHIELD) && getShieldHealth() > 0;
	}

	@Override
	public void setShield(boolean shield) {
		getSelf().getEntityData().set(DATA_HAS_SHIELD, shield);
	}

	@Override
	public int getShieldHealth() {
		return getSelf().getEntityData().get(DATA_SHIELD_HEALTH);
	}

	@Override
	public void setShieldHealth(int value) {
		getSelf().getEntityData().set(DATA_SHIELD_HEALTH, Math.max(0, Math.min(20, value)));
	}

	@Override
	public void addShieldHealth(int amount) {
		getSelf().getEntityData().set(DATA_SHIELD_HEALTH, Math.max(0, getShieldHealth() + amount));
	}

	@Override
	public int getMaxShieldHealth() {
		return getSelf().getEntityData().get(DATA_MAX_SHIELD_HEALTH);
	}

	@Override
	public void setMaxShieldHealth(int value) {
		getSelf().getEntityData().set(DATA_MAX_SHIELD_HEALTH, Math.max(1, value));
	}

	@Override
	public int getTempShieldHealth() {
		return getSelf().getEntityData().get(DATA_TEMP_SHIELD_HEALTH);
	}

	@Override
	public void setTempShieldHealth(int value) {
		getSelf().getEntityData().set(DATA_TEMP_SHIELD_HEALTH, Math.max(0, Math.min(getMaxShieldHealth(), value)));
	}

	@Override
	public void addTempShieldHealth(int amount) {
		getSelf().getEntityData().set(DATA_TEMP_SHIELD_HEALTH, Math.min(getMaxShieldHealth(), getTempShieldHealth() + amount));
	}

	@Inject(at = @At(value = "HEAD"), method = "addAdditionalSaveData", remap = true)
	private void addAdditionalSaveData(CompoundTag tag, CallbackInfo ci) {
		tag.putInt(SHIELD_HEALTH_NBT_KEY, getShieldHealth());
		tag.putInt(MAX_SHIELD_HEALTH_NBT_KEY, getMaxShieldHealth());
		tag.putInt(TEMP_SHIELD_HEALTH_NBT_KEY, getTempShieldHealth());
	}

	@Inject(at = @At(value = "HEAD"), method = "readAdditionalSaveData", remap = true)
	private void readAdditionalSaveData(CompoundTag tag, CallbackInfo ci) {
		if (tag.contains(SHIELD_HEALTH_NBT_KEY)) {
			setShieldHealth(tag.getInt(SHIELD_HEALTH_NBT_KEY));
		} else {
			setShieldHealth(20);
		}
		if (tag.contains(MAX_SHIELD_HEALTH_NBT_KEY)) {
			setMaxShieldHealth(tag.getInt(MAX_SHIELD_HEALTH_NBT_KEY));
		} else {
			setMaxShieldHealth(20);
		}
		if (tag.contains(TEMP_SHIELD_HEALTH_NBT_KEY)) {
			setTempShieldHealth(tag.getInt(TEMP_SHIELD_HEALTH_NBT_KEY));
		} else {
			setTempShieldHealth(0);
		}
	}

	@Inject(at = @At(value = "HEAD"), method = "tick", cancellable = false)
	private void tick(CallbackInfo ci) {
		if (this.getSelf().level.isClientSide()) return;

		boolean shouldHaveShield = false;

		List<EnderDragon> dragons = new ArrayList<>();
		this.getSelf().level.getEntities().get(EntityType.ENDER_DRAGON, dragons::add);

		if (!dragons.isEmpty() && dragons.stream().anyMatch(dragon -> !dragon.isDeadOrDying()) && dragons.stream().noneMatch(dragon -> dragon.nearestCrystal == this.getSelf())) {
			for (SpikeFeature.EndSpike spike : SpikeFeature.getSpikesForLevel((ServerLevel) this.getSelf().level)) {
				if (spike.getTopBoundingBox().contains(this.getSelf().position())) {
					shouldHaveShield = true;
					break;
				}
			}
		}
		this.setShield(shouldHaveShield);

		this.shieldRecoveryTick++;
		if (this.shieldRecoveryTick >= 20) {
			this.shieldRecoveryTick = 0;
			if (this.hasShield() && this.getShieldHealth() < this.getMaxShieldHealth()) {
				this.addShieldHealth(1);
			} else if (!hasShield() && this.getTempShieldHealth() < this.getMaxShieldHealth()) {
				this.addTempShieldHealth(1);
			}else if (this.getShieldHealth() < this.getMaxShieldHealth() && this.getTempShieldHealth() >= this.getMaxShieldHealth()) {
				this.setShieldHealth(this.getTempShieldHealth());
				this.setTempShieldHealth(0);
			}
		}
	}

	@Inject(at = @At(value = "HEAD"), method = "hurt", cancellable = true)
	private void hurt(DamageSource damagesource, float amount, CallbackInfoReturnable<Boolean> info) {
		if (this.getSelf().level.isClientSide()) return;

		if (hasShield() && damagesource.isProjectile()) {
			info.setReturnValue(false);
			info.cancel();
		} else if (hasShield()) {
			if (getShieldHealth() > 0) {
				this.addShieldHealth((int) -amount);
			} else {
				this.addTempShieldHealth((int) -amount);
				if (getTempShieldHealth() >= getMaxShieldHealth()) {
					setShieldHealth(getMaxShieldHealth());
					setTempShieldHealth(0);
				}
			}
			this.playHurtSound();
			info.setReturnValue(false);
			info.cancel();
		}
	}

	@Unique
	private void playHurtSound() {
		float pitch = 0.5F + (getShieldHealth() / (float) getMaxShieldHealth()) * 0.7F;
		this.getSelf().level.playSound(null, this.getSelf().getX(), this.getSelf().getY(), this.getSelf().getZ(), SoundEvents.GLASS_BREAK, SoundSource.HOSTILE, 0.75F, pitch);
	}

	@Unique
	private EndCrystal getSelf(){
		return  (EndCrystal)((Object)this);
	}
}
