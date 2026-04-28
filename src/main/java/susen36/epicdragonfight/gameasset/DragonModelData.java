package susen36.epicdragonfight.gameasset;

import com.google.common.collect.Maps;
import susen36.epicdragonfight.api.animation.Joint;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.nio.FloatBuffer;
import java.util.Map;

public class DragonModelData {

    public static Armature createArmature() {
        Map<String, Joint> jointMap = Maps.newHashMap();
        Joint rootJoint = buildRoot(jointMap);
        rootJoint.setInversedModelTransform(new OpenMatrix4f());
        return new Armature(jointMap.size(), rootJoint, jointMap);
    }

    private static Joint buildRoot(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1e-06F, 1.0F, 2.441811F, 0.0F, -1.0F, -1e-06F, 1.268548F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("root", 0, localMatrix);
        jointMap.put("root", joint);
        joint.addSubJoint(buildRightHindLeg(jointMap));
        joint.addSubJoint(buildLeftHindLeg(jointMap));
        joint.addSubJoint(buildBody(jointMap));
        return joint;
    }

    private static Joint buildRightHindLeg(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.999855F, 0.0F, -0.857079F, 0.515184F, 0.544667F, 0.0F, -0.515184F, -0.857079F, 0.036199F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_hind_leg", 1, localMatrix);
        jointMap.put("right_hind_leg", joint);
        joint.addSubJoint(buildRightHindLegTip(jointMap));
        return joint;
    }

    private static Joint buildRightHindLegTip(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, -0.0F, 0.0F, 0.0F, 0.871159F, 0.491001F, 1.692269F, -0.0F, -0.491001F, 0.871159F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_hind_leg_tip", 2, localMatrix);
        jointMap.put("right_hind_leg_tip", joint);
        joint.addSubJoint(buildRightHindFoot(jointMap));
        return joint;
    }

    private static Joint buildRightHindFoot(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, -0.0F, 0.0F, -0.0F, 0.659118F, -0.75204F, 2.159911F, 0.0F, 0.75204F, 0.659118F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_hind_foot", 3, localMatrix);
        jointMap.put("right_hind_foot", joint);
        return joint;
    }

    private static Joint buildLeftHindLeg(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, -0.999948F, 0.0F, -0.857079F, 0.515184F, 0.544667F, 0.0F, -0.515184F, -0.857079F, 0.036199F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_hind_leg", 4, localMatrix);
        jointMap.put("left_hind_leg", joint);
        joint.addSubJoint(buildLeftHindLegTip(jointMap));
        return joint;
    }

    private static Joint buildLeftHindLegTip(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, -0.0F, 0.0F, 0.0F, 0.871159F, 0.491001F, 1.692269F, -0.0F, -0.491001F, 0.871159F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_hind_leg_tip", 5, localMatrix);
        jointMap.put("left_hind_leg_tip", joint);
        joint.addSubJoint(buildLeftHindFoot(jointMap));
        return joint;
    }

    private static Joint buildLeftHindFoot(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, -0.0F, -0.0F, -0.0F, 0.659118F, -0.75204F, 2.159911F, 0.0F, 0.75204F, 0.659118F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_hind_foot", 6, localMatrix);
        jointMap.put("left_hind_foot", joint);
        return joint;
    }

    private static Joint buildBody(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1e-06F, 0.273754F, 0.0F, 1e-06F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("body", 7, localMatrix);
        jointMap.put("body", joint);
        joint.addSubJoint(buildNeckTail1(jointMap));
        joint.addSubJoint(buildRightFrontLeg(jointMap));
        joint.addSubJoint(buildLeftFrontLeg(jointMap));
        joint.addSubJoint(buildRightWing(jointMap));
        joint.addSubJoint(buildLeftWing(jointMap));
        joint.addSubJoint(buildNeck(jointMap));
        return joint;
    }

