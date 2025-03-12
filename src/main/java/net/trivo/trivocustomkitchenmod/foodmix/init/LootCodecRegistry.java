package net.trivo.trivocustomkitchenmod.foodmix.init;

import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.trivo.trivocustomkitchenmod.foodmix.TrivoCustomKitchenMod;
import net.trivo.trivocustomkitchenmod.foodmix.loot.GoldenLootModifier;

import java.util.function.Supplier;

public class LootCodecRegistry {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> GLOBAL_LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, TrivoCustomKitchenMod.MODID);

    public static final Supplier<MapCodec<GoldenLootModifier>> GOLDEN_LOOT =
            GLOBAL_LOOT_MODIFIER_SERIALIZERS.register("add_item", () -> GoldenLootModifier.CODEC);
}