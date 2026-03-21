package susen36.epicdragonfight.mixin;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(value = AreaEffectCloud.class)
public abstract class MixinAreaEffectCloud {
    @Shadow
    private int duration;

    @Shadow
    private float radiusPerTick;

    @Shadow
    private LivingEntity owner;

    @Shadow
    public abstract float getRadius();

    @Shadow
    public abstract void setRadius(float p_19713_);

    @Inject(method = "tick", at = @At("HEAD"))
    private void epicfight_dragonBreathTick(CallbackInfo ci) {
        if (this.owner instanceof EnderDragon) {
            this.dragonBreathTick();
        }
    }

    private void dragonBreathTick() {
        AreaEffectCloud self = (AreaEffectCloud) (Object) this;
        self.move(MoverType.SELF, self.getDeltaMovement());

        if (!self.level.isClientSide) {
            if (self.tickCount >= this.duration) {
                self.discard();
                return;
            }

            float f = this.getRadius();

            if (this.radiusPerTick != 0.0F) {
                f += this.radiusPerTick;
                if (f < 0.5F) {
                    self.discard();
                }

                this.setRadius(f);
            }
        }
    }
}
