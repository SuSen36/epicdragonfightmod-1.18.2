package susen36.epicdragonfight.entitypatch.ai;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameRules;

import java.util.EnumSet;

public class DragonHurtByTargetGoal extends TargetGoal {
	private static final TargetingConditions HURT_BY_TARGETING = TargetingConditions.forCombat().ignoreLineOfSight().ignoreInvisibilityTesting();

	private int timestamp;
	private final Class<?>[] toIgnoreDamage;

	public DragonHurtByTargetGoal(Mob mob, Class<?>... toIgnoreDamage) {
		super(mob, true);
		this.toIgnoreDamage = toIgnoreDamage;
		this.setFlags(EnumSet.of(Flag.TARGET));
	}

	public boolean canUse() {
		int lastHurtTimestamp = this.mob.getLastHurtByMobTimestamp();
		LivingEntity attacker = this.mob.getLastHurtByMob();

		if (lastHurtTimestamp == this.timestamp || attacker == null) {
			return false;
		}

		if (attacker instanceof Player && this.mob.level.getGameRules().getBoolean(GameRules.RULE_UNIVERSAL_ANGER)) {
			return false;
		}

		for (Class<?> ignoreClass : this.toIgnoreDamage) {
			if (ignoreClass.isAssignableFrom(attacker.getClass())) {
				return false;
			}
		}

		return this.canAttack(attacker, HURT_BY_TARGETING);
	}

	public void start() {
		this.mob.setTarget(this.mob.getLastHurtByMob());
		this.targetMob = this.mob.getTarget();
		this.timestamp = this.mob.getLastHurtByMobTimestamp();
		this.unseenMemoryTicks = 300;
		super.start();
	}
}
