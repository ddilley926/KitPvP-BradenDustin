package com.bradendustin.BDKitPvP.level4kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.bradendustin.BDKitPvP.Main;

public class ExplosiveArcher implements CommandExecutor {

	public Main plugin;
	public ExplosiveArcher(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
			Player p = (Player) sender;
			if(cmd.getLabel().equalsIgnoreCase("ExplosiveArcher")){
				if(p.hasPermission("level4kits.use")){
				if(!plugin.ExplosiveArcher.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.ExplosiveArcher.add(p.getName());
					plugin.kitused.add(p.getName());
					p.getInventory().clear();
					p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
					p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
					p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
					p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
					p.getInventory().addItem(new ItemStack(Material.WOOD_SWORD));
					
					ItemStack Bow = new ItemStack(Material.BOW);
					Bow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
					Bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
					Bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
					ItemMeta BowMeta = Bow.getItemMeta();
					BowMeta.setDisplayName(ChatColor.RED + "Fire Arrows That EXPLODE!");
					Bow.setItemMeta(BowMeta);
					
					p.getInventory().addItem(Bow);
	                
	                for(int i = 0; i<25; i++)
	            	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));

				}else{
					p.sendMessage(ChatColor.RED + "You haven't unlocked this kit!");
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

