package susen36.epicdragonfight.api.animation.types;

import com.mojang.math.Vector3f;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.entity.PartEntity;
import susen36.epicdragonfight.api.animation.*;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.ActionAnimationCoordSetter;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.ActionAnimationProperty;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.AttackAnimationProperty;
import susen36.epicdragonfight.api.animation.property.AnimationProperty.StaticAnimationProperty;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class AttackAnimation extends ActionAnimation {
	protected static final ActionAnimationCoordSetter COMMON_COORD_SETTER = (self, entitypatch, transformSheet) -> {
		LivingEntity attackTarget = entitypatch.getOriginal().getTarget();
		
		if (!self.getRealAnimation().getProperty(AttackAnimationProperty.FIXED_MOVE_DISTANCE).orElse(false) && attackTarget != null) {
			TransformSheet transform = self.getTransfroms().get("root").copyAll();
			Keyframe[] keyframes = transform.getKeyframes();
			int startFrame = 0;
			int endFrame = transform.getKeyframes().length - 1;
			Vector3f keyLast = keyframes[endFrame].transform().translation();
			Vec3 pos = entitypatch.getOriginal().getEyePosition();
			Vec3 targetpos = attackTarget.position();
			float horizontalDistance = Math.max((float)targetpos.subtract(pos).horizontalDistance() - (attackTarget.getBbWidth() + entitypatch.getOriginal().getBbWidth()) * 0.75F, 0.0F);
			Vector3f worldPosition = new Vector3f(keyLast.x, 0.0F, -horizontalDistance);
			float worldPositionLength = (float) Math.sqrt(worldPosition.dot(worldPosition));
			float keyLastLength = (float) Math.sqrt(keyLast.dot(keyLast));
			float scale = Math.min(worldPositionLength / keyLastLength, 2.0F);
			
			for (int i = startFrame; i <= endFrame; i++) {
				Vector3f translation = keyframes[i].transform().translation();
				translation.z *= scale;
			}
			
			transformSheet.readFrom(transform);
		} else {
			transformSheet.readFrom(self.getTransfroms().get("root"));
		}
	};
	
	public final Phase[] phases;
	
	public AttackAnimation(float convertTime, float antic, float preDelay, float contact, float recovery, String index, String name, Model model) {
		this(convertTime, name, model, new Phase(0.0F, antic, preDelay, contact, recovery, Float.MAX_VALUE, index));
	}

	public AttackAnimation(float convertTime, String name, Model model, Phase... phases) {
		super(convertTime, name, model);
		
		this.addProperty(ActionAnimationProperty.COORD_SET_BEGIN, COMMON_COORD_SETTER);
		this.addProperty(ActionAnimationProperty.COORD_SET_TICK, COMMON_COORD_SETTER);
		this.addProperty(ActionAnimationProperty.STOP_MOVEMENT, true);
		this.phases = phases;
		
		this.stateSpectrumBlueprint.clear();
		
		for (Phase phase : phases) {
			
			float preDelay = phase.preDelay;
			
			if (preDelay == 0.0F) {
				preDelay += 0.01F;
			}
			
			this.stateSpectrumBlueprint
				.newTimePair(phase.start,preDelay)
				.addState(EntityState.PHASE_LEVEL, 1)
				.newTimePair(phase.start, phase.contact + 0.01F)
				.addState(EntityState.CAN_SKILL_EXECUTION, false)
				.newTimePair(phase.start, phase.recovery)
				.addState(EntityState.MOVEMENT_LOCKED, true)
				.addState(EntityState.CAN_BASIC_ATTACK, false)
				.newTimePair(phase.start, phase.end)
				.addState(EntityState.INACTION, true)
				.newTimePair(phase.antic, phase.recovery)
				.addState(EntityState.TURNING_LOCKED, true)
				.newTimePair(preDelay, phase.contact + 0.01F)
				.addState(EntityState.ATTACKING, true)
				.addState(EntityState.PHASE_LEVEL, 2)
				.newTimePair(phase.contact + 0.01F, phase.end)
				.addState(EntityState.PHASE_LEVEL, 3);
		}
	}
	
	@Override
	public void tick(IDragonPatch entitypatch) {
		super.tick(entitypatch);
		
		if (!entitypatch.isLogicalClient()) {
			AnimationPlayer player = entitypatch.getAnimator().getPlayerFor(this);
			float elapsedTime = player.getElapsedTime();
			float prevElapsedTime = player.getPrevElapsedTime();
			EntityState state = this.getState(elapsedTime);
			EntityState prevState = this.getState(prevElapsedTime);
			Phase phase = this.getPhaseByTime(elapsedTime);
			
			if (state.getLevel() == 1 && !state.turningLocked()) {
				if (entitypatch instanceof IDragonPatch) {
					((Mob)entitypatch.getOriginal()).getNavigation().stop();
					entitypatch.getOriginal().attackAnim = 2;
					LivingEntity target = entitypatch.getOriginal().getTarget();
					
					if (target != null) {
						entitypatch.rotateTo(target, entitypatch.getYRotLimit(), false);
					}
				}
			} else if (prevState.attacking() || state.attacking() || (prevState.getLevel() < 2 && state.getLevel() > 2)) {
				if (!prevState.attacking()) {
				//	entitypatch.playSound(this.getSwingSound(entitypatch, phase), 0.0F, 0.0F);
					entitypatch.getCurrentlyAttackedEntity().clear();
				}
			}
		}
	}
	
	@Override
	public void end(IDragonPatch entitypatch, boolean isEnd) {
		super.end(entitypatch, isEnd);
		entitypatch.getCurrentlyAttackedEntity().clear();
	}
	

	
	@Override
	protected void onLoaded() {
		if (!this.getProperty(AttackAnimationProperty.LOCK_ROTATION).orElse(false)) {
			this.stateSpectrumBlueprint.newTimePair(0.0F, Float.MAX_VALUE).addStateRemoveOld(EntityState.TURNING_LOCKED, false);
		}
		
		super.onLoaded();
	}
	
	public LivingEntity getTrueEntity(Entity entity) {
		if (entity instanceof LivingEntity) {
			return (LivingEntity)entity;
		} else if (entity instanceof PartEntity) {
			Entity parentEntity = ((PartEntity<?>)entity).getParent();
			
			if (parentEntity instanceof LivingEntity) {
				return (LivingEntity)parentEntity;
			}
		}
		
		return null;
	}

	@Override
	public Pose getPoseByTime(IDragonPatch entitypatch, float time, float partialTicks) {
		Pose pose = super.getPoseByTime(entitypatch, time, partialTicks);
		
		this.getProperty(AttackAnimationProperty.ROTATE_X).ifPresent((flag) -> {
			if (flag) {
				float pitch = entitypatch.getAttackDirectionPitch();
				JointTransform chest = pose.getOrDefaultTransform("Chest");
				chest.frontResult(JointTransform.getRotation(Vector3f.XP.rotationDegrees(-pitch)), OpenMatrix4f::mulAsOriginFront);
			}
		});
		
		return pose;
	}
	
	@Override
	public float getPlaySpeed(IDragonPatch entitypatch) {
		if (this.getProperty(StaticAnimationProperty.PLAY_SPEED).isPresent()) {
			return super.getPlaySpeed(entitypatch);
		}

		return 1.0F;
	}
	
	public <V> AttackAnimation addProperty(AttackAnimationProperty<V> propertyType, V value) {
		this.properties.put(propertyType, value);
		return this;
	}
	
	public String getPathIndexByTime(float elapsedTime) {
		return this.getPhaseByTime(elapsedTime).jointName;
	}
	
	public Phase getPhaseByTime(float elapsedTime) {
		Phase currentPhase = null;
		
		for (Phase phase : this.phases) {
			currentPhase = phase;
			
			if (phase.end > elapsedTime) {
				break;
			}
		}
		
		return currentPhase;
	}
	
	public static class Phase {
		protected final float start;
		protected final float antic;
		protected final float preDelay;
		protected final float contact;
		protected final float recovery;
		protected final float end;
		protected final String jointName;
		protected final InteractionHand hand;
		
		public Phase(float start, float antic, float preDelay, float contact, float recovery, float end, String jointName) {
			this(start, antic, preDelay, contact, recovery, end, InteractionHand.MAIN_HAND, jointName);
		}
		
		public Phase(float start, float antic, float preDelay, float contact, float recovery, float end, InteractionHand hand, String jointName) {
			this.start = start;
			this.antic = antic;
			this.preDelay = preDelay;
			this.contact = contact;
			this.recovery = recovery;
			this.end = end;
			this.jointName = jointName;
			this.hand = hand;
		}

		public String getColliderJointName() {
			return this.jointName;
		}
	}
}
