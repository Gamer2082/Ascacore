package fr.ascaria.ascacore.command;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class commandMenuExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage("Viens in game pour cette command");
            return true;
        }
        Player player = (Player) sender;
        String playerNamer = player.getName();
        // menu containt
        Inventory menu = Bukkit.createInventory(null,27,"Menu");
        ItemStack warps = new ItemStack(Material.COMPASS);
        //customise warps
        ItemMeta mWarps = warps.getItemMeta();
        mWarps.setDisplayName("Warp");
        warps.setItemMeta(mWarps);
        menu.setItem(15,warps);

        /*
            Warps list
             Arene
             Spawn
             ...
        */

        // Warp containt
        Inventory warpList = Bukkit.createInventory(null,9,"Menu - Warps");
        // arene warp
        ItemStack arene = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta mArene = arene.getItemMeta();
        mArene.setDisplayName("Arene");
        arene.setItemMeta(mArene);
        warpList.setItem(11,arene);
        // spawn warp
        ItemStack spawn = new ItemStack(Material.ENDER_PEARL);
        ItemMeta mSpawn = spawn.getItemMeta();
        mSpawn.setDisplayName("Spawn");
        spawn.setItemMeta(mSpawn);
        warpList.setItem(13,spawn);

        



        player.openInventory(menu);
        return true;
    }
}
