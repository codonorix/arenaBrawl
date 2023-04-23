package me.logan.arenabrawl.arenachallenger;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

public class ArenaChallengerNpc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        spawnNpc(player.getWorld(), player);

        return false;
    }

    private void spawnNpc(World world, Player player) {
        Villager display = (Villager) world.spawnEntity(player.getLocation(), EntityType.VILLAGER);
        display.setAI(false);
        display.shakeHead();
        display.setCustomName(ChatColor.AQUA + "Arena Challenger");
        display.setCustomNameVisible(true);
    }
}
