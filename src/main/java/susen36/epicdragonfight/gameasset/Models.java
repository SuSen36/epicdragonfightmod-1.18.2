package susen36.epicdragonfight.gameasset;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.client.model.ClientModel;
import susen36.epicdragonfight.api.model.Model;

public class Models {
	public static final Model SERVER_DRAGON = new Model(new ResourceLocation(EpicDragonFight.MODID, "dragon"));

	@OnlyIn(Dist.CLIENT)
	private static ClientModel clientDragon;

	@OnlyIn(Dist.CLIENT)
	public static ClientModel getClientDragon() {
		if (clientDragon == null) {
			clientDragon = new ClientModel(new ResourceLocation(EpicDragonFight.MODID, "dragon"));
		}
		return clientDragon;
	}

	public static void loadArmatures() {
		SERVER_DRAGON.loadArmatureData();
	}

	@OnlyIn(Dist.CLIENT)
	public static void loadMeshData() {
		getClientDragon().loadMeshAndProperties();
	}

	@OnlyIn(Dist.CLIENT)
	public static void copyArmaturesFromServer() {
		getClientDragon().setArmature(SERVER_DRAGON.getArmature());
	}
}