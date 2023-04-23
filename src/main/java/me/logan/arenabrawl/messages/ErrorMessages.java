package me.logan.arenabrawl.messages;

import org.bukkit.ChatColor;

public enum ErrorMessages {
    NO_PERMISSION_ADMIN(ChatColor.RED + "✖ " + ChatColor.WHITE + "You must be an " + ChatColor.RED + " ADMIN " + ChatColor.WHITE + " to use this command."),
    ;

    private final String value;

    private ErrorMessages(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
