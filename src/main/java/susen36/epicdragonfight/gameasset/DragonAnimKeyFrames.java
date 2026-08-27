package susen36.epicdragonfight.gameasset;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DragonAnimKeyFrames {

	private static final AnimationDefinition DEF_AIRSTRIKE =
			build_AIRSTRIKE();

	private static final AnimationDefinition DEF_ATTACK1 =
			build_ATTACK1();

	private static final AnimationDefinition DEF_ATTACK2 =
			build_ATTACK2();

	private static final AnimationDefinition DEF_ATTACK3 =
			build_ATTACK3();

	private static final AnimationDefinition DEF_BACKJUMPMOVE =
			build_BACKJUMPMOVE();

	private static final AnimationDefinition DEF_BACKJUMPPREPARE =
			build_BACKJUMPPREPARE();

	private static final AnimationDefinition DEF_BACKJUMPRECOVERY =
			build_BACKJUMPRECOVERY();

	private static final AnimationDefinition DEF_CRYSTALLINK =
			build_CRYSTALLINK();

	private static final AnimationDefinition DEF_DEATH =
			build_DEATH();

	private static final AnimationDefinition DEF_FIREBALL =
			build_FIREBALL();

	private static final AnimationDefinition DEF_FLY =
			build_FLY();

	private static final AnimationDefinition DEF_FLYTOGROUND =
			build_FLYTOGROUND();

	private static final AnimationDefinition DEF_GROUNDTOFLY =
			build_GROUNDTOFLY();

	private static final AnimationDefinition DEF_IDLE =
			build_IDLE();

	private static final AnimationDefinition DEF_LEFTTAILSWEEP =
			build_LEFTTAILSWEEP();

	private static final AnimationDefinition DEF_RIGHTTAILSWEEP =
			build_RIGHTTAILSWEEP();

	private static final AnimationDefinition DEF_WALK =
			build_WALK();

	
	private static AnimationDefinition build_AIRSTRIKE() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(0.933F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(19.086802F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.719492F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(9.729655F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(10.719492F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.069566F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(10.078624F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(11.069566F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.974784F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(7.989996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.974784F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(73.518188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(73.518188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-70.507072F, -5.303103F, 14.542413F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(56.63316F, 4.068866F, -7.472899F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.961033F, 0.291694F, 1.317936F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-70.507072F, -5.303103F, 14.542413F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.444935F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-47.643883F, 0.069943F, 0.003354F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(47.559689F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(39.274948F, 0.094142F, 0.098196F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(24.961033F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-36.444935F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-71.163986F, 5.292192F, -15.000327F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(59.380409F, -0.024757F, 9.819826F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.964483F, -0.005214F, -1.381348F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-71.163986F, 5.292192F, -15.000327F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.169525F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-44.830879F, -0.180487F, -0.193731F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(44.992916F, 0.002031F, -0.16697F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(38.57568F, -0.42686F, -0.342347F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(24.961033F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-35.169525F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.475315F, -0.49504F, -31.365835F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(31.069576F, -0.349893F, -31.412647F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(23.475315F, -0.49504F, -31.365835F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(88.068748F, 40.411469F, -159.71527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(88.068748F, 40.411469F, -159.71527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(85.643478F, -0.007622F, -0.197878F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(85.643478F, -0.007622F, -0.197878F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.208078F, -0.478929F, 31.434008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(29.828653F, -4.415158F, 32.102985F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(23.208078F, -0.478929F, 31.434008F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(88.357079F, -40.280849F, 159.35088F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(88.357079F, -40.280849F, 159.35088F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(78.536423F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(78.536423F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.02071F, 23.33181F, -39.65823F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-23.379333F, 23.31258F, -39.649334F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-37.02071F, 23.33181F, -39.65823F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.821171F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(56.821171F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.079285F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-35.079285F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.745369F, -21.334263F, 41.490341F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-23.379333F, -23.31258F, 39.649334F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-36.745369F, -21.334263F, 41.490341F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.821171F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(56.821171F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.079285F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-35.079285F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.278673F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-7.411798F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(-5.278673F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.718998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(6.718998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.337298F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.337298F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.800833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.800833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.916792F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.916792F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.932148F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(7.932148F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.834391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(6.834391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.240811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.067F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.234811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.589811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.214811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.240811F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(-8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.933F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_ATTACK1() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.525141F, -0.688649F, -20.763231F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-6.218743F, 12.239233F, -58.722027F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-12.131548F, 13.955375F, -78.234161F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.533517F, 0.028648F, -0.003152F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.643588F, 0.862305F, 10.196222F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.643815F, 0.836834F, 12.475597F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.348351F, 1.314821F, 6.652156F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-15.551782F, 2.079393F, 14.927677F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-11.543677F, 1.936036F, 18.97699F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.226147F, 1.1487F, 5.965351F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-15.137812F, 1.879277F, 14.071449F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-11.01643F, 1.762798F, 18.128391F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.944345F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.20756F, 0.677359F, 8.395794F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.661721F, 0.63604F, 10.895121F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.100166F, -0.647464F, -17.891815F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(53.139717F, -3.858347F, -23.630547F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(50.348011F, -4.846037F, -25.617481F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(60.36628F, -1.835288F, -15.324106F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.493584F, 2.772571F, 8.036881F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(41.537251F, -1.357914F, 40.444782F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.453098F, -0.003379F, 51.518616F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.012677F, 0.0F, -0.033816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(41.967171F, -13.892539F, -41.967171F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(46.168587F, -4.075728F, -48.762653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(46.168587F, -4.075728F, -48.762653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.013323F, 0.0F, 0.033184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(44.06926F, 5.902561F, 53.518154F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(37.210358F, 14.892476F, 39.056915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(37.210358F, 14.892476F, 39.056915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.607452F, -9.418406F, -12.108974F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-73.33139F, -10.597176F, -18.721512F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-79.522285F, -5.40856F, -20.817322F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-31.992088F, -19.423183F, -12.949613F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(4.033581F, 6.490939F, -23.977694F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(5.324017F, 6.505071F, -23.850479F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-28.49127F, -9.904175F, -7.682056F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.049187F, -1.939218F, -6.721969F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-29.550844F, -5.696603F, -24.502821F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-28.483711F, -9.910368F, -28.304918F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-48.878384F, -22.154325F, -42.226601F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-91.045937F, 20.574997F, 13.069555F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-92.694489F, 20.851278F, 13.749064F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.282852F, -0.168268F, -0.024868F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.905205F, 12.306829F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(20.860653F, 31.274395F, 1.265359F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(28.712189F, 39.791851F, 4.558822F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(4.465269F, 40.369141F, -22.387476F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-17.030575F, -10.631503F, -2.835808F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-17.383337F, -11.666396F, -3.30059F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.450441F, 0.009067F, -12.306248F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.015254F, -0.167041F, -0.008837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.024254F, -0.47508F, -0.091394F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.026254F, -0.572107F, -0.046186F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.026254F, -0.584958F, -0.040632F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.026254F, -0.584958F, -0.040632F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-58.466057F, -3.276074F, 65.096146F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-36.426426F, -15.355217F, 43.876152F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-19.018883F, -20.046101F, 33.482204F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-60.783581F, -1.315689F, 93.349182F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(-132.9169F, 49.069965F, 28.468597F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-142.53954F, 17.816183F, -15.863864F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-138.88243F, 26.991369F, -31.532419F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-138.88243F, 26.991369F, -31.532419F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-43.472313F, 11.649512F, 7.791193F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-45.229927F, -47.232204F, 44.879158F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-51.298885F, -44.029152F, 46.757004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-54.443485F, -42.530003F, 48.634281F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-32.0186F, -46.901669F, 32.982021F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(16.826294F, -0.017025F, -0.025521F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-18.142775F, 7.002606F, -22.515875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-19.990608F, 8.494064F, -28.757244F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-19.990608F, 8.494064F, -28.757244F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.909817F, -0.056196F, -0.028492F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.545338F, -67.727112F, 85.950027F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-73.312546F, -11.66419F, 159.31332F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-82.552444F, -2.947236F, -176.91812F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-83.885277F, -27.612856F, 152.81537F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(59.405773F, 19.493397F, 27.150127F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(37.685509F, 22.269991F, -7.110282F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-27.980841F, 52.942474F, -74.389122F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-40.473537F, 59.044399F, -82.222397F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-40.473537F, 59.044399F, -82.222397F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(4.870542F, -4.652318F, 13.207677F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-121.31789F, 0.004955F, -40.667233F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-132.97209F, -4.851879F, -37.831581F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-142.04703F, -9.417172F, -36.214069F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-141.76704F, -9.601618F, -35.965988F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-136.53499F, 7.418174F, -30.129713F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-154.50758F, 0.0F, -23.648207F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-154.50758F, 0.0F, -23.648207F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.51598F, 0.864624F, -18.713387F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(86.951065F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(94.314941F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.043045F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(93.568115F, -1.001743F, 1.77239F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.208282F, -0.446238F, 0.883074F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(89.502342F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(89.502342F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.646294F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.989151F, 2.527189F, 1.552818F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-95.989037F, 2.598151F, 1.808875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.490234F, 2.542634F, 1.880918F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-90.661903F, 2.618706F, 2.230133F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.471535F, -0.447365F, 0.48345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-85.211967F, -3.385389F, 0.262011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-85.211967F, -3.385389F, 0.262011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.923313F, -3.145688F, 10.220248F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-79.359863F, -17.865034F, 36.585716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-79.359863F, -17.865034F, 36.585716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.63015F, -1.748161F, 15.041159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.887886F, 8.436071F, -17.479233F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(51.482231F, -0.015959F, -25.058397F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.279266F, 0.013293F, -12.297203F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-100.06565F, -21.719818F, 4.700527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-105.96056F, -26.912798F, 7.072946F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.043992F, -1.638192F, 22.399481F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-5.725389F, -5.946825F, 22.473654F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(11.41102F, -5.368127F, 24.63335F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(14.259638F, -13.659637F, 22.7432F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.33952F, 0.846239F, 6.24335F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.655313F, -0.475302F, -0.164396F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(11.655313F, -0.475302F, -0.164396F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(11.655313F, -0.475302F, -0.164396F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(11.655313F, -0.475302F, -0.164396F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.032897F, 0.169625F, 0.042226F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.991654F, -0.22167F, -0.105981F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(9.991654F, -0.22167F, -0.105981F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(9.991654F, -0.22167F, -0.105981F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(9.991654F, -0.22167F, -0.105981F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.279405F, 0.14324F, 0.010368F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.776723F, -0.053903F, -0.060688F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(6.776723F, -0.053903F, -0.060688F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(6.776723F, -0.053903F, -0.060688F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(6.776723F, -0.053903F, -0.060688F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.776695F, -0.057296F, -0.003392F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.776717F, -0.114592F, 0.006786F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-6.776717F, -0.114592F, 0.006786F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-6.776717F, -0.114592F, 0.006786F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.776717F, -0.114592F, 0.006786F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.874289F, -0.028648F, 0.001972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.874289F, -0.028648F, 0.001972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.874289F, -0.028648F, 0.001972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.874289F, -0.028648F, 0.001972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.077452F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.460452F, -0.203811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.531452F, -0.234811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.271548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 1.305548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 1.322548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.225014F, 7.797851F, 9.014324F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(11.12207F, 7.478322F, 17.128208F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(12.183901F, 7.415154F, 18.622875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.820126F, 8.68717F, -6.915144F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(13.003315F, 12.885299F, -29.379183F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(13.626988F, 13.383887F, -30.988829F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_ATTACK2() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.677015F, 0.0F, -10.358498F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(6.200048F, -0.027096F, -0.0302F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.028576F, -0.143254F, -0.05726F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(1.824558F, -12.972798F, 51.262569F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.608703F, -14.95405F, 60.466366F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.597708F, 0.275093F, 0.209767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-11.186197F, 0.102777F, 0.163471F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.303131F, 0.039988F, 0.111757F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-10.078636F, 0.038753F, 0.112065F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.885595F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.032927F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.163671F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.411777F, 0.06472F, 0.110879F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-22.088737F, 0.211736F, 0.018096F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-22.709072F, 0.269357F, 0.005434F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.149635F, -0.280714F, -0.102054F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.597193F, -1.194913F, -6.259038F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-18.486635F, -1.302808F, -7.992071F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-17.762604F, -1.259901F, -8.049806F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.028648F, 0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-13.88661F, -0.26481F, -0.025893F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-15.129704F, -0.322741F, -0.015429F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-18.119812F, -0.324266F, -0.007037F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.166378F, -1.149176F, -6.143655F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-19.153711F, -1.419587F, -8.397802F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-18.668612F, -1.392282F, -8.455624F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-8.105725F, -0.085944F, 0.006089F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-8.916796F, -0.057296F, 0.004467F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-11.069557F, -0.060072F, -0.023095F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.826859F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-11.888564F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-11.654468F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(34.670898F, -5.916091F, 21.138933F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(43.754536F, 8.886687F, 8.496113F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(46.202896F, 8.981756F, 9.267792F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(48.711697F, -0.011492F, 2.310007F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(66.911316F, 1.095648F, 2.578686F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(37.713703F, -4.593509F, -57.075832F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(27.456062F, -11.080872F, -69.036751F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.010677F, 0.0F, -0.029816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(44.360924F, -8.190072F, -48.412697F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(42.817299F, -10.607262F, -41.558838F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(0.011323F, 0.0F, 0.029184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(41.926266F, 11.779868F, 47.265823F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(41.169205F, 8.466339F, 46.501186F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.004884F, -0.099115F, -0.038197F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.posVec(-0.162116F, -0.411083F, 0.09447F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(-0.045116F, -0.538234F, 0.03722F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(-0.018116F, -0.540639F, 0.024097F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(-0.018116F, -0.540639F, 0.024097F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-50.029617F, 26.762217F, -56.987091F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-56.272072F, 18.611158F, -55.813095F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-56.002583F, 17.776489F, -54.370594F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-69.199295F, 1.621772F, -87.48497F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(-50.702057F, -69.568748F, -90.205162F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-143.77362F, -2.818367F, 16.19623F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-133.40524F, -4.469695F, 28.903782F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-133.40524F, -4.469695F, 28.903782F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-28.49127F, -9.904175F, -7.682056F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.871256F, 18.187202F, -23.129087F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-0.416842F, 0.003478F, -0.010735F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.018862F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-28.823866F, 43.230667F, -43.897915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(16.752443F, -0.364202F, -0.701318F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(5.342072F, -15.74101F, 26.894251F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.924767F, -19.457081F, 38.512459F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.924767F, -19.457081F, 38.512459F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.282852F, -0.168268F, -0.024868F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(63.002136F, -1.443194F, 6.098668F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(85.513069F, -0.406454F, 6.941626F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(86.237633F, -0.865156F, -0.830345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(82.644394F, -57.333157F, -27.332352F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.55F, KeyframeAnimations.degreeVec(40.922306F, -0.858343F, -1.573926F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-40.530724F, -65.398308F, 77.099373F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-74.010956F, -56.940708F, 107.43363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-74.010956F, -56.940708F, 107.43363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.450441F, 0.009067F, -12.306248F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.015254F, -0.167041F, -0.008837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.026254F, -0.584958F, -0.040632F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.026254F, -0.584958F, -0.040632F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-59.175213F, 24.282064F, 19.098513F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-66.99823F, 18.815786F, 37.490372F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-58.498955F, 21.768803F, 41.423542F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-33.611454F, 0.0F, 39.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(20.88286F, -6.680613F, 20.304556F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(19.723782F, -7.697675F, 25.358616F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-43.472313F, 11.649512F, 7.791193F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.661186F, -42.318199F, 15.120427F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(-51.615711F, -39.788834F, 28.186274F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-51.944771F, -39.568287F, 30.383486F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-40.282204F, 7.472743F, 24.270731F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-89.465332F, 1.168888F, 3.979652F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-91.606918F, 0.898363F, 2.717576F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.909817F, -0.056196F, -0.028492F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.922749F, 16.331161F, -12.303672F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(25.865871F, -4.100352F, -9.162664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(24.174662F, -5.361555F, -11.026638F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(-22.777885F, -48.584465F, 38.295174F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-28.276737F, -6.170045F, -0.91748F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-31.710142F, -7.497981F, -1.029F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(4.870542F, -4.652318F, 13.207677F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-127.75431F, 15.405583F, -34.066578F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-149.01706F, -1.066259F, -38.858322F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.51598F, 0.864624F, -18.713387F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(82.415894F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(86.321548F, -0.026863F, 0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.646294F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-91.582062F, -4.112876F, 0.605379F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-85.632965F, 10.586841F, 0.00864F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.923313F, -3.145688F, 10.220248F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-73.115379F, -18.732849F, 35.387966F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-135.64561F, 36.43108F, 27.45874F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.63015F, -1.748161F, 15.041159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.075302F, 7.817378F, -14.609477F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(74.224533F, 18.278236F, -27.529316F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.279266F, 0.013293F, -12.297203F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-113.04245F, -18.084232F, 15.16967F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-77.916908F, -16.695036F, -21.541082F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.918419F, 5.101278F, -5.827122F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.339066F, 1.955373F, 0.41479F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(18.106241F, 5.505308F, -4.222319F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(23.192675F, 5.918356F, 2.503297F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.33952F, 0.846239F, 6.24335F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.098835F, -0.14324F, -0.013923F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(10.640721F, 0.176677F, -7.80985F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.032897F, 0.169625F, 0.042226F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.488291F, -0.085944F, -0.004872F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(9.207723F, -0.422788F, -0.120619F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.279405F, 0.14324F, 0.010368F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(5.940876F, -0.140263F, -0.064737F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.776695F, -0.057296F, -0.003392F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.315321F, -0.085944F, 0.004741F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-0.028634F, -0.057303F, -0.028634F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.296269F, -0.057296F, 0.003653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.642948F, -0.118419F, -0.049641F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.296266F, -0.028648F, 0.001826F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-9.235945F, -0.145554F, -0.017075F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.315315F, -0.028648F, 0.00158F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-10.136891F, -0.174429F, -0.0134F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.974816F, -0.057296F, 0.004497F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-10.253289F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.077452F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.posVec(0.0F, -0.444452F, -0.197811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.460452F, -0.203811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.posVec(0.0F, 0.660548F, -0.095811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.271548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, 1.321548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 1.322548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.092622F, 0.323118F, -7.961012F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.117F, KeyframeAnimations.degreeVec(8.360811F, 2.715591F, -18.76133F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(8.572685F, 2.522719F, -19.232676F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4F, KeyframeAnimations.degreeVec(8.540654F, 0.365996F, 0.113807F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.645499F, -1.322326F, 9.774309F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(14.508306F, -8.33712F, 30.265026F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(16.336758F, -8.979193F, 31.291624F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_ATTACK3() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.9F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.148873F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-12.356843F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-12.650263F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-11.361627F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-13.238103F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-38.392693F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-38.392693F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-38.392693F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.36702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(17.277456F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(17.457581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(20.120745F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(20.120745F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(20.120745F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.678411F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(19.450924F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(19.694498F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(29.340048F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(29.340048F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(29.340048F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.661109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(12.47426F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(12.650263F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(20.426243F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(20.426243F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(20.426243F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.36702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-15.36702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-32.343533F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-32.140041F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-32.140041F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.704842F, -32.68824F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-71.640343F, -22.561417F, 48.025211F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-82.308769F, -13.852116F, 55.852314F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.733F, KeyframeAnimations.degreeVec(70.042847F, -17.325712F, -38.034683F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(27.489601F, 0.0F, -37.455341F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(26.80817F, -0.22875F, -41.590691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(26.80817F, -0.22875F, -41.590691F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.10721F, -1.710911F, -16.573044F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-35.029156F, -0.037688F, -0.019608F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(29.143415F, 0.021201F, 0.036095F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-0.028648F, -0.008658F, -33.640465F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-0.028648F, -0.008658F, -33.640465F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(3.213763F, 32.297295F, 3.021421F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-64.656624F, 29.105045F, -45.014656F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-75.913002F, 21.770267F, -53.703709F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.733F, KeyframeAnimations.degreeVec(69.086784F, 18.056408F, 37.725224F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(25.491539F, 0.021781F, 34.820869F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(25.286289F, 1.319976F, 39.173161F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(25.286289F, 1.319976F, 39.173161F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.090714F, 1.822454F, 16.531267F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-35.029156F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(30.930258F, 0.009745F, 0.187738F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 32.616398F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 32.616398F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.302963F, -0.439234F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.568661F, 7.749419F, -42.534897F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-9.412048F, 6.507099F, -53.913685F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-11.678841F, -30.694511F, -150.68388F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-156.82224F, -72.445969F, -0.782596F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-132.45541F, -31.050674F, 0.350091F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-68.197113F, -47.657192F, -66.886993F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-68.197113F, -47.657192F, -66.886993F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-87.8162F, 64.4431F, -45.18462F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-93.559013F, 60.368111F, -55.17239F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(35.356564F, 81.864059F, 42.341537F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(16.86989F, 0.0F, -0.629673F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(1.623884F, 5.837693F, 0.018364F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-63.928032F, 11.179143F, 7.938211F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-63.928032F, 11.179143F, 7.938211F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(31.898062F, 36.882175F, 38.255211F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(31.898062F, 36.882175F, 38.255211F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-86.888863F, 33.363415F, -119.16248F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-40.03624F, 33.677631F, -89.937386F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(29.319059F, 20.46402F, -0.016417F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(21.099035F, 42.001911F, -39.124401F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(21.099035F, 42.001911F, -39.124401F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.302963F, -0.439234F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, -0.306262F, -0.444345F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.782521F, -20.309805F, 32.589165F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-29.586197F, -16.199207F, 45.754246F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-7.884541F, 19.580732F, 147.85858F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-155.26616F, 74.910721F, 0.68308F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-134.62044F, 26.553011F, -0.003368F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-74.07309F, 42.280388F, 59.019985F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-74.07309F, 42.280388F, 59.019985F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-111.51677F, -65.654137F, 66.189774F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(-113.1109F, -62.110218F, 72.149025F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(166.93658F, -5.735279F, 164.3848F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(16.894545F, -0.008509F, -0.348868F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(5.492877F, -0.10451F, -0.238521F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-58.677273F, -17.277504F, -17.044712F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-58.677273F, -17.277504F, -17.044712F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(62.516796F, -21.78805F, -46.885521F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.467F, KeyframeAnimations.degreeVec(62.516796F, -21.78805F, -46.885521F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-1.346647F, -30.883221F, 0.00603F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-39.526939F, -44.026234F, 85.544769F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(28.359947F, -18.359108F, 3.855779F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(23.915205F, -35.178375F, 40.09927F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(23.915205F, -35.178375F, 40.09927F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-118.68403F, -0.002804F, -34.107346F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-146.00075F, -4.995526F, -30.52743F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-148.3535F, 0.491077F, -31.957706F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-5.083414F, 30.840748F, -0.017349F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(12.751593F, -3.858103F, 0.011044F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(3.961438F, -4.70791F, 0.001194F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.213405F, -4.311229F, -0.00473F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-3.47958F, -4.571026F, -0.002012F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-3.47958F, -4.571026F, -0.002012F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(96.94957F, -0.17003F, 0.228795F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(96.61869F, -0.149664F, 0.290091F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(96.61869F, -0.149664F, 0.290091F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-29.406397F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-29.406397F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(43.775547F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(9.344174F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-4.071933F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-4.071933F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-91.083717F, 0.0F, 33.60841F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-63.198704F, -3.476914F, 29.728191F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-60.770393F, -4.331995F, 29.707777F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-81.878204F, 25.320618F, 4.479187F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(38.168182F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-13.160975F, 7.52509F, 0.294326F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(54.759335F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(38.168182F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(38.168182F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-116.10024F, -6.691565F, 26.11611F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-133.09512F, -1.317956F, 23.088673F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-134.79655F, -0.878164F, 22.75285F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-1.752968F, -31.202957F, 6.150395F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(12.114356F, 0.003811F, 6.235414F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(4.472012F, -0.086522F, 0.288499F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.006424F, -0.029805F, 1.074754F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-4.875727F, -0.082474F, 1.853722F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-4.875727F, -0.082474F, 1.853722F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(92.175377F, -20.101093F, 11.904185F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(100.46398F, -16.807825F, 9.481096F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(101.29337F, -16.495289F, 9.287715F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-29.406506F, 0.007517F, 0.241977F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-29.406397F, 0.015035F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(41.560127F, -8.115064F, 11.987479F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(8.894348F, -1.207107F, 9.322288F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-2.455066F, -0.009728F, 7.819208F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-2.455066F, -0.009728F, 7.819208F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-90.291786F, -23.082426F, 2.968805F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-79.853806F, -15.433796F, 0.001605F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-78.866409F, -14.492338F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.633F, KeyframeAnimations.degreeVec(-75.826607F, -24.098717F, 6.21976F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(38.168182F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-11.892161F, -15.653966F, 0.023622F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(54.759335F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(38.168182F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(38.168182F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.732336F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-1.03138F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(19.694056F, 0.262803F, 0.016094F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(43.232792F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(61.273582F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(61.273582F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(61.273582F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(17.157768F, 0.081621F, 0.041616F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-15.30741F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-15.30741F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-15.30741F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-6.027174F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(13.238287F, -0.057296F, -0.00665F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-11.478487F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-11.478487F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-11.478487F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.974784F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-9.439177F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(8.511043F, -0.028648F, -0.002132F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-8.453118F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-8.453118F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-8.453118F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.369732F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-12.23962F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(-6.027174F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-6.027174F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(-6.027174F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.186313F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-14.063677F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-5.969542F, 0.030141F, 0.027154F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-6.488273F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.303102F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-14.89223F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-7.932149F, 0.028648F, -0.001987F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.719492F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-14.536692F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-8.68491F, 0.028648F, -0.002176F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-13.120495F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-8.337299F, 0.028648F, -0.002088F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.776691F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.719398F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-7.065285F, 0.028648F, -0.001769F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-7.527395F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.088452F, -0.298811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.684452F, -0.505811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.742452F, -0.526811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.posVec(0.0F, 8.752548F, 3.707189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(0.0F, 12.959548F, 1.196189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, 15.777548F, -0.991811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 16.534548F, -0.991811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.posVec(0.0F, 16.534548F, -0.991811F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.42108F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-18.783789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.844654F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.2F, KeyframeAnimations.degreeVec(9.845986F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(9.845986F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.9F, KeyframeAnimations.degreeVec(9.845986F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_BACKJUMPMOVE() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.067F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.122312F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-10.195084F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(8.858808F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.989996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(26.615488F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(23.140863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(21.653515F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(23.017099F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(17.637877F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(15.010702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(14.00467F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(15.426373F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.23962F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-15.129497F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.952763F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-20.181547F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.141964F, -10.359917F, 6.46099F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(52.952091F, -2.450641F, 2.753657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(59.174793F, -3.268098F, 2.736595F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-7.763911F, -13.242744F, 12.561554F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-61.515541F, -6.078019F, 21.429171F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.904104F, 0.028648F, -0.007116F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-23.953674F, 0.006077F, 0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(51.715351F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(54.982189F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(11.011108F, 0.028648F, 0.002761F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-25.024279F, -0.041364F, -0.050938F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-31.320408F, 9.27962F, -5.591412F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(53.195091F, 7.948106F, -0.011452F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(59.434723F, 8.151632F, 0.001791F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-7.916338F, 13.256985F, -12.582847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-61.755234F, 6.01006F, -21.452688F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.594395F, 0.028648F, -0.006507F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-24.079241F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(51.725922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(54.982189F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(11.011106F, -0.002761F, 0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-25.024279F, -0.041364F, -0.050938F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-71.775795F, -52.201115F, 3.301685F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-73.953926F, -45.724201F, -0.007791F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-53.525505F, -47.658836F, -22.222321F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-44.562481F, -47.752453F, -0.013041F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-36.110619F, -42.692551F, -11.853107F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.894621F, 0.0F, -0.450977F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(8.33935F, -0.10969F, -0.233541F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-6.627216F, -0.631067F, 14.540643F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(9.316674F, -0.175178F, -0.341319F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(2.711572F, 15.549852F, 7.036681F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.657705F, 16.252026F, -30.70682F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-9.94489F, 8.815604F, -35.803886F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(13.018024F, 31.810719F, -23.658361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(15.833454F, 29.479094F, -18.26333F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(13.388797F, 19.740749F, -30.028837F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.282059F, 50.64447F, -0.053967F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-73.130623F, 50.831207F, 6.500796F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-53.407642F, 48.001606F, 22.377085F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-42.52375F, 50.507408F, 6.080334F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-36.685074F, 40.575058F, 11.477995F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.89455F, 0.0F, -0.382904F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(8.347607F, -0.082961F, -0.200562F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-6.556265F, 0.010497F, -14.528197F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(9.344387F, -0.176739F, -0.302049F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(3.078208F, -15.410007F, -7.606964F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.812702F, -16.380001F, 30.642384F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-9.126314F, -9.833846F, 40.506092F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(14.23694F, -32.635323F, 27.898848F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(17.734047F, -33.236565F, 18.951477F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(14.589684F, -20.133905F, 35.03233F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.63262F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-84.5662F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-69.669113F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-81.730835F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-31.862068F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(46.205833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-29.406397F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-29.406397F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(39.049885F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-21.407808F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-77.756241F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(30.313105F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(30.313105F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(30.313105F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-48.343212F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.63262F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-84.469696F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-69.669113F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-81.730835F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-31.862068F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(46.205833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-29.406397F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-29.406397F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(39.049885F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-21.461548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-77.655281F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(30.313105F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(30.313105F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(30.313105F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-48.343212F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.935596F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-18.059113F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(18.360857F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-4.588564F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-25.785856F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-21.346348F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-13.709645F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(13.886494F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-22.581966F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.359139F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(-8.16359F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(11.303102F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-16.977514F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(8.337298F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-10.952763F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.027157F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(8.047852F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.311505F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(7.758615F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.54456F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(11.420052F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.661109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(5.854348F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(13.591621F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.179293F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(13.179293F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(10.369732F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(15.961842F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(13.179293F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(15.902347F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.356843F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(11.536936F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(6.892097F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(14.00467F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(8.453118F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(10.311505F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.090548F, 1.027189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.posVec(0.0F, -4.690452F, 3.851189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -9.347452F, 5.316189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.posVec(0.0F, -15.342452F, 5.559189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.posVec(0.0F, -19.531452F, 1.871189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.233F, KeyframeAnimations.degreeVec(-24.771454F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-38.82922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.717F, KeyframeAnimations.degreeVec(-38.532154F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.067F, KeyframeAnimations.degreeVec(-12.415471F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_BACKJUMPPREPARE() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(0.317F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.723953F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(18.783789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(15.485742F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(12.122312F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-6.20004F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.381046F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-10.311505F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-7.989996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-6.315314F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.661312F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-9.148873F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-12.23962F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(29.512962F, -3.380088F, -20.820118F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-54.03936F, -12.111437F, 2.769434F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-47.050686F, -8.924964F, 9.401488F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-32.141964F, -10.359917F, 6.46099F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-33.092438F, 0.028648F, -0.00851F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-29.077932F, 0.036077F, 0.021218F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-27.904104F, 0.028648F, -0.007116F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(29.512962F, 3.380088F, 20.820118F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-53.438873F, 7.054771F, -9.386169F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-46.004223F, 7.899267F, -8.074893F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-31.320408F, 9.27962F, -5.591412F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-30.264381F, 0.09369F, 0.00541F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-26.359413F, 0.064004F, 0.015231F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-25.594395F, 0.028648F, -0.006507F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.157187F, -28.550447F, -43.209255F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(3.492574F, -24.36191F, -48.767277F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(12.182244F, -14.412791F, -51.559071F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-71.775795F, -52.201115F, 3.301685F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-54.092247F, 31.811028F, 16.397558F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.33345F, -0.918563F, -0.008206F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-108.20457F, 0.865889F, 0.01052F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(16.894621F, 0.0F, -0.450977F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.82207F, -22.513474F, -38.373959F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(2.739288F, -8.16558F, -43.784451F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(7.602726F, -8.833759F, -44.374763F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-27.657705F, 16.252026F, -30.70682F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-19.788126F, 26.951626F, 42.402283F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(2.164621F, 20.98531F, 49.817558F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(11.504755F, 12.57409F, 52.360516F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-69.282059F, 50.64447F, -0.053967F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.123001F, -32.878212F, -19.105513F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.33345F, -0.918563F, -0.008206F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-108.20286F, 0.567183F, 0.002864F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(16.89455F, 0.0F, -0.382904F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.931009F, 23.495445F, 37.689796F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(2.607094F, 8.288752F, 43.486237F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(7.065119F, 8.676741F, 44.098362F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-27.812702F, -16.380001F, 30.642384F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.10507F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88443F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-148.99023F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-102.63262F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.226646F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34333F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(107.89648F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(46.205833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.537537F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.973869F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-96.222847F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-77.756241F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.10507F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88443F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-148.99023F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-102.63262F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.226646F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34333F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(107.89648F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(46.205833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.537537F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.973869F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-96.222847F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-77.655281F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.865982F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-22.643665F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-26.935596F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-17.157343F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-21.346348F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(-10.952763F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-14.359139F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(6.027157F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(8.453118F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(10.54456F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(10.719398F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(13.179293F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(11.011106F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(9.787779F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(12.356843F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(7.238509F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.262189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.215811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.554811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.posVec(0.0F, 0.090548F, 1.027189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.267F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_BACKJUMPRECOVERY() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.167F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(7.989996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(7.989996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.989996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-7.87427F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-7.87427F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.87427F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.017099F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-9.845986F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-9.845986F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.845986F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.426373F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.181547F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(13.120495F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(15.010702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(15.010702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-61.515541F, -6.078019F, 21.429171F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(27.819025F, -8.182507F, -12.070395F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(27.819025F, -8.182507F, -12.070395F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(27.819025F, -8.182507F, -12.070395F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.024279F, -0.041364F, -0.050938F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-61.755234F, 6.01006F, -21.452688F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(27.819025F, 8.182507F, 12.070395F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(27.819025F, 8.182507F, 12.070395F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(27.819025F, 8.182507F, 12.070395F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.024279F, -0.041364F, -0.050938F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.713972F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.110619F, -42.692551F, -11.853107F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-45.654865F, -41.202511F, -29.903599F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-23.671539F, -26.691277F, -44.221287F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-23.671539F, -26.691277F, -44.221287F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.711572F, 15.549852F, 7.036681F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-30.046694F, 27.070503F, 8.980061F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-64.653236F, 32.635883F, 11.367343F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-64.653236F, 32.635883F, 11.367343F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.388797F, 19.740749F, -30.028837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-14.439604F, -9.953002F, -26.63641F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(1.606876F, -16.067133F, -29.023239F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(1.606876F, -16.067133F, -29.023239F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.685074F, 40.575058F, 11.477995F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-47.021492F, 39.231796F, 29.068739F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-25.293106F, 25.149508F, 43.481785F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-25.293106F, 25.149508F, 43.481785F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(3.078208F, -15.410007F, -7.606964F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-28.904573F, -27.462385F, -10.849986F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-62.797882F, -34.144253F, -14.106552F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-62.797882F, -34.144253F, -14.106552F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.589684F, -20.133905F, 35.03233F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-14.867923F, 10.478195F, 26.066154F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(1.22671F, 17.446495F, 28.786612F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(1.22671F, 17.446495F, 28.786612F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-31.862068F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-114.37435F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-124.65536F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-124.65536F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-21.407808F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(70.631866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(88.818329F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(88.818329F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.343212F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-91.488998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-99.471672F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-99.471672F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-31.862068F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-114.37435F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-124.65536F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-124.65536F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-21.461548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(70.631866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(88.818329F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(88.818329F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.343212F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-91.488998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-99.471672F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-99.471672F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.785856F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-13.355945F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-2.005762F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-2.005762F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.581966F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-12.532915F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.977514F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-10.427968F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.952763F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(-7.932148F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.758615F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.591621F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-7.00753F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.00753F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.961842F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.892097F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.892097F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.902347F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(-6.20004F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-6.20004F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.00467F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.311505F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.001452F, 1.871189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.posVec(0.0F, -1.587452F, 0.457189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.posVec(0.0F, -1.587452F, -0.032811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, -1.587452F, -0.032811F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.415471F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.283F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.567F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_CRYSTALLINK() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(9.8F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-24.393131F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-24.393131F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-25.407297F, 0.691235F, -0.005417F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-25.645403F, -0.016549F, -6.306653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(12.88527F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(12.88527F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.057296F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(39.417709F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(39.417709F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.066925F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(45.066925F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(28.81642F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(28.81642F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(57.781937F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(63.638233F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-46.640381F, -4.4658F, 4.722512F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-44.382347F, 9.503453F, -3.782968F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(40.994267F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(40.994267F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.617323F, 0.0F, -0.209816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(-0.617323F, 0.0F, -0.209816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(43.093224F, 5.556553F, 94.336891F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(42.020405F, 9.572102F, 93.88221F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(-20.390902F, 49.61657F, 33.731529F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-27.071718F, 47.727459F, 27.338869F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(49.994514F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(62.013229F, 0.011428F, 0.045868F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.degreeVec(48.585461F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(19.998589F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.617323F, 0.0F, -0.209816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.617323F, 0.0F, -0.209816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(41.440388F, -6.561997F, -90.652252F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(41.857761F, -9.654544F, -93.529106F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(-18.526594F, -51.403461F, -35.195816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-25.640909F, -49.659821F, -28.456856F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(49.994514F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(62.013229F, 0.011428F, 0.045868F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.333F, KeyframeAnimations.degreeVec(48.585461F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.5F, KeyframeAnimations.degreeVec(19.998589F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(5.911945F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.013995F, 0.021854F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.016998F, 0.016198F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.163071F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-35.281586F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-70.466591F, 0.435497F, 6.401388F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-68.404251F, 0.008957F, 5.764975F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(-24.847195F, -2.709348F, 3.53013F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-28.287926F, -6.466978F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-25.796579F, -9.532891F, -8.140183F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-25.796579F, -9.532891F, -8.140183F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.32785F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.432381F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(16.894363F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(16.894363F, -0.008509F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(-51.388039F, -0.291835F, 0.004544F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-46.744404F, -0.016348F, -0.021144F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-67.219711F, -0.01607F, -0.02134F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-67.219711F, -0.01607F, -0.02134F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.917439F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(31.772095F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-21.211639F, 0.102473F, 2.917938F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-19.262428F, -1.389562F, -0.518365F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.55F, KeyframeAnimations.degreeVec(3.290548F, -0.877637F, -0.001013F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-5.16748F, -1.892448F, -7.710321F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.690371F, -0.00995F, -12.306512F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.690371F, -0.00995F, -12.306512F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.033739F, 0.037287F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.005936F, 0.005728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.163071F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-35.281586F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-68.610146F, 0.161749F, 4.348229F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-58.789978F, -0.025222F, 5.298184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-41.694012F, 10.955115F, 8.587875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-41.694012F, 10.955115F, 8.587875F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.32785F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-68.432381F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(16.894369F, -0.059562F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(8.549843F, -0.076374F, -0.002892F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-61.776539F, 0.132807F, 0.001062F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-61.776539F, 0.132807F, 0.001062F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(24.917439F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(31.772095F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-19.651924F, -3.760744F, 0.007053F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-17.242968F, -2.37842F, -0.983627F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(10.938609F, -6.045258F, 12.787517F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(10.938609F, -6.045258F, 12.787517F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.posVec(0.0F, 0.276284F, 0.01384F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.posVec(0.0F, 0.454135F, 0.022444F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.55215F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-123.57863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-96.010742F, 2.908682F, 3.901876F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-100.42334F, 3.334156F, 3.793755F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-113.69341F, -0.218621F, 0.621534F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(-163.00398F, -2.048275F, -15.179752F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-157.08151F, -0.009456F, -18.060787F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-157.08151F, -0.009456F, -18.060787F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(107.3401F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(108.936F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(95.107437F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(96.844704F, -0.051824F, 0.038555F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(92.446587F, -0.026535F, 0.038801F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(103.93469F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(73.491714F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(73.491714F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.5111F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-106.32495F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-106.46429F, -0.482894F, -0.009063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-103.98211F, -0.208757F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.75F, KeyframeAnimations.degreeVec(-101.10439F, -0.819669F, 0.405958F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.967F, KeyframeAnimations.degreeVec(-68.096085F, -4.483339F, 2.254917F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-55.590595F, -3.259306F, 10.219077F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-55.590595F, -3.259306F, 10.219077F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-119.55215F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-123.57863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-100.1367F, -0.035569F, 0.078317F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-96.564545F, 3.732647F, 4.866233F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-83.927635F, -1.335533F, 15.303329F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-83.927635F, -1.335533F, 15.303329F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(107.3401F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(108.936F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(95.950729F, -0.022455F, 0.070416F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(95.901031F, -0.223386F, 0.306458F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(67.057281F, 5.978664F, -9.052012F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(67.057281F, 5.978664F, -9.052012F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-105.5111F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-106.32495F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-103.35336F, -0.094039F, 0.220632F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-106.74646F, -0.979807F, -0.009927F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.917345F, -10.657214F, 22.759232F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-4.25729F, -10.119619F, 22.990133F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-4.301223F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-4.301223F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-2.404123F, 0.686703F, 6.678936F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-2.404123F, 0.686703F, 6.678936F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.028626F, -0.085951F, -0.028626F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-0.028626F, -0.085951F, -0.028626F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-5.854348F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-5.854348F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(9.846073F, 0.16942F, 0.043455F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(9.846073F, 0.16942F, 0.043455F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.090786F, -0.323786F, -8.6269F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-0.090786F, -0.323786F, -8.6269F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-7.527395F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-7.527395F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(9.439182F, 0.057296F, 0.004731F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(9.439182F, 0.057296F, 0.004731F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.183108F, -0.400783F, -14.093177F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-0.183108F, -0.400783F, -14.093177F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-9.032786F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-9.032786F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(8.105725F, -0.085944F, -0.006089F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(8.105725F, -0.085944F, -0.006089F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.207373F, 0.581294F, -18.173931F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(6.207373F, 0.581294F, -18.173931F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.136888F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.136888F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(5.854351F, -0.057296F, -0.002929F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(5.854351F, -0.057296F, -0.002929F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.52148F, 1.255566F, -20.684391F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(7.52148F, 1.255566F, -20.684391F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.719398F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.719398F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-0.028648F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-0.028648F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.342588F, 1.723968F, -21.344503F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(8.342588F, 1.723968F, -21.344503F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-10.661109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-10.661109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.516135F, 1.851324F, -20.258518F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(8.516135F, 1.851324F, -20.258518F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-9.962285F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-9.962285F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.050053F, 1.639364F, -17.707186F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(8.050053F, 1.639364F, -17.707186F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(0.0F, 0.028648F, 0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(0.0F, 0.028648F, 0.028648F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.995004F, 1.214947F, -14.07433F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(6.995004F, 1.214947F, -14.07433F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-7.007556F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-7.007556F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-6.661313F, 0.028648F, -0.001667F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-6.661313F, 0.028648F, -0.001667F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.207272F, 0.420091F, -9.327995F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(6.207272F, 0.420091F, -9.327995F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(-14.536692F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(-14.536692F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.386452F, -1.005811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -0.386452F, -1.005811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.posVec(0.0F, -0.229452F, -0.771811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.posVec(0.0F, -0.229452F, -0.797811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.298225F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.0F, KeyframeAnimations.degreeVec(-8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(7.6F, KeyframeAnimations.degreeVec(-22.428049F, -0.624346F, 0.004729F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(8.333F, KeyframeAnimations.degreeVec(-22.458698F, -0.567077F, -0.006494F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.167F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.8F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_DEATH() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(9.0F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.105717F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-8.105717F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.00467F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(14.00467F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-15.010702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-15.010702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.06996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(15.06996F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-16.14106F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-16.14106F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.497254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(9.497254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-10.195084F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-10.195084F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(70.583092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(70.583092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-53.313683F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-53.313683F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(73.297997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(73.297997F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.243244F, -6.025776F, -27.699261F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(56.714085F, -0.525163F, 4.197311F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-4.716728F, 6.543616F, 1.054627F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-4.716728F, 6.543616F, 1.054627F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.243244F, 6.025776F, 27.699261F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(56.660698F, 3.736367F, -2.466989F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(0.017667F, -6.488948F, -1.323159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.017667F, -6.488948F, -1.323159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.211836F, -0.35443F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.211836F, -0.35443F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.2491F, -10.326121F, 1.095523F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-51.2491F, -10.326121F, 1.095523F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-27.869095F, -9.932183F, -45.777744F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-27.869095F, -9.932183F, -45.777744F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-23.802399F, 0.076406F, -0.015799F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-23.802399F, 0.076406F, -0.015799F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-31.523609F, -46.96801F, 27.792906F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-31.523609F, -46.96801F, 27.792906F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(87.322304F, 19.566956F, 13.561269F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(87.322304F, 19.566956F, 13.561269F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-40.404179F, 46.950642F, -84.151306F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-40.404179F, 46.950642F, -84.151306F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.211836F, -0.35443F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.211836F, -0.35443F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-50.684612F, 13.181046F, 5.221855F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-50.684612F, 13.181046F, 5.221855F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-18.015043F, 22.448463F, 52.376732F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-18.015043F, 22.448463F, 52.376732F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-23.802408F, -0.319384F, -0.055552F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-23.802408F, -0.319384F, -0.055552F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-28.372562F, 45.004852F, -25.88871F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-28.372562F, 45.004852F, -25.88871F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(88.287941F, -22.942501F, -17.208805F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(88.287941F, -22.942501F, -17.208805F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-55.183018F, -36.406822F, 90.007469F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-55.183018F, -36.406822F, 90.007469F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.957695F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-69.957695F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-74.287292F, -0.016316F, -21.944191F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-74.287292F, -0.016316F, -21.944191F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(33.628254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(33.628254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(47.00227F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(47.00227F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.521867F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.521867F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(1.323609F, -22.1924F, 0.005982F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(1.323609F, -22.1924F, 0.005982F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.957695F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-69.957695F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-73.42543F, 0.463417F, 29.818451F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-73.42543F, 0.463417F, 29.818451F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(33.628254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(33.628254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(46.375256F, -0.013986F, -10.971148F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(46.375256F, -0.013986F, -10.971148F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.521867F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.521867F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(3.088889F, 18.157091F, 2.519175F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(3.088889F, 18.157091F, 2.519175F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.063093F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-4.301223F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-3.038097F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-3.038097F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-6.718998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-6.718998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-9.148873F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-9.148873F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.105717F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(8.105717F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-10.894428F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-10.894428F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.16359F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(8.16359F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-11.712468F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-11.712468F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.700798F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(7.700798F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-11.595394F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-11.595394F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.834391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(6.776691F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-10.54456F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-10.54456F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.375452F, -2.880811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.368452F, -2.889811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.posVec(0.0F, -0.377452F, -2.870811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -0.377452F, -2.870811F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.303102F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.55534F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.883F, KeyframeAnimations.degreeVec(-14.951458F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(9.0F, KeyframeAnimations.degreeVec(-14.951458F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_FIREBALL() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.333F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.037691F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(13.06171F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(11.127934F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-10.602829F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-31.668489F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-11.770963F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-11.244701F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.354029F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.272089F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-27.000614F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-27.45071F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(8.800833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.424084F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-29.801216F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-30.464094F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(9.148873F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-17.999002F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-19.572662F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-19.512064F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(100.73264F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(106.09821F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(97.015793F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(17.217585F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(12.122312F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(66.809128F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.373074F, -7.647833F, -11.153376F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(21.679792F, -6.974316F, -2.773136F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(14.999855F, 0.006111F, 3.938514F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(30.704865F, -0.808243F, -23.769638F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(32.16148F, -0.341624F, -25.666046F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.373074F, 7.647833F, 11.153376F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(21.679792F, 6.974316F, 2.773136F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(14.901133F, 3.605903F, -3.468807F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(30.704865F, 0.808243F, 23.769638F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(32.16148F, 0.341624F, 25.666046F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.713972F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.072035F, -31.797697F, -37.323456F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-40.238544F, -41.99292F, -17.877441F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-66.758835F, -46.735477F, 3.276834F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(2.025298F, -17.461473F, -35.781872F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-11.09856F, -25.045158F, -31.687374F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-46.845028F, 28.222116F, 12.191633F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-8.74494F, 20.414145F, 6.909838F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(16.891342F, 16.494648F, -0.029877F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-95.32074F, 7.796009F, -1.298426F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-72.519035F, 7.822996F, 0.124652F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.693937F, -12.423504F, -27.889244F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-19.342056F, -2.411339F, -26.960375F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-28.404497F, -0.372014F, -24.935499F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-1.217848F, -11.057293F, -32.395058F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-1.76648F, -5.271867F, -33.543591F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-26.551373F, 30.069801F, 36.509411F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-41.079678F, 39.928612F, 17.292774F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-62.314129F, 39.80727F, 3.927894F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.742901F, 15.730723F, 35.42395F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-12.304791F, 23.206068F, 31.177885F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-45.294651F, -29.128271F, -14.581613F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-8.165503F, -20.370291F, -7.918757F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(16.901316F, -16.324331F, -0.029851F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-94.934097F, -7.746486F, -0.028756F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-72.537041F, -8.215608F, -0.068216F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.854622F, 13.803867F, 25.951855F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-20.178612F, 0.0F, 25.67433F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-29.757637F, -5.113692F, 24.512989F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-1.518337F, 12.231268F, 30.765608F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-1.986656F, 6.371913F, 31.618443F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-120.24719F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-113.79565F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-112.29363F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-111.33336F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-113.06247F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(95.851479F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(105.4094F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.60428F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(83.019791F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(86.796753F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.62259F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-106.06344F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-106.73078F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-114.37293F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-108.90912F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-120.24719F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-113.79565F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-112.29363F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-111.33336F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-113.06247F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(95.851479F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(105.4094F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.60428F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(83.019791F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(86.796753F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-102.62259F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-106.06344F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-106.73078F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-114.37293F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-108.90912F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.057296F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-5.68159F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-4.818527F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(23.82823F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(21.223202F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(15.010702F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(12.47426F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(8.105717F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.027174F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-7.065284F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(-6.430614F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.042452F, -0.245811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.posVec(0.0F, -0.106452F, -0.556811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.120452F, -0.628811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.658548F, -0.070811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.posVec(0.0F, 0.353548F, -0.070811F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.167F, KeyframeAnimations.degreeVec(-15.485742F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-18.360857F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(12.944014F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_FLY() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.167F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.783789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-19.998589F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(17.637877F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(18.783789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(10.719398F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.497254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(11.069566F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-8.916792F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.497254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.011106F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(8.974784F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.427968F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-11.011106F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-6.776691F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.20004F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.20004F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-70.507072F, -5.303103F, 14.542413F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(56.674961F, 4.071295F, -7.472889F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-24.961033F, 0.291694F, 1.317936F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-70.507072F, -5.303103F, 14.542413F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.513474F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-47.643883F, 0.069943F, 0.003354F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(47.559689F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.817F, KeyframeAnimations.degreeVec(39.274948F, 0.094142F, 0.098196F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(24.961033F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-36.513474F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-71.172447F, 5.320964F, -15.02195F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(59.3797F, -0.00845F, 9.79076F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-24.964483F, -0.005214F, -1.381348F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-71.172447F, 5.320964F, -15.02195F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-35.169525F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.317F, KeyframeAnimations.degreeVec(-44.830864F, -0.192305F, -0.222379F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(44.992916F, 0.002031F, -0.16697F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.817F, KeyframeAnimations.degreeVec(38.610588F, -0.426812F, -0.342484F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(24.961033F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-35.169525F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(58.898827F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-32.011391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(52.778965F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(58.898827F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.237854F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-5.56598F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-92.005302F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-98.237854F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.391915F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(49.729645F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.511077F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.391915F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(58.898827F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-32.011391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(52.778965F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(58.898827F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.237854F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-5.56598F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-92.005302F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-98.237854F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.391915F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(49.729645F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.511077F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-9.391915F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.621365F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(21.556396F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-9.928764F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-37.621365F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.417839F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.004423F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(45.315292F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(71.417839F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.003572F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-52.261879F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.50926F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-0.003572F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.621365F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(21.556396F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-9.928764F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-37.621365F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.417839F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.004423F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(45.315292F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(71.417839F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.003572F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-52.261879F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8F, KeyframeAnimations.degreeVec(-24.50926F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-0.003572F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-10.836105F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.718998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(-6.661312F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-10.661109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.718998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-8.105717F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.585188F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.337254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.337254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.800833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.800833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.916792F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.916792F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(8.626911F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.932109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(7.932109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.834391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.367F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.45F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(6.834391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.240811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.234811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.589811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.214811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.240811F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.533F, KeyframeAnimations.degreeVec(-8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_FLYTOGROUND() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(3.183F);
		builder.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-17.81835F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-17.81835F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-17.81835F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(18.783789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-50.706352F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-35.731518F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(18.663132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(18.663132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(18.663132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(18.663132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(18.663132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(18.663132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(25.086977F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.497254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(34.749088F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(12.00519F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.011106F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(31.939457F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(14.832767F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(18.783789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(9.904131F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.35F, KeyframeAnimations.degreeVec(16.917732F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-23.953674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(6.315314F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(10.078624F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(9.439177F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.475296F, -12.590566F, 4.400884F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(42.627045F, -6.714114F, 7.225453F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(57.262302F, -7.470314F, 4.754949F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(34.555946F, -2.415156F, 10.286631F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-53.15641F, -11.532537F, 4.630103F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-55.411629F, -12.045671F, 4.684099F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-16.187979F, -4.993648F, 8.080696F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-25.961609F, 2.633021F, 5.380525F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-25.961609F, 2.633021F, 5.380525F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.519325F, 0.385467F, 0.476195F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(43.470867F, -0.212154F, -0.217367F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-28.002172F, 0.264771F, 0.329559F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-30.631105F, 0.289599F, 0.382642F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(47.303734F, -0.016103F, -0.041193F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(54.287628F, 0.0F, -0.071981F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(47.303734F, -0.016103F, -0.041193F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(33.367477F, 0.008587F, -0.028648F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.850876F, 11.175919F, -5.04292F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.433F, KeyframeAnimations.degreeVec(42.256126F, 8.687327F, -0.412396F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(57.763142F, 10.520947F, -2.634545F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(32.35265F, 5.511383F, -8.632021F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-53.515366F, 11.127397F, -4.61122F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-55.673157F, 11.592758F, -4.659393F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-15.209004F, 3.374988F, -7.854746F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-26.053873F, -0.020803F, -6.103232F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-26.053873F, -0.020803F, -6.103232F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.014713F, -0.009312F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(44.508453F, 0.001321F, -0.166686F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-26.422678F, -0.006724F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-29.013432F, -0.007414F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(45.562378F, 0.007448F, -0.097976F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(52.56002F, 0.013789F, -0.10009F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(45.562378F, 0.007448F, -0.097976F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(32.547459F, -0.020285F, -0.037011F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.104889F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-37.90234F, -74.483955F, -39.674496F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-76.178413F, 0.030754F, 5.590274F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-66.912895F, 0.016466F, 8.217623F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-30.416931F, 0.004936F, 0.86078F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-19.476484F, -0.41472F, 0.730035F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(13.607116F, -4.098921F, -16.77132F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(15.818373F, -3.906059F, -26.000259F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-7.06695F, 0.001506F, -17.830635F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-15.078291F, 0.002337F, -13.883098F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-19.087105F, 0.02615F, -11.752551F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.335785F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-4.8775F, 5.867945F, 7.17752F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(22.671978F, -0.648977F, -0.458104F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(16.835911F, -0.578729F, -0.535933F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-50.02914F, 0.001974F, 0.001296F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-68.147926F, 0.137058F, 0.013112F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-101.67028F, 1.865735F, 0.036135F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-102.17623F, 2.477475F, 4.29806F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-83.571106F, 27.506018F, 19.456688F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-56.68726F, 11.255658F, 19.433588F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-45.792629F, 6.797125F, 17.630701F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.139664F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(16.747007F, -0.327166F, -0.039503F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-34.695297F, 9.268192F, -8.248372F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-34.749428F, -0.05172F, -9.140934F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-14.724745F, -0.645899F, -0.307713F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.310515F, -1.539343F, -0.120899F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-11.35842F, -9.501475F, -15.957562F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-13.475316F, -17.216455F, -19.43302F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-2.197782F, -18.666296F, 0.001314F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-19.18824F, -11.677719F, -6.563067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-25.974297F, -11.130305F, -6.310396F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(53.104889F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-78.785759F, 90.0F, 20.965445F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-76.240746F, -0.012048F, 3.096504F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-66.706627F, 0.002631F, 3.505619F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-30.444769F, 0.005215F, 0.860854F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-19.490913F, -0.008497F, 1.974506F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(13.801338F, -0.008296F, 17.257631F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(16.100298F, 0.004353F, 26.976538F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-5.017683F, -2.293021F, 13.96648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-13.413466F, -0.827573F, 10.710425F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-17.672287F, -0.057407F, 9.139858F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.335785F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-2.397834F, -3.215423F, -9.046647F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(22.826067F, -0.439032F, -0.315975F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(16.867512F, -0.314894F, -0.399863F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-49.862488F, 0.001971F, 0.001298F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-68.047249F, -0.141616F, -0.026856F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-101.53149F, 1.718222F, 0.006937F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-102.48456F, -8.728913F, -6.172994F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-90.139954F, -13.283109F, -8.071718F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-59.892105F, -5.396743F, -10.543014F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-48.074718F, -2.910536F, -9.912061F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.139664F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(27.154976F, -3.088937F, -0.314814F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-33.42004F, -2.363382F, -0.28957F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-35.279514F, -1.367075F, 5.778119F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.167F, KeyframeAnimations.degreeVec(-14.636777F, -0.878623F, -0.416837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.602612F, 0.003392F, -0.014938F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-13.26594F, -0.013677F, 18.075171F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-14.673046F, 13.368156F, 21.919304F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-0.099918F, 7.593812F, 6.37999F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-18.667173F, 2.606865F, 3.657429F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-25.388834F, 2.478015F, 2.898103F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.629387F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-132.05704F, 2.438729F, -16.097897F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-65.538063F, 15.829941F, 2.806347F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-139.52448F, 19.660851F, -62.464737F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-134.3781F, 13.504657F, -65.234848F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-133.39326F, 14.012415F, -65.329323F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-143.7924F, 12.895784F, -66.387207F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-130.0995F, 20.64719F, -63.877293F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-126.65836F, 24.696674F, -63.203644F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(54.957485F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(113.6164F, -6.024009F, -8.073586F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-1.600946F, -7.785571F, 14.420824F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(69.931206F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(79.311348F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(78.671661F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(84.79229F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(68.900879F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(58.463646F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.644328F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-10.184056F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-35.995083F, -1.336199F, 10.168121F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-83.147682F, 20.13183F, 2.330337F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-92.178719F, 33.155773F, 0.55632F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-92.739647F, 34.669556F, 0.471086F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-88.213417F, 24.030397F, 1.964312F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-85.635948F, 26.165571F, 2.055259F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-84.472687F, 27.106684F, 1.79812F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-32.629387F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-131.64667F, -1.385827F, 15.253541F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-66.336517F, -14.108594F, 4.41947F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-139.66226F, -14.576823F, 58.944473F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-141.40752F, -15.013263F, 62.940342F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-140.85159F, -15.875829F, 63.283508F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-144.58499F, -7.270032F, 60.301846F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-137.38406F, -22.404312F, 63.195282F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-134.46797F, -26.804569F, 63.545197F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.424484F, -0.340527F, 6.597595F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(112.6804F, -0.014128F, 7.921594F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-2.616433F, 0.053987F, 0.133862F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(60.424484F, -0.340527F, 6.597595F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(73.374496F, -10.078191F, 13.489695F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(72.488441F, -10.205363F, 13.876648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(79.371315F, -11.721601F, 11.4466F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(55.834316F, -7.39363F, 13.905973F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(56.98457F, -7.831761F, 14.407559F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.644328F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-10.184056F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-32.410332F, -4.132142F, -12.206346F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-77.884537F, -26.580051F, 0.005815F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-87.525887F, -41.702522F, 1.849826F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-87.735481F, -43.081329F, 1.663951F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(-82.025047F, -32.766705F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-80.143692F, -33.308216F, -0.005971F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-78.278404F, -32.858013F, 0.044275F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(51.357719F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(53.509453F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(58.208393F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(54.486935F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(54.994907F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(54.994907F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-13.591621F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-16.319799F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-6.718998F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.834391F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-11.303102F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-14.181948F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(-6.315314F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-5.854348F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-5.796756F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-7.065284F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-9.381046F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-12.356843F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-6.08479F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-7.00753F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-7.065284F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-7.758615F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-10.719492F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.315314F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(-5.739171F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(-5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-6.603633F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.661312F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-6.430614F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-9.206903F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.00753F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(-5.969548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(-6.027157F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-7.700798F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(-6.315314F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.892097F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -17.716454F, 10.338189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.posVec(0.0F, -4.065452F, 3.810189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.posVec(0.0F, 0.292548F, 2.597189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.posVec(0.0F, 0.890548F, 0.945189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.posVec(0.0F, 0.890548F, 0.239189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.posVec(0.0F, 1.342548F, -0.183811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.posVec(0.0F, 1.414548F, -0.198811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.posVec(0.0F, 0.890548F, -0.181811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.posVec(0.0F, 1.362548F, 0.126189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.posVec(0.0F, 1.268548F, 0.239189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.65F, KeyframeAnimations.degreeVec(-14.00467F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.95F, KeyframeAnimations.degreeVec(14.77357F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.1F, KeyframeAnimations.degreeVec(22.954327F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.233F, KeyframeAnimations.degreeVec(22.954327F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.433F, KeyframeAnimations.degreeVec(28.489479F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.617F, KeyframeAnimations.degreeVec(29.406641F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.1F, KeyframeAnimations.degreeVec(22.954327F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.417F, KeyframeAnimations.degreeVec(19.815832F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(3.183F, KeyframeAnimations.degreeVec(19.208269F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_GROUNDTOFLY() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.5F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.723953F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(18.844654F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(18.844654F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-5.911945F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-5.911945F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.381046F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-11.653985F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-11.653985F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.661312F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(22.333672F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(9.148873F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(-0.023323F, 0.0F, 0.008184F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(29.512962F, -3.380088F, -20.820118F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-54.03936F, -12.111437F, 2.769434F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(56.241295F, -2.712439F, 2.718537F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-54.03936F, -12.111437F, 2.769434F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.degreeVec(56.241295F, -2.712439F, 2.718537F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(56.241295F, -2.712439F, 2.718537F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-33.092438F, 0.028648F, -0.00851F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-29.077932F, 0.036077F, 0.021218F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(54.982189F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-33.092438F, 0.028648F, -0.00851F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(54.982189F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(-0.023677F, 0.0F, -0.008816F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(29.512962F, 3.380088F, 20.820118F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-53.438873F, 7.054771F, -9.386169F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(56.477089F, 7.835148F, 0.022542F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.017F, KeyframeAnimations.degreeVec(-53.438873F, 7.054771F, -9.386169F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.417F, KeyframeAnimations.degreeVec(56.477089F, 7.835148F, 0.022542F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(56.477089F, 7.835148F, 0.022542F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.713972F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-30.264381F, 0.09369F, 0.00541F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-26.359413F, 0.064004F, 0.015231F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(54.982189F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-30.264381F, 0.09369F, 0.00541F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(54.982189F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.157187F, -28.550447F, -43.209255F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(3.492574F, -24.36191F, -48.767277F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(12.182244F, -14.412791F, -51.559071F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-71.775795F, -52.201115F, 3.301685F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-36.458042F, -47.801193F, -20.042454F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-44.313904F, -45.937878F, -29.720181F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-6.504047F, -24.807096F, -49.208324F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-35.223751F, -46.769566F, -15.648636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-54.092247F, 31.811028F, 16.397558F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.287636F, -0.91826F, -0.008496F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-108.20457F, 0.865889F, 0.01052F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(16.894621F, 0.0F, -0.450977F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-5.22793F, -3.385888F, 12.809815F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-27.896132F, -3.885638F, 3.860363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-68.205635F, -4.460384F, 9.749598F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-6.387418F, -8.135903F, 3.491581F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.072027F, -22.514582F, -27.810232F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(2.780983F, -8.140124F, -33.409691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(7.978978F, -8.863165F, -34.260025F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-26.421652F, 17.464449F, -50.905018F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(39.52652F, 11.131214F, -9.572928F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(39.52652F, 11.131214F, -9.572928F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(52.879429F, 18.973669F, -7.965018F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -0.115907F, -0.203067F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-19.788126F, 26.951626F, 42.402283F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(2.164621F, 20.98531F, 49.817558F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(11.476926F, 12.587224F, 52.355511F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-69.336418F, 50.659653F, -0.076006F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-35.093269F, 44.77066F, 22.76832F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-44.132023F, 46.169056F, 29.938599F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-6.437147F, 24.913097F, 49.354836F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-35.223751F, 46.769566F, 15.648636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.123001F, -32.878212F, -19.105513F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-91.287636F, -0.91826F, -0.008496F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-108.20286F, 0.567183F, 0.002864F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(16.89455F, 0.0F, -0.382904F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-4.833157F, -0.003198F, -12.636645F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(-27.775915F, -0.007556F, -7.113461F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-67.493362F, -3.481759F, -9.412915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-6.133039F, 8.188626F, 0.010475F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-16.122478F, 22.935844F, 25.812027F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(2.642934F, 8.123301F, 31.812891F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(7.908193F, 9.401319F, 32.63942F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-26.371061F, -17.791103F, 51.029377F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(39.133762F, -12.467762F, 10.081608F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(39.133762F, -12.467762F, 10.081608F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(53.122612F, -18.967766F, 8.163902F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.10507F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88443F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-148.99023F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-102.63262F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-53.149456F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-148.99023F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-28.741322F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.226646F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34333F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.89648F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(46.205833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-3.943659F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(78.315048F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(52.943176F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.310425F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.899109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-96.307823F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-77.756241F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(34.608723F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-22.191675F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-11.314044F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-129.10507F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-140.88443F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-148.99023F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-102.63262F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-53.149456F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-148.99023F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-28.741322F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(79.226646F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(96.34333F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(107.89648F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(46.205833F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-3.943659F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(78.315048F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(52.943176F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-88.310425F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-93.899109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-96.307823F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(-77.756241F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(34.608723F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(-22.191675F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-11.314044F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(71.477364F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(63.509727F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(26.487385F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(40.242371F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(26.487385F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.090854F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-13.532728F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(16.798216F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(16.798216F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.742866F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-10.253289F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(9.904131F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(9.904131F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.337254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-7.700798F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.816439F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(-5.739171F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.18076F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.430614F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.262189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.215811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.554811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.posVec(0.0F, 0.090548F, 1.027189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.posVec(0.0F, 0.413548F, 5.250189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.posVec(0.0F, 0.305548F, 3.852189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.posVec(0.0F, 0.303548F, 3.456189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.438548F, 9.508188F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.15F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.383F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.617F, KeyframeAnimations.degreeVec(-11.361627F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.85F, KeyframeAnimations.degreeVec(9.32299F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.133F, KeyframeAnimations.degreeVec(12.47426F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_IDLE() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.667F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.796579F, -9.532891F, -8.140183F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-28.49127F, -9.904175F, -7.682056F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-25.796579F, -9.532891F, -8.140183F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-67.219711F, -0.01607F, -0.02134F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-56.282852F, -0.168268F, -0.024868F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-67.219711F, -0.01607F, -0.02134F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.690371F, -0.00995F, -12.306512F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-4.450441F, 0.009067F, -12.306248F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(0.690371F, -0.00995F, -12.306512F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-41.694012F, 10.955115F, 8.587875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-43.472313F, 11.649512F, 7.791193F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-41.694012F, 10.955115F, 8.587875F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-61.776539F, 0.132807F, 0.001062F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-50.909817F, -0.056196F, -0.028492F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-61.776539F, 0.132807F, 0.001062F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.938609F, -6.045258F, 12.787517F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(4.870542F, -4.652318F, 13.207677F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(10.938609F, -6.045258F, 12.787517F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-157.08151F, -0.009456F, -18.060787F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-148.51598F, 0.864624F, -18.713387F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-157.08151F, -0.009456F, -18.060787F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(73.491714F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(73.646294F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(73.491714F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-55.590595F, -3.259306F, 10.219077F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-55.923313F, -3.145688F, 10.220248F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-55.590595F, -3.259306F, 10.219077F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-83.927635F, -1.335533F, 15.303329F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-80.63015F, -1.748161F, 15.041159F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-83.927635F, -1.335533F, 15.303329F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(67.057281F, 5.978664F, -9.052012F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(67.279266F, 0.013293F, -12.297203F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(67.057281F, 5.978664F, -9.052012F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.404123F, 0.686703F, 6.678936F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-2.33952F, 0.846239F, 6.24335F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-2.404123F, 0.686703F, 6.678936F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.846073F, 0.16942F, 0.043455F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(9.032897F, 0.169625F, 0.042226F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(9.846073F, 0.16942F, 0.043455F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.439182F, 0.057296F, 0.004731F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(8.279405F, 0.14324F, 0.010368F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(9.439182F, 0.057296F, 0.004731F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.105725F, -0.085944F, -0.006089F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(6.776695F, -0.057296F, -0.003392F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(8.105725F, -0.085944F, -0.006089F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(5.854351F, -0.057296F, -0.002929F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, -0.057296F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(5.854351F, -0.057296F, -0.002929F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-6.661313F, 0.028648F, -0.001667F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-6.661313F, 0.028648F, -0.001667F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-7.123018F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.536692F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(-14.536692F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.667F, KeyframeAnimations.degreeVec(8.511042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_LEFTTAILSWEEP() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.525141F, -0.688649F, -20.763231F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.218743F, 12.239233F, -58.722027F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-12.131548F, 13.955375F, -78.234161F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.533517F, 0.028648F, -0.003152F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.643588F, 0.862305F, 10.196222F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-7.643815F, 0.836834F, 12.475597F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.348351F, 1.314821F, 6.652156F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.551782F, 2.079393F, 14.927677F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.543677F, 1.936036F, 18.97699F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.226147F, 1.1487F, 5.965351F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.137812F, 1.879277F, 14.071449F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.01643F, 1.762798F, 18.128391F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.944345F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.20756F, 0.677359F, 8.395794F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-6.661721F, 0.63604F, 10.895121F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(60.100166F, -0.647464F, -17.891815F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(53.139717F, -3.858347F, -23.630547F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(50.348011F, -4.846037F, -25.617481F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(60.36628F, -1.835288F, -15.324106F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.493584F, 2.772571F, 8.036881F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(41.537251F, -1.357914F, 40.444782F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(25.453098F, -0.003379F, 51.518616F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.012677F, 0.0F, -0.033816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(44.672947F, -7.866275F, -45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(41.967171F, -13.892539F, -41.967171F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(46.168587F, -4.075728F, -48.762653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(46.168587F, -4.075728F, -48.762653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-0.009275F, 0.028648F, -35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -34.33527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(0.013323F, 0.0F, 0.033184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(41.169758F, 8.757169F, 47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(44.06926F, 5.902561F, 53.518154F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(37.210358F, 14.892476F, 39.056915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(37.210358F, 14.892476F, 39.056915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-0.608629F, -0.213409F, 36.160664F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.513669F, -0.404656F, 34.950596F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.607452F, -9.418406F, -12.108974F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-75.316826F, -10.882311F, -19.316008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-79.522285F, -5.40856F, -20.817322F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-31.992088F, -19.423183F, -12.949613F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(4.033581F, 6.490939F, -23.977694F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(5.324017F, 6.505071F, -23.850479F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-28.49127F, -9.904175F, -7.682056F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.049187F, -1.939218F, -6.721969F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-31.053082F, -8.154723F, -26.70908F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-28.483711F, -9.910368F, -28.304918F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-40.497807F, -15.846197F, -36.581444F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-48.878384F, -22.154325F, -42.226601F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-91.045937F, 20.574997F, 13.069555F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-92.694489F, 20.851278F, 13.749064F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.282852F, -0.168268F, -0.024868F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.905205F, 12.306829F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(20.860653F, 31.274395F, 1.265359F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(28.712189F, 39.791851F, 4.558822F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(4.465269F, 40.369141F, -22.387476F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-17.030575F, -10.631503F, -2.835808F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-17.383337F, -11.666396F, -3.30059F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.450441F, 0.009067F, -12.306248F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.021222F, -0.029378F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -0.021222F, -0.029378F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.708458F, -0.02291F, 13.181899F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-56.069939F, -2.385424F, 33.181652F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-56.069939F, -2.385424F, 33.181652F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-43.472313F, 11.649512F, 7.791193F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-33.890511F, -8.210957F, 9.996606F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-40.223331F, 14.695107F, 28.280363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-40.223331F, 14.695107F, 28.280363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.909817F, -0.056196F, -0.028492F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.850577F, -14.750386F, 9.696075F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.01716F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.01716F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(4.870542F, -4.652318F, 13.207677F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-121.31789F, 0.004955F, -40.667233F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-132.97209F, -4.851879F, -37.831581F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-142.04703F, -9.417172F, -36.214069F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-141.76704F, -9.601618F, -35.965988F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-136.53499F, 7.418174F, -30.129713F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-154.50758F, 0.0F, -23.648207F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-154.50758F, 0.0F, -23.648207F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.51598F, 0.864624F, -18.713387F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(86.951065F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(94.314941F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.043045F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(93.568115F, -1.001743F, 1.77239F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.208282F, -0.446238F, 0.883074F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(89.502342F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(89.502342F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.646294F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-98.989151F, 2.527189F, 1.552818F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-95.989037F, 2.598151F, 1.808875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.490234F, 2.542634F, 1.880918F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-90.661903F, 2.618706F, 2.230133F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.471535F, -0.447365F, 0.48345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-85.211967F, -3.385389F, 0.262011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-85.211967F, -3.385389F, 0.262011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.923313F, -3.145688F, 10.220248F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-79.359863F, -17.865034F, 36.585716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-79.359863F, -17.865034F, 36.585716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.63015F, -1.748161F, 15.041159F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.887886F, 8.436071F, -17.479233F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(51.482231F, -0.015959F, -25.058397F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(67.279266F, 0.013293F, -12.297203F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-100.06565F, -21.719818F, 4.700527F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-105.96056F, -26.912798F, 7.072946F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.108261F, -1.470408F, 22.27528F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(1.219543F, -1.433849F, 24.302694F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(6.092365F, -11.399406F, -28.291689F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(6.793156F, -11.53231F, -30.65716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.33952F, 0.846239F, 6.24335F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.04156F, -0.478695F, -0.133123F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(11.128339F, -0.278105F, -0.113863F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(12.772528F, 5.58015F, -31.640085F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(14.718499F, -0.023269F, -34.628727F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.032897F, 0.169625F, 0.042226F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.352268F, -0.224496F, -0.076049F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(9.497286F, -0.083564F, -0.035788F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(11.219084F, 7.063076F, -31.792753F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(11.230627F, 7.704548F, -34.057709F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.279405F, 0.14324F, 0.010368F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.14244F, -0.084406F, -0.03326F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(6.257674F, -0.028648F, -0.001566F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(8.393437F, 7.995345F, -25.934191F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(8.398367F, 8.726422F, -28.196407F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.776695F, -0.057296F, -0.003392F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-0.028648F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.151193F, -0.326418F, -7.498272F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.221278F, -0.451659F, -9.700292F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.057296F, -0.028648F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.028648F, 0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.165096F, -0.124779F, -6.776581F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.273016F, -0.19433F, -8.945563F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.028677F, 0.114584F, 0.028676F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.12076F, -0.07772F, -9.508264F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.297124F, -0.087982F, -12.288469F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.911953F, -0.028648F, 0.001479F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.028698F, 0.200528F, 0.028698F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.320006F, 0.28953F, -12.285892F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.238008F, 0.251488F, -9.874807F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.411802F, 0.145095F, 0.01937F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.094162F, 0.261389F, 0.041291F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.167153F, 0.390403F, -10.224081F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.167734F, 0.39009F, -10.049411F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.482104F, 0.14324F, -0.010622F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-8.163648F, 0.261926F, 0.038875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.03851F, 0.523575F, -10.48674F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.039304F, 0.523443F, -10.31196F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.758624F, 0.085944F, -0.005827F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.440752F, 0.231048F, 0.013734F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.006467F, -0.375126F, -10.749157F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.022764F, -0.377738F, -10.574094F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.816908F, 0.059756F, 0.023727F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-9.497288F, 0.028648F, -0.002381F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-9.875778F, -1.896105F, -10.786595F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-9.908871F, -1.854774F, -10.613665F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.077452F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.460452F, -0.203811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.531452F, -0.234811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.271548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 1.305548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 1.322548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.225014F, 7.797851F, 9.014324F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(11.12207F, 7.478322F, 17.128208F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(12.183901F, 7.415154F, 18.622875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.820126F, 8.68717F, -6.915144F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(13.003315F, 12.885299F, -29.379183F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(13.626988F, 13.383887F, -30.988829F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_RIGHTTAILSWEEP() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(2.0F);
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.735456F, -0.457288F, 20.769335F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-6.218743F, -12.239233F, 58.722027F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-12.131548F, -13.955375F, 78.234161F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(23.07897F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-10.369775F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.533517F, 0.028648F, -0.003152F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.643588F, -0.862305F, -10.196222F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-7.643815F, -0.836834F, -12.475597F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.684909F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.542789F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.354786F, -1.200202F, -6.673694F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.559157F, -2.022061F, -14.935375F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.543677F, -1.936036F, -18.97699F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-8.568973F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-18.482038F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-21.229033F, -1.091393F, -5.976063F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-15.137812F, -1.879277F, -14.071449F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-11.01643F, -1.762798F, -18.128391F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.257674F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-11.303158F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.944345F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-9.20756F, -0.677359F, -8.395794F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-6.661721F, -0.63604F, -10.895121F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(59.950127F, 0.017197F, 17.509508F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(51.981335F, 0.016614F, 21.543324F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(48.805412F, 0.027415F, 23.11845F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(59.987099F, 0.001509F, 14.220042F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(63.946815F, -1.654079F, -13.636804F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(42.169102F, -0.017311F, -41.088951F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(26.444931F, -1.830398F, -52.122585F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(-0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(-0.013323F, 0.0F, 0.033184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(-0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(-0.004323F, 0.0F, 0.016184F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(41.169758F, -8.757169F, -47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(41.169758F, -8.757169F, -47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(41.169758F, -8.757169F, -47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(41.169758F, -8.757169F, -47.180847F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(44.06926F, -5.902561F, -53.518154F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(37.210358F, -14.892476F, -39.056915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(37.210358F, -14.892476F, -39.056915F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, -11.365757F, -45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.365433F, -0.531444F, -36.157837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.365433F, -0.531444F, -36.157837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.365433F, -0.531444F, -36.157837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-0.365433F, -0.531444F, -36.157837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.365433F, -0.531444F, -36.157837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.365433F, -0.531444F, -36.157837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-0.365433F, -0.531444F, -36.157837F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-1.007834F, -1.199717F, -34.934654F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(-0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(-0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(-0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.posVec(-0.012677F, 0.0F, -0.033816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.posVec(-0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(-0.004677F, 0.0F, -0.015816F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(44.672947F, 7.866275F, 45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(44.672947F, 7.866275F, 45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(44.672947F, 7.866275F, 45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(44.672947F, 7.866275F, 45.296505F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.542F, KeyframeAnimations.degreeVec(41.967171F, 13.892539F, 41.967171F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.833F, KeyframeAnimations.degreeVec(46.168587F, 4.075728F, 48.762653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(46.168587F, 4.075728F, 48.762653F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(47.964893F, 11.365757F, 45.724693F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.009275F, 0.028648F, 35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.009275F, 0.028648F, 35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.009275F, 0.028648F, 35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(0.009275F, 0.028648F, 35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.009275F, 0.028648F, 35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(0.009275F, 0.028648F, 35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(0.009275F, 0.028648F, 35.874767F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 34.33527F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.021222F, -0.029378F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -0.021222F, -0.029378F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-69.423164F, -0.558082F, -10.778224F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-55.332054F, 3.30127F, -28.677673F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-55.332054F, 3.30127F, -28.677673F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-43.653286F, -13.693241F, -5.749678F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-33.198494F, 0.014194F, -13.373108F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-40.223331F, -14.695107F, -28.280363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-40.223331F, -14.695107F, -28.280363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.909817F, -0.056196F, -0.028492F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.762731F, 12.825525F, -11.846558F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-0.01716F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.01716F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(5.402077F, 0.00625F, -13.389088F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, -0.041534F, -0.058728F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-66.607452F, 9.418406F, 12.108974F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-75.316826F, 10.882311F, 19.316008F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-79.140785F, 11.189522F, 24.175127F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-31.922985F, 18.170549F, 13.947777F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(4.033581F, -6.490939F, 23.977694F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(5.324017F, -6.505071F, 23.850479F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-28.485786F, 9.430619F, 8.043778F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.034431F, 0.314848F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-31.053082F, 8.154723F, 26.70908F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-28.483711F, 9.910368F, 28.304918F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.333F, KeyframeAnimations.degreeVec(-40.497807F, 15.846197F, 36.581444F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-48.878384F, 22.154325F, 42.226601F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-91.045937F, -20.574997F, -13.069555F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-92.694489F, -20.851278F, -13.749064F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-56.282852F, -0.168268F, -0.024868F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(13.776164F, -12.457144F, 1.231447F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(20.524681F, -31.504993F, 0.008386F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(27.211899F, -40.895588F, -0.005196F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(4.465269F, -40.369141F, 22.387476F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-17.146265F, 12.644442F, 1.842341F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-17.578527F, 13.945863F, 1.724597F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-4.4877F, -0.352843F, 12.320145F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-79.359863F, 17.865034F, -36.585716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-79.359863F, 17.865034F, -36.585716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-80.209145F, 0.029016F, -13.536457F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(56.887886F, -8.436071F, 17.479233F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(50.050278F, -5.607977F, 22.255377F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(66.787079F, -0.669146F, 5.960458F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-100.26486F, 27.341827F, -0.008404F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-105.96056F, 26.912798F, -7.072946F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-104.74546F, -1.492416F, 0.790636F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 0.135526F, -0.14657F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.551378F, 0.026996F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-121.96283F, -3.387379F, 38.384296F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-134.06764F, -0.024059F, 35.246738F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-142.04703F, 9.417172F, 36.214069F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-141.76704F, 9.601618F, 35.965988F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-136.14801F, -6.303267F, 29.87524F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-155.42992F, -4.87637F, 22.539011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-155.42992F, -4.87637F, 22.539011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-148.09695F, 0.582644F, 16.270849F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(86.951065F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(94.314941F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(98.043045F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(93.568115F, -1.001743F, 1.77239F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(89.208282F, -0.446238F, 0.883074F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(89.502342F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(89.502342F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(73.646294F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.342087F, -9.052235F, 0.020179F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-96.256676F, -7.866069F, 0.003363F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.715256F, -7.228954F, -0.027368F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.417F, KeyframeAnimations.degreeVec(-90.822166F, -6.061426F, -0.001134F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-94.471535F, -0.447365F, 0.48345F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(-85.211967F, -3.385389F, 0.262011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(-85.211967F, -3.385389F, 0.262011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-55.189411F, -6.131055F, -10.05476F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.01727F, 7.16116F, -22.37014F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.015503F, 7.008856F, -24.399176F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(6.092365F, 11.399406F, 28.291689F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(6.793156F, 11.53231F, 30.65716F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.417778F, 0.586196F, -6.272994F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.04156F, -0.478695F, -0.133123F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(11.128339F, -0.278105F, -0.113863F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(13.775288F, -2.019413F, 32.021172F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(14.011378F, -2.211815F, 34.31636F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(9.032897F, 0.169625F, 0.042226F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.352268F, -0.224496F, -0.076049F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(9.497286F, -0.083564F, -0.035788F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(11.424388F, -6.313122F, 31.842751F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(11.502594F, -6.780433F, 34.114861F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(8.279405F, 0.14324F, 0.010368F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.14244F, -0.084406F, -0.03326F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(6.257674F, -0.028648F, -0.001566F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(9.160196F, -4.536413F, 26.100254F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(9.276704F, -5.089781F, 28.352251F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(6.776695F, -0.057296F, -0.003392F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-0.028648F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.192587F, -0.303839F, 7.499215F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.2944F, -0.407786F, 9.702216F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.057296F, -0.028648F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, -0.028648F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.028648F, 0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.178679F, -0.104404F, 6.776924F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.299946F, -0.149446F, 8.946419F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.028677F, 0.114584F, 0.028676F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.108424F, -0.094168F, 9.508118F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.275836F, -0.141202F, 12.287984F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.911953F, -0.028648F, 0.001479F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(0.028698F, 0.200528F, 0.028698F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.367552F, 0.226134F, 12.287193F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.27766F, 0.206879F, 9.875833F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.028648F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.411802F, 0.145095F, 0.01937F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.094162F, 0.261389F, 0.041291F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.233927F, 0.354448F, 10.225377F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.233346F, 0.35476F, 10.050707F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.482104F, 0.14324F, -0.010622F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-8.163648F, 0.261926F, 0.038875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(0.133384F, 0.507763F, 10.48751F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.132591F, 0.507895F, 10.312729F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-7.758624F, 0.085944F, -0.005827F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-7.440752F, 0.231048F, 0.013734F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-0.063764F, -0.369724F, 10.749342F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.09183F, -0.367112F, 10.574464F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-6.142412F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.816908F, 0.059756F, 0.023727F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.208F, KeyframeAnimations.degreeVec(-9.497288F, 0.028648F, -0.002381F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.708F, KeyframeAnimations.degreeVec(-10.054379F, 0.004998F, 10.950036F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-10.079243F, 0.020985F, 10.772661F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(-13.768581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.077452F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.460452F, -0.203811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.531452F, -0.234811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.271548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.posVec(0.0F, 1.305548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.posVec(0.0F, 1.322548F, -0.039811F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.097189F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.225014F, -7.797851F, -9.014324F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(11.12207F, -7.478322F, -17.128208F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(12.183901F, -7.415154F, -18.622875F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.820126F, -8.68717F, 6.915144F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.667F, KeyframeAnimations.degreeVec(14.106412F, -8.279375F, 29.677248F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.083F, KeyframeAnimations.degreeVec(14.687895F, -9.176385F, 31.258434F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	private static AnimationDefinition build_WALK() {
		AnimationDefinition.Builder builder = AnimationDefinition.Builder.withLength(1.3333F).looping();
		builder.addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -4.8864F, 0.5872F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, -4.8864F, 0.9932F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, -4.8864F, 0.5802F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -4.8864F, 1.0072F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.posVec(0.0F, -4.8864F, 0.5872F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0147F, 11.7445F, 2.4947F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-53.1261F, 1.726F, 8.2004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-60.0F, 1.505F, -1.1516F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-34.8725F, 9.7784F, 10.0145F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-15.0147F, 11.7445F, 2.4947F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0001F, 0.5514F, 0.027F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(46.3807F, -0.5453F, 0.8084F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(90.0F, 0.6471F, 1.0004F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(67.9013F, -0.0427F, 1.5025F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(55.7304F, -0.0206F, 0.0027F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(46.3807F, -0.5453F, 0.8084F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0002F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 5.2064F, 5.011F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-2.6995F, -0.6721F, -0.2598F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-3.6345F, 2.6906F, 1.1696F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-17.1804F, 1.2202F, -0.0052F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-30.0F, 5.2064F, 5.011F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, -6.0575F, -6.1666F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-33.5028F, -11.6722F, -10.1813F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-14.2598F, -16.9603F, -3.3497F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-54.4905F, -2.0615F, -16.6627F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-60.0F, -6.0575F, -6.1666F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5514F, 0.027F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(67.1493F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(56.0416F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(45.4567F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(67.1493F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0002F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("back_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.4326F, 3.2678F, 0.5154F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-18.4311F, 0.3098F, 0.0326F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-30.0F, -10.4727F, 5.2893F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(25.4812F, -0.3406F, 0.0041F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-3.4326F, 3.2678F, 0.5154F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.4584F, 0.3153F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, -0.2082F, 0.1967F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, -0.5354F, 0.3263F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -0.0076F, 0.0496F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(0.0F, -0.4584F, 0.3153F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0002F, -0.0003F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0286F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail2", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0005F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0286F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail3", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0286F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail4", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0002F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0303F, 0.027F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail5", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0003F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0305F, 0.0268F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail6", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0306F, 0.0267F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail7", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0286F, -0.0019F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail8", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail9", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0002F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.0286F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail10", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0001F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail11", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0001F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("tail12", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0003F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, -2.7229F, 7.6313F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-18.8195F, 0.0151F, 4.5361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(21.0266F, 1.5435F, 1.4771F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-18.7985F, 57.8394F, 15.8549F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-60.0F, -2.7229F, 7.6313F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_leg", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(41.7109F, 0.0523F, -0.095F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(12.7694F, -0.2651F, 0.2469F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-27.5986F, -1.098F, -0.0163F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-44.4577F, -17.7555F, -45.9841F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(41.7109F, 0.0523F, -0.095F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_shin", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0005F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(19.0024F, 0.3295F, -0.2306F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(13.8067F, 0.1781F, -0.1355F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(11.1707F, 1.4076F, -0.8187F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(30.0F, 46.4554F, -1.6102F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(19.0024F, 0.3295F, -0.2306F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_right_foot", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.657F, 1.5192F, 1.461F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-2.1658F, 3.098F, -21.8071F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-60.0F, -0.1785F, 0.2075F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-21.8107F, -0.5036F, 3.1656F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(17.657F, 1.5192F, 1.461F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_leg", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0001F, 0.0F, -0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-28.0533F, -1.0873F, 0.0005F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-34.3522F, 11.2145F, -0.0158F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(61.8945F, 0.0085F, -0.2468F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(13.8075F, -0.5582F, 0.4017F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-28.0533F, -1.0873F, 0.0005F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_shin", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0005F, -0.0001F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.648F, -1.7827F, 3.3747F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(30.0F, -32.6325F, 1.3283F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(15.9826F, 0.1842F, -0.1017F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(15.0857F, 0.7052F, -0.0901F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(10.648F, -1.7827F, 3.3747F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("front_left_foot", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0003F, 0.0004F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(35.6039F, -0.9851F, 33.1156F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(31.1157F, 0.0074F, 37.2333F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(35.6039F, -0.9851F, 33.1156F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(31.1157F, 0.0074F, 37.2333F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(35.6039F, -0.9851F, 33.1156F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(-0.0003F, 0.0002F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(34.7555F, 1.7185F, -30.8022F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(29.9785F, 0.0009F, -34.6691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(34.7555F, 1.7185F, -30.8022F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(29.9785F, 0.0009F, -34.6691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(34.7555F, 1.7185F, -30.8022F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0003F, 0.0003F, 0.0002F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-51.4824F, 0.9011F, -0.6955F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-32.5161F, -0.4345F, -0.0024F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-57.4581F, 2.4163F, -1.5462F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-33.7802F, -0.3013F, 0.0649F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-51.4824F, 0.9011F, -0.6955F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0002F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.643F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(12.5329F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.6613F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(7.643F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck2", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0003F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(11.1864F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(6.2577F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(13.6506F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(6.1424F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(11.1864F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck3", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0002F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.428F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(5.9119F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(11.3616F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(10.428F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck4", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0002F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6667F, KeyframeAnimations.degreeVec(6.4306F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(6.2F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("neck5", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.0004F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		));
		builder.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(6.9149F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.3333F, KeyframeAnimations.degreeVec(6.9149F, -0.4705F, -0.4537F), AnimationChannel.Interpolations.LINEAR)
		));
		return builder.build();
	}

	public static AnimationDefinition get(String animationName) {
        return switch (animationName) {
            case "airstrike" -> DEF_AIRSTRIKE;
            case "attack1" -> DEF_ATTACK1;
            case "attack2" -> DEF_ATTACK2;
            case "attack3" -> DEF_ATTACK3;
            case "backjumpmove" -> DEF_BACKJUMPMOVE;
            case "backjumpprepare" -> DEF_BACKJUMPPREPARE;
            case "backjumprecovery" -> DEF_BACKJUMPRECOVERY;
            case "crystallink" -> DEF_CRYSTALLINK;
            case "death" -> DEF_DEATH;
            case "fireball" -> DEF_FIREBALL;
            case "fly" -> DEF_FLY;
            case "flytoground" -> DEF_FLYTOGROUND;
            case "groundtofly" -> DEF_GROUNDTOFLY;
            case "idle" -> DEF_IDLE;
            case "lefttailsweep" -> DEF_LEFTTAILSWEEP;
            case "righttailsweep" -> DEF_RIGHTTAILSWEEP;
            case "walk" -> DEF_WALK;
            default -> throw new IllegalArgumentException("[EpicDragonFight] Unknown animation: " + animationName);
        };
	}
}