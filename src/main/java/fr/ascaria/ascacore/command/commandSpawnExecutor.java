package fr.ascaria.ascacore.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandSpawnExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage("Cette command n'est disponnible qu'en jeu");
        }else{
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GREEN+"Teleportation");
            Location spawn = new Location(Bukkit.getWorld("world"), -135.48f, 30.00f, 184.93f, -719.85f, 6.00f);
            player.teleport(spawn);
        }

        return true;
    }
}
