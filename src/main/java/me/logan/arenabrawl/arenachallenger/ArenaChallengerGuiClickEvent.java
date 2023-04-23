package me.logan.arenabrawl.arenachallenger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ArenaChallengerGuiClickEvent implements Listener {
    @EventHandler
    public void onArenaChallengerClickEvent(InventoryClickEvent event) {
        if(event.getClickedInventory() == null) return;
        if(!(event.getClickedInventory().getHolder() instanceof ArenaChallengerHolder)) return;
        if(event.getCurrentItem() == null) return;

        event.setCancelled(true);

    }
}
