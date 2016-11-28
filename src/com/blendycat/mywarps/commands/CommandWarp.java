package com.blendycat.mywarps.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CommandWarp implements CommandExecutor {
	FileConfiguration fig; 
	
	public CommandWarp(Plugin main){
		fig = main.getConfig();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arg3) {
		if(command.getName().equalsIgnoreCase("warp")){
			if(sender instanceof Player){
				
			}else sender.sendMessage("Error: this command must be sent from a player!");; 
		}
		return false;
	}

}
