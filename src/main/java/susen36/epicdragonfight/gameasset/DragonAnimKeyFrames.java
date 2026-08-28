package susen36.epicdragonfight.gameasset;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DragonAnimKeyFrames {

	private static final AnimationDefinition DRAGON_AIRSTRIKE =
			buildAirstrike();

	private static final AnimationDefinition DRAGON_ATTACK1 =
			buildAttack1();

	private static final AnimationDefinition DRAGON_ATTACK2 =
			buildAttack2();

	private static final AnimationDefinition DRAGON_ATTACK3 =
			buildAttack3();

	private static final AnimationDefinition DRAGON_BACKJUMP_MOVE =
			buildBackjumpMove();

	private static final AnimationDefinition DRAGON_BACKJUMP_PREPARE =
			buildBackjumpPrepare();

	private static final AnimationDefinition DRAGON_BACKJUMP_RECOVERY =
			buildBackjumpRecovery();

	private static final AnimationDefinition DRAGON_CRYSTAL_LINK =
			buildCrystalLink();

	private static final AnimationDefinition DRAGON_DEATH =
			buildDeath();

	private static final AnimationDefinition DRAGON_FIREBALL =
			buildFireball();

	private static final AnimationDefinition DRAGON_FLY =
			buildFly();

	private static final AnimationDefinition DRAGON_FLY_TO_GROUND =
			buildFlyToGround();

	private static final AnimationDefinition DRAGON_GROUND_TO_FLY =
			buildGroundToFly();

	private static final AnimationDefinition DRAGON_IDLE =
			buildIdle();

	private static final AnimationDefinition DRAGON_LEFT_TAIL_SWEEP =
			buildLeftTailSweep();

	private static final AnimationDefinition DRAGON_RIGHT_TAIL_SWEEP =
			buildRightTailSweep();

	private static final AnimationDefinition DRAGON_WALK =
			buildWalk();

	
	private static AnimationDefinition buildAirstrike() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(0.933F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-35.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.84F, -35.87F, -29.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-5.22F, -35.87F, -29.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-18.84F, -35.87F, -29.26F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(56.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-35.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.91F, 38.1F, 27.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-5.22F, 35.87F, 29.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-18.91F, 38.1F, 27.54F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(56.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(85.64F, -0.2F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(85.64F, -0.2F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.17F, -31.36F, 0.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(30.86F, -31.41F, 0.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(23.17F, -31.36F, 0.58F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.41F, -15.31F, -137.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-105.41F, -15.31F, -137.77F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(78.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(78.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.5F, 31.43F, 0.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(32.59F, 32.0F, 5.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(23.5F, 31.43F, 0.56F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.34F, 15.61F, 137.83F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-105.34F, 15.61F, 137.83F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(73.52F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(73.52F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.13F, 14.48F, 5.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(57.17F, -7.45F, -4.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.97F, 1.32F, -0.29F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-69.13F, 14.48F, 5.48F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.44F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-47.64F, 0.0F, -0.07F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(47.56F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(39.27F, 0.1F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(24.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-36.44F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(19.09F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(9.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(10.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(11.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(7.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.75F, -14.93F, -5.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(59.38F, 9.82F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.96F, -1.38F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-69.75F, -14.93F, -5.48F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-44.83F, -0.19F, 0.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(44.99F, -0.17F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(38.57F, -0.34F, 0.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(24.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-35.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -2.2408F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.067F, KeyframeAnimations.posVec(0.0F, -2.2348F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0F, -2.5898F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -2.2148F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -2.2408F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.28F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-7.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-5.28F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(6.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(7.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(6.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildAttack1() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.06F, 1.55F, -2.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-96.07F, 1.81F, -2.6F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.57F, 1.88F, -2.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-90.76F, 2.23F, -2.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.47F, 0.48F, 0.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-85.2F, 0.26F, 3.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-85.2F, 0.26F, 3.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.36F, 10.2F, 3.2F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-121.31F, -40.67F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-136.73F, -37.67F, 6.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-148.88F, -35.65F, 11.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-148.67F, -35.39F, 11.81F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-132.25F, -29.85F, -8.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-154.51F, -23.65F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-154.51F, -23.65F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.22F, -18.71F, -0.91F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(86.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(94.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.04F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(93.6F, 1.77F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.22F, 0.88F, 0.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.32F, 4.37F, 21.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-102.75F, 6.3F, 27.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.53F, 34.56F, 21.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-66.53F, 34.56F, 21.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.16F, 15.03F, 1.81F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.53F, -17.28F, -8.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(51.47F, -25.06F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.28F, -12.3F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.91F, 0.0F, -12.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(20.2F, 1.08F, -31.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(25.79F, 3.5F, -39.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(19.4F, -16.87F, -42.6F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-17.55F, -2.79F, 10.64F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-18.05F, -3.23F, 11.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.45F, -12.31F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-68.62F, -11.94F, 9.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-76.9F, -18.39F, 11.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-81.57F, -20.72F, 5.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-36.36F, -12.2F, 19.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(6.91F, -23.81F, -7.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(8.19F, -23.69F, -7.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-29.82F, -7.57F, 9.99F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.28F, -6.72F, 1.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-32.14F, -24.37F, 6.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-33.78F, -27.85F, 11.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-67.77F, -38.5F, 28.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-95.71F, 12.22F, -21.07F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-97.67F, 12.83F, -21.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.28F, -0.02F, 0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.08F, 22.21F, 88.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(102.32F, 20.24F, 167.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(97.61F, -3.08F, 177.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(82.72F, 23.88F, 149.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(49.69F, 25.48F, -21.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(40.39F, -6.58F, -22.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(42.72F, -35.48F, -78.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(40.48F, -30.64F, -85.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(40.48F, -30.64F, -85.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(5.96F, 13.16F, 4.78F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0153F, -0.0088F, 0.167F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0243F, -0.0914F, 0.4751F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0263F, -0.0462F, 0.5721F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0263F, -0.0406F, 0.585F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0263F, -0.0406F, 0.585F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.45F, 64.9F, 7.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-22.14F, 41.94F, 20.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-6.24F, 31.22F, 23.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(97.79F, 86.4F, 158.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(-155.19F, 18.2F, -52.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-137.57F, -15.08F, -18.47F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-123.32F, -27.78F, -30.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-123.32F, -27.78F, -30.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.05F, 7.63F, -11.76F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.06F, 28.63F, 56.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-14.83F, 31.58F, 54.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-16.93F, 33.58F, 54.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-6.66F, 21.84F, 51.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(16.83F, -0.03F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-15.25F, -22.34F, -7.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-15.36F, -28.41F, -9.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-15.36F, -28.41F, -9.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.91F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.89F, -17.89F, 0.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(51.45F, -23.57F, 4.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(48.03F, -25.52F, 5.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(59.86F, -15.32F, 1.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.1F, 8.03F, -2.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(42.69F, 40.43F, 1.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.46F, 51.52F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0127F, -0.0338F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(29.78F, -40.48F, 18.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(41.53F, -48.6F, 6.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(41.53F, -48.6F, 6.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.79F, -20.76F, 0.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(13.02F, -56.64F, -22.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(37.05F, -71.82F, -50.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.53F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.8F, 10.2F, -0.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.83F, 12.47F, -0.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, 6.65F, -1.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-16.11F, 14.92F, -2.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-12.21F, 18.97F, -2.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.35F, 5.96F, -1.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-15.61F, 14.06F, -1.94F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-11.59F, 18.12F, -1.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.31F, 8.4F, -0.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.78F, 10.89F, -0.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0133F, 0.0332F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(36.15F, 53.11F, -9.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(25.43F, 37.51F, -18.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.43F, 37.51F, -18.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0398F, 0.0775F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.2038F, 0.4605F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.2348F, 0.5315F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.2715F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3055F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3225F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.01F, 8.93F, -7.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(8.83F, 16.98F, -7.82F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.69F, 18.46F, -7.82F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(6.87F, -6.84F, -8.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(20.16F, -28.57F, -14.71F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(21.54F, -30.06F, -15.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.72F, 22.39F, 1.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-3.27F, 22.35F, 6.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(13.87F, 24.52F, 5.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(19.91F, 22.07F, 14.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.43F, 6.24F, -0.85F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.65F, -0.16F, 0.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(11.65F, -0.16F, 0.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(11.65F, -0.16F, 0.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(11.65F, -0.16F, 0.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.03F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.99F, -0.11F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(9.99F, -0.11F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(9.99F, -0.11F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(9.99F, -0.11F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.28F, 0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.78F, -0.06F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(6.78F, -0.06F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(6.78F, -0.06F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(6.78F, -0.06F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.78F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.78F, 0.01F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-6.78F, 0.01F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-6.78F, 0.01F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.78F, 0.01F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildAttack2() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-91.54F, 0.6F, 4.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-85.63F, 0.01F, -10.59F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.36F, 10.2F, 3.2F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-117.57F, -32.69F, -18.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-149.88F, -38.85F, 1.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.22F, -18.71F, -0.91F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(82.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(86.32F, 0.03F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-108.23F, 14.4F, 18.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-84.39F, -20.59F, 17.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.26F, 33.26F, 22.59F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-152.8F, 21.78F, -39.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.16F, 15.03F, 1.81F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(58.11F, -14.47F, -8.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(83.51F, -26.03F, -20.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.28F, -12.3F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(63.16F, 6.1F, 1.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(85.56F, 6.94F, 0.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(86.23F, -0.83F, 0.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(59.13F, -14.35F, 60.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(40.9F, -1.57F, 0.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(35.33F, 23.94F, 84.16F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(36.53F, 31.36F, 101.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(36.53F, 31.36F, 101.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.45F, -12.31F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0049F, -0.0382F, 0.0991F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(-0.1621F, 0.0945F, 0.4111F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(-0.0451F, 0.0372F, 0.5382F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(-0.0181F, 0.0241F, 0.5406F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(-0.0181F, 0.0241F, 0.5406F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.31F, -48.48F, -42.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-31.11F, -51.62F, -30.94F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-32.93F, -50.71F, -28.83F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-36.4F, -87.01F, -32.83F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(-140.92F, -20.43F, 90.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-142.96F, 16.18F, 2.93F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-130.94F, 28.81F, 5.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-130.94F, 28.81F, 5.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-29.82F, -7.57F, 9.99F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.28F, -21.91F, -19.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.42F, -0.01F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(4.56F, -30.34F, -52.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(16.75F, -0.7F, 0.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(13.18F, 25.81F, 17.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(15.77F, 35.95F, 24.3F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(15.77F, 35.95F, 24.3F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.28F, -0.02F, 0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.43F, -11.8F, -16.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(25.21F, -9.14F, 4.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(23.13F, -10.98F, 5.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(7.85F, 24.2F, 55.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-28.38F, -0.91F, 6.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-31.84F, -1.02F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(5.96F, 13.16F, 4.78F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0153F, -0.0088F, 0.167F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0263F, -0.0406F, 0.585F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0263F, -0.0406F, 0.585F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-67.28F, 17.35F, -25.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-80.89F, 35.18F, -23.24F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-76.62F, 37.91F, -28.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-33.61F, 39.03F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(23.35F, 20.16F, 7.12F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(23.36F, 25.11F, 8.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.05F, 7.63F, -11.76F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.35F, 11.12F, 43.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-32.69F, 21.28F, 43.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-31.47F, 22.95F, 43.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-43.64F, 24.05F, -8.19F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-89.55F, 3.98F, -1.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-91.65F, 2.72F, -0.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.91F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.95F, 21.02F, 6.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(42.43F, 8.39F, -8.98F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(44.74F, 9.15F, -9.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(48.71F, 2.31F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(66.86F, 2.58F, -1.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(30.66F, -56.79F, 8.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.82F, -66.41F, 28.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0107F, -0.0298F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(35.24F, -47.76F, 12.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(33.55F, -40.7F, 14.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.68F, -10.36F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(6.2F, -0.03F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.03F, -0.06F, 0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(17.46F, 49.47F, 20.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.1F, 57.2F, 28.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.6F, 0.21F, -0.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-11.19F, 0.16F, -0.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.3F, 0.11F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-10.08F, 0.11F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.16F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.41F, 0.11F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-22.09F, 0.02F, -0.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-22.71F, 0.01F, -0.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.15F, -0.1F, 0.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.73F, -6.26F, 1.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-18.67F, -7.99F, 1.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-17.94F, -8.05F, 1.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-13.89F, -0.03F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-15.13F, -0.02F, 0.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.12F, -0.01F, 0.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.29F, -6.14F, 1.16F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-19.36F, -8.4F, 1.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-18.88F, -8.45F, 1.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-8.11F, 0.01F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-8.92F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-11.07F, -0.02F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-11.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-11.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0113F, 0.0292F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(29.47F, 45.98F, -17.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(32.35F, 45.85F, -12.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0398F, 0.0775F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.1978F, 0.4445F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.2038F, 0.4605F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.0958F, -0.6605F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.2715F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3215F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3225F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.14F, -7.96F, -0.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(9.28F, -18.74F, -2.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.45F, -19.21F, -2.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(8.54F, 0.11F, -0.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.87F, 9.77F, 1.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(19.34F, 29.91F, 9.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(21.76F, 30.87F, 10.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.44F, -5.8F, -5.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.32F, 0.41F, -1.96F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(18.51F, -4.2F, -5.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(22.93F, 2.49F, -5.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.43F, 6.24F, -0.85F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.32F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-10.14F, -0.01F, 0.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.97F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-10.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.1F, -0.01F, 0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(10.66F, -7.81F, -0.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.03F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.49F, 0.0F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(9.21F, -0.12F, 0.42F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.28F, 0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(5.94F, -0.06F, 0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.78F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.32F, 0.0F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.03F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.3F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.64F, -0.05F, 0.12F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.3F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-9.24F, -0.02F, 0.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildAttack3() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.9F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-91.08F, 33.61F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-61.22F, 29.67F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-58.3F, 29.61F, 4.98F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-83.8F, 4.05F, -25.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(38.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-13.2F, 0.29F, -7.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(54.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(38.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(38.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-118.69F, -34.11F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-148.94F, -30.4F, 5.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-148.05F, -31.96F, -0.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-5.07F, -0.01F, -30.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(12.75F, 0.01F, 3.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(3.96F, 0.0F, 4.71F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.21F, 0.0F, 4.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-3.48F, 0.0F, 4.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-3.48F, 0.0F, 4.57F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(96.95F, 0.23F, 0.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(96.62F, 0.29F, 0.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(96.62F, 0.29F, 0.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-29.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-29.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(43.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(9.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-4.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-4.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-89.13F, 2.73F, 23.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-79.85F, 0.0F, 15.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-78.87F, 0.0F, 14.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-73.28F, 5.68F, 24.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(38.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-11.89F, 0.02F, 15.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(54.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(38.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(38.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-112.83F, 25.92F, 7.44F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-132.53F, 23.08F, 1.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-134.43F, 22.75F, 0.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(1.44F, 5.26F, 31.35F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(12.11F, 6.24F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(4.47F, 0.29F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.01F, 1.07F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-4.87F, 1.85F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-4.87F, 1.85F, 0.08F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(96.32F, 11.17F, 20.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(103.23F, 9.07F, 17.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(103.95F, 8.9F, 16.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-29.41F, 0.24F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-29.41F, 0.0F, -0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(43.28F, 11.87F, 8.29F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(9.09F, 9.32F, 1.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-2.45F, 7.82F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-2.45F, 7.82F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.57F, 29.69F, -43.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(6.57F, 29.69F, -43.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(48.53F, -46.83F, -126.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(49.85F, -56.32F, -89.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(29.32F, -0.02F, -20.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(49.66F, -27.96F, -49.25F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(49.66F, -27.96F, -49.25F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.4392F, 0.303F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(-0.0001F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(-0.0001F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(-0.0001F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(-0.0001F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(-0.0001F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(-0.0001F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(5.48F, -42.06F, -10.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-0.57F, -53.41F, -10.96F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-175.68F, -24.9F, 145.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-157.57F, -0.24F, 72.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-132.27F, 0.3F, 31.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-128.19F, -38.28F, 70.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-128.19F, -38.28F, 70.32F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-45.58F, -17.82F, -71.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-42.23F, -23.95F, -72.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-6.7F, 5.47F, -83.97F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(16.87F, -0.63F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(1.62F, 0.02F, -5.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-65.48F, 7.79F, -11.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-65.48F, 7.79F, -11.28F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(40.89F, -42.68F, 30.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(40.89F, -42.68F, 30.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-1.34F, 0.01F, 30.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(44.08F, 45.79F, 85.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(29.58F, 3.66F, 18.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(49.79F, 31.77F, 42.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(49.79F, 31.77F, 42.66F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.4392F, 0.303F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0003F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0003F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0003F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0003F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0003F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0003F, -0.4443F, 0.3063F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.27F, 30.34F, 23.71F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-13.6F, 43.47F, 22.61F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-175.99F, 30.08F, -157.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-155.93F, 0.18F, -74.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-134.62F, 0.0F, -26.55F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-122.33F, 39.37F, -60.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-122.33F, 39.37F, -60.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.36F, 22.16F, 79.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-43.13F, 26.44F, 80.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-14.66F, 15.54F, 174.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(16.89F, -0.35F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(5.49F, -0.24F, 0.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-63.88F, -16.25F, 18.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-63.88F, -16.25F, 18.02F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-15.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-32.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-32.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-32.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.733F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.7F, 0.0F, 32.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-48.54F, 43.36F, 31.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-62.87F, 53.47F, 23.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.733F, KeyframeAnimations.degreeVec(56.93F, -36.03F, 21.61F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(27.49F, -37.46F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(26.61F, -41.59F, 0.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(26.61F, -41.59F, 0.31F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.62F, -16.57F, 1.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-35.03F, -0.02F, 0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(29.14F, 0.04F, -0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-0.03F, -33.64F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-0.03F, -33.64F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-12.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-12.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-11.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-13.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-38.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-38.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-38.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(17.28F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(17.46F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(20.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(20.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(20.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(19.45F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(19.69F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(29.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(29.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(29.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(12.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(12.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(20.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(20.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(20.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.733F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.6F, 2.55F, -32.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-38.71F, -38.17F, -38.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-49.12F, -48.46F, -34.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.733F, KeyframeAnimations.degreeVec(55.6F, 35.57F, -22.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(25.48F, 34.82F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(24.21F, 39.16F, -1.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(24.21F, 39.16F, -1.7F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.63F, 16.52F, -1.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-35.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(30.93F, 0.19F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 32.62F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 32.62F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.2988F, 0.0885F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.5058F, 0.6845F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.5268F, 0.7425F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 3.7072F, -8.7525F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 1.1962F, -12.9595F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.9918F, -15.7775F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.9918F, -16.5345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.9918F, -16.5345F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-18.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.84F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(9.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(9.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(9.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-1.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(19.69F, 0.02F, -0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(43.23F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(61.27F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(61.27F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(61.27F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-7.07F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-7.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(17.16F, 0.04F, -0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-15.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-15.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-15.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(13.24F, -0.01F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-11.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-11.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-11.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-9.44F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-8.45F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-8.45F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-8.45F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-12.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.19F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-14.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-5.97F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-6.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-14.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-7.93F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-14.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-13.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-8.34F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildBackjumpMove() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.067F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-77.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(30.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(30.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(30.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-48.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-84.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-69.67F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-81.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-31.86F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(46.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-29.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-29.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(39.05F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-21.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-77.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(30.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(30.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(30.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-48.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-84.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-69.67F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-81.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-31.86F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(46.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-29.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-29.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(39.05F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-21.46F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.22F, -29.36F, -18.73F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-3.64F, -35.32F, -10.83F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(26.02F, -19.94F, -34.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(25.06F, -15.83F, -30.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(24.44F, -28.1F, -22.51F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.17F, 2.02F, 52.25F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-73.96F, -0.01F, 45.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-70.33F, -14.76F, 49.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-44.57F, -0.01F, 47.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-44.21F, -8.68F, 43.31F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.89F, -0.45F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(8.34F, -0.23F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-6.46F, 14.54F, 0.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(9.32F, -0.34F, 0.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.82F, 6.78F, -15.66F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.33F, 29.27F, 18.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-0.83F, 39.79F, 12.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(30.17F, 23.21F, 35.93F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(28.39F, 15.76F, 34.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(28.16F, 32.61F, 24.12F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.24F, -0.03F, -50.64F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-78.18F, 4.1F, -51.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-70.42F, 14.76F, -50.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-47.22F, 3.86F, -50.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-44.21F, 8.69F, -41.15F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.89F, -0.38F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(8.35F, -0.2F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-6.55F, -14.53F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(9.34F, -0.3F, 0.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(1.05F, -7.33F, 15.54F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-15.13F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-20.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.98F, 6.36F, 10.42F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(53.07F, 2.75F, 2.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(59.33F, 2.73F, 3.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-4.84F, 12.22F, 13.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-59.14F, 21.3F, 6.53F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.9F, -0.01F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-23.95F, 0.03F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(51.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(54.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(11.01F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-25.02F, -0.05F, 0.04F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-10.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(8.86F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(26.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(23.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(21.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(23.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(17.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(15.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(15.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.42F, -5.52F, -9.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(53.2F, -0.01F, -7.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(59.43F, 0.0F, -8.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-4.99F, -12.24F, -13.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-59.4F, -21.33F, -6.45F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.59F, -0.01F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-24.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(51.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(54.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(11.01F, 0.03F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-25.02F, -0.05F, 0.04F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.0272F, -0.0905F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 3.8512F, 4.6905F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 5.3162F, 9.3475F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 5.5592F, 15.3425F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 1.8712F, 19.5315F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-24.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-38.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-38.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-12.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-18.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(18.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-4.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-25.79F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(11.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(6.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(8.45F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(10.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-21.35F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-13.71F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(13.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-22.58F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-8.16F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-16.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(8.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-10.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(8.05F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(7.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(11.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(5.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(13.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(13.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(15.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(13.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(15.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildBackjumpPrepare() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(0.317F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-96.22F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-77.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-148.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-102.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.23F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(107.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(46.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-96.22F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-77.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-148.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-102.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.23F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(107.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(46.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-31.69F, -34.99F, 27.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-5.01F, -43.23F, 11.24F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-0.94F, -43.71F, 12.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-18.22F, -29.36F, -18.73F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-42.34F, -36.97F, 36.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-21.71F, -43.24F, 34.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-5.23F, -49.34F, 22.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-69.17F, 2.02F, 52.25F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-62.91F, 13.88F, -32.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.33F, -0.01F, 0.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-108.2F, 0.01F, -0.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(16.89F, -0.45F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-33.05F, 34.1F, -28.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-5.18F, 42.92F, -11.35F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-1.25F, 43.47F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-18.33F, 29.27F, 18.86F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-42.27F, 36.95F, -34.55F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-20.81F, 45.51F, -30.73F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-4.26F, 50.61F, -20.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-69.24F, -0.03F, -50.64F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-62.77F, -15.96F, 34.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.33F, -0.01F, 0.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-108.2F, 0.0F, -0.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(16.89F, -0.38F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-9.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-12.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(28.23F, -20.78F, 3.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-53.46F, 2.71F, 12.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-45.58F, 9.29F, 9.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-30.98F, 6.36F, 10.42F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-33.09F, -0.01F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-29.08F, 0.02F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-27.9F, -0.01F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(18.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(15.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(12.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.38F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-10.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-7.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-6.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(28.23F, 20.78F, -3.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-52.28F, -9.31F, -7.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-44.89F, -8.0F, -7.98F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-30.42F, -5.52F, -9.32F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-30.26F, 0.01F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-26.36F, 0.02F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-25.59F, -0.01F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.2622F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.2158F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.5548F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 1.0272F, -0.0905F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.87F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-22.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-26.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(9.79F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(12.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(7.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-17.16F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-21.35F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-10.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-14.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(8.45F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(10.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(13.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(11.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildBackjumpRecovery() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.167F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-91.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-99.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-99.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-31.86F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-114.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-124.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-124.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-21.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(70.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(88.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(88.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-91.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-99.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-99.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-31.86F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-114.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-124.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-124.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-21.46F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(70.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(88.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(88.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.44F, -28.1F, -22.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-19.39F, -26.2F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-7.12F, -27.79F, 18.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.12F, -27.79F, 18.23F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-44.21F, -8.68F, 43.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-66.4F, -22.03F, 45.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-47.28F, -38.54F, 35.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-47.28F, -38.54F, 35.05F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.82F, 6.78F, -15.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-34.16F, 7.99F, -27.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-70.84F, 9.55F, -33.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-70.84F, 9.55F, -33.15F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(28.16F, 32.61F, 24.12F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-19.95F, 25.6F, -11.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-8.13F, 27.35F, -19.73F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-8.13F, 27.35F, -19.73F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-44.21F, 8.69F, -41.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-66.39F, 22.11F, -43.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-47.24F, 38.53F, -32.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-47.24F, 38.53F, -32.9F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.05F, -7.33F, 15.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-33.96F, -9.61F, 27.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-70.83F, -11.64F, 34.96F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-70.83F, -11.64F, 34.96F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(13.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(15.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(15.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-59.14F, 21.3F, 6.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(26.08F, -11.95F, 8.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(26.08F, -11.95F, 8.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(26.08F, -11.95F, 8.36F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.02F, -0.05F, 0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(7.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(7.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-9.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-9.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-59.4F, -21.33F, -6.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(26.08F, 11.95F, -8.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(26.08F, 11.95F, -8.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(26.08F, 11.95F, -8.36F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.02F, -0.05F, 0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.8712F, 0.0015F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.4572F, 1.5875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0328F, 1.5875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0328F, 1.5875F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.79F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-13.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-2.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-2.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.58F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-12.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-10.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-7.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-7.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildCrystalLink() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(9.8F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-106.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-106.46F, -0.01F, 0.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-103.98F, 0.0F, 0.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-101.1F, 0.41F, 0.82F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(-67.92F, 2.25F, 4.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-55.0F, 10.2F, 3.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-55.0F, 10.2F, 3.31F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(-0.0001F, 0.0138F, -0.2763F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.posVec(-0.0001F, 0.0224F, -0.4541F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.55F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-123.58F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-96.21F, 3.9F, -2.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-100.64F, 3.79F, -3.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-113.69F, 0.62F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(-163.56F, -15.17F, 2.12F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-157.08F, -18.06F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-157.08F, -18.06F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(107.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(108.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(95.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(96.84F, 0.04F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(92.45F, 0.04F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(103.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(73.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(73.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-106.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-103.35F, 0.22F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-106.75F, -0.01F, 0.98F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.55F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-123.58F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-100.14F, 0.08F, 0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-96.88F, 4.86F, -3.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-83.56F, 15.3F, 1.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-83.56F, 15.3F, 1.38F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(107.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(108.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(95.95F, 0.07F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(95.9F, 0.31F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(68.01F, -9.0F, -6.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(68.01F, -9.0F, -6.05F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(31.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-21.22F, 2.92F, -0.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-19.27F, -0.52F, 1.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(3.29F, 0.0F, 0.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-5.42F, -7.71F, 1.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.69F, -12.31F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.69F, -12.31F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(-0.0001F, 0.0219F, -0.014F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(-0.0001F, 0.0162F, -0.017F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.16F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-35.28F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-70.52F, 6.4F, -0.44F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-68.41F, 5.76F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(-24.68F, 3.53F, 2.71F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-28.29F, 0.0F, 6.47F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-27.15F, -8.03F, 9.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-27.15F, -8.03F, 9.63F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.33F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(16.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(16.89F, 0.0F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(-51.39F, 0.0F, 0.29F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-46.74F, -0.02F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-67.22F, -0.02F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-67.22F, -0.02F, 0.02F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(31.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-19.65F, 0.01F, 3.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-17.28F, -0.98F, 2.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(12.31F, 12.72F, 6.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(12.31F, 12.72F, 6.2F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0003F, 0.0373F, -0.0337F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0003F, 0.0057F, -0.0059F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.16F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-35.28F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-68.62F, 4.35F, -0.16F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-58.79F, 5.3F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-43.34F, 8.43F, -11.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-43.34F, 8.43F, -11.08F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.33F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(16.89F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(8.55F, 0.0F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-61.78F, 0.0F, -0.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-61.78F, 0.0F, -0.13F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(57.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(63.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-46.27F, 4.71F, 4.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-43.76F, -3.73F, -9.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(40.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(40.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.6173F, -0.2098F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(-0.6173F, -0.2098F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-84.98F, 82.96F, -127.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-70.18F, 79.68F, -111.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(-47.35F, 21.09F, -54.73F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-48.01F, 17.99F, -51.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(49.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(62.01F, 0.05F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.degreeVec(48.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-24.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-24.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-25.41F, -0.01F, -0.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-25.65F, -6.31F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(12.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(39.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(39.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(45.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(28.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(28.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.6173F, -0.2098F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.6173F, -0.2098F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-54.25F, -83.41F, 95.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.33F, -79.73F, 109.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(-47.39F, -21.07F, 56.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-48.09F, -17.97F, 53.25F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(49.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(62.01F, 0.05F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.degreeVec(48.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(5.91F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0058F, 0.3865F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -1.0058F, 0.3865F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.7718F, 0.2295F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.7978F, 0.2295F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-22.43F, 0.0F, 0.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-22.46F, -0.01F, 0.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.48F, 22.35F, 11.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.01F, 22.61F, 10.97F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-4.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-4.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-2.48F, 6.68F, -0.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-2.48F, 6.68F, -0.69F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.3F, -14.07F, -1.25F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(7.3F, -14.07F, -1.25F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-7.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-7.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.28F, -9.33F, -0.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(6.28F, -9.33F, -0.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-14.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-14.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.03F, -0.03F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-0.03F, -0.03F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-5.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-5.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(9.85F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(9.85F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.14F, -8.63F, 0.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-0.14F, -8.63F, 0.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-7.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-7.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(9.44F, 0.0F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(9.44F, 0.0F, -0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.28F, -14.09F, 0.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-0.28F, -14.09F, 0.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-9.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-9.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(8.11F, -0.01F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(8.11F, -0.01F, 0.09F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.4F, -18.17F, -0.61F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(6.4F, -18.17F, -0.61F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(5.85F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(5.85F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.0F, -20.68F, -1.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(8.0F, -20.68F, -1.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.02F, -21.33F, -1.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(9.02F, -21.33F, -1.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.2F, -20.25F, -1.97F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(9.2F, -20.25F, -1.97F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-9.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-9.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.57F, -17.7F, -1.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(8.57F, -17.7F, -1.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildDeath() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(9.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.52F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.52F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(1.33F, 0.01F, 22.19F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(1.33F, 0.01F, 22.19F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-69.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-74.29F, -21.94F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-74.29F, -21.94F, 0.02F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(33.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(33.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(47.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(47.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.52F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.52F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(2.3F, 2.39F, -18.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(2.3F, 2.39F, -18.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-69.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-73.69F, 29.82F, -0.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-73.69F, 29.82F, -0.53F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(33.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(33.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(46.37F, -10.97F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(46.37F, -10.97F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(82.7F, 12.76F, -20.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(82.7F, 12.76F, -20.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(41.62F, -42.77F, -84.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(41.62F, -42.77F, -84.56F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(-0.0001F, -0.3544F, 0.2118F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(-0.0001F, -0.3544F, 0.2118F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.05F, 1.08F, 10.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-51.05F, 1.08F, 10.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-37.92F, -44.9F, 14.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-37.92F, -44.9F, 14.09F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-23.8F, -0.02F, -0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-23.8F, -0.02F, -0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-10.45F, 18.55F, 50.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-10.45F, 18.55F, 50.45F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(81.4F, -15.81F, 23.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(81.4F, -15.81F, 23.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(34.83F, 53.59F, 90.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(34.83F, 53.59F, 90.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0003F, -0.3544F, 0.2118F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0003F, -0.3544F, 0.2118F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.88F, 5.08F, -13.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-51.88F, 5.08F, -13.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-44.37F, 47.06F, -34.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-44.37F, 47.06F, -34.09F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-23.8F, -0.06F, 0.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-23.8F, -0.06F, 0.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-9.43F, -17.98F, -48.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-9.43F, -17.98F, -48.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(70.58F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(70.58F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-53.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-53.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(73.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(73.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.09F, -27.53F, 6.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(56.75F, 4.2F, 0.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-4.84F, 1.05F, -6.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-4.84F, 1.05F, -6.54F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-8.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-15.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-15.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(15.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-16.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-16.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-10.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-10.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.09F, 27.53F, -6.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(56.82F, -2.46F, -3.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-0.13F, -1.31F, 6.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-0.13F, -1.31F, 6.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -2.8808F, 0.3755F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -2.8898F, 0.3685F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -2.8708F, 0.3775F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -2.8708F, 0.3775F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.56F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-14.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-14.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-4.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-3.04F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-3.04F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-6.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-6.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-9.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-9.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(8.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-10.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-10.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.16F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(8.16F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-11.71F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-11.71F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.7F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(7.7F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-11.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-11.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-10.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-10.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildFireball() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.333F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-106.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-106.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-114.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-108.91F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-120.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-113.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-112.29F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-111.33F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-113.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(95.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(105.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(83.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(86.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-106.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-106.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-114.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-108.91F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-120.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-113.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-112.29F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-111.33F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-113.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(95.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(105.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(83.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(86.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.19F, -27.18F, 14.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-20.57F, -26.93F, 2.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-28.58F, -24.93F, 0.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-8.16F, -31.72F, 13.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-5.25F, -33.38F, 6.32F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-46.96F, -31.02F, 37.94F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-52.42F, -13.19F, 43.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-64.37F, 2.25F, 46.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.18F, -33.9F, 21.19F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-25.74F, -28.42F, 28.77F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.68F, 10.72F, -28.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-11.17F, 6.47F, -20.55F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(16.9F, -0.03F, -16.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.14F, -1.29F, -7.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-72.54F, 0.12F, -7.82F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.48F, 25.15F, -15.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-20.18F, 25.67F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-27.43F, 24.41F, 5.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-8.71F, 29.99F, -14.16F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-5.9F, 31.4F, -7.47F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-46.9F, 30.99F, -35.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-52.38F, 13.18F, -41.24F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-64.83F, 3.02F, -39.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.17F, 33.91F, -19.07F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-25.72F, 28.41F, -26.62F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.51F, -12.7F, 29.93F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-10.94F, -7.42F, 20.55F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(16.89F, -0.03F, 16.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-94.94F, -0.03F, 7.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-72.55F, -0.07F, 8.22F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(100.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(106.1F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(97.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(17.22F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(12.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(66.81F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.87F, -11.05F, 7.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(21.34F, -2.75F, 6.98F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(15.0F, 3.94F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(30.35F, -23.77F, 0.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(32.0F, -25.67F, 0.38F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.04F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(13.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(11.13F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-31.67F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-11.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-11.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.35F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.27F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-27.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-27.45F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(8.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-29.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-30.46F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(9.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-19.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-19.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.87F, 11.05F, -7.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(21.34F, 2.75F, -6.98F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(15.12F, -3.46F, -3.61F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(30.35F, 23.77F, -0.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(32.0F, 25.67F, -0.38F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.2458F, 0.0425F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.5568F, 0.1065F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.6288F, 0.1205F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0708F, -0.6585F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0708F, -0.3535F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-15.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-18.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(12.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.06F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-5.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-4.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(23.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(21.22F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(15.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(12.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(8.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildFly() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.167F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-52.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(21.56F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-9.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-37.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(45.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(71.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-52.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(21.56F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-9.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-37.62F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(45.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(71.42F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(49.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(58.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-32.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(52.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(58.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-5.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-92.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-98.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(49.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.39F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(58.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-32.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(52.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(58.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-5.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-92.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-98.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.13F, 14.48F, 5.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(57.21F, -7.45F, -4.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-24.97F, 1.32F, -0.29F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-69.13F, 14.48F, 5.48F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.817F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-47.64F, 0.0F, -0.07F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(47.56F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.817F, KeyframeAnimations.degreeVec(39.27F, 0.1F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(24.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-36.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(17.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(18.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(11.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(8.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-11.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-6.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.75F, -14.96F, -5.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(59.38F, 9.79F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-24.96F, -1.38F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-69.75F, -14.96F, -5.51F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.817F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-44.83F, -0.22F, 0.19F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(44.99F, -0.17F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.817F, KeyframeAnimations.degreeVec(38.61F, -0.34F, 0.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(24.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-35.17F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -2.2408F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, -2.2348F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.posVec(0.0F, -2.5898F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -2.2148F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -2.2408F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(-8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-10.84F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-10.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-8.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.looping();
		return builder.build();
	}

	private static AnimationDefinition buildFlyToGround() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(3.183F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-10.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-35.76F, 10.17F, 1.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-83.95F, 2.19F, -20.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-92.48F, 0.47F, -33.16F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-93.01F, 0.39F, -34.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-89.01F, 1.79F, -24.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-86.54F, 1.84F, -26.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-85.29F, 1.6F, -27.12F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(-0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-131.35F, -16.08F, -2.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-66.3F, 2.7F, -15.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-106.69F, -56.62F, -37.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-107.53F, -62.0F, -29.83F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-105.6F, -61.85F, -30.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-116.75F, -63.27F, -29.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-94.38F, -57.16F, -40.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-87.06F, -54.19F, -45.57F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(54.96F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(112.76F, -8.03F, 6.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.39F, 14.29F, 8.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(69.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(79.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(78.67F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(84.79F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(68.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(58.46F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-10.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-33.3F, -12.17F, 4.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-77.88F, 0.01F, 26.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-86.3F, 1.38F, 41.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-86.6F, 1.22F, 43.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-82.02F, 0.0F, 32.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-80.15F, 0.0F, 33.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-78.25F, 0.04F, 32.86F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0001F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-131.27F, 15.25F, 1.44F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-65.26F, 4.29F, 14.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-116.98F, 56.01F, 26.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-114.52F, 59.33F, 30.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-112.33F, 59.22F, 32.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-132.08F, 59.5F, 14.44F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-100.35F, 55.61F, 42.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-92.28F, 53.04F, 48.6F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.46F, 6.6F, 0.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(112.68F, 7.92F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-2.62F, 0.13F, -0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(60.46F, 6.6F, 0.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(75.78F, 13.28F, 10.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(74.99F, 13.65F, 10.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(81.73F, 11.2F, 11.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(57.66F, 13.79F, 7.61F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(58.99F, 14.27F, 8.08F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-17.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-17.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-17.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(16.75F, -0.04F, 0.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-33.36F, -8.14F, -9.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-34.76F, -9.14F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-14.73F, -0.31F, 0.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.31F, -0.12F, 1.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-14.06F, -15.73F, 9.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-19.44F, -18.53F, 18.19F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-2.2F, 0.0F, 18.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-20.52F, -6.43F, 11.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-27.2F, -6.19F, 11.2F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.1F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-76.54F, -9.83F, 77.94F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-76.18F, 5.59F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-66.92F, 8.22F, -0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-30.42F, 0.86F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-19.47F, 0.73F, 0.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(12.37F, -16.73F, 4.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(13.92F, -25.94F, 4.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-7.07F, -17.83F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-15.08F, -13.88F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-19.08F, -11.75F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-5.62F, 7.14F, -5.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(22.67F, -0.46F, 0.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(16.83F, -0.54F, 0.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-50.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-68.15F, 0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-101.67F, 0.04F, -1.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-102.36F, 4.29F, -2.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-92.84F, 17.18F, -28.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-60.63F, 19.05F, -11.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-47.95F, 17.5F, -7.13F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(27.14F, -0.31F, 3.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-33.43F, -0.29F, 2.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-35.14F, 5.78F, 1.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-14.64F, -0.42F, 0.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.6F, -0.01F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-13.26F, 18.08F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-19.99F, 21.3F, -14.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-0.95F, 6.32F, -7.64F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-18.83F, 3.65F, -2.61F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-25.51F, 2.9F, -2.48F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.1F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-99.75F, 0.0F, -90.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-76.24F, 3.1F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-66.71F, 3.51F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-30.44F, 0.86F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-19.49F, 1.97F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(13.8F, 17.26F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(16.1F, 26.98F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-4.45F, 13.96F, 2.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-13.26F, 10.71F, 0.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-17.66F, 9.14F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-2.91F, -9.03F, 3.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(22.82F, -0.32F, 0.44F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(16.87F, -0.4F, 0.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-49.86F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-68.05F, -0.03F, 0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-101.53F, 0.01F, -1.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-103.42F, -6.1F, 8.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-92.01F, -7.85F, 13.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-60.89F, -10.5F, 5.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-48.58F, -9.9F, 2.95F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.35F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.35F, KeyframeAnimations.degreeVec(16.92F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-23.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(6.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(10.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(9.44F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-64.51F, 4.29F, 12.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(43.48F, 7.18F, 6.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(57.88F, 4.71F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(34.99F, 10.28F, 2.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-52.23F, 4.54F, 11.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-54.43F, 4.58F, 12.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-15.48F, 8.05F, 5.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-26.21F, 5.37F, -2.64F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-26.21F, 5.37F, -2.64F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.52F, 0.48F, -0.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(43.47F, -0.22F, 0.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-28.0F, 0.33F, -0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-30.63F, 0.38F, -0.29F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(47.3F, -0.04F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(54.29F, -0.07F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(47.3F, -0.04F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(33.37F, -0.03F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-50.71F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-35.73F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(18.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(18.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(18.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(18.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(18.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(18.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(25.09F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(34.75F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(12.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(31.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(14.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(18.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(9.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-64.87F, -4.95F, -11.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(42.32F, -0.41F, -8.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(58.24F, -2.59F, -10.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(33.19F, -8.59F, -5.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-52.62F, -4.52F, -11.16F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-54.73F, -4.56F, -11.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-14.74F, -7.84F, -3.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-26.06F, -6.1F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-26.06F, -6.1F, 0.02F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.01F, -0.03F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(44.51F, -0.17F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-26.42F, -0.03F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-29.01F, -0.03F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(45.56F, -0.1F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(52.56F, -0.1F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(45.56F, -0.1F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(32.55F, -0.04F, 0.02F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 10.3382F, 17.7165F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 3.8102F, 4.0655F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 2.5972F, -0.2925F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.9452F, -0.8905F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.2392F, -0.8905F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.1838F, -1.3425F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, -0.1988F, -1.4145F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.1818F, -0.8905F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.1262F, -1.3625F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.2392F, -1.2685F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(14.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(22.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(22.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(28.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(29.41F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(22.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(19.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(19.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(51.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(53.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(58.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(54.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(54.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(54.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-13.59F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-16.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-6.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.83F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-14.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-6.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-5.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-5.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-7.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.38F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-12.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-6.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-7.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-7.07F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-10.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-5.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-6.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-9.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.01F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-5.97F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.03F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-7.7F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-6.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.89F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildGroundToFly() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.5F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-96.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-77.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(34.61F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-22.19F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-11.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-148.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-102.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-53.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-148.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-28.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.23F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(46.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-3.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(78.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(52.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-96.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-77.76F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(34.61F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-22.19F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-11.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.11F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-148.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-102.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-53.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-148.99F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-28.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.23F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(46.21F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-3.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(78.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(52.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.49F, -25.53F, 25.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-2.55F, -33.03F, 9.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(1.99F, -33.8F, 10.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-6.15F, -47.76F, -26.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(41.39F, -9.39F, -11.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(41.39F, -9.39F, -11.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(55.48F, -7.53F, -19.15F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(-0.0001F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-42.34F, -36.97F, 36.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-21.71F, -43.24F, 34.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-5.23F, -49.34F, 22.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-69.17F, 2.02F, 52.25F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-51.58F, -13.31F, 49.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-66.62F, -20.17F, 49.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-32.43F, -43.41F, 35.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-46.76F, -10.65F, 47.85F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-62.91F, 13.88F, -32.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.29F, -0.01F, 0.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-108.2F, 0.01F, -0.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(16.89F, -0.45F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-4.46F, 12.79F, 3.47F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-27.63F, 3.85F, 3.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-67.44F, 9.72F, 4.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.89F, 3.46F, 8.15F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.8F, 23.64F, -25.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-2.37F, 31.46F, -9.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(1.94F, 32.15F, -11.12F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-5.68F, 47.76F, 27.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(41.33F, 9.84F, 12.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(41.33F, 9.84F, 12.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(55.79F, 7.72F, 19.15F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0003F, -0.2031F, 0.1159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-42.27F, 36.95F, -34.55F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-20.81F, 45.51F, -30.73F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-4.3F, 50.6F, -20.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-69.28F, -0.05F, -50.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-51.56F, 15.95F, -47.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-66.69F, 20.22F, -50.24F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-32.57F, 43.48F, -35.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-46.76F, 10.65F, -47.85F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-62.77F, -15.96F, 34.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.29F, -0.01F, 0.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-108.2F, 0.0F, -0.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(16.89F, -0.38F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-4.83F, -12.64F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-27.78F, -7.11F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-68.07F, -9.4F, 3.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-6.13F, 0.01F, -8.19F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(22.33F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(9.15F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(-0.0233F, 0.0082F, 0.0007F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(28.23F, -20.78F, 3.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-53.46F, 2.71F, 12.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(56.37F, 2.72F, 2.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-53.46F, 2.71F, 12.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.degreeVec(56.37F, 2.72F, 2.72F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(56.37F, 2.72F, 2.72F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-33.09F, -0.01F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-29.08F, 0.02F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(54.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-33.09F, -0.01F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(54.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.72F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(18.84F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(18.84F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-5.91F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.91F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.38F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-11.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-11.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(-0.0237F, -0.0088F, 0.0008F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(28.23F, 20.78F, -3.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-52.28F, -9.31F, -7.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(56.47F, 0.02F, -7.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-52.28F, -9.31F, -7.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.degreeVec(56.47F, 0.02F, -7.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(56.47F, 0.02F, -7.84F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 27.71F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-30.26F, 0.01F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-26.36F, 0.02F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(54.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-30.26F, 0.01F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(54.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.2622F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.2158F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.5548F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, 1.0272F, -0.0905F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 5.2502F, -0.4135F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 3.8522F, -0.3055F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 3.4562F, -0.3035F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 9.5082F, -0.4385F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-11.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(9.32F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(12.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(63.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(26.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(40.24F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(26.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.09F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-13.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(16.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(16.8F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-10.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(9.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(9.9F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.34F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-7.7F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.82F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-5.74F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.18F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildIdle() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.667F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-55.0F, 10.2F, 3.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-55.36F, 10.2F, 3.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-55.0F, 10.2F, 3.31F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-157.08F, -18.06F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-148.22F, -18.71F, -0.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-157.08F, -18.06F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(73.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(73.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(73.49F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-83.56F, 15.3F, 1.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-80.16F, 15.03F, 1.81F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-83.56F, 15.3F, 1.38F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(68.01F, -9.0F, -6.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(67.28F, -12.3F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(68.01F, -9.0F, -6.05F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.69F, -12.31F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-4.45F, -12.31F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.69F, -12.31F, 0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.15F, -8.03F, 9.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-29.82F, -7.57F, 9.99F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-27.15F, -8.03F, 9.63F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-67.22F, -0.02F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-56.28F, -0.02F, 0.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-67.22F, -0.02F, 0.02F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.31F, 12.72F, 6.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(5.96F, 13.16F, 4.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(12.31F, 12.72F, 6.2F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-43.34F, 8.43F, -11.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-45.05F, 7.63F, -11.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-43.34F, 8.43F, -11.08F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-61.78F, 0.0F, -0.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-50.91F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-61.78F, 0.0F, -0.13F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(8.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.48F, 6.68F, -0.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-2.43F, 6.24F, -0.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-2.48F, 6.68F, -0.69F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-6.66F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-7.12F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-14.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.85F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(9.03F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(9.85F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.44F, 0.0F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(8.28F, 0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(9.44F, 0.0F, -0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.11F, -0.01F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(6.78F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(8.11F, -0.01F, 0.09F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(5.85F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(5.85F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.looping();
		return builder.build();
	}

	private static AnimationDefinition buildLeftTailSweep() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.06F, 1.55F, -2.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-96.07F, 1.81F, -2.6F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.57F, 1.88F, -2.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-90.76F, 2.23F, -2.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.47F, 0.48F, 0.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-85.2F, 0.26F, 3.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-85.2F, 0.26F, 3.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.36F, 10.2F, 3.2F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-121.31F, -40.67F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-136.73F, -37.67F, 6.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-148.88F, -35.65F, 11.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-148.67F, -35.39F, 11.81F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-132.25F, -29.85F, -8.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-154.51F, -23.65F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-154.51F, -23.65F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.22F, -18.71F, -0.91F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(86.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(94.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.04F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(93.6F, 1.77F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.22F, 0.88F, 0.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.32F, 4.37F, 21.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-102.75F, 6.3F, 27.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.53F, 34.56F, 21.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-66.53F, 34.56F, 21.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.16F, 15.03F, 1.81F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.53F, -17.28F, -8.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(51.47F, -25.06F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.28F, -12.3F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.91F, 0.0F, -12.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(20.2F, 1.08F, -31.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(25.79F, 3.5F, -39.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(19.4F, -16.87F, -42.6F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-17.55F, -2.79F, 10.64F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-18.05F, -3.23F, 11.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.45F, -12.31F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-68.62F, -11.94F, 9.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-79.1F, -18.96F, 11.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-81.57F, -20.72F, 5.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-36.36F, -12.2F, 19.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.91F, -23.81F, -7.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(8.19F, -23.69F, -7.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-29.82F, -7.57F, 9.99F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.28F, -6.72F, 1.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-35.14F, -26.42F, 9.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-33.78F, -27.85F, 11.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-51.95F, -34.98F, 19.47F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-67.77F, -38.5F, 28.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.71F, 12.22F, -21.07F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-97.67F, 12.83F, -21.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.28F, -0.02F, 0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.34F, 9.37F, 14.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(5.96F, 13.16F, 4.78F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, -0.0294F, 0.0212F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0003F, -0.0294F, 0.0212F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.7F, 13.18F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-54.51F, 33.15F, 2.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-54.51F, 33.15F, 2.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.05F, 7.63F, -11.76F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.45F, 9.89F, 8.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-47.99F, 27.28F, -16.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-47.99F, 27.28F, -16.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.91F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.89F, -17.89F, 0.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(51.45F, -23.57F, 4.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(48.03F, -25.52F, 5.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(59.86F, -15.32F, 1.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.1F, 8.03F, -2.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(42.69F, 40.43F, 1.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(25.46F, 51.52F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.0127F, -0.0338F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0047F, -0.0158F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(36.8F, -44.75F, 11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(29.78F, -40.48F, 18.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(41.53F, -48.6F, 6.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(41.53F, -48.6F, 6.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.01F, -35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.79F, -20.76F, 0.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.02F, -56.64F, -22.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(37.05F, -71.82F, -50.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.53F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.8F, 10.2F, -0.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-7.83F, 12.47F, -0.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, 6.65F, -1.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-16.11F, 14.92F, -2.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-12.21F, 18.97F, -2.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.35F, 5.96F, -1.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.61F, 14.06F, -1.94F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.59F, 18.12F, -1.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.31F, 8.4F, -0.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-6.78F, 10.89F, -0.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.0133F, 0.0332F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0043F, 0.0162F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(31.84F, 46.46F, -12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(36.15F, 53.11F, -9.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(25.43F, 37.51F, -18.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(25.43F, 37.51F, -18.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-0.45F, 36.16F, 0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.23F, 34.95F, 0.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0398F, 0.0775F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.2038F, 0.4605F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.2348F, 0.5315F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.2715F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3055F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3225F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.01F, 8.93F, -7.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(8.83F, 16.98F, -7.82F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.69F, 18.46F, -7.82F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(6.87F, -6.84F, -8.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(20.16F, -28.57F, -14.71F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(21.54F, -30.06F, -15.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.71F, 22.27F, 1.59F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(1.87F, 24.29F, 1.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.02F, -27.69F, 12.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.04F, -29.97F, 13.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.43F, 6.24F, -0.85F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.48F, -0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-8.16F, 0.04F, -0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.14F, -10.49F, -0.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.13F, -10.31F, -0.53F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.76F, -0.01F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.44F, 0.01F, -0.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.06F, -10.75F, 0.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.09F, -10.57F, 0.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.82F, 0.02F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-10.24F, -10.78F, 1.93F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-10.26F, -10.61F, 1.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.04F, -0.13F, 0.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(11.13F, -0.11F, 0.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(16.2F, -31.47F, -6.55F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(14.7F, -34.63F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.03F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.35F, -0.08F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(9.5F, -0.04F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(15.58F, -31.52F, -8.29F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(16.41F, -33.71F, -9.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.28F, 0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.14F, -0.03F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(6.26F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(12.26F, -25.66F, -8.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(13.05F, -27.84F, -9.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.78F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.19F, -7.5F, 0.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.3F, -9.7F, 0.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.03F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.18F, -6.78F, 0.13F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.3F, -8.95F, 0.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.03F, 0.03F, -0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.11F, -9.51F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.28F, -12.29F, 0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.91F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.03F, 0.03F, -0.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.38F, -12.29F, -0.3F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.28F, -9.87F, -0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.41F, 0.02F, -0.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.09F, 0.04F, -0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.24F, -10.22F, -0.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.24F, -10.05F, -0.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildRightTailSweep() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-100.26F, -0.01F, -27.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-102.75F, -6.3F, -27.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.72F, 0.79F, 1.49F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(-0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.53F, -34.56F, -21.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-66.53F, -34.56F, -21.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.2F, -13.54F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.53F, 17.28F, 8.84F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(52.34F, 22.14F, 6.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(66.86F, 5.96F, 0.67F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.34F, 0.02F, 9.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-96.26F, 0.0F, 7.87F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.72F, -0.03F, 7.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-90.82F, 0.0F, 6.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.47F, 0.48F, 0.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-85.2F, 0.26F, 3.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-85.2F, 0.26F, 3.39F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.27F, -10.0F, 6.23F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0001F, -0.1466F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.28F, 38.31F, 4.32F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-134.05F, 35.25F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-148.88F, 35.65F, -11.62F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-148.67F, 35.39F, -11.81F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-132.54F, 29.68F, 7.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-153.41F, 22.45F, 5.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-153.41F, 22.45F, 5.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.27F, 16.27F, -0.61F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(86.95F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(94.31F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.04F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(93.6F, 1.77F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.22F, 0.88F, 0.45F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, -0.14F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.43F, -11.55F, -13.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.02F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(5.4F, -13.39F, -0.01F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, -0.0294F, 0.0212F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(-0.0001F, -0.0294F, 0.0212F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.53F, -10.78F, 0.57F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-53.53F, -28.63F, -3.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-53.53F, -28.63F, -3.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.02F, -5.59F, 13.76F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-33.2F, -13.37F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-47.99F, -27.28F, 16.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-47.99F, -27.28F, 16.58F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.91F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.04F, 1.2F, 12.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(20.53F, 0.01F, 31.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(27.21F, 0.0F, 40.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(19.4F, 16.87F, 42.6F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-17.55F, 1.8F, -12.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-17.99F, 1.67F, -13.95F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.41F, 12.32F, 0.36F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0003F, -0.0587F, 0.0415F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-68.62F, 11.94F, -9.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-79.1F, 18.96F, -11.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-84.12F, 23.69F, -12.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-36.35F, 13.24F, -18.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.91F, 23.81F, 7.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(8.19F, 23.69F, 7.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-29.81F, 7.93F, -9.52F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.03F, 0.0F, -0.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-35.14F, 26.42F, -9.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-33.78F, 27.85F, -11.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-51.95F, 34.98F, -19.47F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-67.77F, 38.5F, -28.8F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.71F, -12.22F, 21.07F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-97.67F, -12.83F, 21.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.28F, -0.02F, 0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.94F, 17.51F, -0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(51.97F, 21.54F, -0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(48.79F, 23.12F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(59.99F, 14.22F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.55F, -13.63F, 1.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(42.15F, -41.09F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(24.09F, -52.09F, 2.98F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0005F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0043F, 0.0162F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(-0.0043F, 0.0162F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0043F, 0.0162F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0043F, 0.0162F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(-0.0133F, 0.0332F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(-0.0043F, 0.0162F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(-0.0043F, 0.0162F, 0.0007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(31.84F, -46.46F, 12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(31.84F, -46.46F, 12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(31.84F, -46.46F, 12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(31.84F, -46.46F, 12.77F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(36.15F, -53.11F, 9.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(25.43F, -37.51F, 18.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(25.43F, -37.51F, 18.91F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, -44.58F, 16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.75F, -36.16F, 0.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.75F, -36.16F, 0.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.75F, -36.16F, 0.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-0.75F, -36.16F, 0.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.75F, -36.16F, 0.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.75F, -36.16F, 0.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-0.75F, -36.16F, 0.66F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.85F, -34.93F, 1.46F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.56F, 20.77F, 0.49F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.02F, 56.64F, 22.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(37.05F, 71.82F, 50.63F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.08F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.53F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.8F, -10.2F, 0.88F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-7.83F, -12.47F, 0.86F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, -6.67F, 1.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-16.1F, -14.93F, 2.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-12.21F, -18.97F, 2.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.57F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.48F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.34F, -5.97F, 1.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.61F, -14.06F, 1.94F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.59F, -18.12F, 1.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-11.3F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.94F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.31F, -8.4F, 0.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-6.78F, -10.89F, 0.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0047F, -0.0158F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(-0.0047F, -0.0158F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.0047F, -0.0158F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.0047F, -0.0158F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(-0.0127F, -0.0338F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(-0.0047F, -0.0158F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(-0.0047F, -0.0158F, 0.0008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.8F, 44.75F, -11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(36.8F, 44.75F, -11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(36.8F, 44.75F, -11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(36.8F, 44.75F, -11.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(29.78F, 40.48F, -18.4F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(41.53F, 48.6F, -6.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(41.53F, 48.6F, -6.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.54F, 44.58F, -16.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.01F, 35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.01F, 35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.01F, 35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-0.01F, 35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.01F, 35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.01F, 35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-0.01F, 35.87F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 34.34F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0398F, 0.0775F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.2038F, 0.4605F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.2348F, 0.5315F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.2715F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3055F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.0398F, -1.3225F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0972F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.01F, -8.93F, 7.89F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(8.83F, -16.98F, 7.82F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.69F, -18.46F, 7.82F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(6.87F, 6.84F, 8.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(18.8F, 29.34F, 9.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(20.22F, 30.81F, 10.7F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.92F, -22.19F, -7.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(3.18F, -24.21F, -7.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.02F, 27.69F, -12.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.04F, 29.97F, -13.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.35F, -6.27F, -0.59F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.48F, -0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-8.16F, 0.04F, -0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.04F, 10.49F, -0.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.04F, 10.31F, -0.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.76F, -0.01F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.44F, 0.01F, -0.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.01F, 10.75F, 0.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.02F, 10.57F, 0.37F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.82F, 0.02F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-10.06F, 10.95F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-10.08F, 10.77F, -0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.77F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.04F, -0.13F, 0.48F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(11.13F, -0.11F, 0.28F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(15.04F, 32.0F, 2.38F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(15.52F, 34.29F, 2.68F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.03F, 0.04F, -0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.35F, -0.08F, 0.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(9.5F, -0.04F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(15.33F, 31.63F, 7.42F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(16.08F, 33.84F, 8.17F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.28F, 0.01F, -0.14F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.14F, -0.03F, 0.08F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(6.26F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(11.38F, 26.01F, 5.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(12.02F, 28.23F, 5.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.78F, 0.0F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-0.03F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.15F, 7.5F, 0.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.22F, 9.7F, 0.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.06F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.03F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.17F, 6.78F, 0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.28F, 8.95F, 0.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.03F, 0.03F, -0.11F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.12F, 9.51F, 0.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.31F, 12.29F, 0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.91F, 0.0F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.03F, 0.03F, -0.2F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.32F, 12.29F, -0.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.24F, 9.88F, -0.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.41F, 0.02F, -0.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.09F, 0.04F, -0.26F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.17F, 10.23F, -0.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.17F, 10.05F, -0.36F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition buildWalk() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.333F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-64.2F, 0.51F, 3.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-87.08F, 0.03F, 0.31F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-105.67F, 5.2F, -10.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.18F, 0.0F, -0.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-64.2F, 0.51F, 3.27F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(-0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-149.01F, -6.13F, -6.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-101.36F, -9.97F, -11.85F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-68.9F, -3.2F, -16.99F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-139.44F, -16.65F, -2.15F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-149.01F, -6.13F, -6.09F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(42.51F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(25.98F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(95.54F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(59.85F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-104.72F, 4.99F, 5.23F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-63.15F, -0.26F, -0.67F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-64.54F, 1.17F, 2.69F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-85.44F, -0.01F, 1.22F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-104.72F, 4.99F, 5.23F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0001F, 0.027F, -0.5514F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-70.53F, 2.44F, 11.76F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-136.88F, 8.2F, 1.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-149.08F, -1.15F, 1.51F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-103.76F, 9.87F, 9.93F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-70.53F, 2.44F, 11.76F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.39F, 0.81F, -0.55F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(93.56F, 1.0F, 0.65F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(59.52F, 1.5F, -0.04F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(40.79F, 0.0F, -0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(26.39F, 0.81F, -0.55F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-0.06F, -0.2F, 0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.28F, 3.37F, -1.79F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(49.59F, 1.12F, -32.64F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(5.78F, -0.1F, 0.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.93F, -0.09F, 0.71F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-11.28F, 3.37F, -1.79F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(-0.0001F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.41F, 1.46F, 1.52F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-49.25F, -21.77F, 3.34F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-128.43F, 0.21F, -0.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-75.35F, 3.17F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-20.41F, 1.46F, 1.52F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-73.05F, 0.0F, -1.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-79.36F, -0.02F, 11.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(16.89F, -0.25F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-31.2F, 0.4F, -0.56F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-73.05F, 0.0F, -1.09F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.94F, -0.23F, 0.33F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-2.17F, -0.14F, 0.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.37F, -0.82F, 1.41F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(46.89F, -1.11F, 46.47F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(13.94F, -0.23F, 0.33F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0003F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-115.42F, 7.62F, -2.75F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-66.97F, 4.54F, 0.02F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-20.41F, 1.48F, 1.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-53.43F, 8.36F, 58.83F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-115.42F, 7.62F, -2.75F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0001F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.29F, -0.1F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-32.23F, 0.25F, -0.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-72.6F, -0.02F, -1.1F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-71.94F, -43.23F, -24.74F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-3.29F, -0.1F, 0.05F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.06F, 0.03F, -0.14F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, -0.03F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.09F, 0.06F, -0.09F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-0.06F, -0.06F, 0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.03F, 0.03F, -0.17F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(33.73F, -30.79F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(29.98F, -34.67F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(33.73F, -30.79F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(29.98F, -34.67F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(33.73F, -30.79F, 2.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.49F, -0.7F, 0.9F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-32.52F, 0.0F, -0.43F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-57.52F, -1.54F, 2.42F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-33.78F, 0.06F, -0.3F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-51.49F, -0.7F, 0.9F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(12.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.66F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(7.64F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.19F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(6.26F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.65F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.14F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(11.19F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(5.91F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(11.36F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(10.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.43F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0003F, 0.0002F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(34.96F, 33.11F, -1.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(31.12F, 37.23F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(34.96F, 33.11F, -1.18F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(31.12F, 37.23F, 0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(34.96F, 33.11F, -1.18F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5872F, -0.1135F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.9932F, -0.1135F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.5802F, -0.1135F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.0072F, -0.1135F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.5872F, -0.1135F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.03F, -0.29F, 0.78F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(17.22F, -0.04F, 0.05F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(20.0F, -0.34F, 0.92F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(19.18F, 0.54F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(20.03F, -0.29F, 0.78F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(69.05F, 0.32F, -0.46F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(72.52F, 0.2F, -0.21F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(69.07F, 0.33F, -0.54F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(72.52F, 0.05F, -0.01F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(69.05F, 0.32F, -0.46F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-6.55F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-6.6F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.03F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.49F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-6.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.49F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-6.37F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.49F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.41F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-7.87F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.41F, 0.02F, -0.06F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.87F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-7.41F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.76F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-8.63F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.82F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.63F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-7.76F, 0.03F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.53F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.59F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.68F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-7.53F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-7.93F, 0.0F, -0.03F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.93F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.78F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.looping();
		return builder.build();
	}

	public static AnimationDefinition get(String animationName) {
        return switch (animationName) {
            case "airstrike" -> DRAGON_AIRSTRIKE;
            case "attack1" -> DRAGON_ATTACK1;
            case "attack2" -> DRAGON_ATTACK2;
            case "attack3" -> DRAGON_ATTACK3;
            case "backjump_move" -> DRAGON_BACKJUMP_MOVE;
            case "backjump_prepare" -> DRAGON_BACKJUMP_PREPARE;
            case "backjump_recovery" -> DRAGON_BACKJUMP_RECOVERY;
            case "crystal_link" -> DRAGON_CRYSTAL_LINK;
            case "death" -> DRAGON_DEATH;
            case "fireball" -> DRAGON_FIREBALL;
            case "fly" -> DRAGON_FLY;
            case "fly_to_ground" -> DRAGON_FLY_TO_GROUND;
            case "ground_to_fly" -> DRAGON_GROUND_TO_FLY;
            case "idle" -> DRAGON_IDLE;
            case "left_tail_sweep" -> DRAGON_LEFT_TAIL_SWEEP;
            case "right_tail_sweep" -> DRAGON_RIGHT_TAIL_SWEEP;
            case "walk" -> DRAGON_WALK;
            default -> throw new IllegalArgumentException("[EpicDragonFight] Unknown animation: " + animationName);
        };
	}
}