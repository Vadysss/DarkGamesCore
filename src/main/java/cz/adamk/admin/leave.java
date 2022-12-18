package cz.adamk.admin;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class leave implements Listener {
    @EventHandler
    public void onQuitJoin(PlayerQuitEvent event) {
        String nick = event.getPlayer().getDisplayName();
        event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&cSystém &8| &f" + nick + "&f se odpojil"));

    }
}
