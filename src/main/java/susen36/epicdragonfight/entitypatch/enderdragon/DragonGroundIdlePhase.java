package susen36.epicdragonfight.entitypatch.enderdragon;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import susen36.epicdragonfight.gameasset.Animations;

public class DragonGroundIdlePhase extends PatchedDragonPhase {
	private static final int IDLE_WAIT_TICKS = 200;
	private int scanningTime;

	public DragonGroundIdlePhase(EnderDragon dragon) {
		super(dragon);
	}

	@Override
	public void begin() {
		this.scanningTime = 0;
	}

	@Override
	public void doServerTick() {
		++this.scanningTime;

		LivingEntity target = this.getSelectedTarget();
        this.dragonpatch.setAttakTargetSync(target);

		if (isValidTarget(target)) {
			if(isInEndSpikes(target)){
				this.dragonpatch.playAnimationSynchronized(Animations.DRAGON_GROUND_TO_FLY, 0.0F);
				this.dragon.getPhaseManager().setPhase(PatchedPhases.FLYING);
				((DragonFlyingPhase)this.dragon.getPhaseManager().getCurrentPhase()).enableAirstrike();
			}else {
				this.dragon.getPhaseManager().setPhase(PatchedPhases.GROUND_BATTLE);
			}
		} else if (isInEndSpikes(this.dragon) || this.scanningTime >= IDLE_WAIT_TICKS && !this.dragonpatch.getEntityState().inaction()) {
			this.dragonpatch.playAnimationSynchronized(Animations.DRAGON_GROUND_TO_FLY, 0.0F);
			this.dragon.getPhaseManager().setPhase(PatchedPhases.FLYING);
			((DragonFlyingPhase)this.dragon.getPhaseManager().getCurrentPhase()).enableAirstrike();
		}
	}

	@Override
	public EnderDragonPhase<? extends DragonPhaseInstance> getPhase() {
		return PatchedPhases.GROUND_IDLE;
	}

	@Override
	public boolean isSitting() {
		return true;
	}
}
