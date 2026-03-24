package susen36.epicdragonfight.client.renderer.patched.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event.Result;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import susen36.epicdragonfight.api.model.Armature;
import susen36.epicdragonfight.api.utils.math.MathUtils;
import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;
import susen36.epicdragonfight.world.capabilities.entitypatch.MobPatch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@OnlyIn(Dist.CLIENT)
public abstract class PatchedEntityRenderer<E extends Mob, T extends MobPatch<E>, R extends EntityRenderer<E>> {
	protected static Method shouldShowName;
	protected static Method renderNameTag;
	
	static {
		shouldShowName = ObfuscationReflectionHelper.findMethod(EntityRenderer.class, "m_6512_", Entity.class);
		renderNameTag = ObfuscationReflectionHelper.findMethod(EntityRenderer.class, "m_7649_", Entity.class, Component.class, PoseStack.class, MultiBufferSource.class, int.class);
	}

	public void render(E entityIn, T entitypatch, R renderer, MultiBufferSource buffer, PoseStack poseStack, int packedLight, float partialTicks) {

	}

	public OpenMatrix4f[] getPoseMatrices(T entitypatch, Armature armature, float partialTicks) {
		armature.initializeTransform();
		entitypatch.getClientAnimator().setPoseToModel(partialTicks);

        return armature.getJointTransforms();
	}

	
	public void mulPoseStack(PoseStack poseStack, Armature armature, E entityIn, T entitypatch, float partialTicks) {
		OpenMatrix4f modelMatrix = entitypatch.getModelMatrix(partialTicks);
        OpenMatrix4f transpose = modelMatrix.transpose(null);
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0F));
        MathUtils.translateStack(poseStack, modelMatrix);
        MathUtils.rotateStack(poseStack, transpose);
        MathUtils.scaleStack(poseStack, transpose);
	}

}