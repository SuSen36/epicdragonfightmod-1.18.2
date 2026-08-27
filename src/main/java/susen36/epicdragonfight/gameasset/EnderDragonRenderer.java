package susen36.epicdragonfight.gameasset;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EndCrystalRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EnderDragonRenderer extends EntityRenderer<EnderDragon> {
    public static final ResourceLocation CRYSTAL_BEAM_LOCATION = new ResourceLocation("textures/entity/end_crystal/end_crystal_beam.png");
    public static final ResourceLocation DRAGON_EXPLODING_LOCATION = new ResourceLocation("textures/entity/enderdragon/dragon_exploding.png");
    public static final ResourceLocation DRAGON_LOCATION = new ResourceLocation("textures/entity/enderdragon/dragon.png");
    public static final ResourceLocation DRAGON_EYES_LOCATION = new ResourceLocation("textures/entity/enderdragon/dragon_eyes.png");
    private static final RenderType RENDER_TYPE = RenderType.entityCutoutNoCull(DRAGON_LOCATION);
    private static final RenderType DECAL = RenderType.entityDecal(DRAGON_LOCATION);
    private static final RenderType EYES = RenderType.eyes(DRAGON_EYES_LOCATION);
    private static final RenderType BEAM = RenderType.entitySmoothCutout(CRYSTAL_BEAM_LOCATION);
    private static final float HALF_SQRT_3 = (float) (Math.sqrt(3.0D) / 2.0D);
    private final EnderDragonModel model;

    public EnderDragonRenderer(EntityRendererProvider.Context p_173973_) {
        super(p_173973_);
        this.shadowRadius = 0.5F;
        this.model = new EnderDragonModel(p_173973_.bakeLayer(EnderDragonModel.LAYER_LOCATION));
    }

    public void render(EnderDragon enderDragon, float p_114209_, float p_114210_, PoseStack p_114211_, MultiBufferSource p_114212_, int p_114213_) {
        p_114211_.pushPose();
        float f = (float) enderDragon.getLatencyPos(7, p_114210_)[0];
        float f1 = (float) (enderDragon.getLatencyPos(5, p_114210_)[1] - enderDragon.getLatencyPos(10, p_114210_)[1]);
        p_114211_.mulPose(Vector3f.YP.rotationDegrees(-f));
        p_114211_.mulPose(Vector3f.XP.rotationDegrees(f1 * 10.0F));
        p_114211_.translate(0.0D, 0.0D, 1.0D);
        p_114211_.scale(-1.0F, -1.0F, 1.0F);
        p_114211_.translate(0.0D, (double) -1.501F, 0.0D);
        boolean flag = enderDragon.hurtTime > 0;
        this.model.prepareMobModel(enderDragon, 0.0F, 0.0F, p_114210_);
        float limbSwing = enderDragon.walkDist + (enderDragon.walkDist - enderDragon.walkDistO) * p_114210_;
        float limbSwingAmount = Mth.lerp(p_114210_, enderDragon.animationSpeedOld, enderDragon.animationSpeed);
        float ageInTicks = enderDragon.tickCount + p_114210_;
        this.model.setupAnim(enderDragon, limbSwing, limbSwingAmount, ageInTicks, p_114210_, 0.0F);
        if (enderDragon.dragonDeathTime > 0) {
            float f2 = (float) enderDragon.dragonDeathTime / 200.0F;
            VertexConsumer vertexconsumer = p_114212_.getBuffer(RenderType.dragonExplosionAlpha(DRAGON_EXPLODING_LOCATION));
            this.model.renderToBuffer(p_114211_, vertexconsumer, p_114213_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, f2);
            VertexConsumer vertexconsumer1 = p_114212_.getBuffer(DECAL);
            this.model.renderToBuffer(p_114211_, vertexconsumer1, p_114213_, OverlayTexture.pack(0.0F, flag), 1.0F, 1.0F, 1.0F, 1.0F);
        } else {
            VertexConsumer vertexconsumer3 = p_114212_.getBuffer(RENDER_TYPE);
            this.model.renderToBuffer(p_114211_, vertexconsumer3, p_114213_, OverlayTexture.pack(0.0F, flag), 1.0F, 1.0F, 1.0F, 1.0F);
        }

        VertexConsumer vertexconsumer4 = p_114212_.getBuffer(EYES);
        this.model.renderToBuffer(p_114211_, vertexconsumer4, p_114213_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        if (enderDragon.dragonDeathTime > 0) {
            float f5 = ((float) enderDragon.dragonDeathTime + p_114210_) / 200.0F;
            float f7 = Math.min(f5 > 0.8F ? (f5 - 0.8F) / 0.2F : 0.0F, 1.0F);
            RandomSource randomsource = RandomSource.create(432L);
            VertexConsumer vertexconsumer2 = p_114212_.getBuffer(RenderType.lightning());
            p_114211_.pushPose();
            p_114211_.translate(0.0D, -1.0D, -2.0D);

            for (int i = 0; (float) i < (f5 + f5 * f5) / 2.0F * 60.0F; ++i) {
                p_114211_.mulPose(Vector3f.XP.rotationDegrees(randomsource.nextFloat() * 360.0F));
                p_114211_.mulPose(Vector3f.YP.rotationDegrees(randomsource.nextFloat() * 360.0F));
                p_114211_.mulPose(Vector3f.ZP.rotationDegrees(randomsource.nextFloat() * 360.0F));
                p_114211_.mulPose(Vector3f.XP.rotationDegrees(randomsource.nextFloat() * 360.0F));
                p_114211_.mulPose(Vector3f.YP.rotationDegrees(randomsource.nextFloat() * 360.0F));
                p_114211_.mulPose(Vector3f.ZP.rotationDegrees(randomsource.nextFloat() * 360.0F + f5 * 90.0F));
                float f3 = randomsource.nextFloat() * 20.0F + 5.0F + f7 * 10.0F;
                float f4 = randomsource.nextFloat() * 2.0F + 1.0F + f7 * 2.0F;
                Matrix4f matrix4f = p_114211_.last().pose();
                int j = (int) (255.0F * (1.0F - f7));
                vertex01(vertexconsumer2, matrix4f, j);
                vertex2(vertexconsumer2, matrix4f, f3, f4);
                vertex3(vertexconsumer2, matrix4f, f3, f4);
                vertex01(vertexconsumer2, matrix4f, j);
                vertex3(vertexconsumer2, matrix4f, f3, f4);
                vertex4(vertexconsumer2, matrix4f, f3, f4);
                vertex01(vertexconsumer2, matrix4f, j);
                vertex4(vertexconsumer2, matrix4f, f3, f4);
                vertex2(vertexconsumer2, matrix4f, f3, f4);
            }

            p_114211_.popPose();
        }

        p_114211_.popPose();
        if (enderDragon.nearestCrystal != null) {
            p_114211_.pushPose();
            float f6 = (float) (enderDragon.nearestCrystal.getX() - Mth.lerp((double) p_114210_, enderDragon.xo, enderDragon.getX()));
            float f8 = (float) (enderDragon.nearestCrystal.getY() - Mth.lerp((double) p_114210_, enderDragon.yo, enderDragon.getY()));
            float f9 = (float) (enderDragon.nearestCrystal.getZ() - Mth.lerp((double) p_114210_, enderDragon.zo, enderDragon.getZ()));
            renderCrystalBeams(f6, f8 + EndCrystalRenderer.getY(enderDragon.nearestCrystal, p_114210_), f9, p_114210_, enderDragon.tickCount, p_114211_, p_114212_, p_114213_);
            p_114211_.popPose();
        }

        super.render(enderDragon, p_114209_, p_114210_, p_114211_, p_114212_, p_114213_);
    }

    private static void vertex01(VertexConsumer p_114220_, Matrix4f p_114221_, int p_114222_) {
        p_114220_.vertex(p_114221_, 0.0F, 0.0F, 0.0F).color(255, 255, 255, p_114222_).endVertex();
    }

    private static void vertex2(VertexConsumer p_114215_, Matrix4f p_114216_, float p_114217_, float p_114218_) {
        p_114215_.vertex(p_114216_, -HALF_SQRT_3 * p_114218_, p_114217_, -0.5F * p_114218_).color(255, 0, 255, 0).endVertex();
    }

    private static void vertex3(VertexConsumer p_114224_, Matrix4f p_114225_, float p_114226_, float p_114227_) {
        p_114224_.vertex(p_114225_, HALF_SQRT_3 * p_114227_, p_114226_, -0.5F * p_114227_).color(255, 0, 255, 0).endVertex();
    }

    private static void vertex4(VertexConsumer p_114229_, Matrix4f p_114230_, float p_114231_, float p_114232_) {
        p_114229_.vertex(p_114230_, 0.0F, p_114231_, p_114232_).color(255, 0, 255, 0).endVertex();
    }

    public static void renderCrystalBeams(float p_114188_, float p_114189_, float p_114190_, float p_114191_, int p_114192_, PoseStack p_114193_, MultiBufferSource p_114194_, int p_114195_) {
        float f = Mth.sqrt(p_114188_ * p_114188_ + p_114190_ * p_114190_);
        float f1 = Mth.sqrt(p_114188_ * p_114188_ + p_114189_ * p_114189_ + p_114190_ * p_114190_);
        p_114193_.pushPose();
        p_114193_.translate(0.0D, 2.0D, 0.0D);
        p_114193_.mulPose(Vector3f.YP.rotation((float) (-Math.atan2((double) p_114190_, (double) p_114188_)) - ((float) Math.PI / 2F)));
        p_114193_.mulPose(Vector3f.XP.rotation((float) (-Math.atan2((double) f, (double) p_114189_)) - ((float) Math.PI / 2F)));
        VertexConsumer vertexconsumer = p_114194_.getBuffer(BEAM);
        float f2 = 0.0F - ((float) p_114192_ + p_114191_) * 0.01F;
        float f3 = Mth.sqrt(p_114188_ * p_114188_ + p_114189_ * p_114189_ + p_114190_ * p_114190_) / 32.0F - ((float) p_114192_ + p_114191_) * 0.01F;
        int i = 8;
        float f4 = 0.0F;
        float f5 = 0.75F;
        float f6 = 0.0F;
        PoseStack.Pose posestack$pose = p_114193_.last();
        Matrix4f matrix4f = posestack$pose.pose();
        Matrix3f matrix3f = posestack$pose.normal();

        for (int j = 1; j <= 8; ++j) {
            float f7 = Mth.sin((float) j * ((float) Math.PI * 2F) / 8.0F) * 0.75F;
            float f8 = Mth.cos((float) j * ((float) Math.PI * 2F) / 8.0F) * 0.75F;
            float f9 = (float) j / 8.0F;
            vertexconsumer.vertex(matrix4f, f4 * 0.2F, f5 * 0.2F, 0.0F).color(0, 0, 0, 255).uv(f6, f2).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
            vertexconsumer.vertex(matrix4f, f4, f5, f1).color(255, 255, 255, 255).uv(f6, f3).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
            vertexconsumer.vertex(matrix4f, f7, f8, f1).color(255, 255, 255, 255).uv(f9, f3).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
            vertexconsumer.vertex(matrix4f, f7 * 0.2F, f8 * 0.2F, 0.0F).color(0, 0, 0, 255).uv(f9, f2).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_114195_).normal(matrix3f, 0.0F, -1.0F, 0.0F).endVertex();
            f4 = f7;
            f5 = f8;
            f6 = f9;
        }

        p_114193_.popPose();
    }

    public ResourceLocation getTextureLocation(EnderDragon p_114206_) {
        return DRAGON_LOCATION;
    }

}