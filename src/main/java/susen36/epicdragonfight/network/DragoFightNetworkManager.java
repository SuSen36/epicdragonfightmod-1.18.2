package susen36.epicdragonfight.network;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.PacketDistributor.PacketTarget;
import net.minecraftforge.network.simple.SimpleChannel;
import susen36.epicdragonfight.EpicDragonFight;

public class DragoFightNetworkManager {
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(EpicDragonFight.MODID, "network_manager"),
			() -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

	public static <MSG> void sendToClient(MSG message, PacketTarget packetTarget) {
		INSTANCE.send(packetTarget, message);
	}

	public static <MSG> void sendToAllPlayerTrackingThisEntity(MSG message, Entity entity) {
		sendToClient(message, PacketDistributor.TRACKING_ENTITY.with(() -> entity));
	}

	public static void registerPackets() {
		int id = 0;
		INSTANCE.registerMessage(id++, SPPlayAnimation.class, SPPlayAnimation::toBytes, SPPlayAnimation::fromBytes, SPPlayAnimation::handle);
	}
}