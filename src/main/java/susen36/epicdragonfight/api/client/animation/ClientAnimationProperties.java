package susen36.epicdragonfight.api.client.animation;

import susen36.epicdragonfight.api.animation.Layer;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.StaticAnimationProperty;

public class ClientAnimationProperties {
	public static final StaticAnimationProperty<Layer.LayerType> LAYER_TYPE = new StaticAnimationProperty<Layer.LayerType> ();
	public static final StaticAnimationProperty<Layer.Priority> PRIORITY = new StaticAnimationProperty<Layer.Priority> ();
}