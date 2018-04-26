package me.adeel.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class ikit implements Listener {
    private Plugin plugin = main.getPlugin(main.class);

    public void iKit (Player player){
        Inventory immokit = plugin.getServer().createInventory(null, 18, ChatColor.BLUE + "iKits");

        ItemStack glass1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 14);
        ItemMeta glassmeta = glass1.getItemMeta();
        glassmeta.setDisplayName("`");
        glass1.setItemMeta(glassmeta);

        ItemStack miner = new ItemStack(Material.CHEST, 1);
        ItemMeta minerMeta = miner.getItemMeta();
        minerMeta.setDisplayName(ChatColor.RED + "Miner Immortal Kit");
        miner.setItemMeta(minerMeta);

        immokit.setItem(0, glass1);
        immokit.setItem(8, glass1);
        immokit.setItem(9, glass1);
        immokit.setItem(17, glass1);
        immokit.setItem(2, miner);

        player.openInventory(immokit);
    }
}