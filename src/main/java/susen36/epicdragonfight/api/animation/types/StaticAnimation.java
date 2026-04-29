
package susen36.epicdragonfight.api.animation.types;

import com.google.common.collect.Maps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.AnimationManager;
import susen36.epicdragonfight.api.animation.AnimationPlayer;
import susen36.epicdragonfight.api.animation.property.AnimationProperty;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.StaticAnimationProperty;
import susen36.epicdragonfight.api.client.animation.ClientAnimationProperties;
import susen36.epicdragonfight.api.client.animation.JointMask.BindModifier;
import susen36.epicdragonfight.api.client.animation.Layer;
import susen36.epicdragonfight.api.client.animation.Layer.LayerType;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.DragonAnimationData;

import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StaticAnimation extends DynamicAnimation {
	protected final Map<AnimationProperty<?>, Object> properties = Maps.newHashMap();
	protected final StateSpectrum.Blueprint stateSpectrumBlueprint = new StateSpectrum.Blueprint();
	protected final ResourceLocation resourceLocation;
	protected final Model model;
	protected final int namespaceId;
	protected final int animationId;
	
	private final StateSpectrum stateSpectrum = new StateSpectrum();
	
	public StaticAnimation() {
		super(0.0F, false);
		this.namespaceId = -1;
		this.animationId = -1;
		this.resourceLocation = null;
		this.model = null;
	}
	
	public StaticAnimation(boolean repeatPlay, String name, Model model) {
		this(0.15F, repeatPlay, name, model);
	}

	public StaticAnimation(float convertTime, boolean isRepeat, String name, Model model) {
		super(convertTime, isRepeat);

		AnimationManager animationManager = EpicDragonFight.getInstance().animationManager;
		this.namespaceId = animationManager.getNamespaceHash();
		this.animationId = animationManager.getIdCounter();

		animationManager.getIdMap().put(this.animationId, this);
		this.resourceLocation = new ResourceLocation(animationManager.getModid(), "animmodels/animations/" + name);
		this.model = model;
	}

	public StaticAnimation(float convertTime, boolean repeatPlay, String name, Model model, boolean notRegisteredInAnimationManager) {
		super(convertTime, repeatPlay);
		this.namespaceId = -1;
		this.animationId = -1;
		this.resourceLocation = new ResourceLocation(EpicDragonFight.getInstance().animationManager.getModid(), "animmodels/animations/" + name);
		this.model = model;
	}
	
	public void loadAnimation(ResourceManager resourceManager) {
		String animPath = this.resourceLocation.getPath();
		String animName = animPath.substring(animPath.lastIndexOf('/') + 1);
		DragonAnimationData.loadByName(animName, this);
		this.onLoaded();
	}
	
	protected void onLoaded() {
		this.stateSpectrum.readFrom(this.stateSpectrumBlueprint);
	}
	
	@Override
	public void begin(IDragonPatch entitypatch) {
		this.getProperty(StaticAnimationProperty.EVENTS).ifPresent((events) -> {
			for (Event event : events) {
				if (event.time == Event.ON_BEGIN) {
					event.testAndExecute(entitypatch);
				}
			}
		});
	}
	
	@Override
	public void end(IDragonPatch entitypatch, boolean isEnd) {
		this.getProperty(StaticAnimationProperty.EVENTS).ifPresent((events) -> {
			for (Event event : events) {
				if (event.time == Event.ON_END) {
					event.testAndExecute(entitypatch);
				}
			}
		});
	}
	
	@Override
	public void tick(IDragonPatch entitypatch) {
		this.getProperty(StaticAnimationProperty.EVENTS).ifPresent((events) -> {
			AnimationPlayer player = entitypatch.getAnimator().getPlayerFor(this);
			
			if (player != null) {
				float prevElapsed = player.getPrevElapsedTime();
				float elapsed = player.getElapsedTime();
				
				for (Event event : events) {
					if (event.time != Event.ON_BEGIN && event.time != Event.ON_END) {
						if (event.time < prevElapsed || event.time >= elapsed) {
							continue;
						} else {
							event.testAndExecute(entitypatch);
						}
					}
				}
			}
		});
	}
	
	@Override
	public final EntityState getState(float time) {
		return this.stateSpectrum.bindStates(time);
	}
	
	@Override
	public boolean isJointEnabled(IDragonPatch entitypatch, String joint) {
		return super.isJointEnabled(entitypatch, joint);
	}

	@Override
	public BindModifier getBindModifier(IDragonPatch entitypatch, String joint) {
		return null;
	}
	
	@Override
	public int getNamespaceId() {
		return this.namespaceId;
	}
	
	@Override
	public int getId() {
		return this.animationId;
	}
	
	public ResourceLocation getLocation() {
		return this.resourceLocation;
	}
	
	public Model getModel() {
		return this.model;
	}
	
	@Override
	public float getPlaySpeed(IDragonPatch entitypatch) {
		return this.getProperty(StaticAnimationProperty.PLAY_SPEED).orElse(1.0F);
	}
	
	@Override
	public String toString() {
		String classPath = this.getClass().toString();
		return classPath.substring(classPath.lastIndexOf(".") + 1) + " " + this.getLocation();
	}
	
	public <V> StaticAnimation addProperty(StaticAnimationProperty<V> propertyType, V value) {
		this.properties.put(propertyType, value);
		return this;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V> Optional<V> getProperty(AnimationProperty<V> propertyType) {
		return (Optional<V>) Optional.ofNullable(this.properties.get(propertyType));
	}
	
	@OnlyIn(Dist.CLIENT)
	public Layer.Priority getPriority() {
		return this.getProperty(ClientAnimationProperties.PRIORITY).orElse(Layer.Priority.LOWEST);
	}
	
	@OnlyIn(Dist.CLIENT)
	public LayerType getLayerType() {
		return this.getProperty(ClientAnimationProperties.LAYER_TYPE).orElse(LayerType.BASE_LAYER);
	}
	
	public static class Event implements Comparable<Event> {
		public static final float ON_BEGIN = Float.MIN_VALUE;
		public static final float ON_END = Float.MAX_VALUE;
		final float time;
		final Side executionSide;
		final Consumer<IDragonPatch> event;
		
		private Event(float time, Side executionSide, Consumer<IDragonPatch> event) {
			this.time = time;
			this.executionSide = executionSide;
			this.event = event;
		}
		
		@Override
		public int compareTo(Event arg0) {
			if(this.time == arg0.time) {
				return 0;
			} else {
				return this.time > arg0.time ? 1 : -1;
			}
		}
		
		public void testAndExecute(IDragonPatch entitypatch) {
			if (this.executionSide.predicate.test(entitypatch.isLogicalClient())) {
				this.event.accept(entitypatch);
			}
		}
		
		public static Event create(float time, Consumer<IDragonPatch> event, Side isRemote) {
			return new Event(time, isRemote, event);
		}
		
		public enum Side {
			CLIENT((isLogicalClient) -> isLogicalClient), SERVER((isLogicalClient) -> !isLogicalClient), BOTH((isLogicalClient) -> true);
			
			Predicate<Boolean> predicate;
			
			Side(Predicate<Boolean> predicate) {
				this.predicate = predicate;
			}
		}
	}
}