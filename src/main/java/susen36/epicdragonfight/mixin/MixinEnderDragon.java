package susen36.epicdragonfight.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnderDragon.class)
public abstract class MixinEnderDragon extends Mob {
	protected MixinEnderDragon(EntityType<? extends Mob> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Inject(
		method = "createAttributes",
		at = @At("RETURN"),
		cancellable = true
	)
	private static void onCreateAttributes(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
		AttributeSupplier.Builder builder = cir.getReturnValue();
		builder.add(Attributes.MAX_HEALTH, 300.0D);
		builder.add(Attributes.ARMOR, 3.0D);
		builder.add(Attributes.ARMOR_TOUGHNESS, 2.0D);
		builder.add(Attributes.ATTACK_DAMAGE, 10.0D);
		builder.add(Attributes.ATTACK_KNOCKBACK, 0.35D);
		cir.setReturnValue(builder);
	}
	@Overwrite
	private boolean checkWalls(AABB pArea) {
		int i = Mth.floor(pArea.minX);
		int j = Mth.floor(pArea.minY);
		int k = Mth.floor(pArea.minZ);
		int l = Mth.floor(pArea.maxX);
		int i1 = Mth.floor(pArea.maxY);
		int j1 = Mth.floor(pArea.maxZ);
		boolean flag = false;
		boolean flag1 = false;

		for (int k1 = i; k1 <= l; ++k1) {
			for (int l1 = j; l1 <= i1; ++l1) {
				for (int i2 = k; i2 <= j1; ++i2) {
					BlockPos blockpos = new BlockPos(k1, l1, i2);
					BlockState blockstate = this.level().getBlockState(blockpos);
					if (!blockstate.isAir() && !blockstate.is(BlockTags.DRAGON_TRANSPARENT)) {
						if (net.minecraftforge.common.ForgeHooks.canEntityDestroy(this.level(), blockpos, this) && !blockstate.is(BlockTags.DRAGON_IMMUNE)) {
							flag1 = true;
						} else {
							flag = true;
						}
					}
				}
			}
		}

		if (flag1) {
			//BlockPos blockpos1 = new BlockPos(i + this.random.nextInt(l - i + 1), j + this.random.nextInt(i1 - j + 1), k + this.random.nextInt(j1 - k + 1));
			//this.level().levelEvent(2008, blockpos1, 0);
		}

		return flag;
	}
}
