package susen36.epicdragonfight.api.animation.types;

import susen36.epicdragonfight.api.animation.AnimationPlayer;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class DynamicAnimation {
	protected Map<String, TransformSheet> jointTransforms;
	protected final boolean isRepeat;
	protected final float convertTime;
	protected float totalTime = 0.0F;

	public DynamicAnimation(float convertTime, boolean isRepeat) {
		this.jointTransforms = new HashMap<>();
		this.isRepeat = isRepeat;
		this.convertTime = convertTime;
	}
	
	public void addSheet(String jointName, TransformSheet sheet) {
		this.jointTransforms.put(jointName, sheet);
	}

	public void putOnPlayer(AnimationPlayer player) {
		player.setPlayAnimation(this);
	}
	
	public void begin(IDragonPatch entitypatch) {}
	public void tick(IDragonPatch entitypatch) {}
	public void end(IDragonPatch entitypatch, boolean isEnd) {}

	public EntityState getState(float time) {
		return EntityState.DEFAULT;
	}
	
	public Map<String, TransformSheet> getTransfroms() {
		return this.jointTransforms;
	}
	
	public float getPlaySpeed(IDragonPatch entitypatch) {
		return 1.0F;
	}
	
	public DynamicAnimation getRealAnimation() {
		return this;
	}
	
	public void setTotalTime(float totalTime) {
		this.totalTime = totalTime;
	}
	
	public float getTotalTime() {
		return this.totalTime - 0.001F;
	}
	
	public float getConvertTime() {
		return this.convertTime;
	}
	
	public boolean isRepeat() {
		return this.isRepeat;
	}
	
	public boolean canBePlayedReverse() {
		return false;
	}
	
	public int getNamespaceId() {
		return -1;
	}
	
	public int getId() {
		return -1;
	}
	
	public <V> Optional<V> getProperty(AnimationProperty<V> propertyType) {
		return Optional.empty();
	}
}