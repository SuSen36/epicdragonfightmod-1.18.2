package susen36.epicdragonfight.entitypatch.enderdragon;

import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.AbstractDragonPhaseInstance;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.EndPodiumFeature;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public abstract class PatchedDragonPhase extends AbstractDragonPhaseInstance {
	protected final IDragonPatch dragonpatch;
	
	public PatchedDragonPhase(EnderDragon dragon) {
		super(dragon);
		this.dragonpatch = dragon instanceof IDragonPatch patch ? patch : null;
	}
	
	@Override
	public void doClientTick() {
		this.dragon.oFlapTime = 0.5F;
		this.dragon.flapTime = 0.5F;
	}
	
	protected static boolean isValidTarget(LivingEntity entity) {
		return entity != null && entity.canBeSeenAsEnemy();
	}
	
	protected static boolean isInEndSpikes(LivingEntity entity) {
		BlockPos blockpos = entity.level.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, new BlockPos(EndPodiumFeature.END_PODIUM_LOCATION));
		double dx = entity.getX() - blockpos.getX();
		double dz = entity.getZ() - blockpos.getZ();
		return dx * dx + dz * dz < 400.0D && Math.abs(entity.getY() - blockpos.getY()) <= 10.0D;
	}

	protected static boolean isWithinAltarVerticalRange(LivingEntity entity) {
		BlockPos blockpos = entity.level.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, new BlockPos(EndPodiumFeature.END_PODIUM_LOCATION));
		double yDiff = entity.getY() - blockpos.getY();
		return yDiff <= 12.0D;
	}
	
	@Nullable
	protected LivingEntity getSelectedTarget() {
		LivingEntity target = this.dragon.getTarget();
		if (isValidTarget(target)) {
			return target;
		}
		return null;
	}
}