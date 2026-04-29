package susen36.epicdragonfight.api.animation.types.procedural;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.JointTransform;
import susen36.epicdragonfight.api.animation.Keyframe;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.ActionAnimation;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.client.renderer.DragonFightRenderTypes;
import susen36.epicdragonfight.client.renderer.RenderingTool;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.DragonAnimationData;

import java.util.Map;

public class EnderDragonDynamicActionAnimation extends ActionAnimation implements ProceduralAnimation {
	private final IKInfo[] ikInfos;
	private Map<String, TransformSheet> tipPointTransform;
	
	public EnderDragonDynamicActionAnimation(float convertTime, String name, Model model, IKInfo[] ikInfos) {
		super(convertTime, name, model);
		this.ikInfos = ikInfos;
	}
	
	@Override
	public void loadAnimation() {
		DragonAnimationData.loadByName(this.name, this);
		this.tipPointTransform = Maps.newHashMap();
		this.setIKInfo(this.ikInfos, this.getTransfroms(), this.tipPointTransform, this.getModel().getArmature(), true, true);
		this.onLoaded();
	}
	
	@Override
	public Pose getPoseByTime(IDragonPatch enderdragonpatch, float time, float partialTicks) {
		Pose pose = super.getPoseByTime(enderdragonpatch, time, partialTicks);

		float x = (float)enderdragonpatch.getOriginal().getX();
		float y = (float)enderdragonpatch.getOriginal().getY();
		float z = (float)enderdragonpatch.getOriginal().getZ();
		float xo = (float)enderdragonpatch.getOriginal().xo;
		float yo = (float)enderdragonpatch.getOriginal().yo;
		float zo = (float)enderdragonpatch.getOriginal().zo;
		OpenMatrix4f toModelPos = OpenMatrix4f.mul(OpenMatrix4f.translate(new Vector3f(xo + (x - xo) * partialTicks, yo + (y - yo) * partialTicks, zo + (z - zo) * partialTicks), new OpenMatrix4f(), null), enderdragonpatch.getModelMatrix(partialTicks), null).invert();
		this.correctRootRotation(pose.getJointTransformData().get("root"), enderdragonpatch, partialTicks);

		for (IKInfo ikInfo : this.ikInfos) {
			TipPointAnimation tipAnim = enderdragonpatch.getTipPointAnimation(ikInfo.endJoint);
			JointTransform jt = tipAnim.getTipTransform(partialTicks);
			Vector3f jointModelpos = OpenMatrix4f.transform3v(toModelPos, jt.translation(), null);
			Vector3f fabrikPos = jointModelpos.copy();
			fabrikPos.mul(-1.0F, 1.0F, -1.0F);

			this.applyFabrikToJoint(fabrikPos, pose, this.getModel().getArmature(), ikInfo.startJoint, ikInfo.endJoint, jt.rotation());
		}
		return pose;
	}

	@Override
	public void begin(IDragonPatch enderdragonpatch) {
		super.begin(enderdragonpatch);

		Vec3 entitypos = enderdragonpatch.getOriginal().position();
		OpenMatrix4f toWorld = OpenMatrix4f.mul(OpenMatrix4f.createTranslation((float)entitypos.x, (float)entitypos.y, (float)entitypos.z), enderdragonpatch.getModelMatrix(1.0F), null);
		TransformSheet movementAnimation = enderdragonpatch.getAnimator().getPlayerFor(this).getActionAnimationCoord();

		for (IKInfo ikInfo : this.ikInfos) {
			TransformSheet tipAnim = this.clipAnimation(this.tipPointTransform.get(ikInfo.endJoint), ikInfo);
			Keyframe[] keyframes = tipAnim.getKeyframes();
			Vector3f startpos = movementAnimation.getInterpolatedTranslation(0.0F);

			for (int i = 0; i < keyframes.length; i++) {
				Keyframe kf = keyframes[i];
				Vector3f dynamicpos = movementAnimation.getInterpolatedTranslation(kf.time()).copy(); dynamicpos.sub(startpos);
				OpenMatrix4f.transform3v(OpenMatrix4f.createRotatorDeg(-90.0F, Vector3f.XP), dynamicpos, dynamicpos); dynamicpos.mul(-1.0F, 1.0F, -1.0F);
				Vector3f finalTargetpos;

				if (!ikInfo.clipAnimation || ikInfo.touchingGround[i]) {
					Vector3f clipStart = kf.transform().translation().copy(); clipStart.mul(-1.0F, 1.0F, -1.0F); clipStart.add(dynamicpos); clipStart.add(0.0F, 2.5F, 0.0F);
					finalTargetpos = this.getRayCastedTipPosition(clipStart, toWorld, enderdragonpatch, 2.5F, ikInfo.rayLeastHeight);
				} else {
					Vector3f start = kf.transform().translation().copy(); start.mul(-1.0F, 1.0F, -1.0F); start.add(dynamicpos);
					finalTargetpos = OpenMatrix4f.transform3v(toWorld, start, null);
				}

				kf.transform().translation().set(finalTargetpos.x(), finalTargetpos.y(), finalTargetpos.z());
			}

			enderdragonpatch.addTipPointAnimation(ikInfo.endJoint, keyframes[0].transform().translation(), tipAnim, ikInfo);
		}
	}

