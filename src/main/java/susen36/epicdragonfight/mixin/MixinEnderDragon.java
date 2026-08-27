package susen36.epicdragonfight.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhaseManager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.enderdragon.*;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Mixin(EnderDragon.class)
public abstract class MixinEnderDragon extends Mob implements IDragonPatch {
	@Shadow public EnderDragonPhaseManager phaseManager;

	@Shadow protected abstract boolean reallyHurt(DamageSource pDamageSource, float pAmount);

	@Shadow private float sittingDamageReceived;

	private boolean groundPhase;
	@Unique
	public float xRoot;
	public float xRootO;
	public float zRoot;
	@Unique
	public float zRootO;
	public int shieldEndEffectAge = 10;

	private AnimationState idleAnimationState = new AnimationState();
	private AnimationState walkAnimationState = new AnimationState();
	private AnimationState flyAnimationState = new AnimationState();
	private AnimationState chaseAnimationState = new AnimationState();
	private AnimationState deathAnimationState = new AnimationState();
	@Unique
	private AnimationState currentAnimation;

	private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.PINK, BossEvent.BossBarOverlay.PROGRESS)).setPlayBossMusic(false).setCreateWorldFog(false);

	@Unique
	private static final AttributeModifier LANDED_ARMOR_MODIFIER = new AttributeModifier(UUID.fromString("A1B2C3D4-E5F6-7890-ABCD-EF1234567890"), "Landed armor bonus", 5.0, AttributeModifier.Operation.ADDITION);
	private static final AttributeModifier FLYING_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("C2D3E4F5-A6B7-8901-CDEF-234567890123"), "Flying follow range", 36.0, AttributeModifier.Operation.ADDITION);
	private static final AttributeModifier CRYSTAL_LINK_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("D3E4F5A6-B7C8-9012-DEFA-345678901234"), "Crystal link follow range", 86.0, AttributeModifier.Operation.ADDITION);

	protected MixinEnderDragon(EntityType<? extends Mob> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(method = "<init>", at = @At("RETURN"))
	private void onInit(CallbackInfo ci) {
		DragonPhaseInstance currentPhase = this.getSelf().phaseManager.getCurrentPhase();
		EnderDragonPhase<?> startPhase = (currentPhase == null || !(currentPhase instanceof PatchedDragonPhase)) ? PatchedPhases.GROUND_IDLE : this.phaseManager.getCurrentPhase().getPhase();
		this.getSelf().phaseManager = new PhaseManagerPatch(this.getSelf());
		this.getSelf().phaseManager.setPhase(startPhase);
		this.maxUpStep = 1.0F;
	}

	@Override
	public void tick() {
		super.tick();

		if (this.level.isClientSide) {
			this.clientTick();
		} else {
			this.serverTick();
		}

		if (this.getSelf().getPhaseManager().getCurrentPhase().isSitting() && this.getSelf().getPhaseManager().getCurrentPhase().getPhase() != PatchedPhases.CRYSTAL_LINK) {
			this.getSelf().nearestCrystal = null;
		}
	}

	@Unique
	private void clientTick() {
		this.xRootO = this.xRoot;
		this.zRootO = this.zRoot;
		if (this.shieldEndEffectAge < 10) {
			this.shieldEndEffectAge++;
		}
		this.updateAnimationStates();
	}

	@Unique
	private void updateAnimationStates() {
		AnimationState target = this.getAnimationForCurrentPhase();
		if (this.currentAnimation != target) {
			if (this.currentAnimation != null) {
				this.currentAnimation.stop();
			}
			target.start(this.tickCount);
			this.currentAnimation = target;
		}
	}

	@Unique
	private AnimationState getAnimationForCurrentPhase() {
		EnderDragonPhase<?> phase = this.getSelf().getPhaseManager().getCurrentPhase().getPhase();
		if (phase == EnderDragonPhase.DYING) {
			return this.deathAnimationState;
		}
		if (!this.groundPhase) {
			EnderDragonPhase<?> currentPhase = this.phaseManager.getCurrentPhase().getPhase();
			DragonPhaseInstance phaseInstance = this.phaseManager.getCurrentPhase();
			if (currentPhase == PatchedPhases.AIRSTRIKE && phaseInstance instanceof DragonAirstrikePhase airstrike && airstrike.isActuallyAttacking()) {
				return this.chaseAnimationState;
			}
			if (currentPhase == PatchedPhases.CHARGE && phaseInstance instanceof DragonChargePhase charge && charge.isActuallyAttacking()) {
				return this.chaseAnimationState;
			}
			return this.flyAnimationState;
		}
		if (phase == PatchedPhases.GROUND_BATTLE) {
			return this.walkAnimationState;
		}
		if (phase == PatchedPhases.GROUND_IDLE || phase == PatchedPhases.LANDING) {
			return this.idleAnimationState;
		}
		return this.idleAnimationState;
	}

	@Unique
	private void serverTick() {
		boolean isFlying = !this.isGroundPhase();

		this.hurtTime = isFlying ? hurtTime : 2;
		this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
		if (this.level instanceof ServerLevel serverLevel) {
			EndDragonFight dragonFight = serverLevel.dragonFight();
			if (dragonFight != null && this.getUUID().equals(dragonFight.dragonUUID)) {
				this.bossEvent.setColor(net.minecraft.world.BossEvent.BossBarColor.PURPLE);
			} else {
				this.bossEvent.setColor(net.minecraft.world.BossEvent.BossBarColor.PINK);
			}
		}

		this.getSensing().tick();

		Entity bodyPart = Objects.requireNonNull(this.getSelf().getParts())[2];
		AABB bodyBoundingBox = bodyPart.getBoundingBox();
		List<Entity> list = this.level.getEntities(this, bodyBoundingBox, EntitySelector.pushableBy(this));
		if (!list.isEmpty()) {
			for (Entity entity : list) {
				double d0 = entity.getX() - this.getX();
				double d1 = entity.getZ() - this.getZ();
				double d2 = Mth.absMax(d0, d1);

				if (d2 >= 0.01D) {
					d2 = Math.sqrt(d2);
					d0 = d0 / d2;
					d1 = d1 / d2;
					double d3 = 1.0D / d2;

					if (d3 > 1.0D) {
						d3 = 1.0D;
					}

					d0 = d0 * d3 * 0.2D;
					d1 = d1 * d3 * 0.2D;

					if (!entity.isVehicle()) {
						entity.push(d0, 0.0D, d1);
						entity.hurtMarked = true;
					}
				}
			}
		}
	}

	@Override
	public final EntityDimensions getDimensions(Pose pose) {
		return EntityDimensions.scalable(3.75F, 4.25F);
	}

	@ModifyVariable(method = "tickDeath", name = "i", at = @At(value = "STORE", ordinal = 0))
	private int modifyExperienceAmount(int original) {
		return 12000;
	}

	@Inject(
		method = "createAttributes",
		at = @At("RETURN"),
		cancellable = true
	)
	private static void onCreateAttributes(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
		AttributeSupplier.Builder builder = cir.getReturnValue();
		builder.add(Attributes.MAX_HEALTH, 400.0D);
		builder.add(Attributes.ARMOR, 4D);
		builder.add(Attributes.ARMOR_TOUGHNESS, 2.5D);
		builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.75D);
		builder.add(Attributes.ATTACK_DAMAGE, 10.0D);
		builder.add(Attributes.ATTACK_KNOCKBACK, 0.5D);
		builder.add(Attributes.FOLLOW_RANGE, 64.0D);
		cir.setReturnValue(builder);
	}

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public boolean hurt(EnderDragonPart pPart, DamageSource pSource, float pDamage) {
		if (this.phaseManager.getCurrentPhase().getPhase() == EnderDragonPhase.DYING) {
			return false;
		}

		Entity sourceEntity = pSource.getEntity();
		if (sourceEntity == this.getSelf() || (sourceEntity instanceof EnderDragonPart dragonPart && dragonPart.getParent() == this.getSelf())) {
			return false;
		}

		pDamage = this.phaseManager.getCurrentPhase().onHurt(pSource, pDamage);

		boolean isAlwaysSource = pSource.getEntity() instanceof Player || pSource.isExplosion();
		if (!isAlwaysSource) {
			pDamage *= 0.5F;
		}

		if (pDamage < 0.01F) {
			return false;
		}

        this.reallyHurt(pSource, pDamage);

		if (this.isDeadOrDying() && !this.phaseManager.getCurrentPhase().isSitting()) {
			this.setHealth(1.0F);
			this.phaseManager.setPhase(EnderDragonPhase.DYING);
		}

		if (this.phaseManager.getCurrentPhase().isSitting()) {
			this.sittingDamageReceived += (this.getHealth() - this.getHealth());
			if (this.sittingDamageReceived > 0.25F * this.getMaxHealth()) {
				this.sittingDamageReceived = 0.0F;
				this.phaseManager.setPhase(EnderDragonPhase.TAKEOFF);
			}
		}
		return true;
	}

	@Override
	protected void registerGoals() {
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, 10, false, false, (entity) -> !(entity instanceof EnderDragon)));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, IronGolem.class, 10, true, false, (entity) -> !(entity instanceof EnderDragon)));
	}

	@Inject(method = "aiStep", at = @At("TAIL"))
	private void onAiStep(CallbackInfo ci) {
		if (this.isEffectiveAi()) {
			this.targetSelector.tick();
		}
	}

	@Override
	public boolean causeFallDamage(float fallDistance, float multiplier, DamageSource source) {
		return false;
	}

	@Inject(method = "knockBack",at = @At("HEAD"), cancellable = true)
	public void knockback(List<Entity> pEntities, CallbackInfo ci) {
		ci.cancel();
	}

	@Inject(method = "checkWalls",at = @At("HEAD"), cancellable = true)
	private void checkWalls(AABB pArea, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}

	@Override
	public void setFlyingPhase() {
		this.groundPhase = false;
		this.horizontalCollision = false;
		this.verticalCollision = false;
		this.updateArmorModifier();
		this.updateFollowRangeModifier();
	}

	@Override
	public void setGroundPhase() {
		this.groundPhase = true;
		this.updateArmorModifier();
		this.updateFollowRangeModifier();
	}

	@Unique
	private void updateArmorModifier() {
		if (!this.level.isClientSide) {
			AttributeInstance armorAttribute = this.getAttribute(Attributes.ARMOR);
			if (armorAttribute != null) {
				armorAttribute.removeModifier(LANDED_ARMOR_MODIFIER);
				if (this.groundPhase) {
					armorAttribute.addPermanentModifier(LANDED_ARMOR_MODIFIER);
				}
			}
		}
	}

	@Unique
	private void updateFollowRangeModifier() {
		if (!this.level.isClientSide) {
			AttributeInstance followRangeAttr = this.getAttribute(Attributes.FOLLOW_RANGE);
			if (followRangeAttr != null){
				followRangeAttr.removeModifier(FLYING_FOLLOW_RANGE_MODIFIER);
				followRangeAttr.removeModifier(CRYSTAL_LINK_FOLLOW_RANGE_MODIFIER);
				EnderDragonPhase<?> currentPhase = this.phaseManager.getCurrentPhase().getPhase();
				if (currentPhase == PatchedPhases.FLYING || currentPhase == PatchedPhases.AIRSTRIKE || currentPhase == PatchedPhases.CHARGE) {
					followRangeAttr.addTransientModifier(FLYING_FOLLOW_RANGE_MODIFIER);
				} else if (currentPhase == PatchedPhases.CRYSTAL_LINK) {
					followRangeAttr.addTransientModifier(CRYSTAL_LINK_FOLLOW_RANGE_MODIFIER);
				}
			}
		}
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossEvent.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossEvent.removePlayer(player);
	}

	@Override
	public void setCustomName(@Nullable Component name) {
		super.setCustomName(name);
		this.bossEvent.setName(this.getDisplayName());
	}

	@Override
	public boolean isGroundPhase() {
		EnderDragonPhase<?> phase = this.phaseManager.getCurrentPhase().getPhase();
		return phase == PatchedPhases.GROUND_BATTLE
			|| phase == PatchedPhases.GROUND_IDLE
			|| phase == PatchedPhases.CRYSTAL_LINK
			|| phase == EnderDragonPhase.SITTING_ATTACKING
			|| phase == EnderDragonPhase.SITTING_FLAMING
			|| phase == EnderDragonPhase.SITTING_SCANNING;
	}

	@Override
	@NotNull
	public EnderDragon getOriginal() {
		return this.getSelf();
	}

	@Unique
	private EnderDragon getSelf() {
		return (EnderDragon)(Object)this;
	}
}