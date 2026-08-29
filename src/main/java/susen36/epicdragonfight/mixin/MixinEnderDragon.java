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
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import susen36.epicdragonfight.client.anim.Animations;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.ai.DragonHurtByTargetGoal;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedDragonPhase;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedPhases;
import susen36.epicdragonfight.entitypatch.enderdragon.PhaseManagerPatch;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Mixin(EnderDragon.class)
public abstract class MixinEnderDragon extends Mob implements IDragonPatch {
	@Shadow public EnderDragonPhaseManager phaseManager;
	@Mutable
	@Shadow @Final public EnderDragonPart head;
	@Mutable
	@Shadow @Final private EnderDragonPart neck;

	@Shadow protected abstract boolean reallyHurt(DamageSource pDamageSource, float pAmount);

	@Shadow private float sittingDamageReceived;
	@Mutable
	@Shadow @Final private EnderDragonPart[] subEntities;

	@Shadow @Final private EnderDragonPart body;
	@Shadow @Final private EnderDragonPart tail1;
	@Shadow @Final private EnderDragonPart tail2;
	@Shadow @Final private EnderDragonPart tail3;
	@Shadow @Final private EnderDragonPart wing1;
	@Shadow @Final private EnderDragonPart wing2;

	boolean groundPhase;
	int shieldEndEffectAge = 10;
	int actionTimer = 0;
	int pendingServerEvent = 0;
	int pendingServerEventTicks = 0;
	int phaseSwitchDelay = 0;
	int pendingPhaseSwitch = 0;
	boolean deathAnimationPlayed = false;

	AnimationState idleAnimationState = new AnimationState();
	AnimationState walkAnimationState = new AnimationState();
	AnimationState flyAnimationState = new AnimationState();
	AnimationState airstrikeAnimationState = new AnimationState();
	AnimationState attack1AnimationState = new AnimationState();
	AnimationState attack2AnimationState = new AnimationState();
	AnimationState leftTailSweepAnimationState = new AnimationState();
	AnimationState rightTailSweepAnimationState = new AnimationState();
	AnimationState fireballAnimationState = new AnimationState();
	AnimationState groundToFlyAnimationState = new AnimationState();
	AnimationState flyToGroundAnimationState = new AnimationState();
	AnimationState crystalLinkAnimationState = new AnimationState();
	AnimationState deathAnimationState = new AnimationState();

