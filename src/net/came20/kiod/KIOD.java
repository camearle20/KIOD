package net.came20.kiod;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by cameronearle on 12/21/16.
 */
public class KIOD extends JavaPlugin {
    private static Plugin plugin;
    Logger logger;


    public static Plugin getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        logger = Bukkit.getLogger();
        Bukkit.getServer().getPluginManager().registerEvents(new KIODListeners(), this);
        logger.log(Level.INFO, "KIOD is loaded and ready!");
    }

    @Override
    public void onDisable() {
        plugin = null;
    }
}
