package susen36.epicdragonfight.api.model;

import susen36.epicdragonfight.gameasset.DragonModelData;

public class Model {
	protected Armature armature;

	public void loadArmatureData() {
		this.armature = DragonModelData.createArmature();
	}

	public void setArmature(Armature armature) {
		this.armature = armature;
	}

	public Armature getArmature() {
		return this.armature;
	}
}