package net.trivo.trivocustomkitchenmod.foodmix.item.custom;

import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems{

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems("trivokitchen");

    public static final DeferredItem<Item> KNIFE = ITEMS.registerItem("knife",
            KNIFE -> new KnifeItem(ToolMaterial.IRON, -1, 3, KNIFE,
                    () -> ModItems.KNIFE.get()));

    public static final DeferredItem<Item> TOAST = ITEMS.registerItem("toast",
            TOAST -> new Item(TOAST.food(ModFoods.TOAST)), new Item.Properties());
    public static final DeferredItem<Item> EGGTOAST = ITEMS.registerItem("eggtoast",
            EGGTOAST -> new Item(EGGTOAST.food(ModFoods.EGGTOAST)));
    public static final DeferredItem<Item> BAKEDCOCOABEANS = ITEMS.registerItem("bakedcocoabeans",
            BAKEDCOCOABEANS -> new Item(BAKEDCOCOABEANS.food(ModFoods.BAKEDCOCOABEANS)));
    public static final DeferredItem<Item> FRIEDEGG = ITEMS.registerItem("friedegg",
            FRIEDEGG -> new Item(FRIEDEGG.food(ModFoods.FRIEDEGG)));
    public static final DeferredItem<Item> CARAMEL = ITEMS.registerItem("caramel",
            CARAMEL -> new Item(CARAMEL.food(ModFoods.CARAMEL)));
    public static final DeferredItem<Item> CHOCOLATE = ITEMS.registerItem("chocolate",
            CHOCOLATE -> new Item(CHOCOLATE.food(ModFoods.CHOCOLATE)));
    public static final DeferredItem<Item> DARKCHOCOLATE = ITEMS.registerItem("darkchocolate",
            DARKCHOCOLATE -> new Item(DARKCHOCOLATE.food(ModFoods.DARKCHOCOLATE)));
    public static final DeferredItem<Item> GOLDENCHOCOLATE = ITEMS.registerItem("goldenchocolate",
            GOLDENCHOCOLATE -> new Item(GOLDENCHOCOLATE.rarity(Rarity.RARE).food(ModFoods.GOLDENCHOCOLATE, defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect
                    (List.of(new MobEffectInstance(MobEffects.REGENERATION, 100, 1),
                            new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0)))).build())));

    public static final DeferredItem<Item> ENCHANTEDGOLDENCHOCOLATE = ITEMS.registerItem("enchantedgoldenchocolate",
            ENCHANTEDGOLDENCHOCOLATE -> new Item(ENCHANTEDGOLDENCHOCOLATE.rarity(Rarity.EPIC).food(ModFoods.ENCHANTEDGOLDENCHOCOLATE, defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect
                    (List.of(new MobEffectInstance(MobEffects.REGENERATION, 400, 1),
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0),
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
                            new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3))))
                            .build()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> CHOCOLATEAPPLE = ITEMS.registerItem("chocolateapple",
            CHOCOLATEAPPLE -> new Item(CHOCOLATEAPPLE.food(ModFoods.CHOCOLATEAPPLE)));
    public static final DeferredItem<Item> DARKCHOCOLATEAPPLE = ITEMS.registerItem("darkchocolateapple",
            DARKCHOCOLATEAPPLE -> new Item(DARKCHOCOLATEAPPLE.food(ModFoods.DARKCHOCOLATEAPPLE)));
    public static final DeferredItem<Item> CARAMELAPPLE = ITEMS.registerItem("caramelapple",
            CARAMELAPPLE -> new Item(CARAMELAPPLE.food(ModFoods.CARAMELAPPLE)));
    public static final DeferredItem<Item> APPLEPIE = ITEMS.registerItem("applepie",
            APPLEPIE -> new Item(APPLEPIE.food(ModFoods.APPLEPIE)));


    public static final DeferredItem<Item> BEEFBURGER = ITEMS.registerItem("beefburger",
            BEEFBURGER -> new Item(BEEFBURGER.food(ModFoods.BEEFBURGER)));
    public static final DeferredItem<Item> CHICKENBURGER = ITEMS.registerItem("chickenburger",
            CHICKENBURGER -> new Item(CHICKENBURGER.food(ModFoods.CHICKENBURGER)));
    public static final DeferredItem<Item> MUTTONBURGER = ITEMS.registerItem("muttonburger",
            MUTTONBURGER -> new Item(MUTTONBURGER.food(ModFoods.MUTTONBURGER)));
    public static final DeferredItem<Item> CODBURGER = ITEMS.registerItem("codburger",
            CODBURGER -> new Item(CODBURGER.food(ModFoods.CODBURGER)));
    public static final DeferredItem<Item> SALMONBURGER = ITEMS.registerItem("salmonburger",
            SALMONBURGER -> new Item(SALMONBURGER.food(ModFoods.SALMONBURGER)));
    public static final DeferredItem<Item> RABBITBURGER = ITEMS.registerItem("rabbitburger",
            RABBITBURGER -> new Item(RABBITBURGER.food(ModFoods.RABBITBURGER)));
    public static final DeferredItem<Item> ROTTENFLESHBURGER = ITEMS.registerItem("rottenfleshburger",
            ROTTENFLESHBURGER -> new Item(ROTTENFLESHBURGER.food(ModFoods.ROTTENFLESHBURGER, defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect
                    (new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F)).build())));

    public static final DeferredItem<Item> CUTBAKEDPOTATO = ITEMS.registerItem("cutbakedpotato",
            CUTBAKEDPOTATO -> new Item(CUTBAKEDPOTATO.food(ModFoods.CUTBAKEDPOTATO)));
    public static final DeferredItem<Item> STEAKFILLEDBAKEDPOTATO = ITEMS.registerItem("steakfilledbakedpotato",
            STEAKFILLEDBAKEDPOTATO -> new Item(STEAKFILLEDBAKEDPOTATO.food(ModFoods.STEAKFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> CHICKENFILLEDBAKEDPOTATO = ITEMS.registerItem("chickenfilledbakedpotato",
            CHICKENFILLEDBAKEDPOTATO -> new Item(CHICKENFILLEDBAKEDPOTATO.food(ModFoods.CHICKENFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> MUTTONFILLEDBAKEDPOTATO = ITEMS.registerItem("muttonfilledbakedpotato",
            MUTTONFILLEDBAKEDPOTATO -> new Item(MUTTONFILLEDBAKEDPOTATO.food(ModFoods.MUTTONFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> RABBITFILLEDBAKEDPOTATO = ITEMS.registerItem("rabbitfilledbakedpotato",
            RABBITFILLEDBAKEDPOTATO -> new Item(RABBITFILLEDBAKEDPOTATO.food(ModFoods.RABBITFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> SALMONFILLEDBAKEDPOTATO = ITEMS.registerItem("salmonfilledbakedpotato",
            SALMONFILLEDBAKEDPOTATO -> new Item(SALMONFILLEDBAKEDPOTATO.food(ModFoods.SALMONFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> CODFILLEDBAKEDPOTATO = ITEMS.registerItem("codfilledbakedpotato",
            CODFILLEDBAKEDPOTATO -> new Item(CODFILLEDBAKEDPOTATO.food(ModFoods.CODFILLEDBAKEDPOTATO)));
    public static final DeferredItem<Item> ROTTENFLESHFILLEDBAKEDPOTATO = ITEMS.registerItem("rottenfleshfilledbakedpotato",
            ROTTENFLESHFILLEDBAKEDPOTATO -> new Item(ROTTENFLESHFILLEDBAKEDPOTATO.food(ModFoods.ROTTENFLESHFILLEDBAKEDPOTATO, defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect
                    (new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F)).build())));

    public static Consumable.Builder defaultFood() {
        return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.EAT).sound(SoundEvents.GENERIC_EAT).hasConsumeParticles(true);
    }

        public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus); }

}
