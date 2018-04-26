package me.adeel.kits.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class minerkey implements Listener {

    public void minerkitkey(Player player){
        ItemStack mkey = new ItemStack(Material.TRIPWIRE_HOOK, 1);
        ItemMeta mmeta = mkey.getItemMeta();

        mmeta.setDisplayName(ChatColor.RED + "Miner Immortal Kit Key");
        ArrayList<String> mlore = new ArrayList<String>();
        mlore.add(ChatColor.WHITE + "Right-Click to redeem key.");
        mmeta.setLore(mlore);
        mmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        mkey.setItemMeta(mmeta);

        player.getInventory().addItem(mkey);
    }
}

