package susen36.epicdragonfight;

import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.resources.ReloadableResourceManager;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import susen36.epicdragonfight.api.animation.AnimationManager;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.ServerAnimator;
import susen36.epicdragonfight.api.client.animation.ClientAnimator;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Models;
import susen36.epicdragonfight.network.DragoFightNetworkManager;
import susen36.epicdragonfight.network.DragonFightDataSerializers;

import java.util.function.Function;

@Mod(EpicDragonFight.MODID)
public class EpicDragonFight {
	public static final String MODID = "epicdragonfight";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	private static EpicDragonFight instance;
	
	public static EpicDragonFight getInstance() {
		return instance;
	}
	
	public final AnimationManager animationManager;
	private Function<IDragonPatch, Animator> animatorProvider;
	
    public EpicDragonFight() {
    	this.animationManager = new AnimationManager();
    	instance = this;
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::doClientStuff);
    	bus.addListener(this::doCommonStuff);
    	bus.addListener(this::doServerStuff);
		DragonFightDataSerializers.VEC.register(bus);
     }
    
	private void doClientStuff(final FMLClientSetupEvent event) {
		this.animatorProvider = ClientAnimator::getAnimator;
		ResourceManager resourceManager = Minecraft.getInstance().getResourceManager();
		Models.loadArmatures(resourceManager);
		Models.loadMeshData(resourceManager);
		Models.copyArmaturesFromServer();
		this.animationManager.loadAnimationsInit(resourceManager);
        ((ReloadableResourceManager)resourceManager).registerReloadListener(this.animationManager);
    }
	
	private void doServerStuff(final FMLDedicatedServerSetupEvent event) {
		Models.loadArmatures(null);
		this.animationManager.loadAnimationsInit(null);
		this.animatorProvider = ServerAnimator::getAnimator;
	}
	
	private void doCommonStuff(final FMLCommonSetupEvent event) {
		event.enqueueWork(this.animationManager::registerAnimations);
		event.enqueueWork(DragoFightNetworkManager::registerPackets);
    }
	
	public static Animator getAnimator(IDragonPatch entitypatch) {
		return EpicDragonFight.getInstance().animatorProvider.apply(entitypatch);
	}
	
	public static boolean isPhysicalClient() {
    	return FMLEnvironment.dist == Dist.CLIENT;
    }
}