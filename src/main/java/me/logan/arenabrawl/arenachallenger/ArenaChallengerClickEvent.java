package me.logan.arenabrawl.arenachallenger;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class ArenaChallengerClickEvent implements Listener {
    @EventHandler
    public void arenaChallengerClickEvent(PlayerInteractEntityEvent event) {
        if(event.getRightClicked().getCustomName() == null) return;
        if(!( event.getRightClicked().getCustomName().equals(ChatColor.AQUA + "Arena Challenger"))) return;

        event.getPlayer().openInventory(new ArenaChallengerGui().arenaChallengerGui());
    }
}
