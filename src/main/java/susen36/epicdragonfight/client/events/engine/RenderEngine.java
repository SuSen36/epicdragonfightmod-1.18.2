package susen36.epicdragonfight.client.events.engine;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import susen36.epicdragonfight.EpicDragonFight;
import susen36.epicdragonfight.api.client.forgeevent.RenderEnderDragonEvent;
import susen36.epicdragonfight.client.renderer.patched.entity.PEnderDragonRenderer;
import susen36.epicdragonfight.client.renderer.patched.entity.PatchedEntityRenderer;
import susen36.epicdragonfight.world.capabilities.DragonFightCapabilities;
import susen36.epicdragonfight.world.capabilities.entitypatch.MobPatch;
import susen36.epicdragonfight.world.capabilities.entitypatch.enderdragon.EnderDragonPatch;

@SuppressWarnings("rawtypes")
@OnlyIn(Dist.CLIENT)
public class RenderEngine {
	private PatchedEntityRenderer dragonRenderer;
	
	public RenderEngine() {
		Events.renderEngine = this;
	}
	
	public void registerRenderer() {
		this.dragonRenderer = new PEnderDragonRenderer();
	}

	@SuppressWarnings("unchecked")
	public void renderEntityArmatureModel(Mob mob, MobPatch<?> entitypatch, LivingEntityRenderer<? extends Entity, ?> renderer, MultiBufferSource buffer, PoseStack matStack, int packedLightIn, float partialTicks) {
		this.dragonRenderer.render(mob, entitypatch, renderer, buffer, matStack, packedLightIn, partialTicks);
	}
	
	public PatchedEntityRenderer getEntityRenderer(Entity entity) {
		return this.dragonRenderer;
	}
	
	public boolean hasRendererFor(Entity entity) {
		return entity instanceof EnderDragon;
	}
	
	@Mod.EventBusSubscriber(modid = EpicDragonFight.MODID, value = Dist.CLIENT)
	public static class Events {
		static RenderEngine renderEngine;
		
		@SubscribeEvent
		public static void renderLivingEvent(RenderLivingEvent.Pre<? extends LivingEntity, ? extends EntityModel<? extends LivingEntity>> event) {
			LivingEntity livingentity = event.getEntity();
			
			if (renderEngine.hasRendererFor(livingentity)) {
				if (livingentity instanceof LocalPlayer && event.getPartialTick() == 1.0F) {
					return;
				}
				
				MobPatch<?> entitypatch = (MobPatch<?>) livingentity.getCapability(DragonFightCapabilities.CAPABILITY_ENTITY, null).orElse(null);
				
				if (livingentity instanceof Mob mob && entitypatch != null && !entitypatch.shouldSkipRender()) {
					event.setCanceled(true);
					renderEngine.renderEntityArmatureModel(mob, entitypatch, event.getRenderer(), event.getMultiBufferSource(), event.getPoseStack(), event.getPackedLight(), event.getPartialTick());
				}
			}
		}
		
		@SuppressWarnings("unchecked")
		@SubscribeEvent
		public static void renderEnderDragonEvent(RenderEnderDragonEvent event) {
			EnderDragon livingentity = event.getEntity();
			
			if (renderEngine.hasRendererFor(livingentity)) {
				EnderDragonPatch entitypatch = (EnderDragonPatch) livingentity.getCapability(DragonFightCapabilities.CAPABILITY_ENTITY, null).orElse(null);
				
				if (entitypatch != null) {
					event.setCanceled(true);
					renderEngine.getEntityRenderer(livingentity).render(livingentity, entitypatch, event.getRenderer(), event.getBuffers(), event.getPoseStack(), event.getLight(), event.getPartialRenderTick());
				}
			}
		}
	}
}