    private static Joint buildNeckTail1(Map<String, Joint> jointMap) {
        float[] transform = new float[]{-1.0F, 0.0F, 0.0F, -0.0F, 0.0F, -1.0F, 0.0F, -0.516188F, 0.0F, 0.0F, 1.0F, 0.429314F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_1", 8, localMatrix);
        jointMap.put("neck_tail_1", joint);
        joint.addSubJoint(buildNeckTail2(jointMap));
        return joint;
    }

    private static Joint buildNeckTail2(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, -0.0F, 1.0F, 0.0F, 0.615504F, 0.0F, -0.0F, 1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_2", 9, localMatrix);
        jointMap.put("neck_tail_2", joint);
        joint.addSubJoint(buildNeckTail3(jointMap));
        return joint;
    }

    private static Joint buildNeckTail3(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.0F, 0.624616F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_3", 10, localMatrix);
        jointMap.put("neck_tail_3", joint);
        joint.addSubJoint(buildNeckTail4(jointMap));
        return joint;
    }

    private static Joint buildNeckTail4(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.62624F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_4", 11, localMatrix);
        jointMap.put("neck_tail_4", joint);
        joint.addSubJoint(buildNeckTail5(jointMap));
        return joint;
    }

    private static Joint buildNeckTail5(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, -0.0F, 1.0F, 0.0F, 0.624649F, -0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_5", 12, localMatrix);
        jointMap.put("neck_tail_5", joint);
        joint.addSubJoint(buildNeckTail6(jointMap));
        return joint;
    }

    private static Joint buildNeckTail6(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.623273F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_6", 13, localMatrix);
        jointMap.put("neck_tail_6", joint);
        joint.addSubJoint(buildNeckTail7(jointMap));
        return joint;
    }

    private static Joint buildNeckTail7(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.625387F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_7", 14, localMatrix);
        jointMap.put("neck_tail_7", joint);
        joint.addSubJoint(buildNeckTail8(jointMap));
        return joint;
    }

    private static Joint buildNeckTail8(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.625387F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_8", 15, localMatrix);
        jointMap.put("neck_tail_8", joint);
        joint.addSubJoint(buildNeckTail9(jointMap));
        return joint;
    }

    private static Joint buildNeckTail9(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, -0.0F, 0.0F, -0.0F, 1.0F, -0.0F, 0.624782F, 0.0F, 0.0F, 1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_9", 16, localMatrix);
        jointMap.put("neck_tail_9", joint);
        joint.addSubJoint(buildNeckTail10(jointMap));
        return joint;
    }

    private static Joint buildNeckTail10(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.62586F, 0.0F, 0.0F, 1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_10", 17, localMatrix);
        jointMap.put("neck_tail_10", joint);
        joint.addSubJoint(buildNeckTail11(jointMap));
        return joint;
    }

    private static Joint buildNeckTail11(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.625142F, 0.0F, 0.0F, 1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_11", 18, localMatrix);
        jointMap.put("neck_tail_11", joint);
        joint.addSubJoint(buildNeckTail12(jointMap));
        return joint;
    }

    private static Joint buildNeckTail12(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, -0.0F, 0.0F, 0.0F, 1.0F, -0.0F, 0.624677F, 0.0F, 0.0F, 1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck_tail_12", 19, localMatrix);
        jointMap.put("neck_tail_12", joint);
        return joint;
    }

    private static Joint buildRightFrontLeg(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.749746F, 0.0F, -0.917921F, 0.396764F, 2.917176F, 0.0F, -0.396764F, -0.91792F, -0.176387F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_front_leg", 20, localMatrix);
        jointMap.put("right_front_leg", joint);
        joint.addSubJoint(buildRightFrontLegTip(jointMap));
        return joint;
    }

    private static Joint buildRightFrontLegTip(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, -0.0F, 0.956842F, -0.290608F, 1.253495F, -0.0F, 0.290608F, 0.956842F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_front_leg_tip", 21, localMatrix);
        jointMap.put("right_front_leg_tip", joint);
        joint.addSubJoint(buildRightFrontFoot(jointMap));
        return joint;
    }

    private static Joint buildRightFrontFoot(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 0.646395F, -0.763003F, 1.488528F, 0.0F, 0.763003F, 0.646395F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_front_foot", 22, localMatrix);
        jointMap.put("right_front_foot", joint);
        return joint;
    }

    private static Joint buildLeftFrontLeg(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, -0.749884F, 0.0F, -0.917921F, 0.396764F, 2.917176F, 0.0F, -0.396764F, -0.91792F, -0.176387F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_front_leg", 23, localMatrix);
        jointMap.put("left_front_leg", joint);
        joint.addSubJoint(buildLeftFrontLegTip(jointMap));
        return joint;
    }

    private static Joint buildLeftFrontLegTip(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, -0.0F, -0.0F, 0.0F, 0.956842F, -0.290608F, 1.253495F, 0.0F, 0.290608F, 0.956842F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_front_leg_tip", 24, localMatrix);
        jointMap.put("left_front_leg_tip", joint);
        joint.addSubJoint(buildLeftFrontFoot(jointMap));
        return joint;
    }

    private static Joint buildLeftFrontFoot(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, -0.0F, -0.0F, -0.0F, 0.646395F, -0.763003F, 1.488528F, -0.0F, 0.763003F, 0.646395F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_front_foot", 25, localMatrix);
        jointMap.put("left_front_foot", joint);
        return joint;
    }

    private static Joint buildRightWing(Map<String, Joint> jointMap) {
        float[] transform = new float[]{0.0F, 1.0F, 0.0F, 0.749813F, -1.0F, 0.0F, -0.0F, 2.861323F, -0.0F, 0.0F, 1.0F, 0.744816F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_wing", 26, localMatrix);
        jointMap.put("right_wing", joint);
        joint.addSubJoint(buildRightWingTip(jointMap));
        return joint;
    }

    private static Joint buildRightWingTip(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.499784F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("right_wing_tip", 27, localMatrix);
        jointMap.put("right_wing_tip", joint);
        return joint;
    }

    private static Joint buildLeftWing(Map<String, Joint> jointMap) {
        float[] transform = new float[]{-0.0F, -1.0F, 0.0F, -0.75068F, 1.0F, -0.0F, -0.0F, 2.861323F, 0.0F, 0.0F, 1.0F, 0.744816F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_wing", 28, localMatrix);
        jointMap.put("left_wing", joint);
        joint.addSubJoint(buildLeftWingTip(jointMap));
        return joint;
    }

    private static Joint buildLeftWingTip(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 3.499784F, -0.0F, -0.0F, 1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("left_wing_tip", 29, localMatrix);
        jointMap.put("left_wing_tip", joint);
        return joint;
    }

    private static Joint buildNeck(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.0F, 3.493827F, 0.0F, 0.0F, 1.0F, 1e-06F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck", 30, localMatrix);
        jointMap.put("neck", joint);
        joint.addSubJoint(buildNeck2(jointMap));
        return joint;
    }

    private static Joint buildNeck2(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.623755F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck2", 31, localMatrix);
        jointMap.put("neck2", joint);
        joint.addSubJoint(buildNeck3(jointMap));
        return joint;
    }

    private static Joint buildNeck3(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.0F, 0.626764F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck3", 32, localMatrix);
        jointMap.put("neck3", joint);
        joint.addSubJoint(buildNeck4(jointMap));
        return joint;
    }

    private static Joint buildNeck4(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.624224F, 0.0F, -0.0F, 1.0F, -0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck4", 33, localMatrix);
        jointMap.put("neck4", joint);
        joint.addSubJoint(buildNeck5(jointMap));
        return joint;
    }

    private static Joint buildNeck5(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.624445F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("neck5", 34, localMatrix);
        jointMap.put("neck5", joint);
        joint.addSubJoint(buildHead(jointMap));
        return joint;
    }

    private static Joint buildHead(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.629229F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("head", 35, localMatrix);
        jointMap.put("head", joint);
        joint.addSubJoint(buildUpperjaw(jointMap));
        joint.addSubJoint(buildJaw(jointMap));
        return joint;
    }

    private static Joint buildUpperjaw(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.001002F, 0.0F, 1.0F, 0.0F, 0.873064F, 0.0F, 0.0F, 1.0F, -0.249922F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("upperJaw", 36, localMatrix);
        jointMap.put("upperJaw", joint);
        return joint;
    }

    private static Joint buildJaw(Map<String, Joint> jointMap) {
        float[] transform = new float[]{1.0F, 0.0F, 0.0F, 0.001002F, 0.0F, 1.0F, 0.0F, 0.873064F, 0.0F, 0.0F, 1.0F, -0.257517F, 0.0F, 0.0F, 0.0F, 1.0F};
        OpenMatrix4f localMatrix = new OpenMatrix4f().load(FloatBuffer.wrap(transform));
        localMatrix.transpose();
        Joint joint = new Joint("jaw", 37, localMatrix);
        jointMap.put("jaw", joint);
        return joint;
    }
}
