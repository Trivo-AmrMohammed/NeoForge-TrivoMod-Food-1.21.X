package net.trivo.trivocustomkitchenmod.foodmix.item.custom;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;

public class ModFoods {
    public static final FoodProperties CRUMBS = new FoodProperties.Builder().nutrition(1)
            .saturationModifier(0.1f).build();
    public static final FoodProperties TOAST = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(0.2f).build();
    public static final FoodProperties BUN = new FoodProperties.Builder().nutrition(3)
            .saturationModifier(0.4f).build();

    public static final FoodProperties EGGTOAST = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.8f).build();
    public static final FoodProperties CHOCOLATETOAST = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.8f).build();
    public static final FoodProperties DARKCHOCOLATETOAST = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.6f).build();

    public static final FoodProperties BAKEDCOCOABEANS = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(0.1f).build();
    public static final FoodProperties FRIEDEGG = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.6f).build();
    public static final FoodProperties CARAMEL = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(0.2f).build();
    public static final FoodProperties CHOCOLATE = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.6f).build();
    public static final FoodProperties DARKCHOCOLATE = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.4f).build();
    public static final FoodProperties GOLDENCHOCOLATE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .alwaysEdible()
            .build();
    public static final FoodProperties ENCHANTEDGOLDENCHOCOLATE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .alwaysEdible()
            .build();
    public static final FoodProperties CHOCOLATEAPPLE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.9f).build();
    public static final FoodProperties DARKCHOCOLATEAPPLE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.7f).build();
    public static final FoodProperties CARAMELAPPLE = new FoodProperties.Builder().nutrition(6)
            .saturationModifier(0.5f).build();
    public static final FoodProperties APPLEPIE = new FoodProperties.Builder().nutrition(8)
            .saturationModifier(0.3f).build();


    public static final FoodProperties BEEFBURGER = new FoodProperties.Builder().nutrition(14)
            .saturationModifier(1.6f).build();
    public static final FoodProperties CHICKENBURGER = new FoodProperties.Builder().nutrition(12)
            .saturationModifier(1.4f).build();
    public static final FoodProperties MUTTONBURGER = new FoodProperties.Builder().nutrition(12)
            .saturationModifier(1.6f).build();
    public static final FoodProperties CODBURGER = new FoodProperties.Builder().nutrition(11)
            .saturationModifier(1.4f).build();
    public static final FoodProperties SALMONBURGER = new FoodProperties.Builder().nutrition(12)
            .saturationModifier(1.6f).build();
    public static final FoodProperties RABBITBURGER = new FoodProperties.Builder().nutrition(11)
            .saturationModifier(1.4f).build();
    public static final FoodProperties ROTTENFLESHBURGER = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(0.8F)
            .build();;

    public static final FoodProperties CUTBAKEDPOTATO = new FoodProperties.Builder().nutrition(5)
            .saturationModifier(0.6f).build();
    public static final FoodProperties STEAKFILLEDBAKEDPOTATO = new FoodProperties.Builder().nutrition(13)
            .saturationModifier(1.4f).build();
    public static final FoodProperties CHICKENFILLEDBAKEDPOTATO = new FoodProperties.Builder().nutrition(11)
            .saturationModifier(1.2f).build();
    public static final FoodProperties MUTTONFILLEDBAKEDPOTATO = new FoodProperties.Builder().nutrition(11)
            .saturationModifier(1.4f).build();
    public static final FoodProperties RABBITFILLEDBAKEDPOTATO = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    public static final FoodProperties SALMONFILLEDBAKEDPOTATO = new FoodProperties.Builder().nutrition(11)
            .saturationModifier(1.4f).build();
    public static final FoodProperties CODFILLEDBAKEDPOTATO = new FoodProperties.Builder().nutrition(10)
            .saturationModifier(1.2f).build();
    public static final FoodProperties ROTTENFLESHFILLEDBAKEDPOTATO = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(0.6F)
            .build();
}
