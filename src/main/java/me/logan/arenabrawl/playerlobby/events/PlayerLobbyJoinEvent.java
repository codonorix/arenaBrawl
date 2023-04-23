package me.logan.arenabrawl.playerlobby.events;

import me.logan.arenabrawl.playerlobby.PlayerLobbyObject;
import me.logan.arenabrawl.globaldata.OnlinePlayerData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class PlayerLobbyJoinEvent implements Listener {
    @EventHandler
    public void playerLobbyJoinEvent(PlayerJoinEvent event) {
        UUID uuid = event.getPlayer().getUniqueId();
        OnlinePlayerData.getInstance().addPlayer(uuid, new PlayerLobbyObject(event.getPlayer(), 0, 0, 0));
    }
}
