package com.bradendustin.BDKitPvP.donatorkits;

import com.bradendustin.BDKitPvP.*;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Demon implements CommandExecutor {

	public Main plugin;
	public Demon(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
			Player p = (Player) sender;
			if(cmd.getLabel().equalsIgnoreCase("Demon")){
				if(p.hasPermission("Demon.donation")){
				if(!plugin.Demon.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Demon.add(p.getName());
					plugin.kitused.add(p.getName());
					p.getInventory().clear();
					p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
					p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
					ItemStack Bow = new ItemStack(Material.BOW);
					Bow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
					Bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
					Bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
	                p.getInventory().addItem(Bow);
	                for(int i = 0; i<25; i++)
	            	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
				}else{
					p.sendMessage(ChatColor.RED + "You either already have a kit or haven't donated for this one!");
				}
			}else{
				p.sendMessage(ChatColor.RED + "You either already have a kit or haven't donated for this one!");
			}
			return false;
		
			}else{
				p.sendMessage(ChatColor.RED + "You either already have a kit or haven't donated for this one!");
			}
		}
			return false;

		}
	}

