package net.trivo.trivocustomkitchenmod.foodmix.item.custom;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems("trivokitchen");
    public static final DeferredItem<Item> BAKEDCOCOABEANS = ITEMS.register("bakedcocoabeans",
            () -> new Item(new Item.Properties().food(ModFoods.BAKEDCOCOABEANS)));
    public static final DeferredItem<Item> FRIEDEGG = ITEMS.register("friedegg",
            () -> new Item(new Item.Properties().food(ModFoods.FRIEDEGG)));
    public static final DeferredItem<Item> CARAMEL = ITEMS.register("caramel",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL)));
    public static final DeferredItem<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE)));
    public static final DeferredItem<Item> DARKCHOCOLATE = ITEMS.register("darkchocolate",
            () -> new Item(new Item.Properties().food(ModFoods.DARKCHOCOLATE)));
    public static final DeferredItem<Item> GOLDENCHOCOLATE = ITEMS.register("goldenchocolate",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(ModFoods.GOLDENCHOCOLATE)));
    public static final DeferredItem<Item> ENCHANTEDGOLDENCHOCOLATE = ITEMS.register("enchantedgoldenchocolate",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).food(ModFoods.ENCHANTEDGOLDENCHOCOLATE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final DeferredItem<Item> CHOCOLATEAPPLE = ITEMS.register("chocolateapple",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATEAPPLE)));
    public static final DeferredItem<Item> DARKCHOCOLATEAPPLE = ITEMS.register("darkchocolateapple",
            () -> new Item(new Item.Properties().food(ModFoods.DARKCHOCOLATEAPPLE)));
    public static final DeferredItem<Item> CARAMELAPPLE = ITEMS.register("caramelapple",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMELAPPLE)));
    public static final DeferredItem<Item> APPLEPIE = ITEMS.register("applepie",
            () -> new Item(new Item.Properties().food(ModFoods.APPLEPIE)));


    public static final DeferredItem<Item> BEEFBURGER = ITEMS.register("beefburger",
            () -> new Item(new Item.Properties().food(ModFoods.BEEFBURGER)));
    public static final DeferredItem<Item> CHICKENBURGER = ITEMS.register("chickenburger",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKENBURGER)));
    public static final DeferredItem<Item> MUTTONBURGER = ITEMS.register("muttonburger",
            () -> new Item(new Item.Properties().food(ModFoods.MUTTONBURGER)));
    public static final DeferredItem<Item> CODBURGER = ITEMS.register("codburger",
            () -> new Item(new Item.Properties().food(ModFoods.CODBURGER)));
    public static final DeferredItem<Item> SALMONBURGER = ITEMS.register("salmonburger",
            () -> new Item(new Item.Properties().food(ModFoods.SALMONBURGER)));
    public static final DeferredItem<Item> RABBITBURGER = ITEMS.register("rabbitburger",
            () -> new Item(new Item.Properties().food(ModFoods.RABBITBURGER)));
    public static final DeferredItem<Item> ROTTENFLESHBURGER = ITEMS.register("rottenfleshburger",
            () -> new Item(new Item.Properties().food(ModFoods.ROTTENFLESHBURGER)));

    public static final DeferredItem<Item> STEAKFILLEDBAKEDPOTATO = ITEMS.register("steakfilledbakedpotato",
            () -> new Item(new Item.Properties().food(ModFoods.STEAKFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> CHICKENFILLEDBAKEDPOTATO = ITEMS.register("chickenfilledbakedpotato",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKENFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> MUTTONFILLEDBAKEDPOTATO = ITEMS.register("muttonfilledbakedpotato",
            () -> new Item(new Item.Properties().food(ModFoods.MUTTONFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> RABBITFILLEDBAKEDPOTATO = ITEMS.register("rabbitfilledbakedpotato",
            () -> new Item(new Item.Properties().food(ModFoods.RABBITFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> SALMONFILLEDBAKEDPOTATO = ITEMS.register("salmonfilledbakedpotato",
            () -> new Item(new Item.Properties().food(ModFoods.SALMONFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> CODFILLEDBAKEDPOTATO = ITEMS.register("codfilledbakedpotato",
            () -> new Item(new Item.Properties().food(ModFoods.CODFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> ROTTENFLESHFILLEDBAKEDPOTATO = ITEMS.register("rottenfleshfilledbakedpotato",
            () -> new Item(new Item.Properties().food(ModFoods.ROTTENFLESHFILLEDBAKEDPOTATO)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus); }
}
