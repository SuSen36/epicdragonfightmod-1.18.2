package susen36.epicdragonfight.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.protocol.game.ClientboundBossEventPacket;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.dimension.end.DragonRespawnAnimation;
import net.minecraft.world.level.dimension.end.EndDragonFight;
import net.minecraft.world.level.levelgen.feature.SpikeFeature;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;
import java.util.UUID;

@Mixin(EndDragonFight.class)
public abstract class MixinEndDragonFight {

    @Mutable
    @Shadow @Final
    private ServerBossEvent dragonEvent;

    @Shadow @Final
    private ServerLevel level;

    @Shadow
    private int crystalsAlive;

    @Shadow protected abstract void updateCrystalCount();

    @Shadow public abstract int getCrystalsAlive();

    @Unique
    private int getTotalCrystals() {
        return SpikeFeature.getSpikesForLevel(this.level).size();
    }

    @Inject(method = "<init>", at = @At("RETURN"))
    private void onInit(CallbackInfo ci) {
        this.dragonEvent = (ServerBossEvent)(new ServerBossEvent(new TranslatableComponent("entity.minecraft.end_crystal").append(": " + getCrystalsAlive() + "/" + getTotalCrystals()), BossEvent.BossBarColor.PINK, BossEvent.BossBarOverlay.PROGRESS)).setPlayBossMusic(false).setCreateWorldFog(false);
        this.updateCrystalCount();
    }

    @Inject(method = "updateDragon", at = @At("HEAD"), cancellable = true)
    private void onUpdateDragon(EnderDragon dragon, CallbackInfo ci) {
        updateCrystalBossBar();
        ci.cancel();
    }

    @ModifyConstant(method = "tick", constant = @Constant(intValue = 100))
    private int epicfight_fasterCrystalScan(int original) {
        return 20;
    }

    @Unique
    private void updateCrystalBossBar() {
        int total = getTotalCrystals();
        int alive = Mth.clamp(this.crystalsAlive, 0, total);
        this.dragonEvent.setProgress((float)alive / total);

        Component name = new TranslatableComponent(
            "entity.minecraft.end_crystal"
        ).append(": " + this.crystalsAlive + "/" + total);
        this.dragonEvent.setName(name);
    }
}
