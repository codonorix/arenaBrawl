package me.logan.arenabrawl.playerlobby.events;

import me.logan.arenabrawl.globaldata.OnlinePlayerData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLobbyDisconectEvent implements Listener {
    @EventHandler
    public void playerLobbyDisconnectEvent(PlayerQuitEvent event) {
        OnlinePlayerData.getInstance().removePlayerData(event.getPlayer().getUniqueId());
    }
}
