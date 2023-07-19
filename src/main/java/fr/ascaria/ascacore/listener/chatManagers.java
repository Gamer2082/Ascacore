package fr.ascaria.ascacore.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatManagers implements Listener {
    @EventHandler
    public static void chatManagers(AsyncPlayerChatEvent e){
        e.setCancelled(true);
        Player player = e.getPlayer();
        if (e.getMessage().startsWith("$")){
            e.setCancelled(
                    true
            );
            return;
        }
        for(Player players : Bukkit.getOnlinePlayers()){

            players.sendMessage(ChatColor.BLUE+"["+player.getName()+"]: "+ChatColor.WHITE+ e.getMessage());
        }
        Bukkit.getConsoleSender().sendMessage("ChatManagers : "+player.getName() + " : " + e.getMessage());
    }
}
