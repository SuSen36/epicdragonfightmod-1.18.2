package susen36.epicdragonfight.api.collider;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.entity.PartEntity;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.AttackAnimationProperty;
import susen36.epicdragonfight.api.animation.types.AttackAnimation;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.gameasset.Models;
import susen36.epicdragonfight.world.capabilities.entitypatch.LivingEntityPatch;

import java.util.List;

public abstract class MultiCollider<T extends Collider> extends Collider {
	protected T bigCollider;
	protected int numberOfColliders;
	
	public MultiCollider(int arrayLength, double posX, double posY, double posZ, AABB outerAABB) {
		super(new Vec3(posX, posY, posZ), outerAABB);
		this.numberOfColliders = arrayLength;
	}
	
	protected abstract T createCollider();
	
	@Override
	public List<Entity> updateAndSelectCollideEntity(LivingEntityPatch<?> entitypatch, AttackAnimation attackAnimation, float prevElapsedTime, float elapsedTime, String jointName, float attackSpeed) {
		int numberOf = Math.max(Math.round((this.numberOfColliders + attackAnimation.getProperty(AttackAnimationProperty.COLLIDER_ADDER).orElse(0)) * attackSpeed), 1);
		float partialScale = 1.0F / (numberOf - 1);
		float interpolation = 0.0F;
		List<T> colliders = Lists.newArrayList();
		Entity original = entitypatch.getOriginal();
		
		for (int i = 0; i < numberOf; i++) {
			colliders.add(this.createCollider());
		}
		
		AABB outerBox = null;
		
		for (T collider : colliders) {
			OpenMatrix4f transformMatrix;
			Armature armature = entitypatch.getEntityModel(Models.LOGICAL_SERVER).getArmature();
			int pathIndex = armature.searchPathIndex(jointName);
			
			if (pathIndex == -1) {
				transformMatrix = new OpenMatrix4f();
			} else {
				//transformMatrix = Animator.getBindedJointTransformByIndex(entitypatch.getAnimator().getPose(interpolation), armature, pathIndex);
				float interpolateTime = prevElapsedTime + (elapsedTime - prevElapsedTime) * interpolation;
				transformMatrix = Animator.getBindedJointTransformByIndex(attackAnimation.getPoseByTime(entitypatch, interpolateTime, 1.0F), armature, pathIndex);
			}
			
			double x = original.xOld + (original.getX() - original.xOld) * interpolation;
			double y = original.yOld + (original.getY() - original.yOld) * interpolation;
			double z = original.zOld + (original.getZ() - original.zOld) * interpolation;
			OpenMatrix4f mvMatrix = OpenMatrix4f.createTranslation(-(float)x, (float)y, -(float)z);
			transformMatrix.mulFront(mvMatrix.mulBack(entitypatch.getModelMatrix(interpolation)));
			collider.transform(transformMatrix);
			
			interpolation += partialScale;
			
			if (interpolation >= 1.0F) {
				this.transform(transformMatrix);
			}
			
			if (outerBox == null) {
				outerBox = collider.getHitboxAABB();
			} else {
				outerBox.minmax(collider.getHitboxAABB());
			}
		}
		
		List<Entity> entities = entitypatch.getOriginal().level.getEntities(entitypatch.getOriginal(), outerBox, (entity) -> {
			if (entity instanceof PartEntity) {
				if (((PartEntity<?>)entity).getParent().is(entitypatch.getOriginal())) {
					return false;
				}
			}
			
			for (T collider : colliders) {
				if (collider.isCollide(entity)) {
					return true;
				}
			}
			
			return false;
		});
		
		return entities;
	}
	
	@Override
	public void drawInternal(PoseStack matrixStackIn, MultiBufferSource buffer, OpenMatrix4f pose, boolean red) {
	}
	
	@Override
	protected AABB getHitboxAABB() {
		return null;
	}
	
	@Override
	protected boolean isCollide(Entity opponent) {
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString() + " collider count: " + this.numberOfColliders + " real collider" + this.bigCollider.toString();
	}
}