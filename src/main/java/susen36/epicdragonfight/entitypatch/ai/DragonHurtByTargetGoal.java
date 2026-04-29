package susen36.epicdragonfight.entitypatch.ai;

import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.phys.AABB;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class DragonHurtByTargetGoal extends TargetGoal {
	private static final TargetingConditions HURT_BY_TARGETING = TargetingConditions.forCombat().ignoreLineOfSight().ignoreInvisibilityTesting();
	private static final int ALERT_RANGE_Y = 10;

	private boolean alertSameType;
	private int timestamp;
	private final Class<?>[] toIgnoreDamage;
	@Nullable
	private Class<?>[] toIgnoreAlert;

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

	public DragonHurtByTargetGoal setAlertOthers(Class<?>... toIgnoreAlert) {
		this.alertSameType = true;
		this.toIgnoreAlert = toIgnoreAlert;
		return this;
	}

	public void start() {
		this.mob.setTarget(this.mob.getLastHurtByMob());
		this.targetMob = this.mob.getTarget();
		this.timestamp = this.mob.getLastHurtByMobTimestamp();
		this.unseenMemoryTicks = 300;

		if (this.alertSameType) {
			this.alertOthers();
		}

		super.start();
	}

	protected void alertOthers() {
		double followDistance = this.getFollowDistance();
		AABB searchArea = AABB.unitCubeFromLowerCorner(this.mob.position()).inflate(followDistance, ALERT_RANGE_Y, followDistance);
		LivingEntity attacker = this.mob.getLastHurtByMob();
		List<? extends Mob> nearbyMobs = this.mob.level.getEntitiesOfClass(this.mob.getClass(), searchArea, EntitySelector.NO_SPECTATORS);

		for (Mob nearby : nearbyMobs) {
			if (nearby == this.mob) {
				continue;
			}
			if (nearby.getTarget() != null) {
				continue;
			}
			if (this.mob instanceof TamableAnimal ownerA && nearby instanceof TamableAnimal ownerB && ownerA.getOwner() != ownerB.getOwner()) {
				continue;
			}
            if (attacker != null && nearby.isAlliedTo(attacker)) {
                continue;
            }
            if (this.toIgnoreAlert != null) {
				boolean shouldIgnore = false;
				for (Class<?> ignoreClass : this.toIgnoreAlert) {
					if (nearby.getClass() == ignoreClass) {
						shouldIgnore = true;
						break;
					}
				}
				if (shouldIgnore) {
					continue;
				}
			}

			this.alertOther(nearby, attacker);
		}
	}

	protected void alertOther(Mob mobToAlert, LivingEntity target) {
		mobToAlert.setTarget(target);
	}
}
