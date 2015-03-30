package com.bradendustin.BDKitPvP.level2kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import com.bradendustin.BDKitPvP.Main;

public class Chemist implements CommandExecutor {

	public Main plugin;
	public Chemist(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
			Player p = (Player) sender;
			if(cmd.getLabel().equalsIgnoreCase("Chemist")){
				if(p.hasPermission("level2kits.use")){
				if(!plugin.Chemist.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Chemist.add(p.getName());
					plugin.kitused.add(p.getName());
					p.getInventory().clear();
					p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
					  
					    Potion strength = new Potion(PotionType.STRENGTH, 1);
					    strength.setSplash(true);
					    Potion speed = new Potion(PotionType.SPEED, 1);
					    speed.setSplash(true);
                   
					    
					    Potion poison = new Potion(PotionType.POISON, 1);
					    poison.setSplash(true);
					    
					    Potion harm = new Potion(PotionType.INSTANT_DAMAGE, 1);
					    harm.setSplash(true);
					    
				   p.getInventory().addItem(strength.toItemStack(1));
                   p.getInventory().addItem(strength.toItemStack(1));
                   p.getInventory().addItem(poison.toItemStack(3));  	
                   p.getInventory().addItem(harm.toItemStack(4));
                   p.getInventory().addItem(harm.toItemStack(4));
                   p.getInventory().addItem(harm.toItemStack(4));  
                   p.getInventory().addItem(speed.toItemStack(1));
	                for(int i = 0; i<25; i++)
	            	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));

				}else{
					p.sendMessage(ChatColor.RED + "You haven't unlocked this kit yet!");
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

