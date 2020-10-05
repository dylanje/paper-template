package com.dylanensor.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
    }
}
