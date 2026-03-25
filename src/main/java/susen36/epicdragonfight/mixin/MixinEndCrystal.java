package susen36.epicdragonfight.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.boss.enderdragon.phases.DragonPhaseInstance;
import susen36.epicdragonfight.world.entitypatch.enderdragon.DragonCrystalLinkPhase;
import susen36.epicdragonfight.world.entitypatch.IDragonPatch;
import susen36.epicdragonfight.world.entitypatch.enderdragon.PatchedPhases;

@Mixin(value = EndCrystal.class)
public abstract class MixinEndCrystal {
	@Inject(at = @At(value = "HEAD"), method = "hurt", cancellable = true)
	private void epicfight_hurt(DamageSource damagesource, float amount, CallbackInfoReturnable<Boolean> info) {
		EndCrystal self = (EndCrystal)((Object)this);

		if (self.level().isClientSide() || !(self.level() instanceof ServerLevel serverLevel)) return;

		EndDragonFight fight = serverLevel.getDragonFight();

		if (fight != null && fight.getDragonUUID() != null) {
			Entity dragonEntity = serverLevel.getEntity(fight.getDragonUUID());

			if (dragonEntity instanceof EnderDragon dragon &&
					dragon.getPhaseManager().getCurrentPhase() instanceof DragonCrystalLinkPhase linkPhase) {

				if (linkPhase.getLinkingCrystal() == self) {
					info.setReturnValue(false);
					info.cancel();
				}
			}
		}
	}
}