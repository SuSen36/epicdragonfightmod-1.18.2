package susen36.epicdragonfight.api.client.animation;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.apache.commons.lang3.tuple.Pair;
import susen36.epicdragonfight.api.animation.LivingMotion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class JointMaskEntry {
	public static final List<JointMask> WINGS = new ArrayList<> (Arrays.asList(JointMask.of("left_wing"), JointMask.of("right_wing")));
	
	private final Map<LivingMotion, List<JointMask>> masks = Maps.newHashMap();
	private final List<JointMask> defaultMask;
	
	public JointMaskEntry(List<JointMask> defaultMask, List<Pair<LivingMotion, List<JointMask>>> masks) {
		this.defaultMask = defaultMask;
		
		for (Pair<LivingMotion, List<JointMask>> mask : masks) {
			this.masks.put(mask.getLeft(), mask.getRight());
		}
	}
	
	public List<JointMask> getMask(LivingMotion livingmotion) {
		return this.masks.getOrDefault(livingmotion, this.defaultMask);
	}
	
	public boolean isMasked(LivingMotion livingmotion, String jointName) {
		List<JointMask> masks = this.masks.getOrDefault(livingmotion, this.defaultMask);
		
		for (JointMask mask : masks) {
			if (mask.equals(JointMask.of(jointName))) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isValid() {
		return this.defaultMask != null;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private List<Pair<LivingMotion, List<JointMask>>> masks = Lists.newArrayList();
		private List<JointMask> defaultMask = null;
		
		public Builder mask(LivingMotion motion, List<JointMask> masks) {
			this.masks.add(Pair.of(motion, masks));
			return this;
		}
		
		public Builder defaultMask(List<JointMask> masks) {
			this.defaultMask = masks;
			return this;
		}
		
		public JointMaskEntry create() {
			return new JointMaskEntry(this.defaultMask, this.masks);
		}
	}
}

