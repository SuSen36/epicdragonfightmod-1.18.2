package susen36.epicdragonfight.api.animation.types;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.Layer;
import susen36.epicdragonfight.api.client.animation.ClientAnimationProperties;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class MainFrameAnimation extends StaticAnimation {
	public MainFrameAnimation(float convertTime, String name, Model model) {
		super(convertTime, false, name, model);
	}
	
	@Override
	public void begin(IDragonPatch entitypatch) {
		super.begin(entitypatch);
		
		entitypatch.updateEntityState();
		
		if (entitypatch.isLogicalClient()) {
			entitypatch.getAnimator().resetMotion();
		entitypatch.getAnimator().resetCompositeMotion();
		entitypatch.getAnimator().getPlayerFor(this).setReversed(false);
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