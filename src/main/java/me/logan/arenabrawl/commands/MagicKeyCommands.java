package me.logan.arenabrawl.commands;

import me.logan.arenabrawl.messages.ErrorMessages;
import me.logan.arenabrawl.permissions.AdminPermissions;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MagicKeyCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) return false;

        Player player = (Player) commandSender;

        if(!(player.hasPermission(AdminPermissions.ADMIN_KEYS.getValue()))) {
            player.sendMessage(ErrorMessages.NO_PERMISSION_ADMIN.getValue());
            return false;
        }


        return false;
    }
}
