package susen36.epicdragonfight.gameasset;

import com.mojang.math.Vector3f;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.entity.PartEntity;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class JointBoundPart {
	public final PartEntity<?> part;
	public final String jointName;
	public final Vector3f offset;

	private long pathIndex = -1;

	public JointBoundPart(PartEntity<?> part, String jointName) {
		this(part,jointName,Vector3f.ZERO);
	}

	public JointBoundPart(PartEntity<?> part, String jointName, Vector3f offset) {
		this.part = part;
		this.jointName = jointName;
		this.offset = offset;
	}

	public void tick(IDragonPatch dragonPatch) {
		if (dragonPatch.getAnimator() == null) {
			return;
		}

		Armature armature = dragonPatch.getEntityModel(Models.LOGICAL_SERVER).getArmature();

		if (this.pathIndex == -1) {
			this.pathIndex = armature.searchPathIndex(this.jointName);
		}else if (this.pathIndex != -1) {
			Vec3 worldPos = this.getJointWorldPosition(dragonPatch, armature, 1.0F);
			if (worldPos != null) {
				this.part.setPos(worldPos.x, worldPos.y - this.part.getBbHeight() * 0.5F, worldPos.z);
			}
		}
	}

	public Vec3 getJointWorldPosition(IDragonPatch dragonPatch, Armature armature, float partialTicks) {
		Pose pose = dragonPatch.getAnimator().getPose(partialTicks);
		OpenMatrix4f jointTransform = Animator.getBindedJointTransformByIndex(pose, armature, this.pathIndex);

		OpenMatrix4f modelMatrix = dragonPatch.getModelMatrix(partialTicks);
		OpenMatrix4f worldTransform = OpenMatrix4f.mul(modelMatrix, jointTransform, null);

		Vector3f jointPos = worldTransform.toTranslationVector();

		float worldX = -jointPos.x();
		float worldY = jointPos.y();
		float worldZ = -jointPos.z();

		EnderDragon dragon = dragonPatch.getOriginal();
		return new Vec3(
			dragon.getX() + worldX + this.offset.x(),
			dragon.getY() + worldY + this.offset.y(),
			dragon.getZ() + worldZ + this.offset.z()
		);
	}
}