package me.logan.arenabrawl.arenachallenger;

import me.logan.arenabrawl.ArenaBrawl;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

public class ArenaChallengerGui {
    /*
    [!] LAST WORKING ON [!]
    Adding an event listiner to the arena challenger GUI to stop items being taken out.
     */
    public Inventory arenaChallengerGui() {
        Inventory inventory = Bukkit.createInventory(new ArenaChallengerHolder(), 9*2, ChatColor.AQUA + "Arena Challenger");

        inventory.setItem(1,winStreakItem(2, 2, ChatColor.GOLD + "Receive 100 coins", "winStreakOne"));
        inventory.setItem(3, winStreakItem(4, 4, ChatColor.GOLD + "Receive 250 coins", "winStreakTwo"));
        inventory.setItem(5, winStreakItem(6, 6, ChatColor.AQUA + "Receive 1 key", "winStreakThree"));
        inventory.setItem(7, winStreakItem(10, 10, ChatColor.AQUA + "Receive 3 keys", "winStreakFour"));

        inventory.setItem(11, buyMagicKeys(1, 500, "magicKeyOne"));
        inventory.setItem(13, buyMagicKeys(10, 4750, "magicKeyTwo"));
        inventory.setItem(15, buyMagicKeys(100, 45000, "magicKeyThree"));

        return inventory;
    }

    private ItemStack winStreakItem(int stackAmt, int winStreakAmt, String reward, String itemId) {
        ItemStack itemStack = new ItemStack(Material.BLAZE_POWDER, stackAmt);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName(ChatColor.GOLD + String.valueOf(winStreakAmt) + " " + ChatColor.WHITE + " win streak");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(reward);
        itemMeta.setLore(lore);

        NamespacedKey namespacedKey = new NamespacedKey(ArenaBrawl.getArenaBrawl(), "arenachallengershop");
        itemMeta.getPersistentDataContainer().set(namespacedKey, PersistentDataType.STRING, itemId);

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    private ItemStack buyMagicKeys(int stackAmt, int price, String itemId) {
        ItemStack itemStack = new ItemStack(Material.DIAMOND_SHOVEL, stackAmt);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName(ChatColor.AQUA + String.valueOf(stackAmt) + " Magic keys");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD +  String.valueOf(price) + " coins");
        itemMeta.setLore(lore);

        NamespacedKey namespacedKey = new NamespacedKey(ArenaBrawl.getArenaBrawl(), "arenachallengershop");
        itemMeta.getPersistentDataContainer().set(namespacedKey, PersistentDataType.STRING, itemId);

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
}
