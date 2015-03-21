package com.bradendustin.BDKitPvP.defaultkits;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Archer implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("Archer")){
			Player p = (Player) sender;
			 p.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
			
			
			
			
		}
		return false;
	}
}
