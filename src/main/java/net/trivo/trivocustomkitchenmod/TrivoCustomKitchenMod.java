package net.trivo.trivocustomkitchenmod;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.trivo.trivocustomkitchenmod.item.custom.ModCreativeModeTabs;
import net.trivo.trivocustomkitchenmod.item.custom.ModItems;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(TrivoCustomKitchenMod.MODID)
public class TrivoCustomKitchenMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "trivokitchen";

    public TrivoCustomKitchenMod(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.BAKEDCOCOABEANS);
            event.accept(ModItems.CARAMEL);
            event.accept(ModItems.CHOCOLATE);
            event.accept(ModItems.DARKCHOCOLATE);
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
            event.accept(ModItems.STEAKFILLEDBAKEDPOTATO);
            event.accept(ModItems.MUTTONFILLEDBAKEDPOTATO);
            event.accept(ModItems.CHICKENFILLEDBAKEDPOTATO);
            event.accept(ModItems.RABBITFILLEDBAKEDPOTATO);
            event.accept(ModItems.SALMONFILLEDBAKEDPOTATO);
            event.accept(ModItems.CODFILLEDBAKEDPOTATO);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BAKEDCOCOABEANS);
            event.accept(ModItems.CARAMEL);
            event.accept(ModItems.CHOCOLATE);
            event.accept(ModItems.DARKCHOCOLATE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
