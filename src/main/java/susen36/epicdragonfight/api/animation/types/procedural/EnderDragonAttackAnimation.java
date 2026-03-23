package susen36.epicdragonfight.api.animation.types.procedural;

import java.util.Map;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.JointTransform;
import susen36.epicdragonfight.api.animation.Keyframe;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.animation.TransformSheet;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.ActionAnimationProperty;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.AttackAnimationProperty;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.ActionAnimationCoordSetter;
import susen36.epicdragonfight.api.animation.types.AttackAnimation;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.client.renderer.DragonFightRenderTypes;
import susen36.epicdragonfight.client.renderer.RenderingTool;
import susen36.epicdragonfight.world.capabilities.entitypatch.MobPatch;
import susen36.epicdragonfight.world.capabilities.entitypatch.enderdragon.EnderDragonPatch;

public class EnderDragonAttackAnimation extends AttackAnimation implements ProceduralAnimation {
	private final IKInfo[] ikInfos;
	private Map<String, TransformSheet> tipPointTransform;
	
	public EnderDragonAttackAnimation(float convertTime, float antic, float preDelay, float contact, float recovery, String index, String path, Model model, IKInfo[] ikInfos) {
		super(convertTime, antic, preDelay, contact, recovery, index, path, model);
		this.ikInfos = ikInfos;
		this.addProperty(AttackAnimationProperty.FIXED_MOVE_DISTANCE, true);
		this.properties.remove(ActionAnimationProperty.COORD_SET_TICK);
	}
	
	@Override
	public void loadAnimation(ResourceManager resourceManager) {
		loadBothSide(resourceManager, this);
		this.tipPointTransform = Maps.newHashMap();
		this.setIKInfo(this.ikInfos, this.getTransfroms(), this.tipPointTransform, this.getModel().getArmature(), false, true);
		this.onLoaded();
	}
	
	@Override
	public Pose getPoseByTime(MobPatch<?> entitypatch, float time, float partialTicks) {
		Pose pose = super.getPoseByTime(entitypatch, time, partialTicks);
		
		if (entitypatch instanceof EnderDragonPatch) {
			EnderDragonPatch enderdragonpatch = (EnderDragonPatch)entitypatch;
	    	float x = (float)entitypatch.getOriginal().getX();
	    	float y = (float)entitypatch.getOriginal().getY();
	    	float z = (float)entitypatch.getOriginal().getZ();
	    	float xo = (float)entitypatch.getOriginal().xo;
	    	float yo = (float)entitypatch.getOriginal().yo;
	    	float zo = (float)entitypatch.getOriginal().zo;
	    	OpenMatrix4f toModelPos = OpenMatrix4f.mul(OpenMatrix4f.translate(new Vector3f(xo + (x - xo) * partialTicks, yo + (y - yo) * partialTicks, zo + (z - zo) * partialTicks), new OpenMatrix4f(), null), entitypatch.getModelMatrix(partialTicks), null).invert();
	    	this.correctRootRotation(pose.getJointTransformData().get("root"), enderdragonpatch, partialTicks);
	    	
	    	for (IKInfo ikInfo : this.ikInfos) {
		    	TipPointAnimation tipAnim = enderdragonpatch.getTipPointAnimation(ikInfo.endJoint);
	    		JointTransform jt = tipAnim.getTipTransform(partialTicks);
		    	Vector3f jointModelpos = OpenMatrix4f.transform3v(toModelPos, jt.translation(), null);
		    	Vector3f jointModelposMultiplied = jointModelpos.copy();
		    	jointModelposMultiplied.mul(-1.0F, 1.0F, -1.0F);
		    	this.applyFabrikToJoint(jointModelposMultiplied, pose, this.getModel().getArmature(), ikInfo.startJoint, ikInfo.endJoint, jt.rotation());
	    	}
		}
		
		return pose;
	}
	
	@Override
	public void begin(MobPatch<?> entitypatch) {
		ActionAnimationCoordSetter movementAnimationSetter = this.getProperty(ActionAnimationProperty.COORD_SET_BEGIN).orElse((self, entitypatch$2, transformSheet) -> {
			transformSheet.readFrom(self.getTransfroms().get("root"));
		});
		
		entitypatch.getAnimator().getPlayerFor(this).setActionAnimationCoord(this, entitypatch, movementAnimationSetter);
		
		if (entitypatch instanceof EnderDragonPatch) {
			EnderDragonPatch enderdragonpatch = (EnderDragonPatch)entitypatch;
			Vec3 entitypos = enderdragonpatch.getOriginal().position();
			OpenMatrix4f toWorld = OpenMatrix4f.mul(OpenMatrix4f.createTranslation((float)entitypos.x, (float)entitypos.y, (float)entitypos.z), enderdragonpatch.getModelMatrix(1.0F), null);
			enderdragonpatch.resetTipAnimations();
			
			for (IKInfo ikInfo : this.ikInfos) {
				TransformSheet tipAnim = this.getFirstPart(this.tipPointTransform.get(ikInfo.endJoint));
				Keyframe[] keyframes = tipAnim.getKeyframes();
				JointTransform firstposeTransform = keyframes[0].transform();
				Vector3f firstTranslation = firstposeTransform.translation();
				firstTranslation.mul(-1.0F, 1.0F, -1.0F);
				
				if (!ikInfo.clipAnimation || ikInfo.touchingGround[0]) {
					Vector3f firstTranslationAdded = firstTranslation.copy();
					firstTranslationAdded.add(0.0F, 2.5F, 0.0F);
					Vector3f rayResultPosition = this.getRayCastedTipPosition(firstTranslationAdded, toWorld, enderdragonpatch, 8.0F, ikInfo.rayLeastHeight);
					firstposeTransform.translation().set(rayResultPosition.x, rayResultPosition.y, rayResultPosition.z);
				} else {
					Vector3f transformedFirstTranslation = new Vector3f();
					OpenMatrix4f.transform3v(toWorld, firstTranslation, transformedFirstTranslation);
					firstposeTransform.translation().set(transformedFirstTranslation.x, transformedFirstTranslation.y, transformedFirstTranslation.z);
  				}
  				
  				for (Keyframe keyframe : keyframes) {
  					Vector3f keyframeTranslation = keyframe.transform().translation();
  					keyframeTranslation.set(firstposeTransform.translation().x, firstposeTransform.translation().y, firstposeTransform.translation().z);
  				}
				
				enderdragonpatch.addTipPointAnimation(ikInfo.endJoint, firstposeTransform.translation(), tipAnim, ikInfo);
			}
		}
		
		if (entitypatch.isLogicalClient()) {
			entitypatch.getClientAnimator().resetMotion();
			entitypatch.getClientAnimator().resetCompositeMotion();
		}
	}
	
