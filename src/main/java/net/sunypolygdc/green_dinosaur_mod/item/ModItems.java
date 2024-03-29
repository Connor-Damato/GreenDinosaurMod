package net.sunypolygdc.green_dinosaur_mod.item;

import net.sunypolygdc.green_dinosaur_mod.GreenDinosaurMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GreenDinosaurMod.MOD_ID);

    // Test Item
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties()));

    // DinoArmor!
    public static final RegistryObject<Item> COPPER_DINO_ARMOR = ITEMS.register("copper_dino_armor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_DINO_ARMOR = ITEMS.register("iron_dino_armor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_DINO_ARMOR = ITEMS.register("gold_dino_armor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DINO_ARMOR = ITEMS.register("diamond_dino_armor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DINO_ARMOR = ITEMS.register("netherite_dino_armor", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREATIVE_DINO_ARMOR = ITEMS.register("creative_dino_armor", () -> new Item(new Item.Properties()));

    // Foods
    public static final RegistryObject<Item> DINO_FRUIT = ITEMS.register("dino_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.Dino_fruit)));
    public static final RegistryObject<Item> BLUE_FRUIT = ITEMS.register("blue_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.Blue_fruit)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
