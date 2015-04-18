package com.bradendustin.BDKitPvP.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.bradendustin.BDKitPvP.Main;

public class Reset implements CommandExecutor{
	public Main plugin;
	public Reset(Main instance){
		plugin = instance;
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("Reset")){
			Player p = (Player) sender;
			
			p.sendMessage(ChatColor.RED + "Are you sure you want to do this? This will remove access to all of your kits. Type /reset confirm to confirm your reset.");
			
			if (args[0].equalsIgnoreCase("confirm")) {
				
				Bukkit.dispatchCommand(p , "manudelp" + p.getName() + "level2kits.use");
				Bukkit.dispatchCommand(p , "manudelp" + " " + p.getName() + " " + "level3kits.use");
				Bukkit.dispatchCommand(p , "manudelp" + " " + p.getName() + " " + "level4kits.use");
				Bukkit.dispatchCommand(p , "manudelp" + " " + p.getName() + " " + "level5kits.use");
			}	
		}
		return false;
	}

	
	
	
}
