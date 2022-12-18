package cz.adamk.admin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Admin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new join(), this);
        getServer().getPluginManager().registerEvents(new leave(), this);
        this.getCommand("tiktok").setExecutor(new tiktok());
        this.getCommand("instagram").setExecutor(new instagram());
        this.getCommand("web").setExecutor(new web());
        this.getCommand("discord").setExecutor(new discord());
        getLogger().info("Admin plugin start");

    }

    @Override
    public void onDisable() {
        getLogger().info("Admin plugin start");
    }
}
