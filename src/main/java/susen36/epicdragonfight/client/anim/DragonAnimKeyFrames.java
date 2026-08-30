package susen36.epicdragonfight.client.anim;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
@OnlyIn(Dist.CLIENT)
public class DragonAnimKeyFrames {
	private static final AnimationDefinition DRAGON_ATTACK1 =
			buildAttack1();
	private static final AnimationDefinition DRAGON_ATTACK2 =
			buildAttack2();
	private static final AnimationDefinition DRAGON_CRYSTAL_LINK =
			buildCrystalLink();
	private static final AnimationDefinition DRAGON_FIREBALL =
			buildFireball();
	private static final AnimationDefinition DRAGON_FLY =
			buildFly();
	private static final AnimationDefinition DRAGON_FLY_TO_GROUND =
			buildFlyToGround();
	private static final AnimationDefinition DRAGON_IDLE =
			buildIdle();
	private static final AnimationDefinition DRAGON_LEFT_TAIL_SWEEP =
			buildLeftTailSweep();
	private static final AnimationDefinition DRAGON_RIGHT_TAIL_SWEEP =
			buildRightTailSweep();
	private static final AnimationDefinition DRAGON_WALK =
			buildWalk();
	private static AnimationDefinition buildAttack1() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.0F, 1.5F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-96.0F, 2.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.5F, 2.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-91.0F, 2.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.5F, 0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-85.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-85.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.5F, 10.0F, 3.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-121.5F, -40.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-136.5F, -37.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-149.0F, -35.5F, 11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-148.5F, -35.5F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-132.0F, -30.0F, -8.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-154.5F, -23.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-154.5F, -23.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.0F, -18.5F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(87.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(94.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(93.5F, 2.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.0F, 1.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.5F, 4.5F, 22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-103.0F, 6.5F, 27.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.5F, 34.5F, 22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-66.5F, 34.5F, 22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.0F, 15.0F, 2.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.5F, -17.5F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(51.5F, -25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.0F, 0.0F, -12.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(20.0F, 1.0F, -31.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(26.0F, 3.5F, -40.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(19.5F, -17.0F, -42.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-17.5F, -3.0F, 10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-18.0F, -3.0F, 11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-68.5F, -12.0F, 9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-77.0F, -18.5F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-81.5F, -20.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-36.5F, -12.0F, 20.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(7.0F, -24.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(8.0F, -23.5F, -7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-30.0F, -7.5F, 10.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, -6.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-32.0F, -24.5F, 6.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-34.0F, -28.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-68.0F, -38.5F, 29.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-95.5F, 12.0F, -21.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-97.5F, 13.0F, -21.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 22.0F, 88.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(102.5F, 20.0F, 167.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(97.5F, -3.0F, 177.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(82.5F, 24.0F, 149.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(49.5F, 25.5F, -21.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(40.5F, -6.5F, -22.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(42.5F, -35.5F, -78.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(40.5F, -30.5F, -85.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(40.5F, -30.5F, -85.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.0F, 13.0F, 5.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.5F, 65.0F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-22.0F, 42.0F, 21.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-6.0F, 31.0F, 23.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(98.0F, 86.5F, 158.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(-155.0F, 18.0F, -52.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-137.5F, -15.0F, -18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-123.5F, -28.0F, -31.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-123.5F, -28.0F, -31.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.0F, 7.5F, -12.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.0F, 28.5F, 57.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-15.0F, 31.5F, 54.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-17.0F, 33.5F, 54.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-6.5F, 22.0F, 52.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-15.0F, -22.5F, -7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-15.5F, -28.5F, -9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-15.5F, -28.5F, -9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-51.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.0F, -18.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(51.5F, -23.5F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(48.0F, -25.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(60.0F, -15.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.0F, 8.0F, -3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(42.5F, 40.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.5F, 51.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(30.0F, -40.5F, 18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(41.5F, -48.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(41.5F, -48.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-1.0F, -21.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(13.0F, -56.5F, -22.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(37.0F, -72.0F, -50.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-10.0F, 10.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.0F, 12.5F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, 6.5F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-16.0F, 15.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-12.0F, 19.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, 6.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-15.5F, 14.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-11.5F, 18.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.5F, 8.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.0F, 11.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(36.0F, 53.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(25.5F, 37.5F, -19.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.5F, 37.5F, -19.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 9.0F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(9.0F, 17.0F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.5F, 18.5F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.0F, -7.0F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(20.0F, -28.5F, -14.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(21.5F, -30.0F, -15.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.5F, 22.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-3.5F, 22.5F, 6.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(14.0F, 24.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(20.0F, 22.0F, 15.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.5F, 6.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}
	private static AnimationDefinition buildAttack2() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-91.5F, 0.5F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-85.5F, 0.0F, -10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.5F, 10.0F, 3.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-117.5F, -32.5F, -18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-150.0F, -39.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.0F, -18.5F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(82.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(86.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-108.0F, 14.5F, 18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-84.5F, -20.5F, 18.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.5F, 33.5F, 22.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-153.0F, 22.0F, -40.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.0F, 15.0F, 2.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(58.0F, -14.5F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(83.5F, -26.0F, -20.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(63.0F, 6.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(85.5F, 7.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(86.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(59.0F, -14.5F, 60.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(41.0F, -1.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(35.5F, 24.0F, 84.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(36.5F, 31.5F, 101.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(36.5F, 31.5F, 101.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.5F, -48.5F, -43.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-31.0F, -51.5F, -31.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-33.0F, -50.5F, -29.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-36.5F, -87.0F, -33.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(-141.0F, -20.5F, 90.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-143.0F, 16.0F, 3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-131.0F, 29.0F, 5.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-131.0F, 29.0F, 5.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-30.0F, -7.5F, 10.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, -22.0F, -19.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(4.5F, -30.5F, -52.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(17.0F, -0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(13.0F, 26.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(16.0F, 36.0F, 24.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(16.0F, 36.0F, 24.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.5F, -12.0F, -16.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(25.0F, -9.0F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(23.0F, -11.0F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(8.0F, 24.0F, 55.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-28.5F, -1.0F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-32.0F, -1.0F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.0F, 13.0F, 5.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-67.5F, 17.5F, -25.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-81.0F, 35.0F, -23.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-76.5F, 38.0F, -28.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-33.5F, 39.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(23.5F, 20.0F, 7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(23.5F, 25.0F, 8.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.0F, 7.5F, -12.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 11.0F, 43.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-32.5F, 21.5F, 43.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-31.5F, 23.0F, 44.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-43.5F, 24.0F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-89.5F, 4.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-91.5F, 2.5F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-51.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.0F, 21.0F, 6.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(42.5F, 8.5F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(44.5F, 9.0F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(48.5F, 2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(67.0F, 2.5F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(30.5F, -57.0F, 8.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(1.0F, -66.5F, 28.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(35.0F, -48.0F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(33.5F, -40.5F, 14.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, -10.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(17.5F, 49.5F, 20.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.0F, 57.0F, 28.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-22.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, -6.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-18.5F, -8.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-18.0F, -8.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, -6.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-19.5F, -8.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-19.0F, -8.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(29.5F, 46.0F, -17.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(32.5F, 46.0F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -8.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(9.5F, -18.5F, -3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.5F, -19.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(8.5F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(8.0F, 10.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(19.5F, 30.0F, 9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(22.0F, 31.0F, 10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.5F, -6.0F, -5.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.5F, 0.5F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(18.5F, -4.0F, -5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(23.0F, 2.5F, -6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.5F, 6.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(10.5F, -8.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}
	private static AnimationDefinition buildCrystalLink() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(9.8F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-106.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-106.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-104.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-101.0F, 0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(-68.0F, 2.0F, 4.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-55.0F, 10.0F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-55.0F, 10.0F, 3.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-123.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-96.0F, 4.0F, -3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-100.5F, 4.0F, -3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-113.5F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(-163.5F, -15.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-157.0F, -18.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-157.0F, -18.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(107.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(109.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(95.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(97.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(92.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(104.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-106.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-103.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-107.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-123.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-100.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-97.0F, 5.0F, -4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-83.5F, 15.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-83.5F, 15.5F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(107.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(109.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(96.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(96.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(68.0F, -9.0F, -6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(68.0F, -9.0F, -6.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-21.0F, 3.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-19.5F, -0.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(3.5F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-5.5F, -7.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-35.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-70.5F, 6.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-68.5F, 6.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(-24.5F, 3.5F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-28.5F, 0.0F, 6.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-27.0F, -8.0F, 9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-27.0F, -8.0F, 9.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(-51.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-46.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-67.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-67.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-19.5F, 0.0F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-17.5F, -1.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(12.5F, 12.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(12.5F, 12.5F, 6.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-35.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-68.5F, 4.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-59.0F, 5.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-43.5F, 8.5F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-43.5F, 8.5F, -11.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-62.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-62.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(58.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(63.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-46.5F, 4.5F, 4.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-44.0F, -3.5F, -9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(41.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(41.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(-0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-85.0F, 83.0F, -128.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-70.0F, 79.5F, -112.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(-47.5F, 21.0F, -54.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-48.0F, 18.0F, -51.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(62.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.degreeVec(48.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-24.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-24.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-25.5F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-25.5F, -6.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(39.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(39.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(29.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(29.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-54.0F, -83.5F, 95.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.5F, -79.5F, 110.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(-47.5F, -21.0F, 57.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-48.0F, -18.0F, 53.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(62.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.degreeVec(48.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.5F, 22.5F, 11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 22.5F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-4.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-4.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-2.5F, 6.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-2.5F, 6.5F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, -14.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(7.5F, -14.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.5F, -9.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(6.5F, -9.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-14.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-14.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -8.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, -8.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.5F, -14.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-0.5F, -14.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.5F, -18.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(6.5F, -18.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.0F, -20.5F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(8.0F, -20.5F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.0F, -21.5F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(9.0F, -21.5F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.0F, -20.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(9.0F, -20.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.5F, -17.5F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(8.5F, -17.5F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}
	private static AnimationDefinition buildFireball() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.333F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-106.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-106.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-114.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-109.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-114.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-112.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-111.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-113.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(96.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(105.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(83.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(87.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-106.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-106.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-114.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-109.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-114.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-112.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-111.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-113.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(96.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(105.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(83.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(87.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.0F, -27.0F, 14.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-20.5F, -27.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-28.5F, -25.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-8.0F, -31.5F, 13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-5.0F, -33.5F, 6.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.0F, -31.0F, 38.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-52.5F, -13.0F, 43.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-64.5F, 2.0F, 47.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.0F, -34.0F, 21.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-25.5F, -28.5F, 29.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 10.5F, -29.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-11.0F, 6.5F, -20.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(17.0F, 0.0F, -16.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.0F, -1.5F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, -8.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 25.0F, -15.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-20.0F, 25.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-27.5F, 24.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-8.5F, 30.0F, -14.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.0F, 31.5F, -7.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.0F, 31.0F, -36.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-52.5F, 13.0F, -41.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-65.0F, 3.0F, -40.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.0F, 34.0F, -19.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-25.5F, 28.5F, -26.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, -12.5F, 30.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-11.0F, -7.5F, 20.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 16.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.0F, 0.0F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 8.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(100.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(106.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(97.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(67.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, -11.0F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(21.5F, -3.0F, 7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(15.0F, 4.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(30.5F, -24.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(32.0F, -25.5F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -27.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, -27.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, -27.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, -27.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, -27.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-31.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-27.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-30.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-19.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-19.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, 11.0F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(21.5F, 3.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(15.0F, -3.5F, -3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(30.5F, 24.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(32.0F, 25.5F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 27.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 27.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-15.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-5.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(21.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}
	private static AnimationDefinition buildFly() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.167F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(21.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(45.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(71.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(21.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(45.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(71.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(49.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(53.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(59.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-5.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-92.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-98.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(49.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(53.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(59.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-5.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-92.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-98.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.5F, -14.5F, -5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.292F, KeyframeAnimations.degreeVec(7.0F, -14.5F, -51.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.584F, KeyframeAnimations.degreeVec(18.5F, -14.5F, -5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(7.0F, -14.5F, 40.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-4.5F, -14.5F, -5.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 60.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 39.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.584F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 60.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(19.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(19.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.5F, 14.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.292F, KeyframeAnimations.degreeVec(7.0F, 14.5F, 51.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.584F, KeyframeAnimations.degreeVec(18.5F, 14.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(7.0F, 14.5F, -40.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-4.5F, 14.5F, 5.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -39.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.584F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.looping();
		return builder.build();
	}
	private static AnimationDefinition buildFlyToGround() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(3.183F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-36.0F, 10.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-84.0F, 2.0F, -20.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-92.5F, 0.5F, -33.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-93.0F, 0.5F, -34.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-89.0F, 2.0F, -24.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-86.5F, 2.0F, -26.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-85.5F, 1.5F, -27.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-131.5F, -16.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-66.5F, 2.5F, -16.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-106.5F, -56.5F, -37.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-107.5F, -62.0F, -30.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-105.5F, -62.0F, -31.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-117.0F, -63.5F, -30.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-94.5F, -57.0F, -40.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-87.0F, -54.0F, -45.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(113.0F, -8.0F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.5F, 14.5F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(79.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(78.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(85.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(69.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(58.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-33.5F, -12.0F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-78.0F, 0.0F, 26.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-86.5F, 1.5F, 41.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-86.5F, 1.0F, 43.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-82.0F, 0.0F, 33.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-80.0F, 0.0F, 33.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-78.0F, 0.0F, 33.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-131.5F, 15.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-65.5F, 4.5F, 14.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-117.0F, 56.0F, 27.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-114.5F, 59.5F, 30.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-112.5F, 59.0F, 32.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-132.0F, 59.5F, 14.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-100.5F, 55.5F, 42.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-92.5F, 53.0F, 48.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.5F, 6.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(112.5F, 8.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(60.5F, 6.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(76.0F, 13.5F, 10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(75.0F, 13.5F, 10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(81.5F, 11.0F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(57.5F, 14.0F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(59.0F, 14.5F, 8.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-18.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-33.5F, -8.0F, -9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-35.0F, -9.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-14.5F, -0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-14.0F, -15.5F, 10.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-19.5F, -18.5F, 18.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-2.0F, 0.0F, 18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-20.5F, -6.5F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-27.0F, -6.0F, 11.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-76.5F, -10.0F, 78.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-76.0F, 5.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-67.0F, 8.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-30.5F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-19.5F, 0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(12.5F, -16.5F, 4.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(14.0F, -26.0F, 4.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-7.0F, -18.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-15.0F, -14.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-19.0F, -12.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-5.5F, 7.0F, -6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(22.5F, -0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(17.0F, -0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-68.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-101.5F, 0.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-102.5F, 4.5F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-93.0F, 17.0F, -29.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-60.5F, 19.0F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-48.0F, 17.5F, -7.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(27.0F, -0.5F, 3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-33.5F, -0.5F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-35.0F, 6.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-14.5F, -0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-13.5F, 18.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-20.0F, 21.5F, -14.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-1.0F, 6.5F, -7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-19.0F, 3.5F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-25.5F, 3.0F, -2.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-100.0F, 0.0F, -90.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-76.0F, 3.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-66.5F, 3.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-30.5F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-19.5F, 2.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(14.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(16.0F, 27.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-4.5F, 14.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-13.5F, 10.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-17.5F, 9.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-3.0F, -9.0F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(23.0F, -0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(17.0F, -0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-68.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-101.5F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-103.5F, -6.0F, 9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-92.0F, -8.0F, 13.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-61.0F, -10.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-48.5F, -10.0F, 3.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.35F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-24.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-64.5F, 4.5F, 12.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(43.5F, 7.0F, 7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(58.0F, 4.5F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(35.0F, 10.5F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-52.0F, 4.5F, 11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-54.5F, 4.5F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-15.5F, 8.0F, 5.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-26.0F, 5.5F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-26.0F, 5.5F, -2.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(43.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-28.0F, 0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-30.5F, 0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(47.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(54.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(47.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(33.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(19.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-50.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-35.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(32.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(19.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, -5.0F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(42.5F, -0.5F, -8.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(58.0F, -2.5F, -10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(33.0F, -8.5F, -5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-52.5F, -4.5F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-54.5F, -4.5F, -11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-14.5F, -8.0F, -3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-26.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-26.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(44.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-26.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-29.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(45.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(45.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 10.5F, 17.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 4.0F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 2.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 1.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.5F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 0.5F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(28.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(29.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(19.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(51.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(53.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(58.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(54.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-13.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-16.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-5.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}
	private static AnimationDefinition buildIdle() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.667F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-55.0F, 10.0F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-55.5F, 10.0F, 3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-55.0F, 10.0F, 3.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-157.0F, -18.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-148.0F, -18.5F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-157.0F, -18.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-83.5F, 15.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-80.0F, 15.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-83.5F, 15.5F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(68.0F, -9.0F, -6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(67.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(68.0F, -9.0F, -6.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-4.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.0F, -8.0F, 9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-30.0F, -7.5F, 10.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-27.0F, -8.0F, 9.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-67.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-56.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-67.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.5F, 12.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(6.0F, 13.0F, 5.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(12.5F, 12.5F, 6.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-43.5F, 8.5F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-45.0F, 7.5F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-43.5F, 8.5F, -11.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-62.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-51.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-62.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.5F, 6.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(2.5F, 6.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(2.5F, 6.5F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(14.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.looping();
		return builder.build();
	}
	private static AnimationDefinition buildLeftTailSweep() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.0F, 1.5F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-96.0F, 2.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.5F, 2.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-91.0F, 2.0F, -2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.5F, 0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-85.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-85.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.5F, 10.0F, 3.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-121.5F, -40.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-136.5F, -37.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-149.0F, -35.5F, 11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-148.5F, -35.5F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-132.0F, -30.0F, -8.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-154.5F, -23.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-154.5F, -23.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.0F, -18.5F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(87.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(94.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(93.5F, 2.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.0F, 1.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.5F, 4.5F, 22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-103.0F, 6.5F, 27.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.5F, 34.5F, 22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-66.5F, 34.5F, 22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.0F, 15.0F, 2.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.5F, -17.5F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(51.5F, -25.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.0F, 0.0F, -12.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(20.0F, 1.0F, -31.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(26.0F, 3.5F, -40.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(19.5F, -17.0F, -42.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-17.5F, -3.0F, 10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-18.0F, -3.0F, 11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-68.5F, -12.0F, 9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-79.0F, -19.0F, 11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-81.5F, -20.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-36.5F, -12.0F, 20.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(7.0F, -24.0F, -7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(8.0F, -23.5F, -7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-30.0F, -7.5F, 10.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, -6.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-35.0F, -26.5F, 9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-34.0F, -28.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-52.0F, -35.0F, 19.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-68.0F, -38.5F, 29.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.5F, 12.0F, -21.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-97.5F, 13.0F, -21.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.5F, 9.5F, 15.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.0F, 13.0F, 5.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.5F, 13.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-54.5F, 33.0F, 3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-54.5F, 33.0F, 3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.0F, 7.5F, -12.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.5F, 10.0F, 8.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-48.0F, 27.5F, -16.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-48.0F, 27.5F, -16.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-51.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.0F, -18.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(51.5F, -23.5F, 4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(48.0F, -25.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(60.0F, -15.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.0F, 8.0F, -3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(42.5F, 40.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(25.5F, 51.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(37.0F, -45.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(30.0F, -40.5F, 18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(41.5F, -48.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(41.5F, -48.5F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, -36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-1.0F, -21.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.0F, -56.5F, -22.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(37.0F, -72.0F, -50.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.0F, 10.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-8.0F, 12.5F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, 6.5F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-16.0F, 15.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-12.0F, 19.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, 6.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.5F, 14.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.5F, 18.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.5F, 8.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-7.0F, 11.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(32.0F, 46.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(36.0F, 53.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(25.5F, 37.5F, -19.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(25.5F, 37.5F, -19.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-0.5F, 36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.0F, 35.0F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 9.0F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(9.0F, 17.0F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.5F, 18.5F, -8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.0F, -7.0F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(20.0F, -28.5F, -14.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(21.5F, -30.0F, -15.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.5F, 22.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(2.0F, 24.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, -27.5F, 13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -30.0F, 13.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.5F, 6.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, -10.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -10.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, -11.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -10.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-10.0F, -11.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-10.5F, -10.5F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(16.0F, -31.5F, -6.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(14.5F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(15.5F, -31.5F, -8.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(16.5F, -33.5F, -9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(12.5F, -25.5F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(13.0F, -28.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, -7.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.5F, -9.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, -7.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.5F, -9.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, -9.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.5F, -12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.5F, -12.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.5F, -10.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, -10.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -10.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}
	private static AnimationDefinition buildRightTailSweep() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-100.5F, 0.0F, -27.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-103.0F, -6.5F, -27.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.5F, 1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.5F, -34.5F, -22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-66.5F, -34.5F, -22.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.0F, -13.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.5F, 17.5F, 9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(52.5F, 22.0F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.0F, 6.0F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.5F, 0.0F, 9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-96.5F, 0.0F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.5F, 0.0F, 7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-91.0F, 0.0F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.5F, 0.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-85.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-85.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.5F, -10.0F, 6.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.5F, 38.5F, 4.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-134.0F, 35.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-149.0F, 35.5F, -11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-148.5F, 35.5F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-132.5F, 29.5F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-153.5F, 22.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-153.5F, 22.5F, 5.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.5F, 16.5F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(87.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(94.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(93.5F, 2.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.0F, 1.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(89.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.5F, -11.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(5.5F, -13.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.5F, -11.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-53.5F, -28.5F, -4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-53.5F, -28.5F, -4.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-45.0F, -5.5F, 14.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-33.0F, -13.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-48.0F, -27.5F, 16.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-48.0F, -27.5F, 16.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-51.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.0F, 1.0F, 12.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(20.5F, 0.0F, 31.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(27.0F, 0.0F, 41.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(19.5F, 17.0F, 42.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-17.5F, 2.0F, -12.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-18.0F, 1.5F, -14.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.5F, 12.5F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-68.5F, 12.0F, -9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-79.0F, 19.0F, -11.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-84.0F, 23.5F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-36.5F, 13.0F, -18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(7.0F, 24.0F, 7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(8.0F, 23.5F, 7.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-30.0F, 8.0F, -9.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-35.0F, 26.5F, -9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-34.0F, 28.0F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-52.0F, 35.0F, -19.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-68.0F, 38.5F, -29.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.5F, -12.0F, 21.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-97.5F, -13.0F, 21.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(52.0F, 21.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(49.0F, 23.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(60.0F, 14.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.5F, -13.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(42.0F, -41.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(24.0F, -52.0F, 3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.0F, -46.5F, 13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(32.0F, -46.5F, 13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.0F, -46.5F, 13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(32.0F, -46.5F, 13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(36.0F, -53.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(25.5F, -37.5F, 19.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(25.5F, -37.5F, 19.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, -44.5F, 16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.0F, -36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-1.0F, -36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-1.0F, -36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-1.0F, -36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-1.0F, -36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-1.0F, -36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-1.0F, -36.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.0F, -35.0F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.5F, 21.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.0F, 56.5F, 22.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(37.0F, 72.0F, 50.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.0F, -10.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-8.0F, -12.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, -6.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-16.0F, -15.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-12.0F, -19.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.5F, -6.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.5F, -14.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.5F, -18.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-13.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.5F, -8.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-7.0F, -11.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.0F, 45.0F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(37.0F, 45.0F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(37.0F, 45.0F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(37.0F, 45.0F, -11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(30.0F, 40.5F, -18.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(41.5F, 48.5F, -6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(41.5F, 48.5F, -6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(36.5F, 44.5F, -16.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.0F, 36.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -9.0F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(9.0F, -17.0F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(9.5F, -18.5F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.0F, 7.0F, 9.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(19.0F, 29.5F, 9.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(20.0F, 31.0F, 10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(3.0F, -22.0F, -7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(3.0F, -24.0F, -7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, 27.5F, -13.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 30.0F, -13.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.5F, -6.5F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, 10.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 10.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, 11.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 10.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-10.0F, 11.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-10.0F, 11.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-14.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(15.0F, 32.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(15.5F, 34.5F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(9.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(15.5F, 31.5F, 7.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(16.0F, 34.0F, 8.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(11.5F, 26.0F, 5.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(12.0F, 28.0F, 6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, 7.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 9.5F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, 7.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.5F, 9.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, 9.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.5F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.5F, 12.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.0F, 10.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 10.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}
	private static AnimationDefinition buildWalk() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.333F);
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-64.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-87.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-105.5F, 5.0F, -10.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-64.0F, 0.5F, 3.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-149.0F, -6.0F, -6.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-101.5F, -10.0F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-69.0F, -3.0F, -17.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-139.5F, -16.5F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-149.0F, -6.0F, -6.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(26.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(95.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(60.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-104.5F, 5.0F, 5.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-63.0F, -0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-64.5F, 1.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-85.5F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-104.5F, 5.0F, 5.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-70.5F, 2.5F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-137.0F, 8.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-149.0F, -1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-104.0F, 10.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-70.5F, 2.5F, 12.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.5F, 1.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(93.5F, 1.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(59.5F, 1.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(41.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(26.5F, 1.0F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.5F, 3.5F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(49.5F, 1.0F, -32.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(3.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-11.5F, 3.5F, -2.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.5F, 1.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-49.0F, -22.0F, 3.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-128.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-75.5F, 3.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-20.5F, 1.5F, 1.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-73.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-79.5F, 0.0F, 11.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-31.0F, 0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-73.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-2.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.5F, -1.0F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(47.0F, -1.0F, 46.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(14.0F, 0.0F, 0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-115.5F, 7.5F, -3.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-67.0F, 4.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-20.5F, 1.5F, 1.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-53.5F, 8.5F, 59.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-115.5F, 7.5F, -3.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-32.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-72.0F, -43.0F, -24.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-3.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(33.5F, -31.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(30.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(33.5F, -31.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(30.0F, -34.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(33.5F, -31.0F, 2.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.5F, -0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-57.5F, -1.5F, 2.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-34.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-51.5F, -0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(11.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(11.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(10.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(6.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(35.0F, 33.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(31.0F, 37.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(35.0F, 33.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(31.0F, 37.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(35.0F, 33.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.0F, -0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(17.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(20.0F, -0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(19.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(20.0F, -0.5F, 1.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.0F, 0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-69.0F, 0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-69.0F, 0.5F, -0.5F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.looping();
		return builder.build();
	}
	public static AnimationDefinition get(String animationName) {
        return switch (animationName) {
            case "attack1" -> DRAGON_ATTACK1;
            case "attack2" -> DRAGON_ATTACK2;
            case "crystal_link" -> DRAGON_CRYSTAL_LINK;
            case "fireball" -> DRAGON_FIREBALL;
            case "fly" -> DRAGON_FLY;
            case "fly_to_ground" -> DRAGON_FLY_TO_GROUND;
            case "idle" -> DRAGON_IDLE;
            case "left_tail_sweep" -> DRAGON_LEFT_TAIL_SWEEP;
            case "right_tail_sweep" -> DRAGON_RIGHT_TAIL_SWEEP;
            case "walk" -> DRAGON_WALK;
            default -> throw new IllegalArgumentException("[EpicDragonFight] Unknown animation: " + animationName);
        };
	}
}