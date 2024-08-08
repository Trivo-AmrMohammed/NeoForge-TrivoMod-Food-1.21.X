package net.trivo.trivocustomkitchenmod.item.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trivo.trivocustomkitchenmod.TrivoCustomKitchenMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TrivoCustomKitchenMod.MODID);

    public static final Supplier<CreativeModeTab> TRIVOCHEF = CREATIVE_MODE_TABS.register("trivo_chef_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHICKENBURGER.get()))
                    .title(Component.translatable("creativetab.trivo_chef_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BAKEDCOCOABEANS.get());
                        pOutput.accept(ModItems.CARAMEL.get());
                        pOutput.accept(ModItems.CHOCOLATE.get());
                        pOutput.accept(ModItems.DARKCHOCOLATE.get());
                        pOutput.accept(ModItems.CHOCOLATEAPPLE.get());
                        pOutput.accept(ModItems.DARKCHOCOLATEAPPLE.get());
                        pOutput.accept(ModItems.CARAMELAPPLE.get());
                        pOutput.accept(ModItems.APPLEPIE.get());
                        pOutput.accept(ModItems.BEEFBURGER.get());
                        pOutput.accept(ModItems.CHICKENBURGER.get());
                        pOutput.accept(ModItems.MUTTONBURGER.get());
                        pOutput.accept(ModItems.CODBURGER.get());
                        pOutput.accept(ModItems.SALMONBURGER.get());
                        pOutput.accept(ModItems.RABBITBURGER.get());
                        pOutput.accept(ModItems.STEAKFILLEDBAKEDPOTATO.get());
                        pOutput.accept(ModItems.CHICKENFILLEDBAKEDPOTATO.get());
                        pOutput.accept(ModItems.MUTTONFILLEDBAKEDPOTATO.get());
                        pOutput.accept(ModItems.RABBITFILLEDBAKEDPOTATO.get());
                        pOutput.accept(ModItems.SALMONFILLEDBAKEDPOTATO.get());
                        pOutput.accept(ModItems.CODFILLEDBAKEDPOTATO.get());
                    })
                    .build());


    public static void register(IEventBus eventBus)
    { CREATIVE_MODE_TABS.register(eventBus); }
}
