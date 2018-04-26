package me.adeel.kits;

import me.adeel.kits.events.ikitClick;
import me.adeel.kits.events.ikitkeys;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    private commands commands = new commands();

    public void onEnable() {
        getCommand(commands.cmd1).setExecutor(commands);
        getServer().getPluginManager().registerEvents(new ikitClick(), this);
        getServer().getPluginManager().registerEvents(new ikitkeys(), this);
        getServer().getConsoleSender().sendMessage("Kits Enabled");
        loadConfig();

    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage("Kits Disabled");
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
