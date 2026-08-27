package susen36.epicdragonfight;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EpicDragonFight.MODID)
public class EpicDragonFight {
	public static final String MODID = "epicdragonfight";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	private static EpicDragonFight instance;

	private static int counter = 0;

	public static EpicDragonFight getInstance() {
		return instance;
	}

    public EpicDragonFight() {
    	instance = this;
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
     }

	public static boolean isPhysicalClient() {
    	return FMLEnvironment.dist == Dist.CLIENT;
    }
}