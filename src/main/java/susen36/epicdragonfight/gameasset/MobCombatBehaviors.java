package susen36.epicdragonfight.gameasset;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.phys.Vec3;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.Behavior;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.BehaviorSeries;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.Health.Comparator;
import susen36.epicdragonfight.entitypatch.enderdragon.DragonFlyingPhase;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedPhases;

public class MobCombatBehaviors {
	public static final int MELEE_COMBO_1 = 0;
	public static final int MELEE_COMBO_2 = 1;
	public static final int MID_RANGE_ATTACK = 2;
	public static final int BACKJUMP = 3;
	public static final int FIREBALL = 4;
	public static final int CRYSTAL_LINK = 5;
	public static final int FLY_AWAY = 6;

	public static final CombatBehaviors.Builder<IDragonPatch> ENDER_DRAGON = CombatBehaviors.builder()
		.newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::meleeAttack).randomChance(0.1F).withinDistance(0.0D, 7.0D).withinAngle(0.0F, 60.0F))
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::meleeAttack).withinDistance(0.0D, 7.0D))
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::meleeAttack))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::meleeAttack).withinDistance(0.0D, 5.0D).withinAngle(0.0F, 60.0F))
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::meleeAttack))
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::meleeAttack).randomChance(0.4F).withinDistance(0.0D, 7.0D))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).cooldown(200).simultaneousCooldown(3).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::heavyAttack).withinDistance(10.0D, 15.0D).withinAngle(0.0F, 40.0F))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(100.0F).cooldown(100).simultaneousCooldown(2).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::backjump).withinDistance(0.0D, 4.0D).withinAngle(90.0F, 180.0F))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(100.0F).cooldown(240).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().behavior(MobCombatBehaviors::shootFireball).withinDistance(15.0D, 30.0D).withinAngleHorizontal(0.0F, 10.0F))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(1000.0F).cooldown(0).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().health(0.4F, Comparator.LESS_RATIO).custom((mobpatch) -> mobpatch.getOriginal().getDragonFight() != null && mobpatch.getOriginal().getDragonFight().getCrystalsAlive() > 0)
				.behavior((mobpatch) -> {
					mobpatch.getOriginal().getPhaseManager().setPhase(PatchedPhases.CRYSTAL_LINK);
				}))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(10.0F).cooldown(1600).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().health(0.5F, Comparator.LESS_RATIO).custom((mobpatch) -> mobpatch.getOriginal().getDragonFight() != null && mobpatch.getOriginal().getDragonFight().getCrystalsAlive() > 0)
				.behavior((mobpatch) -> {
					EnderDragon dragon = mobpatch.getOriginal();
					dragon.getPhaseManager().setPhase(PatchedPhases.FLYING);
					((DragonFlyingPhase) dragon.getPhaseManager().getCurrentPhase()).enableAirstrike();
				}))
		);

	private static void meleeAttack(IDragonPatch mobpatch) {
		LivingEntity target = mobpatch.getOriginal().getTarget();
		if (target != null) {
			mobpatch.getOriginal().doHurtTarget(target);
		}
	}

	private static void heavyAttack(IDragonPatch mobpatch) {
		LivingEntity target = mobpatch.getOriginal().getTarget();
		if (target != null) {
			mobpatch.getOriginal().doHurtTarget(target);
		}
	}

	private static void backjump(IDragonPatch mobpatch) {
		LivingEntity target = mobpatch.getOriginal().getTarget();
		if (target != null) {
			Vec3 away = mobpatch.getOriginal().position().subtract(target.position()).normalize().scale(2.0D);
			mobpatch.getOriginal().setDeltaMovement(away.x, 0.5D, away.z);
		}
	}

	private static void shootFireball(IDragonPatch mobpatch) {
		LivingEntity target = mobpatch.getOriginal().getTarget();
		if (target == null) return;
		EnderDragon dragon = mobpatch.getOriginal();
		Vec3 pos = dragon.getEyePosition();
		double d6 = pos.x;
		double d7 = pos.y;
		double d8 = pos.z;
		double d9 = target.getX() - d6;
		double d10 = target.getY(0.5D) - d7;
		double d11 = target.getZ() - d8;
		DragonFireball fireball = new DragonFireball(dragon.level, dragon, d9, d10, d11);
		fireball.moveTo(d6, d7, d8, 0.0F, 0.0F);
		dragon.level.addFreshEntity(fireball);
	}
}