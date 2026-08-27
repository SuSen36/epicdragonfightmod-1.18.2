package susen36.epicdragonfight.entitypatch.enderdragon;

import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhaseManager;

public class PhaseManagerPatch extends EnderDragonPhaseManager {
	private final DragonPhaseInstance[] patchedPhases = new DragonPhaseInstance[EnderDragonPhase.getCount()];

	public PhaseManagerPatch(EnderDragon dragon) {
		super(dragon);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends DragonPhaseInstance> T getPhase(EnderDragonPhase<T> phase) {
		int i = phase.getId();

		if (this.patchedPhases[i] == null) {
			this.patchedPhases[i] = phase.createInstance(this.dragon);
		}

		return (T) this.patchedPhases[i];
	}

	@Override
	public void setPhase(EnderDragonPhase<?> phase) {
		if (isPatchedPhase(phase) || phase == EnderDragonPhase.DYING) {
			super.setPhase(phase);
		}
	}

	private static boolean isPatchedPhase(EnderDragonPhase<?> phase) {
		return phase == PatchedPhases.FLYING || phase == PatchedPhases.CHARGE
			|| phase == PatchedPhases.GROUND_BATTLE || phase == PatchedPhases.GROUND_IDLE
			|| phase == PatchedPhases.LANDING || phase == PatchedPhases.AIRSTRIKE
			|| phase == PatchedPhases.CRYSTAL_LINK;
	}
}