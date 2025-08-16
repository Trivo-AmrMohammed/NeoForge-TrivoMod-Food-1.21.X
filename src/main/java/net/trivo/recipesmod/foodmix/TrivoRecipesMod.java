package net.trivo.recipesmod.foodmix;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.trivo.recipesmod.foodmix.item.ModCreativeModeTabs;
import net.trivo.recipesmod.foodmix.item.ModItems;
import net.trivo.recipesmod.foodmix.init.LootCodecRegistry;

@Mod(TrivoRecipesMod.MODID)
public class TrivoRecipesMod
{

    public static final String MODID = "trivorecipes";

    public TrivoRecipesMod(IEventBus modEventBus)
    {
        LootCodecRegistry.GLOBAL_LOOT_MODIFIER_SERIALIZERS.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.CRUMBS);
            event.accept(ModItems.BUN);
            event.accept(ModItems.TOAST);
            event.accept(ModItems.EGGTOAST);
            event.accept(ModItems.CHOCOLATETOAST);
            event.accept(ModItems.DARKCHOCOLATETOAST);
            event.accept(ModItems.BAKEDCOCOABEANS);
            event.accept(ModItems.FRIEDEGG);
            event.accept(ModItems.CARAMEL);
            event.accept(ModItems.CHOCOLATE);
            event.accept(ModItems.DARKCHOCOLATE);
            event.accept(ModItems.GOLDENCHOCOLATE);
            event.accept(ModItems.ENCHANTEDGOLDENCHOCOLATE);
            event.accept(ModItems.CHOCOLATEAPPLE);
            event.accept(ModItems.DARKCHOCOLATEAPPLE);
            event.accept(ModItems.CARAMELAPPLE);
            event.accept(ModItems.APPLEPIE);
            event.accept(ModItems.BEEFBURGER);
            event.accept(ModItems.CHICKENBURGER);
            event.accept(ModItems.MUTTONBURGER);
            event.accept(ModItems.CODBURGER);
            event.accept(ModItems.SALMONBURGER);
            event.accept(ModItems.RABBITBURGER);
            event.accept(ModItems.ROTTENFLESHBURGER);
            event.accept(ModItems.CUTBAKEDPOTATO);
            event.accept(ModItems.STEAKFILLEDBAKEDPOTATO);
            event.accept(ModItems.MUTTONFILLEDBAKEDPOTATO);
            event.accept(ModItems.CHICKENFILLEDBAKEDPOTATO);
            event.accept(ModItems.RABBITFILLEDBAKEDPOTATO);
            event.accept(ModItems.SALMONFILLEDBAKEDPOTATO);
            event.accept(ModItems.CODFILLEDBAKEDPOTATO);
            event.accept(ModItems.ROTTENFLESHFILLEDBAKEDPOTATO);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BUN);
            event.accept(ModItems.TOAST);
            event.accept(ModItems.BAKEDCOCOABEANS);
            event.accept(ModItems.CARAMEL);
            event.accept(ModItems.CHOCOLATE);
            event.accept(ModItems.DARKCHOCOLATE);
            event.accept(ModItems.CUTBAKEDPOTATO);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.KNIFE);
        }
    }
}
