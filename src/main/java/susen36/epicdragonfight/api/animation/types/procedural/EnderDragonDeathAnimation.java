package susen36.epicdragonfight.api.animation.types.procedural;

import susen36.epicdragonfight.api.animation.types.ActionAnimation;
import susen36.epicdragonfight.api.animation.types.EntityState;

public class EnderDragonDeathAnimation extends ActionAnimation {
	public EnderDragonDeathAnimation(float convertTime, String name) {
		super(convertTime, name);
		this.stateSpectrumBlueprint.clear()
				.newTimePair(0.0F, Float.MAX_VALUE)
				.addState(EntityState.TURNING_LOCKED, true)
				.addState(EntityState.MOVEMENT_LOCKED, true)
				.addState(EntityState.CAN_BASIC_ATTACK, false)
				.addState(EntityState.CAN_SKILL_EXECUTION, false)
				.addState(EntityState.INACTION, true)
				.addState(EntityState.HURT,	true);
	}
}