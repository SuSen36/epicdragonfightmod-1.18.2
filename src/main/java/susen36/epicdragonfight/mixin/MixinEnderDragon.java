package susen36.epicdragonfight.mixin;

import com.google.common.collect.Maps;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhaseManager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.LivingMotion;
import susen36.epicdragonfight.api.animation.LivingMotions;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.animation.types.procedural.IKInfo;
import susen36.epicdragonfight.api.animation.types.procedural.TipPointAnimation;
import susen36.epicdragonfight.api.client.animation.ClientAnimator;
import susen36.epicdragonfight.api.client.model.ClientModel;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.gameasset.Animations;
import susen36.epicdragonfight.gameasset.Models;
import susen36.epicdragonfight.network.DragoFightNetworkManager;
import susen36.epicdragonfight.world.entitypatch.IDragonPatch;
import susen36.epicdragonfight.world.entitypatch.enderdragon.DragonAirstrikePhase;
import susen36.epicdragonfight.world.entitypatch.enderdragon.PatchedDragonPhase;
import susen36.epicdragonfight.world.entitypatch.enderdragon.PatchedPhases;
import susen36.epicdragonfight.world.entitypatch.enderdragon.PhaseManagerPatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mixin(EnderDragon.class)
public abstract class MixinEnderDragon extends Mob implements IDragonPatch {
	@Shadow public EnderDragonPhaseManager phaseManager;
	@Shadow @Final public EnderDragonPart head;

	@Shadow protected abstract boolean reallyHurt(DamageSource pDamageSource, float pAmount);

	@Shadow private float sittingDamageReceived;

	EntityState state = EntityState.DEFAULT;
	public Animator animator;
	public LivingMotion currentLivingMotion = LivingMotions.IDLE;
	public LivingMotion currentCompositeMotion = LivingMotions.IDLE;
	public List<LivingEntity> currentlyAttackedEntity;

	private Map<String, TipPointAnimation> tipPointAnimations = Maps.newHashMap();
	Map<LivingMotions, StaticAnimation> livingMotions = Maps.newHashMap();

	private boolean groundPhase;
	public float xRoot;
	public float xRootO;
	public float zRoot;
	public float zRootO;
	public int shieldEndEffectAge;
	public LivingMotion prevMotion = LivingMotions.FLY;