	@Override
	public void tick(MobPatch<?> entitypatch) {
		super.tick(entitypatch);
		
		if (entitypatch instanceof EnderDragonPatch) {
			EnderDragonPatch enderdragonpatch = (EnderDragonPatch)entitypatch;
			Vec3 entitypos = enderdragonpatch.getOriginal().position();
			OpenMatrix4f toWorld = OpenMatrix4f.mul(OpenMatrix4f.createTranslation((float)entitypos.x, (float)entitypos.y, (float)entitypos.z), enderdragonpatch.getModelMatrix(1.0F), null);
			float elapsedTime = entitypatch.getAnimator().getPlayerFor(this).getElapsedTime();
			
			for (IKInfo ikInfo : this.ikInfos) {
				if (ikInfo.clipAnimation) {
					Keyframe[] keyframes = this.getTransfroms().get(ikInfo.endJoint).getKeyframes();
					float startTime = keyframes[ikInfo.startFrame].time();
					float endTime = keyframes[ikInfo.endFrame -1].time();
					
					if (startTime <= elapsedTime && elapsedTime < endTime) {
						TipPointAnimation tipAnim = enderdragonpatch.getTipPointAnimation(ikInfo.endJoint);
						Vector3f clipStart = ikInfo.endpos.copy();
						clipStart.add(0.0F, 2.5F, 0.0F);
						clipStart.mul(-1.0F, 1.0F, -1.0F);
						Vector3f endposMultiplied = ikInfo.endpos.copy();
						endposMultiplied.mul(-1.0F, 1.0F, -1.0F);
						Vector3f finalTargetpos = (!ikInfo.clipAnimation || ikInfo.touchingGround[ikInfo.touchingGround.length - 1]) ? 
							this.getRayCastedTipPosition(clipStart, toWorld, enderdragonpatch, 8.0F, ikInfo.rayLeastHeight) : 
								OpenMatrix4f.transform3v(toWorld, endposMultiplied, null);
						
						if (tipAnim.isOnWorking()) {
							tipAnim.newTargetPosition(finalTargetpos);
						} else {
							this.startPartAnimation(ikInfo, tipAnim, this.clipAnimation(this.tipPointTransform.get(ikInfo.endJoint), ikInfo), finalTargetpos);
						}
					}
				}
			}
		}
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void renderDebugging(PoseStack poseStack, MultiBufferSource buffer, MobPatch<?> entitypatch, float playTime, float partialTicks) {
		super.renderDebugging(poseStack, buffer, entitypatch, playTime, partialTicks);
		
		if (entitypatch instanceof EnderDragonPatch) {
			EnderDragonPatch enderdragonpatch = ((EnderDragonPatch)entitypatch);
			OpenMatrix4f modelmat = enderdragonpatch.getModelMatrix(partialTicks);
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
				Vector3f worldtargetpos = enderdragonpatch.getTipPointAnimation(ikInfo.endJoint).getTargetPosition();
				Vector3f modeltargetpos = OpenMatrix4f.transform3v(toModelPos, worldtargetpos, null);
				modeltargetpos.mul(-1.0F, 1.0F, -1.0F);
				RenderingTool.drawQuad(poseStack, vertexBuilder, modeltargetpos, 0.5F, 1.0F, 0.0F, 0.0F);
				
		       	Vector3f jointWorldPos = enderdragonpatch.getTipPointAnimation(ikInfo.endJoint).getTipPosition(partialTicks);
		       	Vector3f jointModelpos = OpenMatrix4f.transform3v(toModelPos, jointWorldPos, null);
		       	jointModelpos.mul(-1.0F, 1.0F, -1.0F);
		       	RenderingTool.drawQuad(poseStack, vertexBuilder, jointModelpos, 0.4F, 0.0F, 0.0F, 1.0F);
		       	Pose pose = new Pose();
		       	
				for (String jointName : this.jointTransforms.keySet()) {
					pose.putJointData(jointName, this.jointTransforms.get(jointName).getInterpolatedTransform(playTime));
				}
			}
		}
	}
}
