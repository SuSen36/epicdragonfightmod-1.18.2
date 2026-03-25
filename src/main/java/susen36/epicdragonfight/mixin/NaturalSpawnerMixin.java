package susen36.epicdragonfight.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.NaturalSpawner;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.chunk.ChunkAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NaturalSpawner.class)
public class NaturalSpawnerMixin {

    @Inject(
        method = "spawnCategoryForPosition*",
        at = @At("RETURN"),
        cancellable = true
    )
    private static void epicdragonfight$reduceEndermanSpawns(
        net.minecraft.world.entity.MobCategory category,
        ServerLevelAccessor level,
        ChunkAccess chunk,
        BlockPos pos,
        CallbackInfoReturnable<MobSpawnSettings.SpawnerData> cir
    ) {
        MobSpawnSettings.SpawnerData data = cir.getReturnValue();

        if (data != null && data.type == EntityType.ENDERMAN) {
            if (level.getBiome(pos).is(Biomes.THE_END)) {
                if (level.getRandom().nextFloat() > 0.3333f) {
                    cir.setReturnValue(null);
                }
            }
        }
    }
}
