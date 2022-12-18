package cz.adamk.admin;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class join implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String nick = event.getPlayer().getDisplayName();
        event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&cSystém &8| &f" + nick + "&f se připojil"));
    }
}
