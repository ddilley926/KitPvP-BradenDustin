package com.bradendustin.BDKitPvP.defaultkits;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.bradendustin.BDKitPvP.Main;

public class Knight implements CommandExecutor{
	
	 public Main plugin;
	 public Knight(Main instance){
	  plugin = instance;
	 }
	@Override
	 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
	   String[] args) {
	  Player p = (Player) sender;
	  if(cmd.getLabel().equalsIgnoreCase("Knight")){
	

		  
		  if(!plugin.Knight.contains(p.getName())){
	   if(!plugin.kitused.contains(p.getName())){
	   
		   plugin.Knight.add(p.getName());
	    plugin.kitused.add(p.getName());
	    p.getInventory().clear();
	    p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
	    p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS)); 
	    p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
	    p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
	    p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
	    p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));

		p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
	    
	   }else{
	    p.sendMessage(ChatColor.RED + "You already have a kit!");
	   }
	  }else{
	   p.sendMessage(ChatColor.RED + "You already have a kit!");
	  }
	 }
	  return false;
	
	}
}
