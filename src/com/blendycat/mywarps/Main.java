package com.blendycat.mywarps;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.blendycat.mywarps.commands.CommandSetwarp;
import com.blendycat.mywarps.commands.CommandWarp;

public class Main extends JavaPlugin{
	private FileConfiguration cfg;
	
	@Override
	public void onEnable(){
		getLogger().info("MyWarps v1.0 Enabled");
		cfg = getConfig();
		cfg.addDefault("Version", 1.0);
		cfg.options().copyDefaults(true);
		getCommand("setwarp").setExecutor(new CommandSetwarp((Plugin) this));
		getCommand("warp").setExecutor(new CommandWarp((Plugin) this));
	}
	
	@Override
	public void onDisable(){
		getLogger().info("MyWarps 1.0 Disabled");
		saveConfig();
	}
}
