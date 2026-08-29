package susen36.epicdragonfight.gameasset;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.phys.Vec3;
import susen36.epicdragonfight.api.animation.types.ActionAnimation;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.animation.types.StaticAnimation.Event;
import susen36.epicdragonfight.api.animation.types.StaticAnimation.Event.Side;
import susen36.epicdragonfight.api.animation.types.procedural.EnderDragonDeathAnimation;
import susen36.epicdragonfight.api.animation.types.procedural.EnderDragonTailAttackAnimation;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty.ActionAnimationProperty;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty.StaticAnimationProperty;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedPhases;

import java.util.function.Consumer;

public class Animations {
	public static StaticAnimation DUMMY_ANIMATION = new StaticAnimation();
	public static StaticAnimation DRAGON_IDLE;
	public static StaticAnimation DRAGON_WALK;
	public static StaticAnimation DRAGON_FLY;
	public static StaticAnimation DRAGON_DEATH;
	public static StaticAnimation DRAGON_GROUND_TO_FLY;
	public static StaticAnimation DRAGON_FLY_TO_GROUND;
	public static StaticAnimation DRAGON_LEFT_TAIL_SWEEP;
	public static StaticAnimation DRAGON_RIGHT_TAIL_SWEEP;
	public static StaticAnimation DRAGON_ATTACK1;
	public static StaticAnimation DRAGON_ATTACK2;
	public static StaticAnimation DRAGON_ATTACK3;
	public static StaticAnimation DRAGON_FIREBALL;
	public static StaticAnimation DRAGON_AIRSTRIKE;
	public static StaticAnimation DRAGON_CRYSTAL_LINK;

	public static void registerAnimations() {
		build();
	}