	protected MixinEnderDragon(EntityType<? extends Mob> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(method = "<init>", at = @At("RETURN"))
	private void onConstruct(CallbackInfo ci) {
		this.livingMotions.put(LivingMotions.IDLE, Animations.DRAGON_IDLE);
		this.livingMotions.put(LivingMotions.WALK, Animations.DRAGON_WALK);
		this.livingMotions.put(LivingMotions.FLY, Animations.DRAGON_FLY);
		this.livingMotions.put(LivingMotions.CHASE, Animations.DRAGON_AIRSTRIKE);
		this.livingMotions.put(LivingMotions.DEATH, Animations.DRAGON_DEATH);

		this.animator = EpicDragonFight.getAnimator(this);
		this.animator.init();
		this.currentlyAttackedEntity = new ArrayList<>();

		if(this.currentLivingMotion!=LivingMotions.FLY){
			this.currentLivingMotion=LivingMotions.WALK;
		}
		DragonPhaseInstance currentPhase = this.getSelf().phaseManager.getCurrentPhase();
		EnderDragonPhase<?> startPhase = (currentPhase == null || !(currentPhase instanceof PatchedDragonPhase)) ? PatchedPhases.FLYING : this.phaseManager.getCurrentPhase().getPhase();
		this.getSelf().phaseManager = new PhaseManagerPatch(this.getSelf());
		this.getSelf().phaseManager.setPhase(startPhase);
		this.setMaxUpStep(1.0F);
	}

	@Override
	public void tick() {
		super.tick();
		this.animator.tick();

		if (this.isLogicalClient()) {
			this.xRootO = this.xRoot;
			this.zRootO = this.zRoot;
			//super.clientTick();
			this.updateTipPoints();

			if (this.shieldEndEffectAge < 10) {
				this.shieldEndEffectAge++;
			}
		} else {
			this.hurtTime = 2;
			this.getSensing().tick();
			this.updateMotion(true);

			if (this.prevMotion != this.currentLivingMotion && !this.animator.getEntityState().inaction()) {
				if (this.livingMotions.containsKey(this.currentLivingMotion)) {
					this.animator.playAnimation(this.livingMotions.get(this.currentLivingMotion), 0.0F);
				}

				this.prevMotion = this.currentLivingMotion;
			}
			this.updateTipPoints();
			Entity bodyPart = Objects.requireNonNull(this.getSelf().getParts())[2];
			AABB bodyBoundingBox = bodyPart.getBoundingBox();
			List<Entity> list = this.level().getEntities(this, bodyBoundingBox, EntitySelector.pushableBy(this));
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

		if (this.getSelf().getPhaseManager().getCurrentPhase().isSitting()) {
			this.getSelf().nearestCrystal = null;
		}
	}

	@Inject(method = "tickDeath", at = @At("HEAD"))
	private void onTickDeath(CallbackInfo ci) {
		this.currentLivingMotion = LivingMotions.DEATH;
	}

	@Inject(
		method = "createAttributes",
		at = @At("RETURN"),
		cancellable = true
	)
	private static void onCreateAttributes(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
		AttributeSupplier.Builder builder = cir.getReturnValue();
		builder.add(Attributes.MAX_HEALTH, 300.0D);
		builder.add(Attributes.ARMOR, 3.0D);
		builder.add(Attributes.ARMOR_TOUGHNESS, 2.0D);
		builder.add(Attributes.ATTACK_DAMAGE, 10.0D);
		builder.add(Attributes.ATTACK_KNOCKBACK, 0.35D);
		cir.setReturnValue(builder);
	}

	/**
	 * @author SuSen
	 * @reason 允许非玩家实体伤害龙,但非特定来源伤害衰减为25%。
	 */
	@Overwrite
	public boolean hurt(EnderDragonPart pPart, DamageSource pSource, float pDamage) {
		if (this.phaseManager.getCurrentPhase().getPhase() == EnderDragonPhase.DYING) {
			return false;
		}
		pDamage = this.phaseManager.getCurrentPhase().onHurt(pSource, pDamage);

		if (pPart != this.head) {
			pDamage = pDamage / 4.0F + Math.min(pDamage, 1.0F);
		}

		boolean isAlwaysSource = pSource.getEntity() instanceof Player || pSource.is(DamageTypeTags.ALWAYS_HURTS_ENDER_DRAGONS);
		if (!isAlwaysSource) {
			pDamage *= 0.25F;
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

	}

	@Override
	public void playSound(SoundEvent sound, float min, float max) {
		float pitch = 1.0F + (this.getRandom().nextFloat() * 2.0F - 1.0F) * (max - min);
		super.playSound(sound, 1.0F, pitch);
	}

	@Inject(method = "knockBack",at = @At("HEAD"), cancellable = true)
	public void knockback(List<Entity> pEntities, CallbackInfo ci) {
		ci.cancel();
	}

	@Inject(method = "checkWalls",at = @At("HEAD"), cancellable = true)
	private void checkWalls(AABB pArea, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}

	@OnlyIn(Dist.CLIENT)
	public void initAnimator(ClientAnimator clientAnimator) {
		for (Map.Entry<LivingMotions, StaticAnimation> livingmotionEntry : this.livingMotions.entrySet()) {
			clientAnimator.addLivingAnimation(livingmotionEntry.getKey(), livingmotionEntry.getValue());
		}
		clientAnimator.setCurrentMotionsAsDefault();
	}

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
				} else {
					this.currentLivingMotion = LivingMotions.FLY;
				}
			} else {
				if (phase.getPhase() == PatchedPhases.GROUND_BATTLE) {
					this.currentLivingMotion = LivingMotions.WALK;
				}
			}
		}
	}

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

	public void resetTipAnimations() {
		this.tipPointAnimations.clear();
	}

	public void setFlyingPhase() {
		this.groundPhase = false;
		this.horizontalCollision = false;
		this.verticalCollision = false;
	}

	public void setGroundPhase() {
		this.groundPhase = true;
	}

	public boolean isGroundPhase() {
		return this.groundPhase;
	}

	public <M extends Model> M getEntityModel(Models<M> modelDB) {
		return (M) CLIENT_MODEL;
	}

	public ClientModel getClientModel() {
		return CLIENT_MODEL;
	}

	public void playAnimationSynchronized(StaticAnimation animation, float convertTimeModifier, AnimationPacketProvider packetProvider) {
		this.animator.playAnimation(animation, convertTimeModifier);
		DragoFightNetworkManager.sendToAllPlayerTrackingThisEntity(packetProvider.get(animation, convertTimeModifier, this), this);
	}

	@SuppressWarnings("unchecked")
	public <A extends Animator> A getAnimator() {
		return (A) this.animator;
	}

	public ClientAnimator getClientAnimator() {
		return this.getAnimator();
	}

	public EntityState getEntityState() {
		return this.state;
	}

	public void updateEntityState() {
		this.state = this.animator.getEntityState();
	}

	public LivingMotion getCurrentLivingMotion() {
		return this.currentLivingMotion;
	}

	public TipPointAnimation getTipPointAnimation(String jointName) {
		return this.tipPointAnimations.get(jointName);
	}

	public void addTipPointAnimation(String jointName, Vector3f initpos, TransformSheet transformSheet, IKInfo ikSetter) {
		this.tipPointAnimations.put(jointName, new TipPointAnimation(transformSheet, initpos, ikSetter));
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
	public void setCurrentLivingMotion(LivingMotion motion) {
		this.currentLivingMotion = motion;
	}

	@Override
	public LivingMotion getCurrentCompositeMotion() {
		return this.currentCompositeMotion;
	}

	@Override
	public void setCurrentCompositeMotion(LivingMotion motion) {
		this.currentCompositeMotion = motion;
	}

	@Override
	public EnderDragon getOriginal() {
		return this.getSelf();
	}

	private EnderDragon getSelf()
	{
		return (EnderDragon)(Object)this;
	}
}
