package susen36.epicdragonfight.entitypatch.enderdragon;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.EndPodiumFeature;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;

public class DragonFlyingPhase extends PatchedDragonPhase {
	
	private Path currentPath;
	private Vec3 targetLocation;
	private boolean clockwise;
	private boolean executeAirstrike;
	
	public DragonFlyingPhase(EnderDragon p_31230_) {
		super(p_31230_);
	}
	
	@Override
	public EnderDragonPhase<DragonFlyingPhase> getPhase() {
		return PatchedPhases.FLYING;
	}
	
	@Override
	public void doServerTick() {
		double d0 = this.targetLocation == null ? 0.0D : this.targetLocation.distanceToSqr(this.dragon.getX(), this.dragon.getY(), this.dragon.getZ());
		
		if (d0 < 100.0D || d0 > 22500.0D || this.dragon.horizontalCollision || this.dragon.verticalCollision && this.dragon.getDragonFight() != null) {
			this.findNewTarget();
		}
	}
	
	@Override
	public void begin() {
		this.currentPath = null;
		this.targetLocation = null;
	}
	
	@Nullable@Override
	public Vec3 getFlyTargetLocation() {
		return this.dragonpatch.getEntityState().inaction() ? null : this.targetLocation;
	}
	
	public void enableAirstrike() {
		this.executeAirstrike = false;
	}
	
	private void findNewTarget() {
		if (this.currentPath != null && this.currentPath.isDone()) {
			int crystalsAlive = this.dragon.getDragonFight() != null ? this.dragon.getDragonFight().getCrystalsAlive() : 0;

			LivingEntity target = this.getSelectedTarget();


			if (target != null && isInEndSpikes(target) && !target.isOnGround()) {
				if (this.dragon.getRandom().nextInt(crystalsAlive / 2 + 2) == 0) {
					this.dragon.getPhaseManager().setPhase(PatchedPhases.LANDING);
				}
				return;
			}

			BlockPos blockpos = this.dragon.level.getHeightmapPos(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, new BlockPos(EndPodiumFeature.END_PODIUM_LOCATION));

            if (target != null && !isWithinAltarVerticalRange(target)  &&!this.executeAirstrike && (this.dragon.getRandom().nextInt(Mth.abs((int) (blockpos.distToCenterSqr(target.position()) / 512.0D)) + 2) == 0 || this.dragon.getRandom().nextFloat() < 0.05F + crystalsAlive * crystalsAlive * 0.007F)) {
				if (isInEndSpikes(target)) {
					this.executeAirstrike = true;
				}
				this.dragonpatch.setAttakTargetSync(target);
				this.dragon.getPhaseManager().setPhase(PatchedPhases.CHARGE);
			}else if (target != null && isWithinAltarVerticalRange(target) &&!this.executeAirstrike && this.dragon.getRandom().nextFloat() > crystalsAlive * 0.15F) {
					if (isInEndSpikes(target)) {
						this.executeAirstrike = true;
					}
					this.dragonpatch.setAttakTargetSync(target);
					this.dragon.getPhaseManager().setPhase(PatchedPhases.AIRSTRIKE);
				} else {
					//TODO:之后会做龙的飞行版的发射fireball
					//this.dragonpatch.setAttakTargetSync(target);
					//this.dragonpatch.getAnimator().playAnimation(Animations.DRAGON_FLYING_FIREBALL, 0);
				}
				return;
		}
		
		if (this.currentPath == null || this.currentPath.isDone()) {
			int j = this.dragon.findClosestNode();
			int k = j;
			
			if (this.dragon.getRandom().nextInt(8) == 0) {
				this.clockwise = !this.clockwise;
				k = j + 6;
			}
			
			if (this.clockwise) {
				++k;
			} else {
				--k;
			}
			
			if (this.dragon.getDragonFight() != null && this.dragon.getDragonFight().getCrystalsAlive() >= 0) {
				k = k % 12;
				if (k < 0) {
					k += 12;
				}
			} else {
				k = k - 12;
				k = k & 7;
				k = k + 12;
			}
			
			this.currentPath = this.dragon.findPath(j, k, null);
			if (this.currentPath != null) {
				this.currentPath.advance();
			}
		}

		this.navigateToNextPathNode();
	}
	
	private void navigateToNextPathNode() {
		if (this.currentPath != null && !this.currentPath.isDone()) {
			Vec3i vec3i = this.currentPath.getNextNodePos();
			this.currentPath.advance();
			double d0 = vec3i.getX();
			double d1 = vec3i.getZ();
			double d2;
			
			do {
				d2 = (float) vec3i.getY() + this.dragon.getRandom().nextFloat() * 20.0F;
			} while (d2 < (double) vec3i.getY());
			
			this.targetLocation = new Vec3(d0, d2, d1);
		}
	}
}