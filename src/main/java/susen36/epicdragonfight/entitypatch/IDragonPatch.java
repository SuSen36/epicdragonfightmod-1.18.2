package susen36.epicdragonfight.entitypatch;

import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.LivingMotions;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.animation.types.procedural.IKInfo;
import susen36.epicdragonfight.api.animation.types.procedural.TipPointAnimation;
import susen36.epicdragonfight.api.client.animation.ClientAnimator;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.gameasset.Models;
import susen36.epicdragonfight.network.server.SPPlayAnimation;

import javax.annotation.Nonnull;
import java.util.List;

public interface IDragonPatch {

	TargetingConditions DRAGON_TARGETING = TargetingConditions.forCombat().ignoreLineOfSight();

	@NotNull
	EnderDragon getOriginal();

	default boolean isLogicalClient() {
		return this.getOriginal().level.isClientSide();
	}

	@OnlyIn(Dist.CLIENT)
    void initAnimator(ClientAnimator clientAnimator);

    void updateMotion(boolean considerInaction);
	
	void updateTipPoints();

    void resetTipAnimations();

    void setFlyingPhase();

    void setGroundPhase();

    boolean isGroundPhase();

    <M extends Model> M getEntityModel(Models<M> modelDB);

	void updateEntityState();

	void playAnimationSynchronized(StaticAnimation animation, float convertTimeModifier, AnimationPacketProvider packetProvider);

    @FunctionalInterface
    interface AnimationPacketProvider {
		SPPlayAnimation get(StaticAnimation animation, float convertTimeModifier, IDragonPatch entitypatch);
	}

	<A extends Animator> A getAnimator();

    ClientAnimator getClientAnimator();

	EntityState getEntityState();

    LivingMotions getCurrentLivingMotion();

	TipPointAnimation getTipPointAnimation(String jointName);

    void addTipPointAnimation(String jointName, Vector3f initpos, TransformSheet transformSheet, IKInfo ikSetter);

	List<LivingEntity> getCurrentlyAttackedEntity();

	float getXRoot();

	float getXRootO();

	float getZRoot();

	float getZRootO();

	int getShieldEndEffectAge();

	void setShieldEndEffectAge(int age);

	void setCurrentLivingMotion(LivingMotions motion);

	LivingMotions getCurrentCompositeMotion();

	void setCurrentCompositeMotion(LivingMotions motion);

	default float getYRotLimit() {
		return 20.0F;
	}

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

	default OpenMatrix4f getModelMatrix(float partialTicks) {
		return MathUtils.getModelMatrixIntegral(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, this.getOriginal().yRotO, this.getOriginal().getYRot(), partialTicks, -1.0F, 1.0F, -1.0F);
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

	default void playAnimationSynchronized(StaticAnimation animation, float convertTimeModifier) {
		this.playAnimationSynchronized(animation, convertTimeModifier, SPPlayAnimation::new);
	}
}
