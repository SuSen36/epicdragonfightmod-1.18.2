package susen36.epicdragonfight.api.model;

import net.minecraft.resources.ResourceLocation;
import susen36.epicdragonfight.gameasset.DragonModelData;

public class Model {
	protected final ResourceLocation location;
	protected Armature armature;
	
	public Model(ResourceLocation location) {
		this.location = new ResourceLocation(location.getNamespace(), location.getPath());
	}
	
	public void loadArmatureData() {
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