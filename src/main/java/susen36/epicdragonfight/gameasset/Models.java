package susen36.epicdragonfight.gameasset;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.client.model.ClientModel;
import susen36.epicdragonfight.api.model.Model;

import java.util.List;
import java.util.Map;

public abstract class Models<T extends Model> {
	public static final ServerModels LOGICAL_SERVER = new ServerModels();
	
	private static ClientModels clientModels;

	@OnlyIn(Dist.CLIENT)
	public static ClientModels getClientModels() {
		if (clientModels == null) {
			clientModels = new ClientModels();
		}
		return clientModels;
	}

	protected final Map<ResourceLocation, T> models = Maps.newHashMap();

	public T dragon;

	public static class ServerModels extends Models<Model> {
		public ServerModels() {
			this.dragon = register(new ResourceLocation(EpicDragonFight.MODID, "dragon"));
		}
		
		@Override
		public Model register(ResourceLocation rl) {
			Model model = new Model(rl);
			this.models.put(rl, model);
			return model;
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class ClientModels extends Models<ClientModel> {
		public final List<ClientModel> registeredModels = Lists.newArrayList();

		public ClientModels() {
			this.dragon = this.register(new ResourceLocation(EpicDragonFight.MODID, "dragon"));
		}

		public void loadMeshData(ResourceManager resourceManager) {
			this.registeredModels.forEach((model) -> {
				model.loadMeshAndProperties(resourceManager);
			});
		}
		
		public void copyArmaturesFromServer() {
			this.dragon.setArmature(LOGICAL_SERVER.dragon.getArmature());
		}
		
		@Override
		public ClientModel register(ResourceLocation rl) {
			ClientModel model = new ClientModel(rl);
			this.models.put(rl, model);
			this.registeredModels.add(model);
			return model;
		}
	}
	
	public abstract T register(ResourceLocation rl);
	
	public T get(ResourceLocation location) {
		return this.models.get(location);
	}
	
	public void loadArmatures(ResourceManager resourceManager) {
		this.dragon.loadArmatureData(resourceManager);
	}
}