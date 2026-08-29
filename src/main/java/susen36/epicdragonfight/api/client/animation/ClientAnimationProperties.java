package susen36.epicdragonfight.api.client.animation;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.types.property.AnimationProperty.StaticAnimationProperty;

@OnlyIn(Dist.CLIENT)
public class ClientAnimationProperties {
	public static final StaticAnimationProperty<Layer.LayerType> LAYER_TYPE = new StaticAnimationProperty<>();
	public static final StaticAnimationProperty<Layer.Priority> PRIORITY = new StaticAnimationProperty<>();
}