package susen36.epicdragonfight.entitypatch.enderdragon;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import net.minecraft.world.entity.boss.enderdragon.phases.EnderDragonPhase;
import net.minecraft.world.level.PathNavigationRegion;
import net.minecraft.world.level.pathfinder.NodeEvaluator;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.level.pathfinder.PathFinder;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;
import net.minecraft.world.phys.Vec3;
import susen36.epicdragonfight.api.animation.types.EntityState;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.entitypatch.ai.CombatBehaviors;
import susen36.epicdragonfight.gameasset.MobCombatBehaviors;

public class DragonGroundBattlePhase extends PatchedDragonPhase {
	private static final int GROUND_BATTLE_MAX_TICKS = 600;
	
	private PathFinder pathFinder;
	private int aggroCounter;
	private int noPathWarningCounter;
	private int groundBattleTickCounter;
	CombatBehaviors<IDragonPatch> combatBehaviors;
	
	public DragonGroundBattlePhase(EnderDragon dragon) {
		super(dragon);
		
		if (!dragon.level.isClientSide()) {
			this.combatBehaviors = MobCombatBehaviors.ENDER_DRAGON.build(this.dragonpatch);
			NodeEvaluator nodeEvaluator = new WalkNodeEvaluator();
			nodeEvaluator.setCanPassDoors(true);
		    this.pathFinder = new PathFinder(nodeEvaluator, 100);
		}
	}
	
	@Override
	public void begin() {
		this.dragonpatch.setGroundPhase();
		int crystalsAlive = this.dragon.getDragonFight() != null ? this.dragon.getDragonFight().getCrystalsAlive() : 0;
		int crystalsDestroyed = 10 - crystalsAlive;
		this.groundBattleTickCounter = GROUND_BATTLE_MAX_TICKS + crystalsDestroyed * 120;
	}
	
	@Override
	public void doServerTick() {
		if (this.groundBattleTickCounter > 0) {
			--this.groundBattleTickCounter;
		}
		
		LivingEntity target = this.dragon.getTarget();
		
		if (isValidTarget(target) && isInEndSpikes(target)) {
			EntityState state = this.dragonpatch.getEntityState();
			this.combatBehaviors.tick();
			--this.aggroCounter;

			if (this.combatBehaviors.hasActivatedMove()) {
				if (state.canBasicAttack()) {
					CombatBehaviors.Behavior<IDragonPatch> result = this.combatBehaviors.tryProceed();

					if (result != null) {
						result.execute(this.dragonpatch);
					}
				}
			} else {
				if (!state.inaction()) {
					CombatBehaviors.Behavior<IDragonPatch> result = this.combatBehaviors.selectRandomBehaviorSeries();

					if (result != null) {
						result.execute(this.dragonpatch);
					} else {
						if (this.dragon.tickCount % 20 == 0) {
							if (!this.checkTargetPath(target)) {
								if (this.noPathWarningCounter++ >= 3) {
									this.fly();
								}
							} else {
								this.noPathWarningCounter = 0;
							}
						}

						double dx = target.getX() - this.dragon.getX();
						double dz = target.getZ() - this.dragon.getZ();
						float yRot = 180.0F - (float) Math.toDegrees(Mth.atan2(dx, dz));
						this.dragon.setYRot(MathUtils.rotlerp(this.dragon.getYRot(), yRot, 6.0F));
						Vec3 forward = this.dragon.getForward().scale(-0.25F);
						this.dragon.move(MoverType.SELF, forward);
					}
				} else {
					if (this.aggroCounter < 0) {
						this.aggroCounter = 200;
						this.searchNearestTarget();
					}
				}
			}
		} else {
			this.searchNearestTarget();
			if ((target == null || !isInEndSpikes(target)) && !this.dragonpatch.getEntityState().inaction()) {
				this.dragon.getPhaseManager().setPhase(PatchedPhases.GROUND_IDLE);
			}
		}
	}

	private boolean checkTargetPath(LivingEntity target) {
		BlockPos blockpos = this.dragon.blockPosition();
		
		while (this.dragon.level.getBlockState(blockpos).getMaterial().blocksMotion()) {
			blockpos = blockpos.above();
		}
		
		while (!this.dragon.level.getBlockState(blockpos.below()).getMaterial().blocksMotion()) {
			blockpos = blockpos.below();
		}
		
        int sight = 60;
        PathNavigationRegion pathnavigationregion = new PathNavigationRegion(this.dragon.level, blockpos.offset(-sight, -sight, -sight), blockpos.offset(sight, sight, sight));
        
        Path path = this.pathFinder.findPath(pathnavigationregion, this.dragon, ImmutableSet.of(target.blockPosition()), sight, 0, 1.0F);
        
        BlockPos pathEnd = path.getNode(path.getNodeCount() - 1).asBlockPos();
        BlockPos targetPos = path.getTarget();
        double xd = Math.abs(pathEnd.getX() - targetPos.getX());
        double yd = Math.abs(pathEnd.getY() - targetPos.getY());
        double zd = Math.abs(pathEnd.getZ() - targetPos.getZ());
        
        return xd < this.dragon.getBbWidth() && yd < this.dragon.getBbHeight() && zd < this.dragon.getBbWidth();
	}
	
	private void searchNearestTarget() {
		LivingEntity target = this.getSelectedTarget();

		if (isValidTarget(target) && isInEndSpikes(target)) {
			this.dragonpatch.setAttakTargetSync(target);
		} else {
			this.dragonpatch.setAttakTargetSync(null);
		}
	}
	
	public void fly() {
		this.combatBehaviors.execute(6);
	}
	
	public void resetFlyCooldown() {
		this.combatBehaviors.resetCooldown(6, false);
	}
	
	@Override
	public boolean isSitting() {
		return true;
	}
	
	@Override
	public EnderDragonPhase<? extends DragonPhaseInstance> getPhase() {
		return PatchedPhases.GROUND_BATTLE;
	}
}