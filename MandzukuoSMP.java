package com.mandzukuo;

import org.bukkit.plugin.java.JavaPlugin;

public class MandzukuoSMP extends JavaPlugin {

    private static MandzukuoSMP instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("MandzukuoSMP v1.0 został włączony!");
        saveDefaultConfig(); // Tworzy config.yml, jeśli go nie ma

        // TODO: Zarejestruj komendy i eventy tutaj
    }

    @Override
    public void onDisable() {
        getLogger().info("MandzukuoSMP został wyłączony.");
    }

    public static MandzukuoSMP getInstance() {
        return instance;
    }
}