	@Override
	public void tick(IDragonPatch entitypatch) {
		super.tick(entitypatch);

		float elapsedTime = entitypatch.getAnimator().getPlayerFor(this).getElapsedTime();

		for (IKInfo ikSetter : this.ikInfos) {
			if (ikSetter.clipAnimation) {
				Keyframe[] keyframes = this.getTransfroms().get(ikSetter.endJoint).getKeyframes();
				float startTime = keyframes[ikSetter.startFrame].time();
				float endTime = keyframes[ikSetter.endFrame - 1].time();

				if (startTime <= elapsedTime && elapsedTime < endTime) {
					TipPointAnimation tipAnim = entitypatch.getTipPointAnimation(ikSetter.endJoint);

					if (!tipAnim.isOnWorking()) {
						this.startSimple(ikSetter, tipAnim);
					}
				}
			}
		}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void renderDebugging(PoseStack poseStack, MultiBufferSource buffer, IDragonPatch entitypatch, float playTime, float partialTicks) {
		OpenMatrix4f modelmat = entitypatch.getModelMatrix(partialTicks);
		LivingEntity originalEntity = entitypatch.getOriginal();
		Vec3 entitypos = originalEntity.position();
		float x = (float)entitypos.x;
		float y = (float)entitypos.y;
		float z = (float)entitypos.z;
		float xo = (float)originalEntity.xo;
		float yo = (float)originalEntity.yo;
		float zo = (float)originalEntity.zo;
		OpenMatrix4f toModelPos = OpenMatrix4f.mul(OpenMatrix4f.createTranslation(xo + (x - xo) * partialTicks, yo + (y - yo) * partialTicks, zo + (z - zo) * partialTicks), modelmat, null).invert();

		for (IKInfo ikInfo : this.ikInfos) {
			VertexConsumer vertexBuilder = buffer.getBuffer(DragonFightRenderTypes.debugQuads());
			Vector3f worldtargetpos = entitypatch.getTipPointAnimation(ikInfo.endJoint).getTargetPosition();

			Vector3f modeltargetpos = OpenMatrix4f.transform3v(toModelPos, worldtargetpos, null);
			modeltargetpos.mul(-1.0F, 1.0F, -1.0F);
			RenderingTool.drawQuad(poseStack, vertexBuilder, modeltargetpos, 0.5F, 1.0F, 0.0F, 0.0F);

			Vector3f jointWorldPos = entitypatch.getTipPointAnimation(ikInfo.endJoint).getTipPosition(partialTicks);
			Vector3f jointModelpos = OpenMatrix4f.transform3v(toModelPos, jointWorldPos, null);

			Vector3f jointModelposCopy = jointModelpos.copy();
			jointModelposCopy.mul(-1.0F, 1.0F, -1.0F);
			RenderingTool.drawQuad(poseStack, vertexBuilder, jointModelposCopy, 0.4F, 0.0F, 0.0F, 1.0F);

			Pose pose = new Pose();
			for (String jointName : this.jointTransforms.keySet()) {
				pose.putJointData(jointName, this.jointTransforms.get(jointName).getInterpolatedTransform(playTime));
			}
		}
	}
}