	private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.PINK, BossEvent.BossBarOverlay.PROGRESS)).setPlayBossMusic(false).setCreateWorldFog(false);

	private static final AttributeModifier LANDED_ARMOR_MODIFIER = new AttributeModifier(UUID.fromString("A1B2C3D4-E5F6-7890-ABCD-EF1234567890"), "Landed armor bonus", 5.0, AttributeModifier.Operation.ADDITION);

	private static final AttributeModifier FLYING_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("C2D3E4F5-A6B7-8901-CDEF-234567890123"), "Flying follow range", 36.0, AttributeModifier.Operation.ADDITION);
	private static final AttributeModifier CRYSTAL_LINK_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("D3E4F5A6-B7C8-9012-DEFA-345678901234"), "Crystal link follow range", 86.0, AttributeModifier.Operation.ADDITION);

	protected MixinEnderDragon(EntityType<? extends Mob> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(method = "<init>", at = @At("RETURN"))
	private void onInit(CallbackInfo ci) {
		DragonPhaseInstance currentPhase = this.getSelf().phaseManager.getCurrentPhase();
		EnderDragonPhase<?> startPhase = (currentPhase == null || !(currentPhase instanceof PatchedDragonPhase)) ? PatchedPhases.FLYING : this.phaseManager.getCurrentPhase().getPhase();
		this.getSelf().phaseManager = new PhaseManagerPatch(this.getSelf());
		this.getSelf().phaseManager.setPhase(startPhase);
		this.maxUpStep = 1.0F;
	}

	@Override
	public void tick() {
		super.tick();
		this.updateFootLanding();

		if (this.level.isClientSide()) {
			if (this.shieldEndEffectAge < 10) {
				this.shieldEndEffectAge++;
			}

			EnderDragonPhase<?> currentPhase = this.phaseManager.getCurrentPhase().getPhase();
			boolean oneShotActive = this.attack1AnimationState.isStarted() || this.attack2AnimationState.isStarted()
				|| this.leftTailSweepAnimationState.isStarted() || this.rightTailSweepAnimationState.isStarted()
				|| this.fireballAnimationState.isStarted() || this.groundToFlyAnimationState.isStarted()
				|| this.flyToGroundAnimationState.isStarted() || this.crystalLinkAnimationState.isStarted()
				|| this.deathAnimationState.isStarted();

			this.stopAnimationAfterDuration(this.attack1AnimationState, Animations.ATTACK1_TICKS);
			this.stopAnimationAfterDuration(this.attack2AnimationState, Animations.ATTACK2_TICKS);
			this.stopAnimationAfterDuration(this.leftTailSweepAnimationState, Animations.LEFT_TAIL_SWEEP_TICKS);
			this.stopAnimationAfterDuration(this.rightTailSweepAnimationState, Animations.RIGHT_TAIL_SWEEP_TICKS);
			this.stopAnimationAfterDuration(this.fireballAnimationState, Animations.FIREBALL_TICKS);
			this.stopAnimationAfterDuration(this.groundToFlyAnimationState, Animations.GROUND_TO_FLY_TICKS);
			this.stopAnimationAfterDuration(this.flyToGroundAnimationState, Animations.FLY_TO_GROUND_TICKS);
			this.stopAnimationAfterDuration(this.crystalLinkAnimationState, Animations.CRYSTAL_LINK_TICKS);
			this.stopAnimationAfterDuration(this.deathAnimationState, Animations.DEATH_TICKS);

			if (!oneShotActive) {
				if (!this.groundPhase) {
					boolean isAirstrike = currentPhase == PatchedPhases.AIRSTRIKE || currentPhase == PatchedPhases.CHARGE;
					if (isAirstrike) {
						this.airstrikeAnimationState.startIfStopped(this.tickCount);
						this.flyAnimationState.stop();
					} else {
						this.flyAnimationState.startIfStopped(this.tickCount);
						this.airstrikeAnimationState.stop();
					}
					this.idleAnimationState.stop();
					this.walkAnimationState.stop();
				} else {
					boolean isWalking = currentPhase == PatchedPhases.GROUND_BATTLE;
					if (isWalking) {
						this.walkAnimationState.startIfStopped(this.tickCount);
						this.idleAnimationState.stop();
					} else {
						this.idleAnimationState.startIfStopped(this.tickCount);
						this.walkAnimationState.stop();
					}
					this.flyAnimationState.stop();
					this.airstrikeAnimationState.stop();
				}
			} else {
				this.idleAnimationState.stop();
				this.walkAnimationState.stop();
				this.flyAnimationState.stop();
				this.airstrikeAnimationState.stop();
			}
		} else {
			EnderDragonPhase<?> currentPhase = this.phaseManager.getCurrentPhase().getPhase();
			boolean isFlying = currentPhase == PatchedPhases.FLYING || currentPhase == PatchedPhases.AIRSTRIKE || currentPhase == PatchedPhases.CHARGE;

			this.hurtTime = isFlying ? hurtTime : 2;
			this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
			if (this.level instanceof ServerLevel serverLevel) {
				EndDragonFight dragonFight = serverLevel.dragonFight();
				if (dragonFight != null && this.getUUID().equals(dragonFight.dragonUUID)) {
					this.bossEvent.setColor(BossEvent.BossBarColor.PURPLE);
				} else {
					this.bossEvent.setColor(BossEvent.BossBarColor.PINK);
				}
			}

			this.getSensing().tick();

			if (this.actionTimer > 0) {
				this.actionTimer--;
			}

			if (this.pendingServerEventTicks > 0) {
				this.pendingServerEventTicks--;
				if (this.pendingServerEventTicks == 0) {
					this.executePendingServerEvent();
				}
			}

			if (this.phaseSwitchDelay > 0) {
				this.phaseSwitchDelay--;
				if (this.phaseSwitchDelay == 0) {
					this.executePendingPhaseSwitch();
				}
			}

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

		if (this.getSelf().getPhaseManager().getCurrentPhase().isSitting() && this.getSelf().getPhaseManager().getCurrentPhase().getPhase() != PatchedPhases.CRYSTAL_LINK) {
			this.getSelf().nearestCrystal = null;
		}
	}

	@Override
	public void handleEntityEvent(byte event) {
		if (this.level.isClientSide()) {
			switch (event) {
				case 100 -> this.groundToFlyAnimationState.start(this.tickCount);
				case 101 -> this.flyToGroundAnimationState.start(this.tickCount);
				case 102 -> this.attack1AnimationState.start(this.tickCount);
				case 103 -> this.attack2AnimationState.start(this.tickCount);
				case 104 -> this.leftTailSweepAnimationState.start(this.tickCount);
				case 105 -> this.rightTailSweepAnimationState.start(this.tickCount);
				case 106 -> this.fireballAnimationState.start(this.tickCount);
				case 107 -> this.crystalLinkAnimationState.start(this.tickCount);
				case 108 -> this.deathAnimationState.start(this.tickCount);
			}
		}
	}

	@Unique
	private void stopAnimationAfterDuration(AnimationState state, int durationTicks) {
		if (state.isStarted()) {
			long accumulatedMs = state.getAccumulatedTime();
			long durationMs = durationTicks * 50L;
			if (accumulatedMs >= durationMs) {
				state.stop();
			}
		}
	}

	@Unique
	private void executePendingServerEvent() {
		switch (this.pendingServerEvent) {
			case Animations.SERVER_ATTACK_HIT -> {
				LivingEntity target = this.getTarget();
				if (target != null && this.distanceToSqr(target) < 64.0D) {
					this.doHurtTarget(target);
				}
			}
			case Animations.SERVER_FIREBALL -> {
				LivingEntity target = this.getTarget();
				if (target != null) {
					Vec3 headPos = this.head.position();
					Vec3 targetPos = target.getEyePosition();
					Vec3 dir = targetPos.subtract(headPos).normalize();
					DragonFireball fireball = new DragonFireball(this.level, this, dir.x, dir.y, dir.z);
					fireball.setPos(headPos);
					this.level.addFreshEntity(fireball);
				}
			}
			case Animations.SERVER_CRYSTAL_COMPLETE -> {
				this.heal(100.0F);
				this.phaseManager.setPhase(PatchedPhases.GROUND_BATTLE);
			}
		}
		this.pendingServerEvent = 0;
	}

	@Unique
	private void executePendingPhaseSwitch() {
		if (this.pendingPhaseSwitch == 1) {
			this.setFlyingPhase();
		} else if (this.pendingPhaseSwitch == 2) {
			this.setGroundPhase();
			AABB aabb = this.getBoundingBox().inflate(4.0D);
			List<Entity> list = this.level.getEntities(this, aabb);
			for (Entity entity : list) {
				if (entity instanceof LivingEntity living && !entity.is(this)) {
					entity.hurt(DamageSource.mobAttack(this), 6.0F);
				}
			}
		}
		this.pendingPhaseSwitch = 0;
	}

	@Override
	public EntityDimensions getDimensions(Pose pose) {
		return EntityDimensions.scalable(3.75F, 4.25F);
	}

	@Inject(method = "tickDeath", at = @At("HEAD"))
	private void onTickDeath(CallbackInfo ci) {
		if (!this.level.isClientSide() && !this.deathAnimationPlayed) {
			this.deathAnimationPlayed = true;
			this.playAnimation(Animations.DEATH_EVENT, Animations.DEATH_TICKS);
		}
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
		builder.add(Attributes.MAX_HEALTH, 300.0D);
		builder.add(Attributes.ARMOR, 1.5D);
		builder.add(Attributes.ARMOR_TOUGHNESS, 2.0D);
		builder.add(Attributes.ATTACK_DAMAGE, 10.0D);
		builder.add(Attributes.ATTACK_KNOCKBACK, 0.35D);
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

		if (pPart != this.head) {
			pDamage = pDamage / 2.0F + Math.min(pDamage, 1.0F);
		}

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
		this.targetSelector.addGoal(1, new DragonHurtByTargetGoal(this, EnderDragon.class));
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

	@Unique
	private void updateFootLanding() {
		if (!this.level.isClientSide() && this.groundPhase) {
			float entityPosY = (float)this.position().y;
			float yFrontL = this.getFootGroundY(5.0F, -6.0F, entityPosY);
			float yFrontR = this.getFootGroundY(-5.0F, -6.0F, entityPosY);
			float yBackL = this.getFootGroundY(9.0F, 34.0F, entityPosY);
			float yBackR = this.getFootGroundY(-9.0F, 34.0F, entityPosY);
			float averageY = (yFrontL + yFrontR + yBackL + yBackR) * 0.25F;
			float dy = averageY - entityPosY;
			this.move(MoverType.SELF, new Vec3(0.0F, dy, 0.0F));
		}
	}

	@Unique
	private float getFootGroundY(float dx, float dz, float entityPosY) {
		BlockHitResult clipResult = this.level.clip(new ClipContext(new Vec3(this.getX() + dx, entityPosY + 4.0F, this.getZ() + dz), new Vec3(this.getX() + dx, entityPosY - 8.0F, this.getZ() + dz), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, this));
		if (clipResult.getType() != HitResult.Type.MISS) {
			return (float)clipResult.getBlockPos().getY() + 1.0F + 0.12F;
		}
		return entityPosY;
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
        if (!this.getOriginal().level.isClientSide()) {
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
        if (!this.getOriginal().level.isClientSide()) {
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
		return this.groundPhase;
	}

	@Override
	public void playAnimation(byte event, int actionTicks) {
		if (!this.level.isClientSide()) {
			this.actionTimer = actionTicks;
			this.level.broadcastEntityEvent(this, event);
		}
	}

	@Override
	public void scheduleSetFlyingPhase(int ticks) {
		this.pendingPhaseSwitch = 1;
		this.phaseSwitchDelay = ticks;
	}

	@Override
	public void scheduleLanding(int ticks) {
		this.pendingPhaseSwitch = 2;
		this.phaseSwitchDelay = ticks;
	}

	@Override
	public void scheduleServerEvent(int event, int ticks) {
		this.pendingServerEvent = event;
		this.pendingServerEventTicks = ticks;
	}

	@Override
	public boolean isInAction() {
		return this.actionTimer > 0;
	}

	@Override
	public int getShieldEndEffectAge() {
		return this.shieldEndEffectAge;
	}

	@Override
	public void setShieldEndEffectAge(int age) {
		this.shieldEndEffectAge = age;
	}

	@Override
	public AnimationState getIdleAnimationState() {
		return this.idleAnimationState;
	}

	@Override
	public AnimationState getWalkAnimationState() {
		return this.walkAnimationState;
	}

	@Override
	public AnimationState getFlyAnimationState() {
		return this.flyAnimationState;
	}

	@Override
	public AnimationState getAirstrikeAnimationState() {
		return this.airstrikeAnimationState;
	}

	@Override
	public AnimationState getAttack1AnimationState() {
		return this.attack1AnimationState;
	}

	@Override
	public AnimationState getAttack2AnimationState() {
		return this.attack2AnimationState;
	}

	@Override
	public AnimationState getLeftTailSweepAnimationState() {
		return this.leftTailSweepAnimationState;
	}

	@Override
	public AnimationState getRightTailSweepAnimationState() {
		return this.rightTailSweepAnimationState;
	}

	@Override
	public AnimationState getFireballAnimationState() {
		return this.fireballAnimationState;
	}

	@Override
	public AnimationState getGroundToFlyAnimationState() {
		return this.groundToFlyAnimationState;
	}

	@Override
	public AnimationState getFlyToGroundAnimationState() {
		return this.flyToGroundAnimationState;
	}

	@Override
	public AnimationState getCrystalLinkAnimationState() {
		return this.crystalLinkAnimationState;
	}

	@Override
	public AnimationState getDeathAnimationState() {
		return this.deathAnimationState;
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