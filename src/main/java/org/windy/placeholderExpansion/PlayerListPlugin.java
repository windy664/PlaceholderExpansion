package org.windy.placeholderExpansion;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new PlayerListExpansion().register();
        } else {
            getLogger().severe("找不到PlaceholderAPI插件！此插件是必需的。");
            getServer().getPluginManager().disablePlugin(this);
        }
    }
}

