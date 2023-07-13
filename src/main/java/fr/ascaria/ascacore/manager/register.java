package fr.ascaria.ascacore.manager;

import fr.ascaria.ascacore.Ascacore;
import fr.ascaria.ascacore.listener.chatManagers;
import fr.ascaria.ascacore.listener.interactListener;
import fr.ascaria.ascacore.listener.modReciever;
import fr.ascaria.ascacore.listener.pluginListenerEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class register {
    public static PluginManager pluginManager = Bukkit.getPluginManager();
     public static Ascacore main = Ascacore.instance;
    // listener
    public static void registerListener(){

        // call events
        pluginManager.registerEvents(new chatManagers(),main);
        pluginManager.registerEvents(new modReciever(),main);
        pluginManager.registerEvents(new interactListener(),main);
        pluginManager.registerEvents(new pluginListenerEvent() , main);
    }

}
