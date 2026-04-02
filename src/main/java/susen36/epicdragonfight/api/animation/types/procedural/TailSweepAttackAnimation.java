package susen36.epicdragonfight.api.animation.types.procedural;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.EnderDragonPart;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.EntitySelector;
import susen36.epicdragonfight.api.model.Model;
import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class TailSweepAttackAnimation extends EnderDragonAttackAnimation {

	public TailSweepAttackAnimation(float convertTime, float antic, float preDelay, float contact, float recovery, String rightFrontFoot, String path, Model dragon, IKInfo[] ikInfos) {
		super(convertTime, antic, preDelay, contact, recovery, rightFrontFoot, path, dragon, ikInfos);
	}

	@Override
	public void tick(IDragonPatch entitypatch) {
		super.tick(entitypatch);

		if (!entitypatch.isLogicalClient()) {
			EnderDragon original = entitypatch.getOriginal();
			float elapsedTime = entitypatch.getAnimator().getPlayerFor(this).getElapsedTime();

			if (elapsedTime >= 0.2F) {
				Entity[] allParts = original.getParts();
				EnderDragonPart[] tails = { (EnderDragonPart) allParts[3], (EnderDragonPart) allParts[4], (EnderDragonPart) allParts[5], (EnderDragonPart) allParts[allParts.length - 3], (EnderDragonPart) allParts[allParts.length - 2], (EnderDragonPart) allParts[allParts.length - 1] };
				for (EnderDragonPart tail : tails) {
					original.knockBack(original.level.getEntities(original, tail.getBoundingBox().inflate(2.5F), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
					original.hurt(original.level.getEntities(original, tail.getBoundingBox().inflate(2.5F), EntitySelector.NO_CREATIVE_OR_SPECTATOR));
				}
			}
		}
	}
}
