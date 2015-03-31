package com.bradendustin.BDKitPvP.level2kits;

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

public class Tank implements CommandExecutor {

	public Main plugin;
	public Tank(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
			Player p = (Player) sender;
			if(cmd.getLabel().equalsIgnoreCase("Tank")){
				if(p.hasPermission("level2kits.use")){
				if(!plugin.Tank.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Tank.add(p.getName());
					plugin.kitused.add(p.getName());
					p.getInventory().clear();
					p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
					p.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
	                for(int i = 0; i<25; i++)
	            	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 2));
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

