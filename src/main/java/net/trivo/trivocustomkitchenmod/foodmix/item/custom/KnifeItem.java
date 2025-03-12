package net.trivo.trivocustomkitchenmod.foodmix.item.custom;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.Level;

import java.util.Objects;
import java.util.function.Supplier;

public class KnifeItem extends SwordItem {
    private final Supplier<Item> craftingRemainder;

    public KnifeItem(ToolMaterial material, int attackDamage, float attackSpeed, Properties properties, Supplier<Item> craftingRemainder) {
        super(material, attackDamage, attackSpeed, properties);
        this.craftingRemainder = craftingRemainder;
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack itemStack) {
        return new ItemStack(craftingRemainder.get());
    }
}