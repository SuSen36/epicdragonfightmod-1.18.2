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
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Models;
import susen36.epicdragonfight.network.DragoFightNetworkManager;

@Mod(EpicDragonFight.MODID)
public class EpicDragonFight {
	public static final String MODID = "epicdragonfight";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	private static EpicDragonFight instance;
	
	public static EpicDragonFight getInstance() {
		return instance;
	}
	
	public final AnimationManager animationManager;
	
    public EpicDragonFight() {
    	this.animationManager = new AnimationManager();
    	instance = this;
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::doClientStuff);
    	bus.addListener(this::doCommonStuff);
    	bus.addListener(this::doServerStuff);
     }
    
	private void doClientStuff(final FMLClientSetupEvent event) {
		ResourceManager resourceManager = Minecraft.getInstance().getResourceManager();
		Models.loadArmatures();
		Models.loadMeshData(resourceManager);
		Models.copyArmaturesFromServer();
		this.animationManager.loadAnimationsInit(resourceManager);
        ((ReloadableResourceManager)resourceManager).registerReloadListener(this.animationManager);
    }
	
	private void doServerStuff(final FMLDedicatedServerSetupEvent event) {
		Models.loadArmatures();
		this.animationManager.loadAnimationsInit(null);
	}
	
	private void doCommonStuff(final FMLCommonSetupEvent event) {
		event.enqueueWork(this.animationManager::registerAnimations);
		event.enqueueWork(DragoFightNetworkManager::registerPackets);
    }
	
	public static Animator getAnimator(IDragonPatch entitypatch) {
		return Animator.getAnimator(entitypatch);
	}
	
	public static boolean isPhysicalClient() {
    	return FMLEnvironment.dist == Dist.CLIENT;
    }
}
