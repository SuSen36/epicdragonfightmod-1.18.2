package susen36.epicdragonfight.mixin;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import net.minecraft.world.phys.AABB;
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

	@Shadow
	protected abstract void tickPart(EnderDragonPart p_31116_, double p_31117_, double p_31118_, double p_31119_);

	@Shadow
	protected abstract float getHeadYOffset();

	@Shadow
	public abstract double[] getLatencyPos(int p_31102_, float p_31103_);

	@Shadow
	@Nullable
	public abstract EndDragonFight getDragonFight();

	@Shadow
	public abstract void knockBack(List<Entity> p_31132_);

	@Shadow
	private @org.jetbrains.annotations.Nullable Player unlimitedLastHurtByPlayer;

	@Shadow
	protected abstract void checkCrystals();

	@Shadow
	public float flapTime;
	@Shadow
	public int posPointer;
	boolean groundPhase;
	int shieldEndEffectAge = 10;
	int actionTimer = 0;
	int pendingServerEvent = 0;
	int pendingServerEventTicks = 0;
	int phaseSwitchDelay = 0;
	int pendingPhaseSwitch = 0;

	AnimationState idleAnimationState = new AnimationState();
	AnimationState walkAnimationState = new AnimationState();
	AnimationState flyAnimationState = new AnimationState();
	AnimationState attack1AnimationState = new AnimationState();
	AnimationState attack2AnimationState = new AnimationState();
	AnimationState leftTailSweepAnimationState = new AnimationState();
	AnimationState rightTailSweepAnimationState = new AnimationState();
	AnimationState fireballAnimationState = new AnimationState();
	AnimationState flyToGroundAnimationState = new AnimationState();
	AnimationState crystalLinkAnimationState = new AnimationState();

	private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.PINK, BossEvent.BossBarOverlay.PROGRESS)).setPlayBossMusic(false).setCreateWorldFog(false);

	private static final AttributeModifier LANDED_ARMOR_MODIFIER = new AttributeModifier(UUID.fromString("A1B2C3D4-E5F6-7890-ABCD-EF1234567890"), "Landed armor bonus", 5.0, AttributeModifier.Operation.ADDITION);

	private static final AttributeModifier FLYING_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("C2D3E4F5-A6B7-8901-CDEF-234567890123"), "Flying follow range", 36.0, AttributeModifier.Operation.ADDITION);
	private static final AttributeModifier CRYSTAL_LINK_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("D3E4F5A6-B7C8-9012-DEFA-345678901234"), "Crystal link follow range", 86.0, AttributeModifier.Operation.ADDITION);

	protected MixinEnderDragon(EntityType<? extends Mob> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(method = "<init>", at = @At("TAIL"))
	private void onInit(CallbackInfo ci) {
		DragonPhaseInstance currentPhase = this.getSelf().phaseManager.getCurrentPhase();
		EnderDragonPhase<?> startPhase = (currentPhase == null || !(currentPhase instanceof PatchedDragonPhase)) ? PatchedPhases.FLYING : this.phaseManager.getCurrentPhase().getPhase();
		this.getSelf().phaseManager = new PhaseManagerPatch(this.getSelf());
		this.getSelf().phaseManager.setPhase(startPhase);
		this.maxUpStep = 1.25F;
	}

	@Override
	public void tick() {
		super.tick();

		if (this.level.isClientSide()) {
			if (this.shieldEndEffectAge < 10) {
				this.shieldEndEffectAge++;
			}

			EnderDragonPhase<?> currentPhase = this.phaseManager.getCurrentPhase().getPhase();
			boolean oneShotActive = this.attack1AnimationState.isStarted() || this.attack2AnimationState.isStarted()
				|| this.leftTailSweepAnimationState.isStarted() || this.rightTailSweepAnimationState.isStarted()
				|| this.fireballAnimationState.isStarted() || this.flyToGroundAnimationState.isStarted()
				|| this.crystalLinkAnimationState.isStarted();

			this.stopAnimationAfterDuration(this.attack1AnimationState, Animations.ATTACK1_TICKS);
			this.stopAnimationAfterDuration(this.attack2AnimationState, Animations.ATTACK2_TICKS);
			this.stopAnimationAfterDuration(this.leftTailSweepAnimationState, Animations.LEFT_TAIL_SWEEP_TICKS);
			this.stopAnimationAfterDuration(this.rightTailSweepAnimationState, Animations.RIGHT_TAIL_SWEEP_TICKS);
			this.stopAnimationAfterDuration(this.fireballAnimationState, Animations.FIREBALL_TICKS);
			this.stopAnimationAfterDuration(this.flyToGroundAnimationState, Animations.FLY_TO_GROUND_TICKS);
			this.stopAnimationAfterDuration(this.crystalLinkAnimationState, Animations.CRYSTAL_LINK_TICKS);

			if (!oneShotActive) {
				if (this.isFlyingPhase()) {
					this.flyAnimationState.startIfStopped(this.tickCount);
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
				}
			} else {
				this.idleAnimationState.stop();
				this.walkAnimationState.stop();
				this.flyAnimationState.stop();
			}
		} else {
			EnderDragonPhase<?> currentPhase = this.phaseManager.getCurrentPhase().getPhase();
			this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
			if (this.level instanceof ServerLevel serverLevel) {
				EndDragonFight dragonFight = serverLevel.dragonFight();
				if (dragonFight != null && this.getUUID().equals(dragonFight.dragonUUID)) {
					this.bossEvent.setColor(BossEvent.BossBarColor.PURPLE);
				} else {
					this.bossEvent.setColor(BossEvent.BossBarColor.PINK);
				}
			}

			//TODO 可能重复了
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
		}

		if (this.getSelf().getPhaseManager().getCurrentPhase().isSitting() && this.getSelf().getPhaseManager().getCurrentPhase().getPhase() != PatchedPhases.CRYSTAL_LINK) {
			this.getSelf().nearestCrystal = null;
		}
	}


	@Override
	public void handleEntityEvent(byte event) {
		if (this.level.isClientSide()) {
			switch (event) {
				case 101 -> this.flyToGroundAnimationState.start(this.tickCount);
				case 102 -> this.attack1AnimationState.start(this.tickCount);
				case 103 -> this.attack2AnimationState.start(this.tickCount);
				case 104 -> this.leftTailSweepAnimationState.start(this.tickCount);
				case 105 -> this.rightTailSweepAnimationState.start(this.tickCount);
				case 106 -> this.fireballAnimationState.start(this.tickCount);
				case 107 -> this.crystalLinkAnimationState.start(this.tickCount);
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
			this.setFlyingPhase(true);
		} else if (this.pendingPhaseSwitch == 2) {
			this.setFlyingPhase(false);
			//AABB aabb = this.getBoundingBox().inflate(4.0D);
			//List<Entity> list = this.level.getEntities(this, aabb);
			//for (Entity entity : list) {
			//	if (entity instanceof LivingEntity && !entity.is(this)) {
			//		entity.hurt(DamageSource.mobAttack(this), 6.0F);
			//	}
			//}
		}
		this.pendingPhaseSwitch = 0;
	}

	@Override
	public EntityDimensions getDimensions(Pose pose) {
		return EntityDimensions.scalable(3.0F, 2.75F);
	}

	@ModifyVariable(method = "tickDeath", name = "i", at = @At(value = "STORE", ordinal = 0))
	private int modifyExperienceAmount(int original) {
		return 12000;
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
				this.takeOff();
			}
		}

		return true;
	}

	@Override
	protected void registerGoals() {
		this.targetSelector.addGoal(1, new DragonHurtByTargetGoal(this, EnderDragon.class));
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
	}

	@Inject(method = "aiStep", at = @At("HEAD"))
	private void onAiStep(CallbackInfo ci) {
		if (this.isEffectiveAi()) {
			this.targetSelector.tick();
		}
		this.noPhysics = this.isFlyingPhase();
		this.setNoGravity(this.isFlyingPhase());
		this.aiTick();
		if (!this.isFlyingPhase() && !this.isNoGravity()) {
			double gravitySpeed = 0.08D;
			AttributeInstance gravity = this.getAttribute(net.minecraftforge.common.ForgeMod.ENTITY_GRAVITY.get());
            if (gravity != null) {
				gravitySpeed = gravity.getValue();
            }
            this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -gravitySpeed / 4.0D, 0.0D));
            this.move(MoverType.SELF, this.getDeltaMovement());
		}
		ci.cancel();
	}

	public void aiTick() {
		// lastHurtByPlayer is cleared after 100 ticks, capture it indefinitely in unlimitedLastHurtByPlayer for LivingExperienceDropEvent
		if (this.lastHurtByPlayer != null) this.unlimitedLastHurtByPlayer = lastHurtByPlayer;
		if (this.unlimitedLastHurtByPlayer != null && this.unlimitedLastHurtByPlayer.isRemoved()) this.unlimitedLastHurtByPlayer = null;
		this.processFlappingMovement();
		if (this.level.isClientSide) {
			if (!this.phaseManager.getCurrentPhase().isSitting() && --this.getSelf().growlTime < 0) {
				this.level.playLocalSound(this.getX(), this.getY(), this.getZ(), SoundEvents.ENDER_DRAGON_GROWL, this.getSoundSource(), 2.5F, 0.8F + this.random.nextFloat() * 0.3F, false);
				this.getSelf().growlTime = 200 + this.random.nextInt(200);
			}
		}

		this.getSelf().oFlapTime = this.getSelf().flapTime;
		if (this.isDeadOrDying()) {
			float f9 = (this.random.nextFloat() - 0.5F) * 8.0F;
			float f10 = (this.random.nextFloat() - 0.5F) * 4.0F;
			float f11 = (this.random.nextFloat() - 0.5F) * 8.0F;
			this.level.addParticle(ParticleTypes.EXPLOSION, this.getX() + (double)f9, this.getY() + 2.0D + (double)f10, this.getZ() + (double)f11, 0.0D, 0.0D, 0.0D);
		} else {
			this.checkCrystals();
			Vec3 vec3 = this.getDeltaMovement();
			float f = 0.2F / ((float)vec3.horizontalDistance() * 10.0F + 1.0F);
			f *= (float)Math.pow(2.0D, vec3.y);
			if (this.phaseManager.getCurrentPhase().isSitting()) {
				this.flapTime += 0.1F;
			}else {
				this.flapTime += f;
			}

			this.setYRot(Mth.wrapDegrees(this.getYRot()));
			if (this.isNoAi()) {
				this.flapTime = 0.5F;
			} else {
				if (this.posPointer < 0) {
					for(int i = 0; i < this.getSelf().positions.length; ++i) {
						this.getSelf().positions[i][0] = (double)this.getYRot();
						this.getSelf().positions[i][1] = this.getY();
					}
				}

				if (++this.posPointer == this.getSelf().positions.length) {
					this.posPointer = 0;
				}

				this.getSelf().positions[this.posPointer][0] = this.getYRot();
				this.getSelf().positions[this.posPointer][1] = this.getY();
				if (this.level.isClientSide) {
					if (this.lerpSteps > 0) {
						double d6 = this.getX() + (this.lerpX - this.getX()) / (double)this.lerpSteps;
						double d0 = this.getY() + (this.lerpY - this.getY()) / (double)this.lerpSteps;
						double d1 = this.getZ() + (this.lerpZ - this.getZ()) / (double)this.lerpSteps;
						double d2 = Mth.wrapDegrees(this.lerpYRot - (double)this.getYRot());
						this.setYRot(this.getYRot() + (float)d2 / (float)this.lerpSteps);
						this.setXRot(this.getXRot() + (float)(this.lerpXRot - (double)this.getXRot()) / (float)this.lerpSteps);
						--this.lerpSteps;
						this.setPos(d6, d0, d1);
						this.setRot(this.getYRot(), this.getXRot());
					}

					this.phaseManager.getCurrentPhase().doClientTick();
				} else {
					DragonPhaseInstance dragonphaseinstance = this.phaseManager.getCurrentPhase();
					dragonphaseinstance.doServerTick();
					if (this.phaseManager.getCurrentPhase() != dragonphaseinstance) {
						dragonphaseinstance = this.phaseManager.getCurrentPhase();
						dragonphaseinstance.doServerTick();
					}

					Vec3 vec31 = dragonphaseinstance.getFlyTargetLocation();
					if (vec31 != null) {
						double d7 = vec31.x - this.getX();
						double d8 = vec31.y - this.getY();
						double d9 = vec31.z - this.getZ();
						double d3 = d7 * d7 + d8 * d8 + d9 * d9;
						float f5 = dragonphaseinstance.getFlySpeed();
						double d4 = Math.sqrt(d7 * d7 + d9 * d9);
						if (d4 > 0.0D) {
							d8 = Mth.clamp(d8 / d4, (double)(-f5), (double)f5);
						}

						this.setDeltaMovement(this.getDeltaMovement().add(0.0D, d8 * 0.01D, 0.0D));
						this.setYRot(Mth.wrapDegrees(this.getYRot()));
						Vec3 vec32 = vec31.subtract(this.getX(), this.getY(), this.getZ()).normalize();
						Vec3 vec33 = (new Vec3(Mth.sin(this.getYRot() * ((float)Math.PI / 180F)), this.getDeltaMovement().y, (double)(-Mth.cos(this.getYRot() * ((float)Math.PI / 180F))))).normalize();
						float f6 = Math.max(((float)vec33.dot(vec32) + 0.5F) / 1.5F, 0.0F);
						if (Math.abs(d7) > (double)1.0E-5F || Math.abs(d9) > (double)1.0E-5F) {
							float f7 = Mth.clamp(Mth.wrapDegrees(180.0F - (float)Mth.atan2(d7, d9) * (180F / (float)Math.PI) - this.getYRot()), -50.0F, 50.0F);
							this.getSelf().yRotA *= 0.8F;
							this.getSelf().yRotA += f7 * dragonphaseinstance.getTurnSpeed();
							this.setYRot(this.getYRot() + this.getSelf().yRotA * 0.1F);
						}

						float f19 = (float)(2.0D / (d3 + 1.0D));
						this.moveRelative(0.06F * (f6 * f19 + (1.0F - f19)), new Vec3(0.0D, 0.0D, -1.0D));

						Vec3 vec34 = this.getDeltaMovement().normalize();
						double d5 = 0.8D + 0.15D * (vec34.dot(vec33) + 1.0D) / 2.0D;
						this.setDeltaMovement(this.getDeltaMovement().multiply(d5, (double)0.91F, d5));
					}
				}

				this.yBodyRot = this.getYRot();
				Vec3[] avec3 = new Vec3[this.subEntities.length];

				for(int j = 0; j < this.subEntities.length; ++j) {
					avec3[j] = new Vec3(this.subEntities[j].getX(), this.subEntities[j].getY(), this.subEntities[j].getZ());
				}

				float f12 = (float)(this.getSelf().getLatencyPos(5, 1.0F)[1] - this.getSelf().getLatencyPos(10, 1.0F)[1]) * 10.0F * ((float)Math.PI / 180F);
				float f13 = Mth.cos(f12);
				float f1 = Mth.sin(f12);
				float f14 = this.getYRot() * ((float)Math.PI / 180F);
				float f2 = Mth.sin(f14);
				float f15 = Mth.cos(f14);
				this.tickPart(this.body, (double)(f2 * 0.5F), 0.0D, (double)(-f15 * 0.5F));
				this.tickPart(this.wing1, (double)(f15 * 4.5F), 2.0D, (double)(f2 * 4.5F));
				this.tickPart(this.wing2, (double)(f15 * -4.5F), 2.0D, (double)(f2 * -4.5F));
				if (!this.level.isClientSide && this.isFlyingPhase() && this.hurtTime == 0) {
					this.knockBack(this.level.getEntities(this, this.wing1.getBoundingBox().inflate(4.0D, 2.0D, 4.0D).move(0.0D, -2.0D, 0.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
					this.knockBack(this.level.getEntities(this, this.wing2.getBoundingBox().inflate(4.0D, 2.0D, 4.0D).move(0.0D, -2.0D, 0.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
					this.getSelf().hurt(this.level.getEntities(this, this.head.getBoundingBox().inflate(1.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
					this.getSelf().hurt(this.level.getEntities(this, this.neck.getBoundingBox().inflate(1.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
				}

				float f3 = Mth.sin(this.getYRot() * ((float)Math.PI / 180F) - this.getSelf().yRotA * 0.01F);
				float f16 = Mth.cos(this.getYRot() * ((float)Math.PI / 180F) - this.getSelf().yRotA * 0.01F);
				float f4 = this.getHeadYOffset();
				this.tickPart(this.head, (double)(f3 * 6.5F * f13), (double)(f4 + f1 * 6.5F), (double)(-f16 * 6.5F * f13));
				this.tickPart(this.neck, (double)(f3 * 5.5F * f13), (double)(f4 + f1 * 5.5F), (double)(-f16 * 5.5F * f13));
				double[] adouble = this.getLatencyPos(5, 1.0F);

				for(int k = 0; k < 3; ++k) {
					EnderDragonPart enderdragonpart = null;
					if (k == 0) {
						enderdragonpart = this.tail1;
					}

					if (k == 1) {
						enderdragonpart = this.tail2;
					}

					if (k == 2) {
						enderdragonpart = this.tail3;
					}

					double[] adouble1 = this.getLatencyPos(12 + k * 2, 1.0F);
					float f17 = this.getYRot() * ((float)Math.PI / 180F) + Mth.rotWrap(adouble1[0] - adouble[0]) * ((float)Math.PI / 180F);
					float f18 = Mth.sin(f17);
					float f20 = Mth.cos(f17);
					float f21 = 1.5F;
					float f22 = (float)(k + 1) * 2.0F;
					this.tickPart(enderdragonpart, (double)(-(f2 * 1.5F + f18 * f22) * f13), adouble1[1] - adouble[1] - (double)((f22 + 1.5F) * f1) + 1.5D, (double)((f15 * 1.5F + f20 * f22) * f13));
				}

				if (!this.level.isClientSide) {
					if (this.getDragonFight() != null) {
						this.getDragonFight().updateDragon(this.getSelf());
					}
				}

				for(int l = 0; l < this.subEntities.length; ++l) {
					this.subEntities[l].xo = avec3[l].x;
					this.subEntities[l].yo = avec3[l].y;
					this.subEntities[l].zo = avec3[l].z;
					this.subEntities[l].xOld = avec3[l].x;
					this.subEntities[l].yOld = avec3[l].y;
					this.subEntities[l].zOld = avec3[l].z;
				}

			}
		}
	}

	@Override
	public boolean causeFallDamage(float fallDistance, float multiplier, DamageSource source) {
		return false;
	}

	@Override
	public void push(Entity pEntity) {
	}

	@Inject(method = "checkWalls",at = @At("HEAD"), cancellable = true)
	private void checkWalls(AABB pArea, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}

	@Override
	public void setFlyingPhase(boolean isFlying) {
		this.groundPhase = !isFlying;
		this.horizontalCollision = this.verticalCollision = !isFlying;
		this.updateGroundPhaseAttributes();
	}

	@Unique
	private void updateGroundPhaseAttributes() {
		if (!this.getOriginal().level.isClientSide()) {
			AttributeInstance armorAttribute = this.getAttribute(Attributes.ARMOR);
			if (armorAttribute != null) {
				armorAttribute.removeModifier(LANDED_ARMOR_MODIFIER);

				if (this.groundPhase) {
					armorAttribute.addPermanentModifier(LANDED_ARMOR_MODIFIER);
				}
			}

			AttributeInstance followRangeAttr = this.getAttribute(Attributes.FOLLOW_RANGE);
			if (followRangeAttr != null) {
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
	public boolean shouldShowName() {
		return false;
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
	public boolean isFlyingPhase() {
		if (this.level.isClientSide()) {
			EnderDragonPhase<?> currentPhase = this.phaseManager.getCurrentPhase().getPhase();
			return currentPhase == PatchedPhases.FLYING || currentPhase == PatchedPhases.CHARGE
				|| currentPhase == PatchedPhases.AIRSTRIKE || currentPhase == PatchedPhases.LANDING;
		}
		return !this.groundPhase;
	}

	@Override
	public void playAnimation(byte event, int actionTicks) {
		if (!this.level.isClientSide()) {
			this.actionTimer = actionTicks;
			this.level.broadcastEntityEvent(this, event);
		}
	}

	@Inject(
			method = "createAttributes",
			at = @At("RETURN"),
			cancellable = true
	)
	private static void onCreateAttributes(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
		AttributeSupplier.Builder builder = cir.getReturnValue();
		builder.add(Attributes.MAX_HEALTH, 400.0D);
		builder.add(Attributes.ARMOR, 2D);
		builder.add(Attributes.ARMOR_TOUGHNESS, 2.0D);
		builder.add(Attributes.ATTACK_DAMAGE, 10.0D);
		builder.add(Attributes.ATTACK_KNOCKBACK, 0.35D);
		builder.add(Attributes.MOVEMENT_SPEED, 0.35D);
		builder.add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
		builder.add(Attributes.FOLLOW_RANGE, 64.0D);
		cir.setReturnValue(builder);
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
	public AnimationState getFlyToGroundAnimationState() {
		return this.flyToGroundAnimationState;
	}

	@Override
	public AnimationState getCrystalLinkAnimationState() {
		return this.crystalLinkAnimationState;
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