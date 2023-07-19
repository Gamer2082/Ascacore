package fr.ascaria.ascacore.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class modReciever implements Listener {
    @EventHandler
    public static void onReceive(AsyncPlayerChatEvent e){
        Player player = e.getPlayer();
        String mess = e.getMessage();
        if (mess.startsWith("$")){
            e.setCancelled(true);
            for (Player players : Bukkit.getOnlinePlayers()){
                if(player.hasPermission("mod.receive")){
                    player.sendMessage(ChatColor.GREEN+"STAFF CHAT --> " + ChatColor.BLUE + player.getName() + ": " + ChatColor.WHITE + mess);
                }
            }
            Bukkit.getConsoleSender().sendMessage("ModChatManagers : "+player.getName() + " : " + e.getMessage());
        }




    }
}
