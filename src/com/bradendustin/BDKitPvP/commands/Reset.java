package com.bradendustin.BDKitPvP.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Reset implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("Reset")){
			Player p = (Player) sender;
			
			p.sendMessage(ChatColor.RED + "Are you sure you want to do this? This will remove access to all of your kits. Type /reset confirm to confirm your reset.");
			
			if(cmd.getName().equalsIgnoreCase("reset" + "confirm")){
				Bukkit.dispatchCommand(p , "manuadd" + p.getName() + "default");
		
			}	
		}
		return false;
	}

	
	
	
}
