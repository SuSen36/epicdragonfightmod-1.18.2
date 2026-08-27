package susen36.epicdragonfight.gameasset;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

@OnlyIn(Dist.CLIENT)
public class EnderDragonModel extends HierarchicalModel<EnderDragon> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(EpicDragonFight.MODID, "ender_dragon"), "main");
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart left_wing;
	private final ModelPart left_wing_tip;
	private final ModelPart right_wing;
	private final ModelPart right_wing_tip;
	private final ModelPart front_left_leg;
	private final ModelPart front_left_shin;
	private final ModelPart front_left_foot;
	private final ModelPart front_right_leg;
	private final ModelPart front_right_shin;
	private final ModelPart front_right_foot;
	private final ModelPart back_left_leg;
	private final ModelPart back_left_shin;
	private final ModelPart back_left_foot;
	private final ModelPart back_right_leg;
	private final ModelPart back_right_shin;
	private final ModelPart back_right_foot;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;

	public EnderDragonModel(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.neck1 = this.body.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head = this.neck5.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.left_wing = this.body.getChild("left_wing");
		this.left_wing_tip = this.left_wing.getChild("left_wing_tip");
		this.right_wing = this.body.getChild("right_wing");
		this.right_wing_tip = this.right_wing.getChild("right_wing_tip");
		this.front_left_leg = this.body.getChild("front_left_leg");
		this.front_left_shin = this.front_left_leg.getChild("front_left_shin");
		this.front_left_foot = this.front_left_shin.getChild("front_left_foot");
		this.front_right_leg = this.body.getChild("front_right_leg");
		this.front_right_shin = this.front_right_leg.getChild("front_right_shin");
		this.front_right_foot = this.front_right_shin.getChild("front_right_foot");
		this.back_left_leg = this.body.getChild("back_left_leg");
		this.back_left_shin = this.back_left_leg.getChild("back_left_shin");
		this.back_left_foot = this.back_left_shin.getChild("back_left_foot");
		this.back_right_leg = this.body.getChild("back_right_leg");
		this.back_right_shin = this.back_right_leg.getChild("back_right_shin");
		this.back_right_foot = this.back_right_shin.getChild("back_right_foot");
		this.tail1 = this.body.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, 0.0F, -16.0F, 24.0F, 24.0F, 64.0F, new CubeDeformation(0.0F))
				.texOffs(220, 53).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(220, 53).addBox(-1.0F, -6.0F, 10.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(220, 53).addBox(-1.0F, -6.0F, 30.0F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -54.0F, -16.0F));

		PartDefinition neck1 = body.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, -21.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -10.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -10.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -10.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -10.0F));

		PartDefinition head = neck5.addOrReplaceChild("head", CubeListBuilder.create().texOffs(176, 44).addBox(-6.0F, -1.0F, -24.0F, 12.0F, 5.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(112, 30).addBox(-8.0F, -8.0F, -10.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(3.0F, -12.0F, -4.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(112, 0).addBox(3.0F, -3.0F, -22.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(112, 0).mirror().addBox(-5.0F, -3.0F, -22.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-5.0F, -12.0F, -4.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -1.0F, -10.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(176, 65).addBox(-6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -8.0F));

		PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(112, 88).mirror().addBox(0.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(-56, 88).mirror().addBox(0.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(12.0F, 1.0F, -6.0F));

		PartDefinition left_wing_tip = left_wing.addOrReplaceChild("left_wing_tip", CubeListBuilder.create().texOffs(112, 136).mirror().addBox(0.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(-56, 144).mirror().addBox(0.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(56.0F, 0.0F, 0.0F));

		PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(-56, 88).addBox(-56.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F))
				.texOffs(112, 88).addBox(-56.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 1.0F, -6.0F));

		PartDefinition right_wing_tip = right_wing.addOrReplaceChild("right_wing_tip", CubeListBuilder.create().texOffs(-56, 144).addBox(-56.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, new CubeDeformation(0.0F))
				.texOffs(112, 136).addBox(-56.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-56.0F, 0.0F, 0.0F));

		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(112, 104).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 12.0F, -6.0F));

		PartDefinition front_left_shin = front_left_leg.addOrReplaceChild("front_left_shin", CubeListBuilder.create().texOffs(226, 138).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition front_left_foot = front_left_shin.addOrReplaceChild("front_left_foot", CubeListBuilder.create().texOffs(144, 104).addBox(-4.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(112, 104).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 12.0F, -6.0F));

		PartDefinition front_right_shin = front_right_leg.addOrReplaceChild("front_right_shin", CubeListBuilder.create().texOffs(226, 138).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition front_right_foot = front_right_shin.addOrReplaceChild("front_right_foot", CubeListBuilder.create().texOffs(144, 104).addBox(-4.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -8.0F, -5.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(19.0F, 12.0F, 34.0F));

		PartDefinition back_left_shin = back_left_leg.addOrReplaceChild("back_left_shin", CubeListBuilder.create().texOffs(196, 0).addBox(-8.0F, -8.0F, -4.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 24.0F, 0.0F));

		PartDefinition back_left_foot = back_left_shin.addOrReplaceChild("back_left_foot", CubeListBuilder.create().texOffs(112, 0).addBox(-11.0F, -2.0F, -14.0F, 18.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -8.0F, -5.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-13.0F, 12.0F, 34.0F));

		PartDefinition back_right_shin = back_right_leg.addOrReplaceChild("back_right_shin", CubeListBuilder.create().texOffs(196, 0).addBox(-8.0F, -8.0F, -4.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 24.0F, 0.0F));

		PartDefinition back_right_foot = back_right_shin.addOrReplaceChild("back_right_foot", CubeListBuilder.create().texOffs(112, 0).addBox(-11.0F, -2.0F, -14.0F, 18.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tail1 = body.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 53.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(192, 104).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(48, 0).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(EnderDragon entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		if (entity.level.isClientSide() && entity instanceof IDragonPatch patch) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			ProceduralDragonAnimator.animate(this, entity, patch, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw);
		}
	}

	@Override
	public ModelPart root() {
		return this.root;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@OnlyIn(Dist.CLIENT)
	public class ProceduralDragonAnimator {
		public static void animate(EnderDragonModel model, EnderDragon entity, IDragonPatch patch,
				float limbSwing, float limbSwingAmount, float ageInTicks, float partialTick) {
			boolean dying = entity.dragonDeathTime > 0;
			boolean flying = !dying && !patch.isGroundPhase();
			boolean walking = !dying && patch.isGroundPhase() && limbSwingAmount > 0.1F;
			boolean idle = !dying && patch.isGroundPhase() && !walking;
			float clampedPartial = partialTick;
			if (clampedPartial < 0.0F) {
				clampedPartial += 1.0F;
			} else if (clampedPartial >= 1.0F) {
				clampedPartial -= (float) Math.floor(clampedPartial);
			}

			float driver;
			if (dying || flying) {
				driver = Mth.lerp(clampedPartial, entity.oFlapTime, entity.flapTime);
			} else {
				driver = ageInTicks * 0.1F;
			}
			float phase = driver * Mth.TWO_PI;

			float breath = (Mth.sin(phase) + 1.0F) * 0.1F;
			model.jaw.xRot = breath * 2.0F;
			float bob = (Mth.sin(phase - 1.0F) + 1.0F);
			bob = (bob * bob + bob * 2.0F) * 0.05F;

			float walkCycle = walking ? (limbSwing * 0.35F) % 1.0F : 0.0F;
			if (walkCycle < 0.0F) {
				walkCycle += 1.0F;
			}
			float walkPhase = walkCycle * Mth.TWO_PI;
			float walkAmt = walking ? Mth.clamp(limbSwingAmount, 0.0F, 1.0F) : 0.0F;
			float wingScale;
			float legAmt = 0.0F;
			if (dying) {
				float stiff = Mth.clamp((float) entity.dragonDeathTime / 80.0F, 0.0F, 1.0F);
				float jitter = (1.0F - stiff) * Mth.sin(ageInTicks * 0.6F) * 0.2F;
				wingScale = (1.0F - stiff) * 0.5F;
				float flyLift = (1.0F - stiff) * bob - stiff * 0.8F;
				bob = flyLift;
				breath = breath * (1.0F - stiff);
			} else if (flying) {
				wingScale = 1.0F;
			} else if (walking) {
				wingScale = 0.15F;
				legAmt = walkAmt;
				bob = bob * 0.25F;
			} else {
				wingScale = 0.06F;
				float idlePhase = ageInTicks * 0.06F;
				bob = Mth.sin(idlePhase) * 0.05F;
			}

			model.root.x = 0.0F;
			model.root.yRot = 0.0F;
			model.root.zRot = 0.0F;
			if (flying) {
				model.root.y = (bob - 2.0F) * 16.0F;
				model.root.z = -3.0F * 16.0F;
				model.root.xRot = bob * 2.0F * Mth.DEG_TO_RAD;
			} else {
				model.root.y = -10.0F * 16.0F + bob * 4.0F;
				model.root.z = -0.5F * 16.0F;
				model.root.xRot = walking ? Mth.sin(walkPhase) * 1.0F * Mth.DEG_TO_RAD : 0.0F;
			}

			double[] neckBasePos = entity.getLatencyPos(6, partialTick);
			double[] neckPrevious = entity.getLatencyPos(5, partialTick);
			float neckYawDelta = Mth.wrapDegrees((float) (neckPrevious[0] - entity.getLatencyPos(10, partialTick)[0]));
			float neckYawMid = Mth.wrapDegrees((float) (neckPrevious[0] + neckYawDelta / 2.0F));

			ModelPart[] neckParts = {model.neck1, model.neck2, model.neck3, model.neck4, model.neck5};
			float prevNeckX = 0.0F;
			float prevNeckY = 0.0F;
			float prevNeckZ = 0.0F;
			for (int neckIndex = 0; neckIndex < 5; ++neckIndex) {
				double[] sample = entity.getLatencyPos(5 - neckIndex, partialTick);
				float absoluteX;
				float absoluteY;
				float absoluteZ;
				float wave;
				if (dying) {
					wave = Mth.cos((float) neckIndex * 0.45F + phase) * 0.15F * (1.0F - Mth.clamp((float) entity.dragonDeathTime / 120.0F, 0.0F, 1.0F));
				} else if (idle) {
					wave = Mth.cos((float) neckIndex * 0.45F + phase) * 0.15F
							+ Mth.cos((float) neckIndex * 0.3F + ageInTicks * 0.06F) * 0.04F;
				} else if (walking) {
					wave = Mth.cos((float) neckIndex * 0.45F + phase) * 0.15F
							+ Mth.cos((float) neckIndex * 0.6F + walkPhase) * 0.08F * walkAmt;
				} else {
					wave = Mth.cos((float) neckIndex * 0.45F + phase) * 0.15F;
				}
				absoluteY = Mth.wrapDegrees((float) (sample[0] - neckBasePos[0])) * Mth.DEG_TO_RAD * 1.5F;
				absoluteX = wave + entity.getHeadPartYOffset(neckIndex, neckBasePos, sample) * Mth.DEG_TO_RAD * 1.5F * 5.0F;
				absoluteZ = -Mth.wrapDegrees((float) (sample[0] - neckYawMid)) * Mth.DEG_TO_RAD * 1.5F;
				neckParts[neckIndex].yRot = absoluteY - prevNeckY;
				neckParts[neckIndex].xRot = absoluteX - prevNeckX;
				neckParts[neckIndex].zRot = absoluteZ - prevNeckZ;
				prevNeckY = absoluteY;
				prevNeckX = absoluteX;
				prevNeckZ = absoluteZ;
			}

			model.body.xRot = 0.0F;
			model.body.yRot = 0.0F;
			if (dying) {
				float stiff = Mth.clamp((float) entity.dragonDeathTime / 80.0F, 0.0F, 1.0F);
				float jitter = (1.0F - stiff) * Mth.sin(ageInTicks * 0.6F) * 0.2F;
				model.body.zRot = -neckYawDelta * Mth.clamp(jitter, -1.0F, 1.0F) * 1.5F * Mth.DEG_TO_RAD;
			} else if (flying) {
				model.body.zRot = -neckYawDelta * 1.5F * Mth.DEG_TO_RAD;
			} else if (walking) {
				model.body.zRot = -neckYawDelta * 0.25F * 1.5F * Mth.DEG_TO_RAD;
			} else {
				model.body.zRot = 0.0F;
			}

			double[] headSample = entity.getLatencyPos(0, partialTick);
			float headAbsY = Mth.wrapDegrees((float) (headSample[0] - neckBasePos[0])) * Mth.DEG_TO_RAD;
			float headAbsX = entity.getHeadPartYOffset(6, neckBasePos, headSample) * Mth.DEG_TO_RAD * 1.5F * 5.0F;
			float headAbsZ = -Mth.wrapDegrees((float) (headSample[0] - neckYawMid)) * Mth.DEG_TO_RAD;
			model.head.yRot = headAbsY - prevNeckY;
			model.head.xRot = headAbsX - prevNeckX;
			model.head.zRot = headAbsZ - prevNeckZ;
			if (dying) {
				float droop = Mth.clamp((float) entity.dragonDeathTime / 100.0F, 0.0F, 1.0F);
				model.head.xRot += droop * 0.8F;
			}

			model.body.x = 0.0F;
			model.body.y = 0.0F;
			model.body.z = 0.0F;

			if (flying) {
				model.left_wing.xRot = 0.125F - Mth.cos(phase) * 0.2F;
				model.left_wing.yRot = -0.25F;
				model.left_wing.zRot = -(Mth.sin(phase) + 0.125F) * 0.8F;
				model.left_wing_tip.zRot = (Mth.sin(phase + 2.0F) + 0.5F) * 0.75F;
				model.right_wing.xRot = model.left_wing.xRot;
				model.right_wing.yRot = -model.left_wing.yRot;
				model.right_wing.zRot = -model.left_wing.zRot;
				model.right_wing_tip.zRot = -model.left_wing_tip.zRot;
			} else {
				float wingCos = Mth.cos(phase) * wingScale;
				float wingSin = Mth.sin(phase) * wingScale;
				model.left_wing.xRot = 0.125F * wingScale - wingCos * 0.2F;
				model.left_wing.yRot = -0.25F * wingScale;
				model.left_wing.zRot = -(wingSin + 0.125F * wingScale) * 0.8F;
				model.left_wing_tip.zRot = (wingSin * 1.1F + 0.5F * wingScale) * 0.75F;
				model.right_wing.xRot = model.left_wing.xRot;
				model.right_wing.yRot = -model.left_wing.yRot;
				model.right_wing.zRot = -model.left_wing.zRot;
				model.right_wing_tip.zRot = -model.left_wing_tip.zRot;
			}

			if (dying) {
				float stiff = Mth.clamp((float) entity.dragonDeathTime / 100.0F, 0.0F, 1.0F);
				float jitter = (1.0F - stiff) * Mth.sin(ageInTicks * 1.2F) * 0.05F;
				float rearLeg = Mth.lerp(1.0F, 0.1F, stiff) + jitter;
				float rearShin = Mth.lerp(0.5F, 1.4F, stiff);
				float rearFoot = Mth.lerp(0.75F, 0.2F, stiff);
				float frontLeg = Mth.lerp(1.3F, 0.2F, stiff) + jitter;
				float frontShin = Mth.lerp(-0.5F, 0.6F, stiff);
				float frontFoot = Mth.lerp(0.75F, 0.1F, stiff);
				model.back_left_leg.xRot = rearLeg;
				model.back_left_shin.xRot = rearShin;
				model.back_left_foot.xRot = rearFoot;
				model.back_right_leg.xRot = rearLeg;
				model.back_right_shin.xRot = rearShin;
				model.back_right_foot.xRot = rearFoot;
				model.front_left_leg.xRot = frontLeg;
				model.front_left_shin.xRot = frontShin;
				model.front_left_foot.xRot = frontFoot;
				model.front_right_leg.xRot = frontLeg;
				model.front_right_shin.xRot = frontShin;
				model.front_right_foot.xRot = frontFoot;
			} else if (flying) {
				model.back_left_leg.xRot = 1.0F + breath * 0.1F;
				model.back_left_shin.xRot = 0.5F + breath * 0.1F;
				model.back_left_foot.xRot = 0.75F + breath * 0.1F;
				model.back_right_leg.xRot = 1.0F + breath * 0.1F;
				model.back_right_shin.xRot = 0.5F + breath * 0.1F;
				model.back_right_foot.xRot = 0.75F + breath * 0.1F;
				model.front_left_leg.xRot = 1.3F + breath * 0.1F;
				model.front_left_shin.xRot = -0.5F - breath * 0.1F;
				model.front_left_foot.xRot = 0.75F + breath * 0.1F;
				model.front_right_leg.xRot = 1.3F + breath * 0.1F;
				model.front_right_shin.xRot = -0.5F - breath * 0.1F;
				model.front_right_foot.xRot = 0.75F + breath * 0.1F;
			} else if (walking) {
				float a = walkPhase;
				float b = walkPhase + (float) Math.PI;
				applyWalkRear(model.back_right_leg, model.back_right_shin, model.back_right_foot, a, legAmt);
				applyWalkFront(model.front_left_leg, model.front_left_shin, model.front_left_foot, a, legAmt);
				applyWalkRear(model.back_left_leg, model.back_left_shin, model.back_left_foot, b, legAmt);
				applyWalkFront(model.front_right_leg, model.front_right_shin, model.front_right_foot, b, legAmt);
			} else {
				float b = breath * 0.05F;
				model.back_left_leg.xRot = 0.05F + b;
				model.back_left_shin.xRot = 0.0F;
				model.back_left_foot.xRot = 0.0F - b;
				model.back_right_leg.xRot = 0.05F + b;
				model.back_right_shin.xRot = 0.0F;
				model.back_right_foot.xRot = 0.0F - b;
				model.front_left_leg.xRot = 0.05F - b;
				model.front_left_shin.xRot = 0.0F;
				model.front_left_foot.xRot = 0.0F + b;
				model.front_right_leg.xRot = 0.05F - b;
				model.front_right_shin.xRot = 0.0F;
				model.front_right_foot.xRot = 0.0F + b;
			}

			double[] tailBasePos = entity.getLatencyPos(11, partialTick);
			float tailWave = 0.0F;
			float prevTailX = 0.0F;
			float prevTailY = 0.0F;
			float prevTailZ = 0.0F;
			ModelPart[] tailParts = {
				model.tail1, model.tail2, model.tail3, model.tail4, model.tail5, model.tail6,
				model.tail7, model.tail8, model.tail9, model.tail10, model.tail11, model.tail12
			};
			for (int tailIndex = 0; tailIndex < 12; ++tailIndex) {
				double[] sample = entity.getLatencyPos(12 + tailIndex, partialTick);
				float absoluteY;
				float absoluteX;
				float absoluteZ;
				float baseTail = Mth.sin((float) tailIndex * 0.45F + phase) * 0.05F;
				tailWave += baseTail;
				if (walking) {
					tailWave += Mth.sin((float) tailIndex * 0.35F + walkPhase) * 0.04F * walkAmt;
				} else if (idle) {
					tailWave += Mth.sin((float) tailIndex * 0.25F + ageInTicks * 0.05F) * 0.02F;
				} else if (dying) {
					tailWave = baseTail * (1.0F - Mth.clamp((float) entity.dragonDeathTime / 140.0F, 0.0F, 1.0F));
				}
				absoluteY = Mth.wrapDegrees((float) (sample[0] - tailBasePos[0])) * 1.5F * Mth.DEG_TO_RAD
						+ 180.0F * Mth.DEG_TO_RAD;
				absoluteX = tailWave + (float) (sample[1] - tailBasePos[1]) * Mth.DEG_TO_RAD * 1.5F * 5.0F;
				absoluteZ = Mth.wrapDegrees((float) (sample[0] - neckYawMid)) * Mth.DEG_TO_RAD * 1.5F;
				tailParts[tailIndex].yRot = absoluteY - prevTailY;
				tailParts[tailIndex].xRot = absoluteX - prevTailX;
				tailParts[tailIndex].zRot = absoluteZ - prevTailZ;
				prevTailY = absoluteY;
				prevTailX = absoluteX;
				prevTailZ = absoluteZ;
			}
		}

		/** 后腿行走程序姿态：大腿摆动、膝部补偿、脚面抓地抬升。 */
		private static void applyWalkRear(ModelPart leg, ModelPart shin, ModelPart foot, float phase, float amt) {
			float s = Mth.sin(phase);
			float c = Mth.cos(phase);
			leg.xRot = -1.047F + (-0.65F + s * 0.4F) * amt;
			leg.yRot = (0.205F + c * 0.18F) * amt;
			leg.zRot = (0.044F + s * 0.1F) * amt;
			shin.xRot = 0.873F + (0.785F + Mth.sin(phase + 0.6F) * 0.25F) * amt;
			shin.yRot = -c * 0.01F * amt;
			shin.zRot = s * 0.02F * amt;
			foot.xRot = -((-0.524F + Mth.sin(phase + 1.2F) * 0.2F) * amt);
			foot.yRot = s * 0.08F * amt;
			foot.zRot = c * 0.09F * amt;
		}

		/** 前腿行走程序姿态：甩动幅度更大、抬步更高、脚面缓冲。 */
		private static void applyWalkFront(ModelPart leg, ModelPart shin, ModelPart foot, float phase, float amt) {
			float s = Mth.sin(phase);
			float c = Mth.cos(phase);
			leg.xRot = -1.047F + (-0.698F + s * 0.7F) * amt;
			leg.yRot = (0.004F + c * 0.6F) * amt;
			leg.zRot = (0.133F + s * 0.25F) * amt;
			shin.xRot = 0.0F + (1.082F + s * 1.571F) * amt;
			shin.yRot = c * 0.001F * amt;
			shin.zRot = -s * 0.002F * amt;
			foot.xRot = (0.524F + Mth.sin(phase + 0.9F) * 0.45F) * amt;
			foot.yRot = c * 0.811F * amt;
			foot.zRot = (-0.028F + s * 0.02F) * amt;
		}

		private ProceduralDragonAnimator() {}
	}
}
