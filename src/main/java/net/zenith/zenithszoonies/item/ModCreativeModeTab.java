package net.zenith.zenithszoonies.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ZENITHS_ZOONIES = new CreativeModeTab("zenithszoonies") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZENITHSZOONIES.get());
        }
    };
}
