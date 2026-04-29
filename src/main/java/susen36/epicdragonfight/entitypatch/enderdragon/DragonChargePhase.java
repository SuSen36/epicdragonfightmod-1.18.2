package susen36.epicdragonfight.entitypatch.enderdragon;

import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import net.minecraft.world.phys.Vec3;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

public class DragonChargePhase extends PatchedDragonPhase {
	private Vec3 startpos;
	private boolean isActuallyAttacking;

	public DragonChargePhase(EnderDragon dragon) {
		super(dragon);
	}

	@Override
	public void begin() {
		this.startpos = this.dragon.position();
		this.isActuallyAttacking = false;
		this.dragon.level.playLocalSound(this.dragon.getX(), this.dragon.getY(), this.dragon.getZ(), SoundEvents.ENDER_DRAGON_GROWL, this.dragon.getSoundSource(), 5.0F, 0.8F + this.dragon.getRandom().nextFloat() * 0.3F, false);
	}

	@Override
	public void end() {
		this.dragonpatch.setAttakTargetSync(null);

		if (this.dragonpatch.isLogicalClient()) {
			Minecraft.getInstance().getSoundManager().stop(SoundEvents.ENDER_DRAGON_GROWL.getLocation(), SoundSource.HOSTILE);
			this.dragon.level.playLocalSound(this.dragon.getX(), this.dragon.getY(), this.dragon.getZ(), SoundEvents.ENDER_DRAGON_SHOOT, this.dragon.getSoundSource(), 5.0F, 1.0F, false);
		}
	}

	@Override
	public void doClientTick() {
		super.doClientTick();
		OpenMatrix4f mouthpos = Animator.getBindedJointTransformByName(this.dragonpatch.getAnimator().getPose(1.0F), this.dragonpatch.getEntityModel().getArmature(), "upperJaw");

		float f = (float)this.dragon.getLatencyPos(7, 1.0F)[0];
		float f1 = (float)(this.dragon.getLatencyPos(5, 1.0F)[1] - this.dragon.getLatencyPos(10, 1.0F)[1]);
		@SuppressWarnings("deprecation")
		float f2 = Mth.rotWrap((this.dragon.getLatencyPos(5, 1.0F)[0] - this.dragon.getLatencyPos(10, 1.0F)[0]));
		OpenMatrix4f modelMatrix = MathUtils.getModelMatrixIntegral(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f1, f1, f, f, 1.0F, 1.0F, 1.0F, 1.0F).rotateDeg(-f2 * 1.5F, Vector3f.ZP);
		mouthpos.mulFront(modelMatrix);

		if (this.dragon.getTarget() != null) {
			Vec3 vec31 = this.dragon.getTarget().position().add(0.0D, 12.0D, 0.0D);

			if (!this.isActuallyAttacking && vec31.subtract(this.dragon.position()).lengthSqr() < 900.0F) {
				this.dragon.level.playLocalSound(this.dragon.getX(), this.dragon.getY(), this.dragon.getZ(), SoundEvents.ENDER_DRAGON_GROWL, this.dragon.getSoundSource(), 5.0F, 1.0F, false);
				this.isActuallyAttacking = true;
			}
		}
	}

	@Override
	public void doServerTick() {
		LivingEntity target = this.dragon.getTarget();

		if (isValidTarget(target) && isInBattleRange(target) && isWithinAltarVerticalRange(target)) {
			Vec3 startToDragon = this.dragon.position().subtract(this.startpos);
			Vec3 startToTarget = target.position().subtract(this.startpos);

			if (startToDragon.horizontalDistanceSqr() < startToTarget.horizontalDistanceSqr()) {
				Vec3 vec31 = target.position();

				if (!this.isActuallyAttacking && vec31.subtract(this.dragon.position()).lengthSqr() < 900.0F) {
					this.isActuallyAttacking = true;
				}

				double d8 = vec31.x - this.dragon.getX();
				double d9 = vec31.y - this.dragon.getY();
				double d10 = vec31.z - this.dragon.getZ();
				float f5 = this.getFlySpeed();
				double d4 = Math.sqrt(d8 * d8 + d10 * d10);

				if (d4 > 0.0D) {
					d9 = Mth.clamp(d9 / d4, -f5, f5);
				}

				this.dragon.setDeltaMovement(this.dragon.getDeltaMovement().add(0.0D, d9 * 0.1D, 0.0D));
				this.dragon.setYRot(Mth.wrapDegrees(this.dragon.getYRot()));
				Vec3 vec32 = vec31.subtract(this.dragon.getX(), this.dragon.getY(), this.dragon.getZ()).normalize();
				Vec3 vec33 = (new Vec3(Mth.sin(this.dragon.getYRot() * ((float) Math.PI / 180F)), this.dragon.getDeltaMovement().y, -Mth.cos(this.dragon.getYRot() * ((float) Math.PI / 180F)))).normalize();
				float f6 = Math.max(((float)vec33.dot(vec32) + 0.5F) / 1.5F, 0.0F);

				if (Math.abs(d8) > (double)1.0E-5F || Math.abs(d10) > (double)1.0E-5F) {
					double dx = target.getX() - this.dragon.getX();
					double dz = target.getZ() - this.dragon.getZ();
					float yRot = 180.0F - (float)Math.toDegrees(Mth.atan2(dx, dz));
					this.dragon.setYRot(MathUtils.rotlerp(this.dragon.getYRot(), yRot, 6.0F));
					double speed = (-0.5D - 1.0D / (1.0D + Math.pow(Math.E, -(d4 / 10.0D - 4.0F)))) * f6;
					Vec3 forward = this.dragon.getForward().scale(speed);
					this.dragon.move(MoverType.SELF, forward);
				}

				if (this.dragon.inWall) {
					this.dragon.move(MoverType.SELF, this.dragon.getDeltaMovement().scale(0.8F));
				} else {
					this.dragon.move(MoverType.SELF, this.dragon.getDeltaMovement());
				}

				Vec3 vec34 = this.dragon.getDeltaMovement().normalize();
				double d6 = 0.8D + 0.15D * (vec34.dot(vec33) + 1.0D) / 2.0D;
				this.dragon.setDeltaMovement(this.dragon.getDeltaMovement().multiply(d6, 0.91F, d6));
			} else {
				this.dragon.getPhaseManager().setPhase(PatchedPhases.FLYING);
			}
		} else {
			this.dragon.getPhaseManager().setPhase(PatchedPhases.FLYING);
		}
	}

	public boolean isActuallyAttacking() {
		return this.isActuallyAttacking;
	}

	@Override
	public float getFlySpeed() {
		return isActuallyAttacking()? 1.95F : 1.75F;
	}

	@Override
	public EnderDragonPhase<? extends DragonPhaseInstance> getPhase() {
		return PatchedPhases.CHARGE;
	}
}
