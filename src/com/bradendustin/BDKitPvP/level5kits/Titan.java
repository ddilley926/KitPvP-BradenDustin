package com.bradendustin.BDKitPvP.level5kits;

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

public class Titan implements CommandExecutor {

	public Main plugin;
	public Titan(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
			Player p = (Player) sender;
			if(cmd.getLabel().equalsIgnoreCase("Titan")){
				if(p.hasPermission("level5kits.use")){
				if(!plugin.Titan.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Titan.add(p.getName());
					plugin.kitused.add(p.getName());
					p.getInventory().clear();
					p.getInventory().addItem(new ItemStack(Material.IRON_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
	                for(int i = 0; i<25; i++)
	            	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5));
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

