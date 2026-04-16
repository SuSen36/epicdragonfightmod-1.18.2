package susen36.epicdragonfight.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.levelgen.feature.SpikeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.SpikeConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Random;

@Mixin(SpikeFeature.class)
public abstract class MixinSpikeFeature {

    @Redirect(
        method = "placeSpike",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/core/BlockPos;distToLowCornerSqr(DDD)D"
        )
    )
    private double modifyRadiusCheck(BlockPos pos, double cx, double y, double cz, ServerLevelAccessor level, Random random, SpikeConfiguration config, SpikeFeature.EndSpike spike) {
        int baseR = spike.getRadius();
        double originalThreshold = baseR * baseR + 1;
        
        if (spike.isGuarded()) {
            int cageHalfWidth = 2;
            boolean insideSquare = Math.abs(pos.getX() - (int)cx) <= cageHalfWidth && Math.abs(pos.getZ() - (int)cz) <= cageHalfWidth;
            return insideSquare ? 0.0 : originalThreshold + 1.0;
        }
        
        int height = spike.getHeight();
        int seaLevel = level.getSeaLevel();
        
        float progress = (float)(pos.getY() - seaLevel) / (float)(height - seaLevel);
        int currentR = progress < 0.667F ? baseR : Mth.ceil(baseR * 0.6F);
        
        double actualDist = pos.distToLowCornerSqr(cx, y, cz);
        double newThreshold = currentR * currentR + 1;
        
        return actualDist - newThreshold + originalThreshold;
    }
}