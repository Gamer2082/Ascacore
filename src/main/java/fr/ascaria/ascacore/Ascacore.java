package fr.ascaria.ascacore;

import fr.ascaria.ascacore.command.*;
import fr.ascaria.ascacore.manager.management;
import fr.ascaria.ascacore.manager.register;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ascacore extends JavaPlugin {
    public static Ascacore instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        management.load();
        instance = this;

        // call listener
        register.registerListener();
        // call command
        getCommand("tuto").setExecutor(new commandTutoExecutor());
        // getCommand("chat").setExecutor(new commandChatExecutor());
        getCommand("testASOM").setExecutor(new commandTestExecutor());
        getCommand("spawn").setExecutor(new commandSpawnExecutor());
        getCommand("rstaff").setExecutor(new commandRstaffExecutor());
        getCommand("arene").setExecutor(new newcommandAreneExecutor());
        getCommand("s").setExecutor(new commandShopExecutor());
        getCommand("discord").setExecutor(new commandDiscordExecutor());
        getCommand("vote").setExecutor(new commandVoteExecutor());
        getCommand("boutique").setExecutor(new commandBoutiqueExecutor());
        getCommand("menu").setExecutor(new commandMenuExecutor());
        getCommand("site").setExecutor(new CommandSiteExecutor());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        management.unLoad();
    }
}
