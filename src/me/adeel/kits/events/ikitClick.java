package me.adeel.kits.events;

import me.adeel.kits.main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ikitClick implements Listener {
    private Plugin plugin = main.getPlugin(main.class);

    @EventHandler
    public void ikitClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        ClickType click = event.getClick();
        Inventory open = event.getClickedInventory();
        ItemStack item = event.getCurrentItem();

        if (open == null){
            return;
        }
        if (open.getName().equals(ChatColor.BLUE + "iKits")){

            event.setCancelled(true);

            if (item == null || !item.hasItemMeta()){
                return;
            }
            if (item.getItemMeta().getDisplayName().equals(ChatColor.RED + "Miner Immortal Kit")){

            }
        }
    }
}
