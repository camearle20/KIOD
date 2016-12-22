package net.came20.kiod;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

/**
 * Created by cameronearle on 12/21/16.
 */
public class KIODListeners implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        if (e.getEntity().getKiller() instanceof Player) {
            e.setKeepInventory(true);
            e.setKeepLevel(true);
            e.setDroppedExp(0);
            String playerName = e.getEntity().getDisplayName();
            String killerName = e.getEntity().getKiller().getDisplayName();
            e.getEntity().sendMessage("[came20's Missing Soul] Don't worry " + playerName + ", " + killerName + " won't be getting your things today!");
            e.getEntity().getKiller().sendMessage("[came20's Missing Soul] " + killerName + ", you blithering idiot!  Why would you kill my good chum " + playerName + "?!");
        }
    }
}
