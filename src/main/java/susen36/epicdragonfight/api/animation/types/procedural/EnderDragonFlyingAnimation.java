package susen36.epicdragonfight.api.animation.types.procedural;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class EnderDragonFlyingAnimation extends StaticAnimation {

	public EnderDragonFlyingAnimation(float convertTime, String path, Model model) {
		super(convertTime, true, path, model);
	}

	@Override
	public void tick(IDragonPatch entitypatch) {
		super.tick(entitypatch);

		if (!entitypatch.isLogicalClient()) {
			EnderDragon original = entitypatch.getOriginal();
			Entity[] allParts = original.getParts();
			EnderDragonPart body = (EnderDragonPart) allParts[2];
			EnderDragonPart wing1 = (EnderDragonPart) allParts[6];
			EnderDragonPart wing2 = (EnderDragonPart) allParts[7];

			original.knockBack(original.level.getEntities(original, wing1.getBoundingBox().inflate(2.0D, 1.0D, 2.0D).move(0.0D, -1.0D, 0.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
			original.knockBack(original.level.getEntities(original, wing2.getBoundingBox().inflate(2.0D, 1.0D, 2.0D).move(0.0D, -1.0D, 0.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
			original.hurt(original.level.getEntities(original, body.getBoundingBox().inflate(2.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
			original.hurt(original.level.getEntities(original, wing1.getBoundingBox().inflate(2.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
			original.hurt(original.level.getEntities(original, wing2.getBoundingBox().inflate(2.0D), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
		}
	}
}