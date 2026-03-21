package susen36.epicdragonfight.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DragonFireball.class)
public abstract class MixinDragonFireball extends AbstractHurtingProjectile {

	public MixinDragonFireball(EntityType<? extends AbstractHurtingProjectile> p_36817_, double p_36818_, double p_36819_, double p_36820_, double p_36821_, double p_36822_, double p_36823_, Level p_36824_) {
		super(p_36817_, p_36818_, p_36819_, p_36820_, p_36821_, p_36822_, p_36823_, p_36824_);
	}

	@Inject(method = "<init>*", at = @At("RETURN"))
	private void epicfight_modifyFireballPower(CallbackInfo ci) {
		this.xPower *= 1.75D;
		this.yPower *= 1.75D;
		this.zPower *= 1.75D;
	}

	@Inject(method = "onHit", at = @At("HEAD"))
	private void epicfight_onProjectileImpact(HitResult p_36913_, CallbackInfo ci) {
		if (p_36913_.getType() != HitResult.Type.ENTITY) {
			return;
		}

		Entity entity = ((EntityHitResult) p_36913_).getEntity();
		DragonFireball fireball = (DragonFireball) (Object) this;

		if (fireball.getOwner() != null && !entity.is(fireball.getOwner())) {
			entity.hurt(DamageSource.indirectMagic(fireball, fireball.getOwner()), 4.0F);
		}
	}
}
