package me.logan.arenabrawl.globaldata;

import me.logan.arenabrawl.playerlobby.PlayerLobbyObject;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OnlinePlayerData {
    private static final OnlinePlayerData instance = new OnlinePlayerData();
    private final Map<UUID, PlayerLobbyObject> players;

    private OnlinePlayerData() {
        players = new HashMap<>();
    }

    public static synchronized OnlinePlayerData getInstance() {
        return instance;
    }

    public synchronized void addPlayer(UUID uuid, PlayerLobbyObject playerData) {
        players.put(uuid, playerData);
    }

    public synchronized PlayerLobbyObject getPlayerLobbyData(UUID uuid) {
        return players.get(uuid);
    }

    public synchronized void removePlayerData(UUID uuid) {
        players.remove(uuid);
    }
}

/*
Learnings -

The synchronized keyword is a good practice to allow for situations in which multi-threading may be apparent.
By using this keyword we avoid multiple threads running the code which could cause corruption or incorrect data.

In general it's good practice to make sure your code is thread safe from the start even if there are no multi-thread
plans
 */