package susen36.epicdragonfight.api.client.animation;

import com.google.common.collect.Maps;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.apache.commons.lang3.tuple.Pair;
import susen36.epicdragonfight.api.animation.LivingMotions;

import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class JointMaskEntry {
	private final Map<LivingMotions, List<JointMask>> masks = Maps.newHashMap();
	private final List<JointMask> defaultMask;
	
	public JointMaskEntry(List<JointMask> defaultMask, List<Pair<LivingMotions, List<JointMask>>> masks) {
		this.defaultMask = defaultMask;
		
		for (Pair<LivingMotions, List<JointMask>> mask : masks) {
			this.masks.put(mask.getLeft(), mask.getRight());
		}
	}
	
	public List<JointMask> getMask(LivingMotions livingmotion) {
		return this.masks.getOrDefault(livingmotion, this.defaultMask);
	}
	
	public boolean isMasked(LivingMotions livingmotion, String jointName) {
		List<JointMask> masks = this.masks.getOrDefault(livingmotion, this.defaultMask);
		
		for (JointMask mask : masks) {
			if (mask.equals(JointMask.of(jointName))) {
				return false;
			}
		}
		
		return true;
	}
}

