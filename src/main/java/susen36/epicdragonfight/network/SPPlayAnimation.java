package susen36.epicdragonfight.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.NetworkEvent;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

import java.util.function.Supplier;

public class SPPlayAnimation {
	protected int animationId;
	protected int entityId;
	protected float convertTimeModifier;

	public SPPlayAnimation(StaticAnimation animation, float convertTimeModifier, IDragonPatch entitypatch) {
		this(animation.getId(), entitypatch.getOriginal().getId(), convertTimeModifier);
	}

	public SPPlayAnimation(int animationId, int entityId, float convertTimeModifier) {
		this.animationId = animationId;
		this.entityId = entityId;
		this.convertTimeModifier = convertTimeModifier;
	}

	public void onArrive() {
		Minecraft mc = Minecraft.getInstance();

        Entity entity = null;
        if (mc.player != null) {
            entity = mc.player.level.getEntity(this.entityId);
        }

        if (entity == null) {
			return;
		}

		if (entity instanceof IDragonPatch entitypatch) {
			entitypatch.getAnimator().playAnimation(this.animationId, this.convertTimeModifier);
		}
	}

	public static SPPlayAnimation fromBytes(FriendlyByteBuf buf) {
		return new SPPlayAnimation(buf.readInt(), buf.readInt(), buf.readFloat());
	}

	public static void toBytes(SPPlayAnimation msg, ByteBuf buf) {
		buf.writeInt(msg.animationId);
		buf.writeInt(msg.entityId);
		buf.writeFloat(msg.convertTimeModifier);
	}

	public static void handle(SPPlayAnimation msg, Supplier<NetworkEvent.Context> ctx) {
		ctx.get().enqueueWork(msg::onArrive);
		ctx.get().setPacketHandled(true);
	}
}