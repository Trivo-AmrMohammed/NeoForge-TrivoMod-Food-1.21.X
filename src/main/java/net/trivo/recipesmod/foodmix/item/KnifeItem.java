package net.trivo.recipesmod.foodmix.item;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class KnifeItem extends Item {

    public KnifeItem(Properties properties) {
        super(properties);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if (state.is(BlockTags.MINEABLE_WITH_HOE)) {
            return 10.0F;
        }
        return super.getDestroySpeed(stack, state);
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack itemStack) {
        ItemStack remainder = itemStack.copy();
            remainder.setDamageValue(remainder.getDamageValue() + 1);
            if (remainder.getDamageValue() >= remainder.getMaxDamage()) {
                Minecraft minecraft = Minecraft.getInstance();
                if (minecraft.player != null && minecraft.level != null) {
                    minecraft.level.playSound(minecraft.player,
                            minecraft.player.getX(), minecraft.player.getY(), minecraft.player.getZ(),
                            SoundEvents.ITEM_BREAK, SoundSource.PLAYERS, 1.0F, 1.0F);
                }
                return ItemStack.EMPTY;
            }
        return remainder;
    }

    public static final ToolMaterial KNIFE_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            250,
            1.0f,
            1.0f,
            15,
            ItemTags.IRON_TOOL_MATERIALS
    );
}
