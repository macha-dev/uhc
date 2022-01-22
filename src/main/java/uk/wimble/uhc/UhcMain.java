package uk.wimble.uhc;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class UhcMain extends JavaPlugin {

    private static UhcMain plugin;
    FileConfiguration config;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.plugin = this;
        this.config = this.getConfig();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[uhc] Plugin disabled");
    }

}
