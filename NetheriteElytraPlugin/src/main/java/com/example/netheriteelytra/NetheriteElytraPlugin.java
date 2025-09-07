package com.example.netheriteelytra;

import org.bukkit.plugin.java.JavaPlugin;

public class NetheriteElytraPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Netherite Elytra Plugin enabled!");
        ItemManager.init();
    }

    @Override
    public void onDisable() {
        getLogger().info("Netherite Elytra Plugin disabled!");
    }
}
