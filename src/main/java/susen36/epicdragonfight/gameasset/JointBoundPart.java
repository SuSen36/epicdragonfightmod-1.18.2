package susen36.epicdragonfight.gameasset;

import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.entity.PartEntity;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.MathUtils;
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
			Vec3 worldPos = this.getJointWorldPosition(dragonPatch, armature);
			if (worldPos != null) {
				this.part.xo = this.part.getX();
				this.part.yo = this.part.getY();
				this.part.zo = this.part.getZ();
				this.part.setPos(worldPos.x, worldPos.y - this.part.getBbHeight() * 0.5F, worldPos.z);
			}
		}
	}

	public Vec3 getJointWorldPosition(IDragonPatch dragonPatch, Armature armature) {
		float partialTicks = EpicDragonFight.isPhysicalClient() ? Minecraft.getInstance().getFrameTime() : 1.0F;
		Pose pose = dragonPatch.getAnimator().getPose(partialTicks);
		OpenMatrix4f jointTransform = Animator.getBindedJointTransformByIndex(pose, armature, this.pathIndex);

		OpenMatrix4f modelMatrix;
		EnderDragon dragon = dragonPatch.getOriginal();

		if (!dragonPatch.isGroundPhase() || dragon.dragonDeathTime > 0) {
			float f = (float)dragon.getLatencyPos(7, partialTicks)[0];
			float f1 = (float)(dragon.getLatencyPos(5, partialTicks)[1] - dragon.getLatencyPos(10, partialTicks)[1]);
			float f2 = dragon.dragonDeathTime > 0 ? 0.0F : Mth.rotWrap((float)(dragon.getLatencyPos(5, partialTicks)[0] - dragon.getLatencyPos(10, partialTicks)[0]));
			modelMatrix = MathUtils.getModelMatrixIntegral(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f1, f1, f, f, partialTicks, 1.0F, 1.0F, 1.0F).rotateDeg(-f2 * 1.5F, Vector3f.ZP).scale(-1.0F, 1.0F, -1.0F);
		} else {
			modelMatrix = dragonPatch.getModelMatrix(partialTicks);
		}

		OpenMatrix4f worldTransform = OpenMatrix4f.mul(modelMatrix, jointTransform, null);
		Vector3f jointPos = worldTransform.toTranslationVector();

		float worldX = -jointPos.x();
		float worldY = jointPos.y();
		float worldZ = -jointPos.z();

		return new Vec3(
			dragon.getX() + worldX + this.offset.x(),
			dragon.getY() + worldY + this.offset.y(),
			dragon.getZ() + worldZ + this.offset.z()
		);
	}
}