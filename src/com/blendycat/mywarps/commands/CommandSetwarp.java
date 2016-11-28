package com.blendycat.mywarps.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CommandSetwarp implements CommandExecutor{
	FileConfiguration fig;
	
	public CommandSetwarp(Plugin main){
		fig = main.getConfig();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		if(command.getName().equalsIgnoreCase("setwarp")){
			if(sender instanceof Player){
				Player player = (Player) sender;
				if(args.length==1){
					Location pos = player.getLocation();
					fig.set(args[0].toLowerCase(), (Object) pos);
					player.sendMessage(ChatColor.GOLD+"Warp \'" + args[0].toLowerCase() + "\' set!");
				}else player.sendMessage(ChatColor.RED+"Invalid arguments!");
			}else sender.sendMessage("Error: this command must be sent from a player!");
			return true;
		}
		return false;
	}
	
}
