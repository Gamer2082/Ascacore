package fr.ascaria.ascacore.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class newcommandAreneExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage("Vient en jeu pour cette commande");
            return true;
        }

        Player player = (Player) sender;
        Location warzone = new Location(Bukkit.getWorld("adventure"), 699.30 ,63.00 ,312.85 ,182.70f ,13.95f);
        player.sendMessage(ChatColor.GREEN + "Teleportation");
        player.teleport(warzone);

        return true;
    }


}
