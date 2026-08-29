package susen36.epicdragonfight.entitypatch;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import susen36.epicdragonfight.EpicDragonFight;

public interface IDragonPatch {

	@NotNull
	EnderDragon getOriginal();

	void setFlyingPhase();

	void setGroundPhase();

	boolean isGroundPhase();

	boolean isInAction();

	void playAnimation(byte event, int actionTicks);

	void scheduleSetFlyingPhase(int ticks);

	void scheduleLanding(int ticks);

	void scheduleServerEvent(int event, int ticks);

	int getShieldEndEffectAge();

	void setShieldEndEffectAge(int age);

	AnimationState getIdleAnimationState();

	AnimationState getWalkAnimationState();

	AnimationState getFlyAnimationState();

	AnimationState getAirstrikeAnimationState();

	AnimationState getAttack1AnimationState();

	AnimationState getAttack2AnimationState();

	AnimationState getLeftTailSweepAnimationState();

	AnimationState getRightTailSweepAnimationState();

	AnimationState getFireballAnimationState();

	AnimationState getGroundToFlyAnimationState();

	AnimationState getFlyToGroundAnimationState();

	AnimationState getCrystalLinkAnimationState();

	AnimationState getDeathAnimationState();

	default float getAttackDirectionPitch() {
		Entity attackTarget = this.getOriginal().getTarget();
		if (attackTarget != null) {
			float partialTicks = EpicDragonFight.isPhysicalClient() ? Minecraft.getInstance().getFrameTime() : 1.0F;
			Vec3 target = attackTarget.getEyePosition(partialTicks);
			Vec3 vector3d = this.getOriginal().getEyePosition(partialTicks);
			double d0 = target.x - vector3d.x;
			double d1 = target.y - vector3d.y;
			double d2 = target.z - vector3d.z;
			double d3 = Math.sqrt(d0 * d0 + d2 * d2);
			return Mth.clamp(Mth.wrapDegrees((float) ((Mth.atan2(d1, d3) * (double) (180F / (float) Math.PI)))), -30.0F, 30.0F);
		} else {
			float partialTicks = EpicDragonFight.isPhysicalClient() ? Minecraft.getInstance().getFrameTime() : 1.0F;
			float pitch = -this.getOriginal().getViewXRot(partialTicks);
			float correct = (pitch > 0) ? 0.03333F * (float)Math.pow(pitch, 2) : -0.03333F * (float)Math.pow(pitch, 2);
			return Mth.clamp(correct, -30.0F, 30.0F);
		}
	}

	default void rotateTo(Entity target, float limit, boolean partialSync) {
		double d0 = target.getX() - this.getOriginal().getX();
		double d1 = target.getZ() - this.getOriginal().getZ();
		float degree = 180.0F - (float)Math.toDegrees(Mth.atan2(d0, d1));
		LivingEntity entity = this.getOriginal();
		float amount = degree - entity.getYRot();

		while (amount < -180.0F) {
			amount += 360.0F;
		}

		while (amount > 180.0F) {
			amount -= 360.0F;
		}

		amount = Mth.clamp(amount, -limit, limit);
		float f1 = entity.getYRot() + amount;

		if (partialSync) {
			entity.yRotO = f1;
			entity.yHeadRotO = f1;
			entity.yBodyRotO = f1;
		}

		entity.setYRot(f1);
		entity.yHeadRot = f1;
		entity.yBodyRot = f1;
	}

	default double getAngleTo(Entity entityIn) {
		Vec3 a = this.getOriginal().getLookAngle().scale(-1.0D);
		Vec3 b = new Vec3(entityIn.getX() - this.getOriginal().getX(), entityIn.getY() - this.getOriginal().getY(), entityIn.getZ() - this.getOriginal().getZ()).normalize();
		double cosTheta = (a.x * b.x + a.y * b.y + a.z * b.z);

		return Math.toDegrees(Math.acos(cosTheta));
	}

	default double getAngleToHorizontal(Entity entityIn) {
		Vec3 a = this.getOriginal().getLookAngle().scale(-1.0D);
		Vec3 b = new Vec3(entityIn.getX() - this.getOriginal().getX(), 0.0D, entityIn.getZ() - this.getOriginal().getZ()).normalize();
		double cos = (a.x * b.x + a.y * b.y + a.z * b.z);

		return Math.toDegrees(Math.acos(cos));
	}

	default void setAttakTargetSync(LivingEntity entityIn) {
		if (!this.getOriginal().level.isClientSide()) {
			this.getOriginal().setTarget(entityIn);
		}
	}
}