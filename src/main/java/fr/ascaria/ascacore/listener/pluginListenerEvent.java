package fr.ascaria.ascacore.listener;

import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;

public class pluginListenerEvent implements Listener  {


    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();
        String playerName = e.getPlayer().getName();
        


        player.setGameMode(GameMode.SURVIVAL);
        Location spawn = new Location(Bukkit.getWorld("world"), -135.48f, 30.00f, 184.93f, -719.85f, 6.00f);
        player.teleport(spawn);
        String message = (ChatColor.WHITE + "["+ ChatColor.GREEN + "+"+ChatColor.WHITE+ "] " + playerName);
        player.sendMessage(ChatColor.GRAY + "-------------------------------------------");
        player.sendMessage(ChatColor.BLUE + "Bienvenue sur Ascaria One Block");
        player.sendMessage(ChatColor.BLUE + "Connecter entant que " + playerName);
        player.sendMessage(ChatColor.BLUE + "Viens sur discord: /discord ");
        player.sendMessage(ChatColor.BLUE + "/spawn pour aller au spawn: ");
        player.sendMessage(ChatColor.GRAY + "-------------------------------------------");
        e.setJoinMessage(message);
        player.setResourcePack("https://www.curseforge.com/minecraft/texture-packs/better-details-texture-models-pack");
        player.sendTitle(ChatColor.RED +"Ascaria", ChatColor.GREEN +"One BlocK");

    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();
        String playerName = e.getPlayer().getName();
        e.setQuitMessage(ChatColor.WHITE + "["+ ChatColor.RED+ "-"+ChatColor.WHITE+ "] " + playerName);
    }
    @EventHandler
    public void onWorld(PlayerChangedWorldEvent e) {
        Player player = e.getPlayer();
        // player.getInventory().clear();

    }
    @EventHandler
    public void onDeath(PlayerDeathEvent e){
        Entity entity= e.getEntity();
        if (!(entity instanceof Player )){
            return;
        }
        e.setKeepInventory(true);
        e.setNewLevel(0);
        e.setNewExp(0);
        e.setDeathMessage(null);
        Location spawn = new Location(Bukkit.getWorld("world"), -135.48f, 30.00f, 184.93f, -719.85f, 6.00f);
        entity.teleport(spawn);


    }
}
