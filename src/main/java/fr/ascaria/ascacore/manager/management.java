package fr.ascaria.ascacore.manager;

import org.bukkit.Bukkit;

public class management {

    public static void load() {
        Bukkit.getConsoleSender().sendMessage("-* Ascaria OneBlock");
        // call listener
        register.registerListener();
    }

    public static void unLoad() {
        Bukkit.getConsoleSender().sendMessage("-* Ascaria OneBlock");
    }


}
