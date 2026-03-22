package susen36.epicdragonfight.api.animation.types.procedural;

import net.minecraft.server.packs.resources.ResourceManager;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.animation.types.LongHitAnimation;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.world.capabilities.entitypatch.MobPatch;

public class EnderDragonDeathAnimation extends LongHitAnimation {
	public EnderDragonDeathAnimation(float convertTime, String path, Model model) {
		super(convertTime, path, model);
	}
	
	@Override
	public void loadAnimation(ResourceManager resourceManager) {
		loadBothSide(resourceManager, this);
		this.onLoaded();
	}
	
	@Override
	protected void modifyPose(Pose pose, MobPatch<?> entitypatch, float time) {
		
	}
}