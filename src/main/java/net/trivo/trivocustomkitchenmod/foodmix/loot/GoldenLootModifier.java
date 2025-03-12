package net.trivo.trivocustomkitchenmod.foodmix.loot;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.trivo.trivocustomkitchenmod.foodmix.init.LootCodecRegistry;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class GoldenLootModifier extends LootModifier {

    public static final MapCodec<GoldenLootModifier> CODEC = RecordCodecBuilder.mapCodec(inst
            -> GoldenLootModifier.codecStart(inst)
            .and(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(e -> e.item))
            .apply(inst, GoldenLootModifier::new));

    private final Item item;

    public GoldenLootModifier(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return LootCodecRegistry.GOLDEN_LOOT.get();
    }

    @Nonnull
    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                return generatedLoot;
            }
        }

        generatedLoot.add(new ItemStack(this.item));
        return generatedLoot;
    }
}
