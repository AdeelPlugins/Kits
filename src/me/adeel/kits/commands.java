package me.adeel.kits;

import me.adeel.kits.items.minerkey;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class commands implements Listener,CommandExecutor {

    public String cmd1 = "ikit";
    public String cmd2 = "mkeygive";

    private minerkey mmkey = new minerkey();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;

            if (cmd.getName().equalsIgnoreCase(cmd1)){
                ikit immokit = new ikit();
                immokit.iKit(player);
            }
            if (cmd.getName().equalsIgnoreCase(cmd2)) {
                mmkey.minerkitkey(player);
            }
        }else {
            sender.sendMessage(ChatColor.RED + "Only a player can use this command!");
            return true;
        }
        return false;
    }
}
