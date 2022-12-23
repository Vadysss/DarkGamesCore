package cz.adamk.admin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vote implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        String nick = player.getPlayer().getDisplayName();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cVote &8| &7Hlasuj za náš server na: &chttps://craftlist.org/rajce?nickname=" + nick));
        return false;
    }
}