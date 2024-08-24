package net.trivo.trivocustomkitchenmod.foodmix.loot;

import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.trivo.trivocustomkitchenmod.foodmix.TrivoCustomKitchenMod;

public class LootCodecRegistry {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> CODECS =
            DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, TrivoCustomKitchenMod.MODID);

    public static final DeferredHolder<MapCodec<? extends IGlobalLootModifier>, MapCodec<GoldenLootModifier>> GOLDEN_LOOT =
            CODECS.register("golden_loot", GoldenLootModifier.CODEC);

    public static void register(IEventBus bus) {
        CODECS.register(bus);
    }
}