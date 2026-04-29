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
	private String modid;
	private int namespaceHash;
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
		this.modid = EpicDragonFight.MODID;
		this.namespaceHash = this.modid.hashCode();
		this.animationById.put(this.namespaceHash, Maps.newHashMap());
		this.counter = 0;
		Animations.build();
	}

	public void loadAnimationsInit(ResourceManager resourceManager) {
		this.animationById.values().forEach((map) -> {
			map.values().forEach((animation) -> {
				animation.loadAnimation(resourceManager);
			});
		});
	}

	@Override
	protected Map<Integer, Map<Integer, StaticAnimation>> prepare(ResourceManager resourceManager, ProfilerFiller profilerIn) {
		return this.animationById;
	}

	@Override
	protected void apply(Map<Integer, Map<Integer, StaticAnimation>> objectIn, ResourceManager resourceManager, ProfilerFiller profilerIn) {
		objectIn.values().forEach((map) -> {
			map.values().forEach((animation) -> {
				animation.loadAnimation(resourceManager);
			});
		});
	}

	public String getModid() {
		return this.modid;
	}

	public int getNamespaceHash() {
		return this.namespaceHash;
	}

	public int getIdCounter() {
		return this.counter++;
	}

	public Map<Integer, StaticAnimation> getIdMap() {
		return this.animationById.get(this.namespaceHash);
	}

	public Map<ResourceLocation, StaticAnimation> getNameMap() {
		return this.animationByName;
	}
}