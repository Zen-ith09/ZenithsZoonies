package net.zenith.zenithszoonies.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ZANIE = new ForgeTier(9, 7991,5, 2f, 24,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.ZANIE.get()));
}
