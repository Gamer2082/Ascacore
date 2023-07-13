package fr.ascaria.ascacore.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class interactListener implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        Action action = e.getAction();
        ItemStack it = e.getItem();
        Inventory iv = e.getPlayer().getInventory();
        if (it != null){

        }

    }
}
