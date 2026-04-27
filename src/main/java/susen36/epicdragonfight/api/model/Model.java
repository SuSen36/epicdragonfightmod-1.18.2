package susen36.epicdragonfight.api.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import susen36.epicdragonfight.gameasset.DragonModelData;

public class Model {
	protected final ResourceLocation location;
	protected Armature armature;
	
	public Model(ResourceLocation location) {
		this.location = new ResourceLocation(location.getNamespace(), "animmodels/" + location.getPath() + ".json");
	}
	
	public void loadArmatureData(ResourceManager resourceManager) {
		this.armature = DragonModelData.createArmature();
	}
	
	public void setArmature(Armature armature) {
		this.armature = armature;
	}
	
	public ResourceLocation getLocation() {
		return this.location;
	}
	
	public Armature getArmature() {
		return this.armature;
	}
}