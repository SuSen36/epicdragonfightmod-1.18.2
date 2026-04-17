package susen36.epicdragonfight.mixin;

import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import susen36.epicdragonfight.api.animation.LivingMotions;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.client.animation.ClientAnimator;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

import java.util.Map;

@Mixin(EnderDragon.class)
public abstract class MixinEnderDragonClient implements IDragonPatch {

	@OnlyIn(Dist.CLIENT)
	@Override
	public void initAnimator(ClientAnimator clientAnimator) {
		for (Map.Entry<LivingMotions, StaticAnimation> entry : this.getLivingMotions().entrySet()) {
			clientAnimator.addLivingAnimation(entry.getKey(), entry.getValue());
		}
		clientAnimator.setCurrentMotionsAsDefault();
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public ClientAnimator getClientAnimator() {
		return this.getAnimator();
	}
}
