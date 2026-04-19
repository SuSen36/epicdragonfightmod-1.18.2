package susen36.epicdragonfight.api.animation.types.procedural;

import com.google.common.collect.Maps;
import com.mojang.math.Vector3f;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.phys.Vec3;
import susen36.epicdragonfight.api.animation.JointTransform;
import susen36.epicdragonfight.api.animation.Keyframe;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

import java.util.Map;

public class EnderDragonWalkAnimation extends StaticAnimation implements ProceduralAnimation {
	private final IKInfo[] ikInfos;
	private Map<String, TransformSheet> tipPointTransforms;

	public EnderDragonWalkAnimation(float convertTime, String path, Model model, IKInfo[] ikInfos) {
		super(convertTime, true, path, model);
		this.ikInfos = ikInfos;
	}

	@Override
	public void loadAnimation(ResourceManager resourceManager) {
		loadBothSide(resourceManager, this);
		this.tipPointTransforms = Maps.newHashMap();
		this.setIKInfo(this.ikInfos, this.getTransfroms(), this.tipPointTransforms, this.getModel().getArmature(), false, true);
		this.onLoaded();
	}

	@Override
	public Pose getPoseByTime(IDragonPatch entitypatch, float time, float partialTicks) {
		Pose pose = super.getPoseByTime(entitypatch, time, partialTicks);
		this.correctRootRotation(pose.getJointTransformData().get("root"), entitypatch, partialTicks);
		return pose;
	}

	@Override
	public void begin(IDragonPatch entitypatch) {
		super.begin(entitypatch);

		Vec3 entitypos = entitypatch.getOriginal().position();
		OpenMatrix4f toWorld = OpenMatrix4f.mul(OpenMatrix4f.createTranslation((float) entitypos.x, (float) entitypos.y, (float) entitypos.z), entitypatch.getModelMatrix(1.0F), null);

		for (IKInfo ikInfo : this.ikInfos) {
			TransformSheet tipAnim = this.getFirstPart(this.tipPointTransforms.get(ikInfo.endJoint));
			Keyframe[] keyframes = tipAnim.getKeyframes();
			JointTransform firstposeTransform = keyframes[0].transform();
			Vector3f firstTranslation = firstposeTransform.translation();
			firstTranslation.mul(-1.0F, 1.0F, -1.0F);

			if (!ikInfo.clipAnimation || ikInfo.touchingGround[0]) {
				Vector3f firstTranslationAdded = firstTranslation.copy();
				firstTranslationAdded.add(0.0F, 2.5F, 0.0F);
				Vector3f rayResultPosition = this.getRayCastedTipPosition(firstTranslationAdded, toWorld, entitypatch, 8.0F, ikInfo.rayLeastHeight);
				firstposeTransform.translation().set(rayResultPosition.x, rayResultPosition.y, rayResultPosition.z);
			} else {
				Vector3f transformedFirstTranslation = new Vector3f();
				OpenMatrix4f.transform3v(toWorld, firstTranslation, transformedFirstTranslation);
				firstposeTransform.translation().set(transformedFirstTranslation.x, transformedFirstTranslation.y, transformedFirstTranslation.z);
			}

			for (Keyframe keyframe : keyframes) {
				Vector3f firstposeTranslation = firstposeTransform.translation();
				Vector3f keyframeTranslation = keyframe.transform().translation();
				keyframeTranslation.set(firstposeTranslation.x, firstposeTranslation.y, firstposeTranslation.z);
			}

			entitypatch.addTipPointAnimation(ikInfo.endJoint, firstposeTransform.translation(), tipAnim, ikInfo);
		}
	}

	@Override
	public void tick(IDragonPatch entitypatch) {
		super.tick(entitypatch);

		Vec3 entitypos = entitypatch.getOriginal().position();
		OpenMatrix4f toWorld = OpenMatrix4f.mul(OpenMatrix4f.createTranslation((float) entitypos.x, (float) entitypos.y, (float) entitypos.z), entitypatch.getModelMatrix(1.0F), null);
		float elapsedTime = entitypatch.getAnimator().getPlayerFor(this).getElapsedTime();
		float totalTime = this.getTotalTime();

		for (IKInfo ikInfo : this.ikInfos) {
			if (ikInfo.clipAnimation) {
				Keyframe[] keyframes = this.getTransfroms().get(ikInfo.endJoint).getKeyframes();
				float startTime = keyframes[ikInfo.startFrame].time();
				float endTime = keyframes[ikInfo.endFrame - 1].time();

				float adjustedTime = elapsedTime % totalTime;
				boolean inLiftPhase = adjustedTime >= startTime && adjustedTime < endTime;

				TipPointAnimation tipAnim = entitypatch.getTipPointAnimation(ikInfo.endJoint);

				if (inLiftPhase) {
					Vector3f clipStart = ikInfo.endpos.copy();
					clipStart.add(0.0F, 2.5F, 0.0F);
					clipStart.mul(-1.0F, 1.0F, -1.0F);
					Vector3f finalTargetpos = this.getRayCastedTipPosition(clipStart, toWorld, entitypatch, 8.0F, ikInfo.rayLeastHeight);

					if (tipAnim != null && tipAnim.isOnWorking()) {
						tipAnim.newTargetPosition(finalTargetpos);
					} else if (tipAnim != null) {
						this.startPartAnimation(ikInfo, tipAnim, this.clipAnimation(this.tipPointTransforms.get(ikInfo.endJoint), ikInfo), finalTargetpos);
					}
				} else if (tipAnim != null && !tipAnim.isOnWorking()) {
					Vector3f groundedPos = ikInfo.startpos.copy();
					groundedPos.mul(-1.0F, 1.0F, -1.0F);
					Vector3f groundedPosAdded = groundedPos.copy();
					groundedPosAdded.add(0.0F, 2.5F, 0.0F);
					Vector3f rayGroundPos = this.getRayCastedTipPosition(groundedPosAdded, toWorld, entitypatch, 8.0F, ikInfo.rayLeastHeight);
					tipAnim.start(rayGroundPos, tipAnim.getAnimation(), 1.0F);
				}
			}
		}
	}
}
