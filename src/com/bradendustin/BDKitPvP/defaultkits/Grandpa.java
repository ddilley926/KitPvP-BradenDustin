package com.bradendustin.BDKitPvP.defaultkits;

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

public class Grandpa implements CommandExecutor {

	public Main plugin;
	public Grandpa(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
			Player p = (Player) sender;
			if(cmd.getLabel().equalsIgnoreCase("Grandpa")){
				if(!plugin.Grandpa.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Grandpa.add(p.getName());
					plugin.kitused.add(p.getName());
					p.getInventory().clear();
					p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
					p.getInventory().addItem(new ItemStack(Material.WOOD_SWORD));
					ItemStack Cane = new ItemStack(Material.STICK);
					Cane.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
					Cane.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
	                p.getInventory().addItem(Cane);
	                for(int i = 0; i<25; i++)
	            	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, 1));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
		
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

