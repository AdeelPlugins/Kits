package me.adeel.kits.events;

import jdk.nashorn.internal.ir.Block;
import me.adeel.kits.main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

import javax.swing.*;

public class ikitkeys implements Listener {
    private Plugin plugin = main.getPlugin(main.class);

    @EventHandler
    public void onRedeem (PlayerInteractEvent event){

        if (event.getItem() == null){
            return;
        }
        if (event.getItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Miner Immortal Kit Key")){
            Player player = event.getPlayer();

            player.sendMessage("HI!");
        }
    }
}
