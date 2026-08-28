package susen36.epicdragonfight.api.animation;

import com.google.common.collect.Maps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.gameasset.Animations;

import java.util.Map;

public class AnimationManager extends SimplePreparableReloadListener<Map<Integer, Map<Integer, StaticAnimation>>> {
	private final Map<Integer, Map<Integer, StaticAnimation>> animationById = Maps.newHashMap();
	private final Map<ResourceLocation, StaticAnimation> animationByName = Maps.newHashMap();
	private int counter = 0;

	public StaticAnimation findAnimationById(int namespaceId, int animationId) {
		if (this.animationById.containsKey(namespaceId)) {
			Map<Integer, StaticAnimation> map = this.animationById.get(namespaceId);
			if (map.containsKey(animationId)) {
				return map.get(animationId);
			}
		}
		throw new IllegalArgumentException("Unable to find animation. id: " + animationId + ", namespcae hash: " + namespaceId);
	}


	public void registerAnimations() {
		this.animationById.put(EpicDragonFight.MODID.hashCode(), Maps.newHashMap());
		this.counter = 0;
		Animations.registerAnimations();
	}

	public void loadAnimationsInit() {
		this.animationById.values().forEach((map) -> {
			map.values().forEach(StaticAnimation::loadAnimation);
		});
	}

	@Override
	protected Map<Integer, Map<Integer, StaticAnimation>> prepare(ResourceManager resourceManager, ProfilerFiller profilerIn) {
		return this.animationById;
	}

	@Override
	protected void apply(Map<Integer, Map<Integer, StaticAnimation>> objectIn, ResourceManager resourceManager, ProfilerFiller profilerIn) {
		objectIn.values().forEach((map) -> {
			map.values().forEach(StaticAnimation::loadAnimation);
		});
	}

	public String getModid() {
		return EpicDragonFight.MODID;
	}

	public int getNamespaceHash() {
		return EpicDragonFight.MODID.hashCode();
	}

	public int getIdCounter() {
		return this.counter++;
	}

	public Map<Integer, StaticAnimation> getIdMap() {
		return this.animationById.get(EpicDragonFight.MODID.hashCode());
	}

	public Map<ResourceLocation, StaticAnimation> getNameMap() {
		return this.animationByName;
	}
}