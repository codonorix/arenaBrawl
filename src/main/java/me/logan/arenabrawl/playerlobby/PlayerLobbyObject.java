package me.logan.arenabrawl.playerlobby;

import org.bukkit.entity.Player;

public class PlayerLobbyObject {
    Player player;
    int coins;
    int winStreak;
    int magicKeys;

    public PlayerLobbyObject(Player player, int coins, int winStreak, int magicKeys) {
        this.player = player;
        this.coins = coins;
        this.winStreak = winStreak;
        this.magicKeys = magicKeys;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getWinStreak() {
        return winStreak;
    }

    public void setWinStreak(int winStreak) {
        this.winStreak = winStreak;
    }

    public int getMagicKeys() {
        return magicKeys;
    }

    public void setMagicKeys(int magicKeys) {
        this.magicKeys = magicKeys;
    }
}
