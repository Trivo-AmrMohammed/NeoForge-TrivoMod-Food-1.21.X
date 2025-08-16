package net.trivo.recipesmod.foodmix.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems{

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems("trivorecipes");

    public static final DeferredItem<Item> KNIFE = ITEMS.registerItem("knife",
            KNIFE -> new KnifeItem(KNIFE.sword(KnifeItem.KNIFE_MATERIAL, 2, -2)));

    public static final DeferredItem<Item> CRUMBS = ITEMS.registerItem("crumbs",
            CRUMBS -> new Item(CRUMBS.food(ModFoods.CRUMBS, defaultFood().consumeSeconds(0.4f).build())), new Item.Properties());
    public static final DeferredItem<Item> TOAST = ITEMS.registerItem("toast",
            TOAST -> new Item(TOAST.food(ModFoods.TOAST, defaultFood().consumeSeconds(0.8f).build())), new Item.Properties());
    public static final DeferredItem<Item> BUN = ITEMS.registerItem("bun",
            BUN -> new Item(BUN.food(ModFoods.BUN, defaultFood().consumeSeconds(1.2f).build())), new Item.Properties());

    public static final DeferredItem<Item> EGGTOAST = ITEMS.registerItem("egg_toast",
            EGGTOAST -> new Item(EGGTOAST.food(ModFoods.EGGTOAST)));
    public static final DeferredItem<Item> CHOCOLATETOAST = ITEMS.registerItem("chocolate_toast",
            CHOCOLATETOAST -> new Item(CHOCOLATETOAST.food(ModFoods.CHOCOLATETOAST)));
    public static final DeferredItem<Item> DARKCHOCOLATETOAST = ITEMS.registerItem("dark_chocolate_toast",
            DARKCHOCOLATETOAST -> new Item(DARKCHOCOLATETOAST.food(ModFoods.DARKCHOCOLATETOAST)));

    public static final DeferredItem<Item> BAKEDCOCOABEANS = ITEMS.registerItem("baked_cocoa_beans",
            BAKEDCOCOABEANS -> new Item(BAKEDCOCOABEANS.food(ModFoods.BAKEDCOCOABEANS, defaultFood().consumeSeconds(0.8f).build())));
    public static final DeferredItem<Item> FRIEDEGG = ITEMS.registerItem("fried_egg",
            FRIEDEGG -> new Item(FRIEDEGG.food(ModFoods.FRIEDEGG, defaultFood().consumeSeconds(0.8f).build())));
    public static final DeferredItem<Item> CARAMEL = ITEMS.registerItem("caramel",
            CARAMEL -> new Item(CARAMEL.food(ModFoods.CARAMEL, defaultFood().consumeSeconds(2f).onConsume(new ApplyStatusEffectsConsumeEffect
                    (List.of(new MobEffectInstance(MobEffects.HASTE, 20, 1),
                            new MobEffectInstance(MobEffects.SPEED, 20, 1)))).build())));

    public static final DeferredItem<Item> CHOCOLATE = ITEMS.registerItem("chocolate",
            CHOCOLATE -> new Item(CHOCOLATE.food(ModFoods.CHOCOLATE)));
    public static final DeferredItem<Item> DARKCHOCOLATE = ITEMS.registerItem("dark_chocolate",
            DARKCHOCOLATE -> new Item(DARKCHOCOLATE.food(ModFoods.DARKCHOCOLATE)));
    public static final DeferredItem<Item> GOLDENCHOCOLATE = ITEMS.registerItem("golden_chocolate",
            GOLDENCHOCOLATE -> new Item(GOLDENCHOCOLATE.rarity(Rarity.RARE).food(ModFoods.GOLDENCHOCOLATE, defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect
                    (List.of(new MobEffectInstance(MobEffects.REGENERATION, 100, 1),
                            new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0)))).build())));

    public static final DeferredItem<Item> ENCHANTEDGOLDENCHOCOLATE = ITEMS.registerItem("enchanted_golden_chocolate",
            ENCHANTEDGOLDENCHOCOLATE -> new Item(ENCHANTEDGOLDENCHOCOLATE.rarity(Rarity.EPIC).food(ModFoods.ENCHANTEDGOLDENCHOCOLATE, defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect
                    (List.of(new MobEffectInstance(MobEffects.REGENERATION, 400, 1),
                            new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0),
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),
                            new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3))))
                            .build()).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> CHOCOLATEAPPLE = ITEMS.registerItem("chocolate_apple",
            CHOCOLATEAPPLE -> new Item(CHOCOLATEAPPLE.food(ModFoods.CHOCOLATEAPPLE)));
    public static final DeferredItem<Item> DARKCHOCOLATEAPPLE = ITEMS.registerItem("dark_chocolate_apple",
            DARKCHOCOLATEAPPLE -> new Item(DARKCHOCOLATEAPPLE.food(ModFoods.DARKCHOCOLATEAPPLE)));
    public static final DeferredItem<Item> CARAMELAPPLE = ITEMS.registerItem("caramel_apple",
            CARAMELAPPLE -> new Item(CARAMELAPPLE.food(ModFoods.CARAMELAPPLE, defaultFood().consumeSeconds(
                    2.4f).onConsume(new ApplyStatusEffectsConsumeEffect(
                            new MobEffectInstance(MobEffects.HASTE, 60, 1))).build())));
    public static final DeferredItem<Item> APPLEPIE = ITEMS.registerItem("apple_pie",
            APPLEPIE -> new Item(APPLEPIE.food(ModFoods.APPLEPIE)));


    public static final DeferredItem<Item> BEEFBURGER = ITEMS.registerItem("beef_burger",
            BEEFBURGER -> new Item(BEEFBURGER.food(ModFoods.BEEFBURGER, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> CHICKENBURGER = ITEMS.registerItem("chicken_burger",
            CHICKENBURGER -> new Item(CHICKENBURGER.food(ModFoods.CHICKENBURGER, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> MUTTONBURGER = ITEMS.registerItem("mutton_burger",
            MUTTONBURGER -> new Item(MUTTONBURGER.food(ModFoods.MUTTONBURGER, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> CODBURGER = ITEMS.registerItem("cod_burger",
            CODBURGER -> new Item(CODBURGER.food(ModFoods.CODBURGER, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> SALMONBURGER = ITEMS.registerItem("salmon_burger",
            SALMONBURGER -> new Item(SALMONBURGER.food(ModFoods.SALMONBURGER, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> RABBITBURGER = ITEMS.registerItem("rabbit_burger",
            RABBITBURGER -> new Item(RABBITBURGER.food(ModFoods.RABBITBURGER, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> ROTTENFLESHBURGER = ITEMS.registerItem("rotten_flesh_burger",
            ROTTENFLESHBURGER -> new Item(ROTTENFLESHBURGER.food(ModFoods.ROTTENFLESHBURGER, defaultFood().consumeSeconds(2.4f).onConsume(new ApplyStatusEffectsConsumeEffect
                    (new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F)).build())));

    public static final DeferredItem<Item> CUTBAKEDPOTATO = ITEMS.registerItem("cut_baked_potato",
            CUTBAKEDPOTATO -> new Item(CUTBAKEDPOTATO.food(ModFoods.CUTBAKEDPOTATO)));
    public static final DeferredItem<Item> STEAKFILLEDBAKEDPOTATO = ITEMS.registerItem("steak_filled_baked_potato",
            STEAKFILLEDBAKEDPOTATO -> new Item(STEAKFILLEDBAKEDPOTATO.food(ModFoods.STEAKFILLEDBAKEDPOTATO, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> CHICKENFILLEDBAKEDPOTATO = ITEMS.registerItem("chicken_filled_baked_potato",
            CHICKENFILLEDBAKEDPOTATO -> new Item(CHICKENFILLEDBAKEDPOTATO.food(ModFoods.CHICKENFILLEDBAKEDPOTATO, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> MUTTONFILLEDBAKEDPOTATO = ITEMS.registerItem("mutton_filled_baked_potato",
            MUTTONFILLEDBAKEDPOTATO -> new Item(MUTTONFILLEDBAKEDPOTATO.food(ModFoods.MUTTONFILLEDBAKEDPOTATO, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> RABBITFILLEDBAKEDPOTATO = ITEMS.registerItem("rabbit_filled_baked_potato",
            RABBITFILLEDBAKEDPOTATO -> new Item(RABBITFILLEDBAKEDPOTATO.food(ModFoods.RABBITFILLEDBAKEDPOTATO, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> SALMONFILLEDBAKEDPOTATO = ITEMS.registerItem("salmon_filled_baked_potato",
            SALMONFILLEDBAKEDPOTATO -> new Item(SALMONFILLEDBAKEDPOTATO.food(ModFoods.SALMONFILLEDBAKEDPOTATO, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> CODFILLEDBAKEDPOTATO = ITEMS.registerItem("cod_filled_baked_potato",
            CODFILLEDBAKEDPOTATO -> new Item(CODFILLEDBAKEDPOTATO.food(ModFoods.CODFILLEDBAKEDPOTATO, defaultFood().consumeSeconds(2.4f).build())));
    public static final DeferredItem<Item> ROTTENFLESHFILLEDBAKEDPOTATO = ITEMS.registerItem("rotten_flesh_filled_baked_potato",
            ROTTENFLESHFILLEDBAKEDPOTATO -> new Item(ROTTENFLESHFILLEDBAKEDPOTATO.food(ModFoods.ROTTENFLESHFILLEDBAKEDPOTATO, defaultFood().consumeSeconds(2.4f).onConsume(new ApplyStatusEffectsConsumeEffect
                    (new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F)).build())));

    public static Consumable.Builder defaultFood() {
        return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.EAT).sound(SoundEvents.GENERIC_EAT).hasConsumeParticles(true);
    }

        public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus); }

}
