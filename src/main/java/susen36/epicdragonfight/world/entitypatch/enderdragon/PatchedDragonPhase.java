package susen36.epicdragonfight.world.entitypatch.enderdragon;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.AbstractDragonPhaseInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.EndPodiumFeature;
import susen36.epicdragonfight.world.entitypatch.IDragonPatch;

public abstract class PatchedDragonPhase extends AbstractDragonPhaseInstance {
	protected final IDragonPatch dragonpatch;

	public PatchedDragonPhase(EnderDragon dragon) {
		super(dragon);
		if (dragon instanceof IDragonPatch dragonPatch) {
			this.dragonpatch = dragonPatch;
		} else {
			throw new IllegalStateException("EenderDragon must implement IDragonPatch! Please check if the Mixin is loaded correctly.");
		}
	}
	
	@Override
	public void doClientTick() {
		this.dragon.oFlapTime = 0.5F;
		this.dragon.flapTime = 0.5F;
	}
	
	protected static boolean isValidTarget(LivingEntity entity) {
		return entity.canBeSeenAsEnemy();
	}
	
	protected static boolean isInEndSpikes(LivingEntity entity) {
		BlockPos blockpos = entity.level().getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, new BlockPos(EndPodiumFeature.END_PODIUM_LOCATION));
		return blockpos.distSqr(new Vec3i((int) entity.getX(), blockpos.getY(), (int) entity.getZ())) < 2000.0D;
	}
	
	protected List<Player> getPlayersNearbyWithin(double within) {
		return this.dragon.level().getNearbyPlayers(IDragonPatch.DRAGON_TARGETING, this.dragon, this.dragon.getBoundingBox().inflate(within, within, within));
	}
}