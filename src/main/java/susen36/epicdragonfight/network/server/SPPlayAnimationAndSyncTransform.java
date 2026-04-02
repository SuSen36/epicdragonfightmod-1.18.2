package susen36.epicdragonfight.network.server;

import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;

public class SPPlayAnimationAndSyncTransform extends SPPlayAnimationAndSetTarget {
	protected double posX;
	protected double posY;
	protected double posZ;
	protected float yRot;

	public SPPlayAnimationAndSyncTransform(int namespaceId, int animation, int entityId, float modifyTime, int targetId, double posX, double posY, double posZ, float yRot) {
		super(namespaceId, animation, entityId, modifyTime, targetId);
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.yRot = yRot;
	}

	@Override
	public void onArrive() {
		super.onArrive();
		Minecraft mc = Minecraft.getInstance();
		if (mc.level == null) return;
		Entity entity = mc.level.getEntity(this.entityId);
		if (entity != null) {
			entity.setPos(this.posX, this.posY, this.posZ);
			entity.xo = this.posX;
			entity.yo = this.posY;
			entity.zo = this.posZ;
			entity.xOld = this.posX;
			entity.yOld = this.posY;
			entity.zOld = this.posZ;
			entity.setYRot(this.yRot);
			entity.yRotO = this.yRot;
		}
	}
	
	public static SPPlayAnimationAndSyncTransform fromBytes(FriendlyByteBuf buf) {
		return new SPPlayAnimationAndSyncTransform(buf.readInt(), buf.readInt(), buf.readInt(), buf.readFloat(), buf.readInt(), buf.readDouble(), buf.readDouble(), buf.readDouble(), buf.readFloat());
	}
	
	public static void toBytes(SPPlayAnimationAndSyncTransform msg, FriendlyByteBuf buf) {
		buf.writeInt(msg.namespaceId);
		buf.writeInt(msg.animationId);
		buf.writeInt(msg.entityId);
		buf.writeFloat(msg.convertTimeModifier);
		buf.writeInt(msg.targetId);
		buf.writeDouble(msg.posX);
		buf.writeDouble(msg.posY);
		buf.writeDouble(msg.posZ);
		buf.writeFloat(msg.yRot);
	}
}