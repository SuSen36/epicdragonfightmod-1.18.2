package susen36.epicdragonfight.mixin;

import com.google.common.collect.Maps;
import com.mojang.math.Vector3f;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.*;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhaseManager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.entity.PartEntity;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.LivingMotions;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.animation.types.procedural.IKInfo;
import susen36.epicdragonfight.api.animation.types.procedural.TipPointAnimation;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.ai.DragonHurtByTargetGoal;
import susen36.epicdragonfight.entitypatch.enderdragon.*;
import susen36.epicdragonfight.gameasset.Animations;
import susen36.epicdragonfight.gameasset.Models;
import susen36.epicdragonfight.network.DragoFightNetworkManager;
import susen36.epicdragonfight.gameasset.JointBoundPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.BossEvent;

import javax.annotation.Nullable;

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
	EntityState state = EntityState.DEFAULT;
	public Animator animator;
	public LivingMotions currentLivingMotion = LivingMotions.IDLE;
	public LivingMotions currentCompositeMotion = LivingMotions.IDLE;
	public List<LivingEntity> currentlyAttackedEntity;

	private Map<String, TipPointAnimation> tipPointAnimations = Maps.newHashMap();
	Map<LivingMotions, StaticAnimation> livingMotions = Maps.newHashMap();
	private final List<JointBoundPart> jointBoundParts = new ArrayList<>();

	private EnderDragonPart neck2;
	private EnderDragonPart neck3;
	private EnderDragonPart neck4;
	private EnderDragonPart neck5;
	private EnderDragonPart tail4;
	private EnderDragonPart tail5;
	private EnderDragonPart tail6;
	private EnderDragonPart tail7;
	private EnderDragonPart tail8;
	private EnderDragonPart tail9;
	private EnderDragonPart tail10;
	private EnderDragonPart tail11;
	private EnderDragonPart tail12;

	private boolean groundPhase;
	public float xRoot;
	public float xRootO;
	public float zRoot;
	public float zRootO;
	public int shieldEndEffectAge = 10;
	public LivingMotions prevMotion = LivingMotions.FLY;

	private final ServerBossEvent bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.PINK, BossEvent.BossBarOverlay.PROGRESS)).setPlayBossMusic(false).setCreateWorldFog(false);

	private static final AttributeModifier LANDED_ARMOR_MODIFIER = new AttributeModifier(UUID.fromString("A1B2C3D4-E5F6-7890-ABCD-EF1234567890"), "Landed armor bonus", 5.0, AttributeModifier.Operation.ADDITION);
	
	private static final AttributeModifier FLYING_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("C2D3E4F5-A6B7-8901-CDEF-234567890123"), "Flying follow range", 36.0, AttributeModifier.Operation.ADDITION);
	private static final AttributeModifier CRYSTAL_LINK_FOLLOW_RANGE_MODIFIER = new AttributeModifier(UUID.fromString("D3E4F5A6-B7C8-9012-DEFA-345678901234"), "Crystal link follow range", 86.0, AttributeModifier.Operation.ADDITION);

	protected MixinEnderDragon(EntityType<? extends Mob> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(method = "<init>", at = @At("RETURN"))
	private void onInit(CallbackInfo ci) {
		this.livingMotions.put(LivingMotions.IDLE, Animations.DRAGON_IDLE);
		this.livingMotions.put(LivingMotions.WALK, Animations.DRAGON_WALK);
		this.livingMotions.put(LivingMotions.FLY, Animations.DRAGON_FLY);
		this.livingMotions.put(LivingMotions.CHASE, Animations.DRAGON_AIRSTRIKE);
		this.livingMotions.put(LivingMotions.DEATH, Animations.DRAGON_DEATH);

		this.animator = EpicDragonFight.getAnimator(this);
		this.animator.init();
		this.currentlyAttackedEntity = new ArrayList<>();

		if (this.currentLivingMotion != LivingMotions.FLY && this.currentLivingMotion != LivingMotions.IDLE) {
			this.currentLivingMotion = LivingMotions.WALK;
		}
		DragonPhaseInstance currentPhase = this.getSelf().phaseManager.getCurrentPhase();
		EnderDragonPhase<?> startPhase = (currentPhase == null || !(currentPhase instanceof PatchedDragonPhase)) ? PatchedPhases.FLYING : this.phaseManager.getCurrentPhase().getPhase();
		this.getSelf().phaseManager = new PhaseManagerPatch(this.getSelf());
		this.getSelf().phaseManager.setPhase(startPhase);
		this.maxUpStep = 1.0F;
		this.neck = new EnderDragonPart(this.getSelf(), "neck", 1.0F, 1.0F);
		this.neck2 = new EnderDragonPart(this.getSelf(), "neck", 1.0F, 1.0F);
		this.neck3 = new EnderDragonPart(this.getSelf(), "neck", 1.0F, 1.0F);
		this.neck4 = new EnderDragonPart(this.getSelf(), "neck", 1.0F, 1.0F);
		this.neck5 = new EnderDragonPart(this.getSelf(), "neck", 1.0F, 1.0F);
		this.tail4 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail5 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail6 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail7 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail8 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail9 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail10 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail11 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		this.tail12 = new EnderDragonPart(this.getSelf(), "tail", 1.0F, 1.0F);
		PartEntity<?>[] originalParts = this.subEntities;
		this.subEntities = new EnderDragonPart[originalParts.length + 13];
		System.arraycopy(originalParts, 0, this.subEntities, 0, originalParts.length);
		this.subEntities[1] = this.neck;
		this.subEntities[originalParts.length] = this.neck2;
		this.subEntities[originalParts.length + 1] = this.neck3;
		this.subEntities[originalParts.length + 2] = this.neck4;
		this.subEntities[originalParts.length + 3] = this.neck5;
		this.subEntities[originalParts.length + 4] = this.tail4;
		this.subEntities[originalParts.length + 5] = this.tail5;
		this.subEntities[originalParts.length + 6] = this.tail6;
		this.subEntities[originalParts.length + 7] = this.tail7;
		this.subEntities[originalParts.length + 8] = this.tail8;
		this.subEntities[originalParts.length + 9] = this.tail9;
		this.subEntities[originalParts.length + 10] = this.tail10;
		this.subEntities[originalParts.length + 11] = this.tail11;
		this.subEntities[originalParts.length + 12] = this.tail12;
		this.initJointBoundParts();
	}

	@Override
	public void tick() {
		super.tick();
		this.animator.tick();

		this.updateJointBoundParts();
		this.updateTipPoints();

		if (this.isLogicalClient()) {
			this.xRootO = this.xRoot;
			this.zRootO = this.zRoot;
			//super.clientTick();
			if (this.shieldEndEffectAge < 10) {
				this.shieldEndEffectAge++;
			}
		} else {
			this.hurtTime = 2;
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
			this.updateMotion(true);

			if (this.prevMotion != this.currentLivingMotion && !this.animator.getEntityState().inaction()) {
				if (this.livingMotions.containsKey(this.currentLivingMotion)) {
					StaticAnimation anim = this.livingMotions.get(this.currentLivingMotion);
					if (anim != null) {
						this.animator.playAnimation(anim, 0.0F);
					}
				}

				this.prevMotion = this.currentLivingMotion;
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
	public EntityDimensions getDimensions(Pose pose) {
		return EntityDimensions.scalable(3.75F, 4.25F);
	}

	@Inject(method = "tickDeath", at = @At("HEAD"))
	private void onTickDeath(CallbackInfo ci) {
		this.currentLivingMotion = LivingMotions.DEATH;
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
	 * @author SuSen
	 * @reason 允许非玩家实体伤害龙,但非特定来源伤害衰减为50%。
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
	public EnderDragonPart getHeadPart() {
		return this.head;
	}

	@Override
	public EnderDragonPart getBodyPart() {
		return this.body;
	}

	@Override
	public EnderDragonPart[] getTailParts() {
		return new EnderDragonPart[]{this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8, this.tail9, this.tail10, this.tail11, this.tail12};
	}

	@Override
	public EnderDragonPart[] getNeckParts() {
		return new EnderDragonPart[]{this.neck, this.neck2, this.neck3, this.neck4, this.neck5};
	}

	@Override
	public EnderDragonPart[] getWingParts() {
		return new EnderDragonPart[]{this.wing1, this.wing2};
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

	@Override
	public void updateMotion(boolean considerInaction) {
		if (this.getHealth() <= 0.0F) {
			currentLivingMotion = LivingMotions.DEATH;
		} else if (this.state.inaction() && considerInaction) {
			this.currentLivingMotion = LivingMotions.IDLE;
		} else {
			DragonPhaseInstance phase = this.getSelf().getPhaseManager().getCurrentPhase();

			if (!this.groundPhase) {
				if (phase.getPhase() == PatchedPhases.AIRSTRIKE && ((DragonAirstrikePhase)phase).isActuallyAttacking()) {
					this.currentLivingMotion = LivingMotions.CHASE;
				} else if (phase.getPhase() == PatchedPhases.CHARGE && ((DragonChargePhase)phase).isActuallyAttacking()) {
					this.currentLivingMotion = LivingMotions.CHASE;
				} else {
					this.currentLivingMotion = LivingMotions.FLY;
				}
			} else {
				if (phase.getPhase() == PatchedPhases.GROUND_BATTLE) {
					this.currentLivingMotion = LivingMotions.WALK;
				} else if (phase.getPhase() == PatchedPhases.GROUND_IDLE) {
					this.currentLivingMotion = LivingMotions.IDLE;
				}
			}
		}
	}

	@Override
	public void updateTipPoints() {
		for (Map.Entry<String, TipPointAnimation> entry : this.tipPointAnimations.entrySet()) {
			if (entry.getValue().isOnWorking()) {
				entry.getValue().tick();
			}
		}

		if (!this.tipPointAnimations.isEmpty()) {
			TipPointAnimation frontL = this.getTipPointAnimation("left_front_foot");
			TipPointAnimation frontR = this.getTipPointAnimation("right_front_foot");
			TipPointAnimation backL = this.getTipPointAnimation("left_hind_foot");
			TipPointAnimation backR = this.getTipPointAnimation("right_hind_foot");
			float entityPosY = (float)this.position().y;
			float yFrontL = (frontL != null && frontL.isTouchingGround()) ? frontL.getTargetPosition().y : entityPosY;
			float yFrontR = (frontR != null && frontR.isTouchingGround()) ? frontR.getTargetPosition().y : entityPosY;
			float yBackL = (backL != null && backL.isTouchingGround()) ? backL.getTargetPosition().y : entityPosY;
			float yBackR = (backR != null && backR.isTouchingGround()) ? backR.getTargetPosition().y : entityPosY;
			float xdiff = (yFrontL + yBackL) * 0.5F - (yFrontR + yBackR) * 0.5F;
			float zdiff = (yFrontL + yFrontR) * 0.5F - (yBackL + yBackR) * 0.5F;
			float xdistance = 4.0F;
			float zdistance = 5.7F;
			this.xRoot += Mth.clamp(((float)Math.toDegrees(Math.atan2(zdiff, zdistance)) - this.xRoot), -1.0F, 1.0F);
			this.zRoot += Mth.clamp(((float)Math.toDegrees(Math.atan2(xdiff, xdistance)) - this.zRoot), -1.0F, 1.0F);
			float averageY = (yFrontL + yFrontR + yBackL + yBackR) * 0.25F;

			if (!this.isLogicalClient()) {
				float dy = averageY - entityPosY;
				this.move(MoverType.SELF, new Vec3(0.0F, dy, 0.0F));
			}
		}
	}

	public void updateJointBoundParts() {
		for (JointBoundPart part : this.jointBoundParts) {
			part.tick(this);
		}
	}

	@Unique
	private void initJointBoundParts() {
		this.jointBoundParts.clear();

		this.jointBoundParts.add(new JointBoundPart(this.getHeadPart(), "head"));
		this.jointBoundParts.add(new JointBoundPart(this.getBodyPart(), "body", new Vector3f(0.0F, -1.0F, 0.0F)));

		for (EnderDragonPart wing : this.getWingParts()) {
			String name = (wing == this.wing1) ? "right_wing" : "left_wing";
			this.jointBoundParts.add(new JointBoundPart(wing, name));
		}

		EnderDragonPart[] necks = this.getNeckParts();
		for (int i = 0; i < necks.length; i++) {
			this.jointBoundParts.add(new JointBoundPart(necks[i], "neck" + (i > 0 ? String.valueOf(i + 1) : "")));
		}

		EnderDragonPart[] tails = this.getTailParts();
		for (int i = 0; i < tails.length; i++) {
			this.jointBoundParts.add(new JointBoundPart(tails[i], "neck_tail_" + (i + 1)));
		}
	}

	@Override
	public void resetTipAnimations() {
		this.tipPointAnimations.clear();
	}

	@Inject(method = "tickPart", at = @At("HEAD"), cancellable = true)
	private void onTickPart(EnderDragonPart pPart, double pX, double pY, double pZ, CallbackInfo ci) {
		ci.cancel();
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
		if (!this.isLogicalClient()) {
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
		if (!this.isLogicalClient()) {
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

	@SuppressWarnings("unchecked")
	@Override
	public <M extends Model> M getEntityModel(Models<M> modelDB) {
		if (modelDB == null) {
			return (M) Models.LOGICAL_SERVER.dragon;
		}
		return modelDB.dragon;
	}

	@Override
	public void playAnimationSynchronized(StaticAnimation animation, float convertTimeModifier, AnimationPacketProvider packetProvider) {
		this.animator.playAnimation(animation, convertTimeModifier);
		DragoFightNetworkManager.sendToAllPlayerTrackingThisEntity(packetProvider.get(animation, convertTimeModifier, this), this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends Animator> A getAnimator() {
		return (A) this.animator;
	}

	@Override
	public EntityState getEntityState() {
		return this.state;
	}

	@Override
	public void updateEntityState() {
		this.state = this.animator.getEntityState();
	}

	@Override
	public LivingMotions getCurrentLivingMotion() {
		return this.currentLivingMotion;
	}

	@Override
	public TipPointAnimation getTipPointAnimation(String jointName) {
		return this.tipPointAnimations.get(jointName);
	}

	@Override
	public void addTipPointAnimation(String jointName, Vector3f initpos, TransformSheet transformSheet, IKInfo ikSetter) {
		this.tipPointAnimations.put(jointName, new TipPointAnimation(transformSheet, initpos, ikSetter));
	}

	@Override
	public Map<LivingMotions, StaticAnimation> getLivingMotions() {
		return this.livingMotions;
	}

	@Override
	public List<LivingEntity> getCurrentlyAttackedEntity() {
		return this.currentlyAttackedEntity;
	}

	@Override
	public float getXRoot() {
		return this.xRoot;
	}

	@Override
	public float getXRootO() {
		return this.xRootO;
	}

	@Override
	public float getZRoot() {
		return this.zRoot;
	}

	@Override
	public float getZRootO() {
		return this.zRootO;
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
	public void setCurrentLivingMotion(LivingMotions motion) {
		this.currentLivingMotion = motion;
	}

	@Override
	public LivingMotions getCurrentCompositeMotion() {
		return this.currentCompositeMotion;
	}

	@Override
	public void setCurrentCompositeMotion(LivingMotions motion) {
		this.currentCompositeMotion = motion;
	}

	@Override
	@NotNull
	public EnderDragon getOriginal() {
		return this.getSelf();
	}

	@Unique
	private EnderDragon getSelf()
	{
		return (EnderDragon)(Object)this;
	}
}
