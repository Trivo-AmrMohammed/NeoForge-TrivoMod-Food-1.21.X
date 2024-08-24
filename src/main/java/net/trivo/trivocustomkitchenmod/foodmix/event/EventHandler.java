package net.trivo.trivocustomkitchenmod.foodmix.event;

import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.trivo.trivocustomkitchenmod.foodmix.TrivoCustomKitchenMod;

@EventBusSubscriber(modid = TrivoCustomKitchenMod.MODID)
public class EventHandler {
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();

            if (player.getY() > 270) {
            player.setDeltaMovement(player.getDeltaMovement().x, player.getDeltaMovement().y * 0.8, player.getDeltaMovement().z);
        }
    }
}