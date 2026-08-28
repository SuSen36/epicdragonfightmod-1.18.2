package susen36.epicdragonfight.api.animation.types.procedural;

import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.animation.types.ActionAnimation;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class EnderDragonDeathAnimation extends ActionAnimation {
	public EnderDragonDeathAnimation(float convertTime, String name) {
		super(convertTime, name);
		this.addProperty(AnimationProperty.ActionAnimationProperty.STOP_MOVEMENT, true);

		this.stateSpectrumBlueprint.clear()
				.newTimePair(0.0F, Float.MAX_VALUE)
				.addState(EntityState.TURNING_LOCKED, true)
				.addState(EntityState.MOVEMENT_LOCKED, true)
				.addState(EntityState.CAN_BASIC_ATTACK, false)
				.addState(EntityState.CAN_SKILL_EXECUTION, false)
				.addState(EntityState.INACTION, true)
				.addState(EntityState.HURT,	true);
	}

	@Override
	protected void modifyPose(Pose pose, IDragonPatch entitypatch, float time) {}
}