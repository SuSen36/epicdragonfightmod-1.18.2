package susen36.epicdragonfight.entitypatch;

import net.minecraft.world.entity.boss.enderdragon.EndCrystal;

public interface IEndCrystalPatch {
	EndCrystal getSelf();

	boolean hasShield();

	void setHasShield(boolean shield);
}
