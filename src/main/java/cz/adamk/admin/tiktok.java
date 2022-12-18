package cz.adamk.admin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tiktok implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cSystém &8| &7TikTok: &chttps://www.tiktok.com/@darkgames"));
        return false;
    }
}