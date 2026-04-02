package susen36.epicdragonfight.gameasset;

import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.enderdragon.DragonFlyingPhase;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedPhases;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.Behavior;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.BehaviorSeries;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.Health.Comparator;

public class MobCombatBehaviors {
	public static final CombatBehaviors.Builder<IDragonPatch> ENDER_DRAGON = CombatBehaviors.builder()
		.newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_ATTACK1).randomChance(0.1F).withinDistance(0.0D, 7.0D).withinAngle(0.0F, 60.0F))
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_ATTACK3).withinDistance(0.0D, 7.0D))
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_ATTACK2))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_ATTACK2).withinDistance(0.0D, 5.0D).withinAngle(0.0F, 60.0F))
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_ATTACK3))
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_ATTACK1).randomChance(0.4F).withinDistance(0.0D, 7.0D))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).cooldown(200).simultaneousCooldown(3).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_ATTACK4).withinDistance(10.0D, 15.0D).withinAngle(0.0F, 40.0F))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(100.0F).cooldown(100).simultaneousCooldown(2).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_BACKJUMP_PREPARE).withinDistance(0.0D, 4.0D).withinAngle(90.0F, 180.0F))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(100.0F).cooldown(240).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().animationBehavior(Animations.DRAGON_FIREBALL).withinDistance(15.0D, 30.0D).withinAngleHorizontal(0.0F, 10.0F))
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
					mobpatch.playAnimationSynchronized(Animations.DRAGON_GROUND_TO_FLY, 0.0F);
					mobpatch.getOriginal().getPhaseManager().setPhase(PatchedPhases.FLYING);
					((DragonFlyingPhase)mobpatch.getOriginal().getPhaseManager().getCurrentPhase()).enableAirstrike();
				}))
		);
}