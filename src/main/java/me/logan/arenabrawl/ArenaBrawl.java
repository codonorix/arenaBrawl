package me.logan.arenabrawl;

import me.logan.arenabrawl.arenachallenger.ArenaChallengerClickEvent;
import me.logan.arenabrawl.arenachallenger.ArenaChallengerGuiClickEvent;
import me.logan.arenabrawl.arenachallenger.ArenaChallengerNpc;
import me.logan.arenabrawl.playerlobby.events.PlayerLobbyDisconectEvent;
import me.logan.arenabrawl.playerlobby.events.PlayerLobbyJoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArenaBrawl extends JavaPlugin {
    private static ArenaBrawl arenaBrawl;
    @Override
    public void onEnable() {
        arenaBrawl = this;
        // Plugin startup logic
        this.getCommand("spawnChallanger").setExecutor(new ArenaChallengerNpc());

        getServer().getPluginManager().registerEvents(new ArenaChallengerClickEvent(), this);
        getServer().getPluginManager().registerEvents(new ArenaChallengerGuiClickEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerLobbyJoinEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerLobbyDisconectEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ArenaBrawl getArenaBrawl() {
        return arenaBrawl;
    }
}
