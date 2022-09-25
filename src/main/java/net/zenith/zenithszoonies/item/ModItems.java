package net.zenith.zenithszoonies.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zenith.zenithszoonies.ZenithsZoonies;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZenithsZoonies.MOD_ID);

    public static final RegistryObject<Item> ZANIE = ITEMS.register("zanie",
            ()-> new Item(new Item.Properties().fireResistant().tab(ModCreativeModeTab.ZENITHS_ZOONIES)));

    public static final RegistryObject<Item> RAW_ZANIE = ITEMS.register("raw_zanie",
            ()-> new Item(new Item.Properties().fireResistant().tab(ModCreativeModeTab.ZENITHS_ZOONIES)));

    public static final RegistryObject<Item> ZENITHSZOONIES = ITEMS.register("zenithszoonies",
            ()-> new Item(new Item.Properties().fireResistant().tab(ModCreativeModeTab.ZENITHS_ZOONIES)));

    public static final RegistryObject<Item> SHLOOMPAFOOMPA = ITEMS.register("shloompafoompa",
            ()-> new PickaxeItem(ModTiers.ZANIE, 8, 2f,
                    new Item.Properties().fireResistant().tab(ModCreativeModeTab.ZENITHS_ZOONIES)));

    public static final RegistryObject<Item> FOOMPASHLOOMPA = ITEMS.register("foompashloompa",
            ()-> new AxeItem(ModTiers.ZANIE, 1, 0f,
                    new Item.Properties().fireResistant().tab(ModCreativeModeTab.ZENITHS_ZOONIES)));

    public static final RegistryObject<Item> FOOMPA = ITEMS.register("foompa",
            ()-> new SwordItem(ModTiers.ZANIE, 9, 14f,
                    new Item.Properties().fireResistant().tab(ModCreativeModeTab.ZENITHS_ZOONIES)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
