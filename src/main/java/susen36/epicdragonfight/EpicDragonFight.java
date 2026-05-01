package susen36.epicdragonfight;

import com.google.common.collect.Maps;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Animations;
import susen36.epicdragonfight.network.DragoFightNetworkManager;

import java.util.Map;

@Mod(EpicDragonFight.MODID)
public class EpicDragonFight {
	public static final String MODID = "epicdragonfight";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	private static EpicDragonFight instance;

	private static final Map<Integer, StaticAnimation> animationById = Maps.newHashMap();
	private static int counter = 0;
	public static final Model MODEL = new Model();

	public static EpicDragonFight getInstance() {
		return instance;
	}

    public EpicDragonFight() {
    	instance = this;
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::doClientStuff);
		bus.addListener(this::doCommonStuff);
     }
    
	private void doClientStuff(final FMLClientSetupEvent event) {
		MODEL.loadMeshAndProperties();
    }

	private void doCommonStuff(final FMLCommonSetupEvent event) {
		MODEL.loadArmatureData();
		event.enqueueWork(EpicDragonFight::loadAnimationsInit);
		event.enqueueWork(DragoFightNetworkManager::registerPackets);
	}

	static void loadAnimationsInit() {
		animationById.clear();
		counter = 0;
		Animations.build();
		animationById.values().forEach(StaticAnimation::loadAnimation);
	}

	public static StaticAnimation findAnimationById(int animationId) {
		if (animationById.containsKey(animationId)) {
			return animationById.get(animationId);
		}
		throw new IllegalArgumentException("Unable to find animation. id: " + animationId);
	}

	public static int getIdCounter() {
		return counter++;
	}

	public static Map<Integer, StaticAnimation> getIdMap() {
		return animationById;
	}
	
	public static Animator getAnimator(IDragonPatch entitypatch) {
		return Animator.getAnimator(entitypatch);
	}
	
	public static boolean isPhysicalClient() {
    	return FMLEnvironment.dist == Dist.CLIENT;
    }
}