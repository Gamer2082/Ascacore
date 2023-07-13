package fr.ascaria.ascacore.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandChatExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage("only Player");
            return
                    false;
        }
        Player player = (Player) sender;
        if (args.length == 0){
            player.sendMessage("Chat [off - report (player) - on - staff (message) / tempBan (player)]");

            return false;
        }
        if (label.equalsIgnoreCase("on")){


        }
        return true;
    }
}
