package susen36.epicdragonfight.api.animation.types.procedural;

import susen36.epicdragonfight.api.animation.types.AttackAnimation;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty.ActionAnimationCoordSetter;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty.ActionAnimationProperty;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty.AttackAnimationProperty;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class EnderDragonAttackAnimation extends AttackAnimation {
	public EnderDragonAttackAnimation(float convertTime, float antic, float preDelay, float contact, float recovery, String index, String name) {
		super(convertTime, antic, preDelay, contact, recovery, index, name);
		this.addProperty(AttackAnimationProperty.FIXED_MOVE_DISTANCE, true);
		this.properties.remove(ActionAnimationProperty.COORD_SET_TICK);
	}

	@Override
	public void begin(IDragonPatch entitypatch) {
		ActionAnimationCoordSetter movementAnimationSetter = this.getProperty(ActionAnimationProperty.COORD_SET_BEGIN).orElse((self, entitypatch$2, transformSheet) -> {
			transformSheet.readFrom(self.getTransfroms().get("root"));
		});
		entitypatch.getAnimator().getPlayerFor(this).setActionAnimationCoord(this, entitypatch, movementAnimationSetter);
		if (entitypatch.getOriginal().level.isClientSide()) {
			entitypatch.getClientAnimator().resetMotion();
			entitypatch.getClientAnimator().resetCompositeMotion();
		}
	}
}