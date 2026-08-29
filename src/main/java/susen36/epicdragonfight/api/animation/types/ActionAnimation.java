package susen36.epicdragonfight.api.animation.types;

import susen36.epicdragonfight.api.animation.types.property.AnimationProperty.ActionAnimationProperty;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class ActionAnimation extends MainFrameAnimation {
	public ActionAnimation(float convertTime, String name) {
		this(convertTime, Float.MAX_VALUE, name);
	}
	
	public ActionAnimation(float convertTime, float postDelay, String name) {
		super(convertTime, name);
		
		this.stateSpectrumBlueprint.clear()
			.newTimePair(0.0F, postDelay)
			.addState(EntityState.TURNING_LOCKED, true)
			.addState(EntityState.MOVEMENT_LOCKED, true)
			.addState(EntityState.CAN_BASIC_ATTACK, false)
			.addState(EntityState.CAN_SKILL_EXECUTION, false)
			.newTimePair(0.0F, Float.MAX_VALUE)
			.addState(EntityState.INACTION, true);
	}
	
	public <V> ActionAnimation addProperty(ActionAnimationProperty<V> propertyType, V value) {
		this.properties.put(propertyType, value);
		return this;
	}
	
	@Override
	public void begin(IDragonPatch entitypatch) {
		super.begin(entitypatch);

		if (this.getProperty(ActionAnimationProperty.STOP_MOVEMENT).orElse(false)) {
			entitypatch.getOriginal().setDeltaMovement(0.0D, entitypatch.getOriginal().getDeltaMovement().y, 0.0D);
		}
	}

}