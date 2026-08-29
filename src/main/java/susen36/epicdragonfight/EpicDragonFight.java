package susen36.epicdragonfight;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EpicDragonFight.MODID)
public class EpicDragonFight {
	public static final String MODID = "epicdragonfight";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
    public EpicDragonFight() {
	}
	
	public static boolean isPhysicalClient() {
    	return FMLEnvironment.dist == Dist.CLIENT;
    }
}