	private static void build() {

		DRAGON_IDLE = new StaticAnimation(0.6F, true, "idle");
		DRAGON_WALK = new StaticAnimation(0.35F, true, "walk");
		DRAGON_FLY = new StaticAnimation(0.35F,true, "fly")
				.addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.4F, ReuseableEvents.WING_FLAP, Side.CLIENT)});

		DRAGON_DEATH = new EnderDragonDeathAnimation(1.0F, "death")
				.addProperty(AnimationProperty.ActionAnimationProperty.STOP_MOVEMENT, true);

		DRAGON_GROUND_TO_FLY = new ActionAnimation(0.25F, "ground_to_fly")
				.addProperty(ActionAnimationProperty.STOP_MOVEMENT, true)
				.addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.25F, ReuseableEvents.WING_FLAP, Side.CLIENT), Event.create(1.05F, ReuseableEvents.WING_FLAP, Side.CLIENT), Event.create(1.45F, (entitypatch) -> {
					entitypatch.setFlyingPhase();
				}, Side.BOTH)});

		DRAGON_FLY_TO_GROUND = new ActionAnimation(0.35F, "fly_to_ground")
				.addProperty(ActionAnimationProperty.STOP_MOVEMENT, true)
				.addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.3F, ReuseableEvents.WING_FLAP, Side.CLIENT), Event.create(1.1F, (entitypatch) -> {
					entitypatch.getOriginal().playSound(SoundEvents.STONE_FALL, 0, 0);
				}, Side.CLIENT), Event.create(1.1F, (entitypatch) -> {
					LivingEntity original = entitypatch.getOriginal();
					DamageSource damageSource = DamageSource.mobAttack(original);

					for (Entity entity : original.level.getEntities(original, original.getBoundingBox().inflate(2.0D, 0.0D, 2.0D))) {
						if (entity != original && !(entity instanceof EnderDragonPart part && part.getParent() == original)) {
							entity.hurt(damageSource, 6.0F);
						}
					}
					entitypatch.setGroundPhase();
				}, Side.SERVER)});

		DRAGON_LEFT_TAIL_SWEEP = new EnderDragonTailAttackAnimation(0.35F, 0.4F, 0.65F, 0.76F, 1.9F, "front_right_foot", "left_tail_sweep").addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.65F, (entitypatch) -> {
					entitypatch.getOriginal().playSound(SoundEvents.GENERIC_EXPLODE, 0, 0);
		}, Side.CLIENT)});

		DRAGON_RIGHT_TAIL_SWEEP = new EnderDragonTailAttackAnimation(0.35F, 0.4F, 0.65F, 0.76F, 1.9F, "legft_front_foot", "right_tail_sweep").addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.65F, (entitypatch) -> {
			entitypatch.getOriginal().playSound(SoundEvents.GENERIC_EXPLODE, 0, 0);
		}, Side.CLIENT)});

		DRAGON_ATTACK1 = new EnderDragonTailAttackAnimation(0.35F, 0.25F, 0.45F, 0.66F, 0.75F, "front_right_foot", "attack1").addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.66F, (entitypatch) -> {
				LivingEntity original = entitypatch.getOriginal();
				Entity target = entitypatch.getOriginal().getTarget();
				if(target != null && original.distanceTo(target)<=8) {
					original.doHurtTarget(target);
				}
		}, Side.SERVER)});

		DRAGON_ATTACK2 = new EnderDragonTailAttackAnimation(0.35F, 0.25F, 0.45F, 0.66F, 0.75F, "front_left_foot", "attack2").addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.66F, (entitypatch) -> {
			LivingEntity original = entitypatch.getOriginal();
			Entity target = entitypatch.getOriginal().getTarget();
			if(target != null && original.distanceTo(target)<=8) {
				original.doHurtTarget(target);
			}
		}, Side.SERVER)});

		DRAGON_ATTACK3 = new EnderDragonTailAttackAnimation(0.35F, 0.5F, 1.15F, 1.26F, 1.9F, "root", "attack3")
		   .addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(1.2F, (entitypatch) -> {
			entitypatch.getOriginal().playSound(SoundEvents.GENERIC_EXPLODE, 0, 0);
		}, Side.CLIENT), Event.create(1.26F, (entitypatch) -> {
			LivingEntity original = entitypatch.getOriginal();
			for (Entity entity : original.level.getEntities(original, original.getBoundingBox().inflate(2.0D, 0.D, 2.0D))) {
				original.doHurtTarget(entity);
			}
		}, Side.SERVER)});

		DRAGON_FIREBALL = new ActionAnimation(0.16F, "fireball").addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.65F, (entitypatch) -> {
			LivingEntity original = entitypatch.getOriginal();
			Entity target = entitypatch.getOriginal().getTarget();
			Vec3 pos = original.getParts()[0].position();
			if(target == null)return;
			Vec3 toTarget = target.position().subtract(original.position()).normalize().scale(0.5D);
			double d6 = (float) (pos.x + toTarget.x);
			double d7 = (float) (pos.y);
			double d8 = (float) (pos.z + toTarget.z);
			double d9 = target.getX() - d6;
			double d10 = target.getY(0.5D) - d7;
			double d11 = target.getZ() - d8;
			if (!original.isSilent()) {
				original.level.levelEvent(null, 1017, original.blockPosition(), 0);
			}
			DragonFireball dragonFireball = new DragonFireball(original.level, original, d9, d10, d11);
			dragonFireball.moveTo(d6, d7, d8, 0.0F, 0.0F);
			original.level.addFreshEntity(dragonFireball);
		}, Side.SERVER)});
		DRAGON_AIRSTRIKE = new StaticAnimation(0.35F,true, "airstrike")
				.addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(0.3F, ReuseableEvents.WING_FLAP, Side.CLIENT)});

		DRAGON_CRYSTAL_LINK = new ActionAnimation(0.5F, "crystal_link")
				.addProperty(StaticAnimationProperty.EVENTS, new Event[]{Event.create(7.0F, (entitypatch) -> {
					entitypatch.getOriginal().playSound(SoundEvents.ENDER_DRAGON_GROWL, 7.0F, 0.8F + entitypatch.getOriginal().getRandom().nextFloat() * 0.3F);
					entitypatch.getOriginal().heal(100.0F);
					entitypatch.getOriginal().getPhaseManager().setPhase(PatchedPhases.GROUND_BATTLE);
				}, Side.SERVER), Event.create(7.0F, (entitypatch) -> {
					Entity original = entitypatch.getOriginal();
					original.level.addParticle(ParticleTypes.EXPLOSION, original.getX(), original.getY() + 2.0D, original.getZ(), 0, 0, 0);
				}, Side.CLIENT)});

	}

	private static class ReuseableEvents {
		private static final Consumer<IDragonPatch> WING_FLAP = (entitypatch) -> {
			entitypatch.getOriginal().onFlap();
		};
	}
}

