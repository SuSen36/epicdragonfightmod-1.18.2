package susen36.epicdragonfight.api.animation.types.procedural;

import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.animation.property.AnimationProperty;
import susen36.epicdragonfight.api.animation.types.ActionAnimation;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.DragonAnimationData;

public class EnderDragonDeathAnimation extends ActionAnimation {
	public EnderDragonDeathAnimation(float convertTime, String path, Model model) {
		super(convertTime, path, model);
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
	public void loadAnimation() {
		String animPath = this.resourceLocation.getPath();
		String animName = animPath.substring(animPath.lastIndexOf('/') + 1);
		DragonAnimationData.loadByName(animName, this);
		this.onLoaded();
	}
	
	@Override
	protected void modifyPose(Pose pose, IDragonPatch entitypatch, float time) {
		
	}
}