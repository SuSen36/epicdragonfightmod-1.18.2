package susen36.epicdragonfight.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.EpicDragonFight;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class EnderDragonModel extends EntityModel<EnderDragon> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(EpicDragonFight.MODID, "ender_dragon"), "main");
    
    private final ModelPart head;
    private final ModelPart neck;
    private final ModelPart neck2;
    private final ModelPart neck3;
    private final ModelPart neck4;
    private final ModelPart neck5;
    private final ModelPart upperJaw;
    private final ModelPart jaw;
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
    private final ModelPart neckTail1;
    private final ModelPart neckTail2;
    private final ModelPart neckTail3;
    private final ModelPart neckTail4;
    private final ModelPart neckTail5;
    private final ModelPart neckTail6;
    private final ModelPart neckTail7;
    private final ModelPart neckTail8;
    private final ModelPart neckTail9;
    private final ModelPart neckTail10;
    private final ModelPart neckTail11;
    private final ModelPart neckTail12;
    private final ModelPart root;
    
    @Nullable
    private EnderDragon entity;
    private float partialTick;
    private float bobOffset;
    private float bodyRot;

    public EnderDragonModel(ModelPart root) {
        this.root = root;
        this.body = root.getChild("body");
        this.neck = this.body.getChild("neck");
        this.neck2 = this.neck.getChild("neck2");
        this.neck3 = this.neck2.getChild("neck3");
        this.neck4 = this.neck3.getChild("neck4");
        this.neck5 = this.neck4.getChild("neck5");
        this.head = this.neck5.getChild("head");
        this.upperJaw = this.head.getChild("upperJaw");
        this.jaw = this.head.getChild("jaw");
        this.leftWing = this.body.getChild("left_wing");
        this.leftWingTip = this.leftWing.getChild("left_wing_tip");
        this.leftFrontLeg = this.body.getChild("left_front_leg");
        this.leftFrontLegTip = this.leftFrontLeg.getChild("left_front_leg_tip");
        this.leftFrontFoot = this.leftFrontLegTip.getChild("left_front_foot");
        this.leftRearLeg = this.body.getChild("left_hind_leg");
        this.leftRearLegTip = this.leftRearLeg.getChild("left_hind_leg_tip");
        this.leftRearFoot = this.leftRearLegTip.getChild("left_hind_foot");
        this.rightWing = this.body.getChild("right_wing");
        this.rightWingTip = this.rightWing.getChild("right_wing_tip");
        this.rightFrontLeg = this.body.getChild("right_front_leg");
        this.rightFrontLegTip = this.rightFrontLeg.getChild("right_front_leg_tip");
        this.rightFrontFoot = this.rightFrontLegTip.getChild("right_front_foot");
        this.rightRearLeg = this.body.getChild("right_hind_leg");
        this.rightRearLegTip = this.rightRearLeg.getChild("right_hind_leg_tip");
        this.rightRearFoot = this.rightRearLegTip.getChild("right_hind_foot");
        this.neckTail1 = this.body.getChild("neck_tail_1");
        this.neckTail2 = this.neckTail1.getChild("neck_tail_2");
        this.neckTail3 = this.neckTail2.getChild("neck_tail_3");
        this.neckTail4 = this.neckTail3.getChild("neck_tail_4");
        this.neckTail5 = this.neckTail4.getChild("neck_tail_5");
        this.neckTail6 = this.neckTail5.getChild("neck_tail_6");
        this.neckTail7 = this.neckTail6.getChild("neck_tail_7");
        this.neckTail8 = this.neckTail7.getChild("neck_tail_8");
        this.neckTail9 = this.neckTail8.getChild("neck_tail_9");
        this.neckTail10 = this.neckTail9.getChild("neck_tail_10");
        this.neckTail11 = this.neckTail10.getChild("neck_tail_11");
        this.neckTail12 = this.neckTail11.getChild("neck_tail_12");
    }


    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition bodyDef = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().addBox("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0, 0).addBox("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 220, 53).addBox("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 220, 53).addBox("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 220, 53), PartPose.offset(0.0F, 4.0F, 8.0F));
        PartDefinition neck1 = bodyDef.addOrReplaceChild("neck", CubeListBuilder.create().addBox("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).addBox("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), PartPose.offset(0.0F, 20.0F, -12.0F));
        PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().addBox("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).addBox("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), PartPose.offset(0.0F, 0.0F, -10.0F));
        PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().addBox("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).addBox("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), PartPose.offset(0.0F, 0.0F, -10.0F));
        PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().addBox("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).addBox("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), PartPose.offset(0.0F, 0.0F, -10.0F));
        PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().addBox("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 192, 104).addBox("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 48, 0), PartPose.offset(0.0F, 0.0F, -10.0F));
        PartDefinition headDef = neck5.addOrReplaceChild("head", CubeListBuilder.create().addBox("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30).mirror().addBox("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0).addBox("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0).mirror().addBox("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0).addBox("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0), PartPose.offset(0.0F, 0.0F, -10.0F));
        headDef.addOrReplaceChild("upperJaw", CubeListBuilder.create().addBox("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44), PartPose.offset(0.0F, 4.0F, -8.0F));
        headDef.addOrReplaceChild("jaw", CubeListBuilder.create().addBox("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 176, 65), PartPose.offset(0.0F, 4.0F, -8.0F));
        PartDefinition leftWing = bodyDef.addOrReplaceChild("left_wing", CubeListBuilder.create().mirror().addBox("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).addBox("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), PartPose.offset(12.0F, 5.0F, 2.0F));
        leftWing.addOrReplaceChild("left_wing_tip", CubeListBuilder.create().mirror().addBox("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).addBox("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144), PartPose.offset(56.0F, 0.0F, 0.0F));
        PartDefinition leftFrontLeg = bodyDef.addOrReplaceChild("left_front_leg", CubeListBuilder.create().addBox("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), PartPose.offset(12.0F, 20.0F, 2.0F));
        PartDefinition leftFrontLegTip = leftFrontLeg.addOrReplaceChild("left_front_leg_tip", CubeListBuilder.create().addBox("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), PartPose.offset(0.0F, 20.0F, -1.0F));
        leftFrontLegTip.addOrReplaceChild("left_front_foot", CubeListBuilder.create().addBox("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), PartPose.offset(0.0F, 23.0F, 0.0F));
        PartDefinition leftHindLeg = bodyDef.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().addBox("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), PartPose.offset(16.0F, 16.0F, 42.0F));
        PartDefinition leftHindLegTip = leftHindLeg.addOrReplaceChild("left_hind_leg_tip", CubeListBuilder.create().addBox("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), PartPose.offset(0.0F, 32.0F, -4.0F));
        leftHindLegTip.addOrReplaceChild("left_hind_foot", CubeListBuilder.create().addBox("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), PartPose.offset(0.0F, 31.0F, 4.0F));
        PartDefinition rightWing = bodyDef.addOrReplaceChild("right_wing", CubeListBuilder.create().addBox("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 112, 88).addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 88), PartPose.offset(-12.0F, 5.0F, 2.0F));
        rightWing.addOrReplaceChild("right_wing_tip", CubeListBuilder.create().addBox("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 112, 136).addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, -56, 144), PartPose.offset(-56.0F, 0.0F, 0.0F));
        PartDefinition rightFrontLeg = bodyDef.addOrReplaceChild("right_front_leg", CubeListBuilder.create().addBox("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 112, 104), PartPose.offset(-12.0F, 20.0F, 2.0F));
        PartDefinition rightFrontLegTip = rightFrontLeg.addOrReplaceChild("right_front_leg_tip", CubeListBuilder.create().addBox("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 226, 138), PartPose.offset(0.0F, 20.0F, -1.0F));
        rightFrontLegTip.addOrReplaceChild("right_front_foot", CubeListBuilder.create().addBox("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 144, 104), PartPose.offset(0.0F, 23.0F, 0.0F));
        PartDefinition rightHindLeg = bodyDef.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().addBox("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0, 0), PartPose.offset(-16.0F, 16.0F, 42.0F));
        PartDefinition rightHindLegTip = rightHindLeg.addOrReplaceChild("right_hind_leg_tip", CubeListBuilder.create().addBox("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 196, 0), PartPose.offset(0.0F, 32.0F, -4.0F));
        rightHindLegTip.addOrReplaceChild("right_hind_foot", CubeListBuilder.create().addBox("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 112, 0), PartPose.offset(0.0F, 31.0F, 4.0F));
        PartDefinition neckTail1 = bodyDef.addOrReplaceChild("neck_tail_1", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 10.0F, 60.0F));
        PartDefinition neckTail2 = neckTail1.addOrReplaceChild("neck_tail_2", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail3 = neckTail2.addOrReplaceChild("neck_tail_3", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail4 = neckTail3.addOrReplaceChild("neck_tail_4", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail5 = neckTail4.addOrReplaceChild("neck_tail_5", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail6 = neckTail5.addOrReplaceChild("neck_tail_6", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail7 = neckTail6.addOrReplaceChild("neck_tail_7", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail8 = neckTail7.addOrReplaceChild("neck_tail_8", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail9 = neckTail8.addOrReplaceChild("neck_tail_9", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail10 = neckTail9.addOrReplaceChild("neck_tail_10", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        PartDefinition neckTail11 = neckTail10.addOrReplaceChild("neck_tail_11", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        neckTail11.addOrReplaceChild("neck_tail_12", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10, 10, 10).texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2, 4, 6), PartPose.offset(0.0F, 0.0F, 10.0F));
        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    public void prepareMobModel(EnderDragon entity, float limbSwing, float limbSwingAmount, float partialTick) {
        this.entity = entity;
        this.partialTick = partialTick;
    }

    public void setupAnim(EnderDragon entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        poseStack.pushPose();
        poseStack.translate(0.0, this.bobOffset - 2.0F, -3.0);
        poseStack.mulPose(Axis.XP.rotationDegrees(this.bobOffset * 2.0F));
        
        this.head.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        
        ModelPart[] neckParts = new ModelPart[]{this.neck, this.neck2, this.neck3, this.neck4, this.neck5};
        for (ModelPart neckPart : neckParts) {
            neckPart.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        }
        
        poseStack.pushPose();
        poseStack.translate(0.0, 1.0, 0.0);
        poseStack.mulPose(Axis.ZP.rotationDegrees(-this.bodyRot * 1.5F));
        poseStack.translate(0.0, -1.0, 0.0);
        this.body.zRot = 0.0F;
        this.body.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        this.leftWing.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        this.rightWing.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        this.leftFrontLeg.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        this.rightFrontLeg.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        this.leftRearLeg.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        this.rightRearLeg.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        poseStack.popPose();
        
        ModelPart[] tailParts = new ModelPart[]{this.neckTail1, this.neckTail2, this.neckTail3, this.neckTail4, this.neckTail5, this.neckTail6, this.neckTail7, this.neckTail8, this.neckTail9, this.neckTail10, this.neckTail11, this.neckTail12};
        for (ModelPart tailPart : tailParts) {
            tailPart.render(poseStack, buffer, packedLight, packedOverlay, 1.0F, 1.0F, 1.0F, alpha);
        }

        poseStack.popPose();
    }
    
    public ModelPart getRoot() {
        return this.root;
    }
    
    public ModelPart getHead() {
        return this.head;
    }
    
    public ModelPart getJaw() {
        return this.jaw;
    }
    
    public ModelPart getNeck() {
        return this.neck;
    }
    
    public ModelPart getNeck2() {
        return this.neck2;
    }
    
    public ModelPart getNeck3() {
        return this.neck3;
    }
    
    public ModelPart getNeck4() {
        return this.neck4;
    }
    
    public ModelPart getNeck5() {
        return this.neck5;
    }
    
    public ModelPart getBody() {
        return this.body;
    }
    
    public ModelPart getNeckTail1() {
        return this.neckTail1;
    }
    
    public ModelPart getNeckTail2() {
        return this.neckTail2;
    }
    
    public ModelPart getNeckTail3() {
        return this.neckTail3;
    }
    
    public ModelPart getNeckTail4() {
        return this.neckTail4;
    }
    
    public ModelPart getNeckTail5() {
        return this.neckTail5;
    }
    
    public ModelPart getNeckTail6() {
        return this.neckTail6;
    }
    
    public ModelPart getNeckTail7() {
        return this.neckTail7;
    }
    
    public ModelPart getNeckTail8() {
        return this.neckTail8;
    }
    
    public ModelPart getNeckTail9() {
        return this.neckTail9;
    }
    
    public ModelPart getNeckTail10() {
        return this.neckTail10;
    }
    
    public ModelPart getNeckTail11() {
        return this.neckTail11;
    }
    
    public ModelPart getNeckTail12() {
        return this.neckTail12;
    }
    
    public ModelPart getLeftWing() {
        return this.leftWing;
    }
    
    public ModelPart getLeftWingTip() {
        return this.leftWingTip;
    }
    
    public ModelPart getRightWing() {
        return this.rightWing;
    }
    
    public ModelPart getRightWingTip() {
        return this.rightWingTip;
    }
    
    public ModelPart getLeftFrontLeg() {
        return this.leftFrontLeg;
    }
    
    public ModelPart getLeftFrontLegTip() {
        return this.leftFrontLegTip;
    }
    
    public ModelPart getLeftFrontFoot() {
        return this.leftFrontFoot;
    }
    
    public ModelPart getLeftRearLeg() {
        return this.leftRearLeg;
    }
    
    public ModelPart getLeftRearLegTip() {
        return this.leftRearLegTip;
    }
    
    public ModelPart getLeftRearFoot() {
        return this.leftRearFoot;
    }
    
    public ModelPart getRightFrontLeg() {
        return this.rightFrontLeg;
    }
    
    public ModelPart getRightFrontLegTip() {
        return this.rightFrontLegTip;
    }
    
    public ModelPart getRightFrontFoot() {
        return this.rightFrontFoot;
    }
    
    public ModelPart getRightRearLeg() {
        return this.rightRearLeg;
    }
    
    public ModelPart getRightRearLegTip() {
        return this.rightRearLegTip;
    }
    
    public ModelPart getRightRearFoot() {
        return this.rightRearFoot;
    }
}
