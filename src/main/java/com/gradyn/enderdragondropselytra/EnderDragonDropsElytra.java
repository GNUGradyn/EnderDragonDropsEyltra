package com.gradyn.enderdragondropselytra;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnderDragonDropsElytra extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EnderDragonListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
