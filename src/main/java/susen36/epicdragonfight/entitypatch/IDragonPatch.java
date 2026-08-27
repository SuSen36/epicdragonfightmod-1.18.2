package susen36.epicdragonfight.entitypatch;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import org.jetbrains.annotations.NotNull;

public interface IDragonPatch {
	@NotNull
	EnderDragon getOriginal();

	void setFlyingPhase();
	void setGroundPhase();
	boolean isGroundPhase();

	int getShieldEndEffectAge();
	void setShieldEndEffectAge(int age);

	default LivingEntity getTarget() {
		return this.getOriginal().getTarget();
	}
	default void setTarget(LivingEntity target) {
		if (!this.getOriginal().level.isClientSide()) {
			this.getOriginal().setTarget(target);
		}
	}
}