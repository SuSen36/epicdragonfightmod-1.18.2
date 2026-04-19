package susen36.epicdragonfight.api.client.animation;

import com.mojang.datafixers.util.Pair;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.Joint;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.animation.types.DynamicAnimation;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class JointMask {
	@OnlyIn(Dist.CLIENT)
	@FunctionalInterface
	public static interface BindModifier {
		public void modify(ClientAnimator clientAnimator, Pose resultPose, Layer.Priority priority, Joint joint, Map<Layer.Priority, Pair<DynamicAnimation, Pose>> poses);
	}

	public static JointMask of(String jointName, BindModifier bindModifier) {
		return new JointMask(jointName, bindModifier);
	}
	
	public static JointMask of(String jointName) {
		return new JointMask(jointName, null);
	}
	
	private final String jointName;
	private final BindModifier bindModifier;
	
	private JointMask(String jointName, BindModifier bindModifier) {
		this.jointName = jointName;
		this.bindModifier = bindModifier;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof JointMask) {
			return ((JointMask)object).jointName.equals(this.jointName);
		}
		
		return super.equals(object);
	}
	
	public BindModifier getBindModifier() {
		return this.bindModifier;
	}
}