package susen36.epicdragonfight.gameasset;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Quaternion;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class DragonPartModel {
    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart jaw;
    private final ModelPart[] neckSegments = new ModelPart[5];
    private final ModelPart[] tailSegments = new ModelPart[12];
    private final ModelPart body;
    private final ModelPart leftWing;
    private final ModelPart leftWingTip;
    private final ModelPart leftFrontLeg;
    private final ModelPart leftFrontLegTip;
    private final ModelPart leftFrontFoot;
    private final ModelPart leftRearLeg;
    private final ModelPart leftRearLegTip;
    private final ModelPart leftRearFoot;
    private final ModelPart rightWing;
    private final ModelPart rightWingTip;
    private final ModelPart rightFrontLeg;
    private final ModelPart rightFrontLegTip;
    private final ModelPart rightFrontFoot;
    private final ModelPart rightRearLeg;
    private final ModelPart rightRearLegTip;
    private final ModelPart rightRearFoot;

    private static final String[] NECK_JOINT_NAMES = {"neck", "neck2", "neck3", "neck4", "neck5"};
    private static final String[] TAIL_JOINT_NAMES = {
        "neck_tail_1", "neck_tail_2", "neck_tail_3", "neck_tail_4",
        "neck_tail_5", "neck_tail_6", "neck_tail_7", "neck_tail_8",
        "neck_tail_9", "neck_tail_10", "neck_tail_11", "neck_tail_12"
    };

    private DragonPartModel(ModelPart root) {
        this.root = root;
        this.head = root.getChild("head");
        this.jaw = this.head.getChild("jaw");
        for (int i = 0; i < 5; i++) {
            this.neckSegments[i] = root.getChild("neck_" + (i + 1));
        }
        for (int i = 0; i < 12; i++) {
            this.tailSegments[i] = root.getChild("tail_" + (i + 1));
        }
        this.body = root.getChild("body");
        this.leftWing = root.getChild("left_wing");
        this.leftWingTip = this.leftWing.getChild("left_wing_tip");
        this.leftFrontLeg = root.getChild("left_front_leg");
        this.leftFrontLegTip = this.leftFrontLeg.getChild("left_front_leg_tip");
        this.leftFrontFoot = this.leftFrontLegTip.getChild("left_front_foot");
        this.leftRearLeg = root.getChild("left_hind_leg");
        this.leftRearLegTip = this.leftRearLeg.getChild("left_hind_leg_tip");
        this.leftRearFoot = this.leftRearLegTip.getChild("left_hind_foot");
        this.rightWing = root.getChild("right_wing");
        this.rightWingTip = this.rightWing.getChild("right_wing_tip");
        this.rightFrontLeg = root.getChild("right_front_leg");
        this.rightFrontLegTip = this.rightFrontLeg.getChild("right_front_leg_tip");
        this.rightFrontFoot = this.rightFrontLegTip.getChild("right_front_foot");
        this.rightRearLeg = root.getChild("right_hind_leg");
        this.rightRearLegTip = this.rightRearLeg.getChild("right_hind_leg_tip");
        this.rightRearFoot = this.rightRearLegTip.getChild("right_hind_foot");
    }

    private static CubeListBuilder neckBox() {
        return CubeListBuilder.create()
            .addBox("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104)
            .addBox("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create()
            .addBox("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .addBox("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30).mirror()
            .addBox("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .addBox("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0).mirror()
            .addBox("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .addBox("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
            PartPose.ZERO);
        partdefinition.getChild("head").addOrReplaceChild("jaw", CubeListBuilder.create()
            .addBox("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65),
            PartPose.offset(0.0F, 4.0F, -8.0F));
        for (int i = 0; i < 5; i++) {
            partdefinition.addOrReplaceChild("neck_" + (i + 1), neckBox(), PartPose.ZERO);
        }
        for (int i = 0; i < 12; i++) {
            partdefinition.addOrReplaceChild("tail_" + (i + 1), neckBox(), PartPose.ZERO);
        }
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create()
            .addBox("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0, 0)
            .addBox("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 220, 53)
            .addBox("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 220, 53)
            .addBox("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 220, 53),
            PartPose.offset(0.0F, 4.0F, 8.0F));
        PartDefinition partdefinition2 = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().mirror()
            .addBox("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88)
            .addBox("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88),
            PartPose.offset(12.0F, 5.0F, 2.0F));
        partdefinition2.addOrReplaceChild("left_wing_tip", CubeListBuilder.create().mirror()
            .addBox("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136)
            .addBox("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
            PartPose.offset(56.0F, 0.0F, 0.0F));
        PartDefinition partdefinition3 = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create()
            .addBox("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104),
            PartPose.offset(12.0F, 20.0F, 2.0F));
        PartDefinition partdefinition4 = partdefinition3.addOrReplaceChild("left_front_leg_tip", CubeListBuilder.create()
            .addBox("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138),
            PartPose.offset(0.0F, 20.0F, -1.0F));
        partdefinition4.addOrReplaceChild("left_front_foot", CubeListBuilder.create()
            .addBox("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104),
            PartPose.offset(0.0F, 23.0F, 0.0F));
        PartDefinition partdefinition5 = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create()
            .addBox("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0),
            PartPose.offset(16.0F, 16.0F, 42.0F));
        PartDefinition partdefinition6 = partdefinition5.addOrReplaceChild("left_hind_leg_tip", CubeListBuilder.create()
            .addBox("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0),
            PartPose.offset(0.0F, 32.0F, -4.0F));
        partdefinition6.addOrReplaceChild("left_hind_foot", CubeListBuilder.create()
            .addBox("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0),
            PartPose.offset(0.0F, 31.0F, 4.0F));
        PartDefinition partdefinition7 = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create()
            .addBox("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88)
            .addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88),
            PartPose.offset(-12.0F, 5.0F, 2.0F));
        partdefinition7.addOrReplaceChild("right_wing_tip", CubeListBuilder.create()
            .addBox("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136)
            .addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144),
            PartPose.offset(-56.0F, 0.0F, 0.0F));
        PartDefinition partdefinition8 = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create()
            .addBox("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104),
            PartPose.offset(-12.0F, 20.0F, 2.0F));
        PartDefinition partdefinition9 = partdefinition8.addOrReplaceChild("right_front_leg_tip", CubeListBuilder.create()
            .addBox("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138),
            PartPose.offset(0.0F, 20.0F, -1.0F));
        partdefinition9.addOrReplaceChild("right_front_foot", CubeListBuilder.create()
            .addBox("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104),
            PartPose.offset(0.0F, 23.0F, 0.0F));
        PartDefinition partdefinition10 = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create()
            .addBox("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0),
            PartPose.offset(-16.0F, 16.0F, 42.0F));
        PartDefinition partdefinition11 = partdefinition10.addOrReplaceChild("right_hind_leg_tip", CubeListBuilder.create()
            .addBox("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0),
            PartPose.offset(0.0F, 32.0F, -4.0F));
        partdefinition11.addOrReplaceChild("right_hind_foot", CubeListBuilder.create()
            .addBox("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0),
            PartPose.offset(0.0F, 31.0F, 4.0F));
        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    public static DragonPartModel bake() {
        return new DragonPartModel(createBodyLayer().bakeRoot());
    }

    public void renderWithPoses(PoseStack poseStack, VertexConsumer consumer, int packedLight, int overlayCoord, float r, float g, float b, float a, OpenMatrix4f[] poses, Armature armature) {
        Map<String, susen36.epicdragonfight.api.animation.Joint> jointMap = armature.getJointByNameMap();

        for (int i = 0; i < 5; i++) {
            this.applyPoseToPart(this.neckSegments[i], poses, jointMap, NECK_JOINT_NAMES[i]);
        }
        this.applyPoseToPart(this.head, poses, jointMap, "head");
        this.applyPoseToPart(this.jaw, poses, jointMap, "jaw", jointMap.get("head").getAnimatedTransform());
        this.applyPoseToPart(this.body, poses, jointMap, "body");
        for (int i = 0; i < 12; i++) {
            this.applyPoseToPart(this.tailSegments[i], poses, jointMap, TAIL_JOINT_NAMES[i]);
        }
        this.applyPoseToPart(this.leftWing, poses, jointMap, "left_wing");
        this.applyPoseToPart(this.leftWingTip, poses, jointMap, "left_wing_tip", jointMap.get("left_wing").getAnimatedTransform());
        this.applyPoseToPart(this.leftFrontLeg, poses, jointMap, "left_front_leg");
        this.applyPoseToPart(this.leftFrontLegTip, poses, jointMap, "left_front_leg_tip", jointMap.get("left_front_leg").getAnimatedTransform());
        this.applyPoseToPart(this.leftFrontFoot, poses, jointMap, "left_front_foot", jointMap.get("left_front_leg_tip").getAnimatedTransform());
        this.applyPoseToPart(this.leftRearLeg, poses, jointMap, "left_hind_leg");
        this.applyPoseToPart(this.leftRearLegTip, poses, jointMap, "left_hind_leg_tip", jointMap.get("left_hind_leg").getAnimatedTransform());
        this.applyPoseToPart(this.leftRearFoot, poses, jointMap, "left_hind_foot", jointMap.get("left_hind_leg_tip").getAnimatedTransform());
        this.applyPoseToPart(this.rightWing, poses, jointMap, "right_wing");
        this.applyPoseToPart(this.rightWingTip, poses, jointMap, "right_wing_tip", jointMap.get("right_wing").getAnimatedTransform());
        this.applyPoseToPart(this.rightFrontLeg, poses, jointMap, "right_front_leg");
        this.applyPoseToPart(this.rightFrontLegTip, poses, jointMap, "right_front_leg_tip", jointMap.get("right_front_leg").getAnimatedTransform());
        this.applyPoseToPart(this.rightFrontFoot, poses, jointMap, "right_front_foot", jointMap.get("right_front_leg_tip").getAnimatedTransform());
        this.applyPoseToPart(this.rightRearLeg, poses, jointMap, "right_hind_leg");
        this.applyPoseToPart(this.rightRearLegTip, poses, jointMap, "right_hind_leg_tip", jointMap.get("right_hind_leg").getAnimatedTransform());
        this.applyPoseToPart(this.rightRearFoot, poses, jointMap, "right_hind_foot", jointMap.get("right_hind_leg_tip").getAnimatedTransform());

        this.root.render(poseStack, consumer, packedLight, overlayCoord, r, g, b, a);
    }

    private void applyPoseToPart(ModelPart part, OpenMatrix4f[] poses, Map<String, susen36.epicdragonfight.api.animation.Joint> jointMap, String jointName) {
        this.applyPoseToPart(part, poses, jointMap, jointName, null);
    }

    private void applyPoseToPart(ModelPart part, OpenMatrix4f[] poses, Map<String, susen36.epicdragonfight.api.animation.Joint> jointMap, String jointName, OpenMatrix4f parentAnimTransform) {
        susen36.epicdragonfight.api.animation.Joint joint = jointMap.get(jointName);
        if (joint == null) {
            return;
        }

        OpenMatrix4f animTransform = joint.getAnimatedTransform();
        OpenMatrix4f rotSource;
        if (parentAnimTransform != null) {
            OpenMatrix4f parentInv = new OpenMatrix4f();
            OpenMatrix4f.invert(parentAnimTransform, parentInv);
            OpenMatrix4f relative = OpenMatrix4f.mul(parentInv, animTransform, null);
            part.x = relative.m30 * 16.0F;
            part.y = relative.m31 * 16.0F;
            part.z = relative.m32 * 16.0F;
            rotSource = relative;
        } else {
            part.x = animTransform.m30 * 16.0F;
            part.y = animTransform.m31 * 16.0F;
            part.z = animTransform.m32 * 16.0F;
            rotSource = poses[joint.getId()];
        }

        Quaternion quat = rotSource.toQuaternion();
        quat.normalize();

        float qx = quat.i();
        float qy = quat.j();
        float qz = quat.k();
        float qw = quat.r();

        float sinX = 2.0F * (qw * qx + qy * qz);
        float cosX = 1.0F - 2.0F * (qx * qx + qy * qy);
        part.xRot = (float)Mth.atan2(sinX, cosX);

        float sinY;
        float sinYClamp = 2.0F * (qw * qy - qz * qx);
        if (Math.abs(sinYClamp) >= 1.0F) {
            sinY = sinYClamp >= 0.0F ? (float)Math.PI / 2.0F : -(float)Math.PI / 2.0F;
        } else {
            sinY = (float)Math.asin(sinYClamp);
        }
        part.yRot = sinY;

        float sinZ = 2.0F * (qw * qz + qx * qy);
        float cosZ = 1.0F - 2.0F * (qy * qy + qz * qz);
        part.zRot = (float)Mth.atan2(sinZ, cosZ);
    }
}