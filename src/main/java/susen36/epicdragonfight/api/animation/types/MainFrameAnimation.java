package susen36.epicdragonfight.api.animation.types;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.client.animation.ClientAnimationProperties;
import susen36.epicdragonfight.api.client.animation.Layer;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class MainFrameAnimation extends StaticAnimation {
	public MainFrameAnimation(float convertTime, String name) {
		super(convertTime, false, name);
	}
	
	@Override
	public void begin(IDragonPatch entitypatch) {
		super.begin(entitypatch);
		
		entitypatch.updateEntityState();

        if (entitypatch.getOriginal().level.isClientSide()) {
			entitypatch.getClientAnimator().resetMotion();
			entitypatch.getClientAnimator().resetCompositeMotion();
			entitypatch.getClientAnimator().getPlayerFor(this).setReversed(false);
		}
	}
	
	@Override
	public void tick(IDragonPatch entitypatch) {
		super.tick(entitypatch);
		entitypatch.getOriginal().animationSpeed = 0;
	}
	
	@Override
	public boolean isMainFrameAnimation() {
		return true;
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public Layer.Priority getPriority() {
		return this.getProperty(ClientAnimationProperties.PRIORITY).orElse(Layer.Priority.HIGHEST);
	}
}