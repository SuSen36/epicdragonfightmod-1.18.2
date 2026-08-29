package susen36.epicdragonfight.entitypatch.ai;

import susen36.epicdragonfight.client.anim.Animations;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.Behavior;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.BehaviorSeries;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.Health.Comparator;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors.RandomAnimation;
import susen36.epicdragonfight.entitypatch.enderdragon.PatchedPhases;

public class MobCombatBehaviors {

	public static final CombatBehaviors.Builder<IDragonPatch> ENDER_DRAGON = CombatBehaviors.builder()
		.newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().randomAnimationBehavior(new RandomAnimation(Animations.LEFT_TAIL_SWEEP_EVENT, Animations.LEFT_TAIL_SWEEP_TICKS), new RandomAnimation(Animations.RIGHT_TAIL_SWEEP_EVENT, Animations.RIGHT_TAIL_SWEEP_TICKS)).randomChance(0.1F).withinDistance(0.0D, 7.0D).withinAngle(0.0F, 60.0F))
				.nextBehavior(Behavior.builder().animationBehavior(Animations.ATTACK2_EVENT, Animations.ATTACK2_TICKS).withinDistance(0.0D, 7.0D))
				.nextBehavior(Behavior.builder().animationBehavior(Animations.ATTACK1_EVENT, Animations.ATTACK1_TICKS))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(50.0F).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().animationBehavior(Animations.ATTACK1_EVENT, Animations.ATTACK1_TICKS).withinDistance(0.0D, 5.0D).withinAngle(0.0F, 60.0F))
				.nextBehavior(Behavior.builder().animationBehavior(Animations.ATTACK2_EVENT, Animations.ATTACK2_TICKS))
				.nextBehavior(Behavior.builder().randomAnimationBehavior(new RandomAnimation(Animations.LEFT_TAIL_SWEEP_EVENT, Animations.LEFT_TAIL_SWEEP_TICKS), new RandomAnimation(Animations.RIGHT_TAIL_SWEEP_EVENT, Animations.RIGHT_TAIL_SWEEP_TICKS)).randomChance(0.4F).withinDistance(0.0D, 7.0D))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(100.0F).cooldown(240).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().behavior((mobpatch) -> {
					mobpatch.playAnimation(Animations.FIREBALL_EVENT, Animations.FIREBALL_TICKS);
					mobpatch.scheduleServerEvent(Animations.SERVER_FIREBALL, Animations.FIREBALL_SPAWN_TICKS);
				}).withinDistance(15.0D, 30.0D).withinAngleHorizontal(0.0F, 10.0F))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(1000.0F).cooldown(0).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().health(0.4F, Comparator.LESS_RATIO).custom((mobpatch) -> mobpatch.getOriginal().getDragonFight() != null && mobpatch.getOriginal().getDragonFight().getCrystalsAlive() > 0)
				.behavior((mobpatch) -> {
					mobpatch.getOriginal().getPhaseManager().setPhase(PatchedPhases.CRYSTAL_LINK);
				}))
		).newBehaviorSeries(
			BehaviorSeries.builder().weight(10.0F).cooldown(1600).canBeInterrupted(false).looping(false)
				.nextBehavior(Behavior.builder().health(0.5F, Comparator.LESS_RATIO).custom((mobpatch) -> mobpatch.getOriginal().getDragonFight() != null && mobpatch.getOriginal().getDragonFight().getCrystalsAlive() > 0)
				.behavior(IDragonPatch::takeOff))
		);
}