package com.bradendustin.BDKitPvP.level4kits;

import com.bradendustin.BDKitPvP.*;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Shadow implements CommandExecutor {

	public Main plugin;
	public Shadow(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
			Player p = (Player) sender;
			if(cmd.getLabel().equalsIgnoreCase("Shadow")){
				if(p.hasPermission("level4kits.use")){
				if(!plugin.Shadow.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Shadow.add(p.getName());
					plugin.kitused.add(p.getName());
					p.getInventory().clear();
	                for(int i = 0; i<25; i++)
	            	
	                p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 2));
				}else{
					p.sendMessage(ChatColor.RED + "You haven't unlocked this kit.");
				}
	                
			}else{
				p.sendMessage(ChatColor.RED + "You already have a kit!");
			}
			return false;
		
			}else{
				p.sendMessage(ChatColor.RED + "You already have a kit!");
			}
		}
			return false;

		}
	}

