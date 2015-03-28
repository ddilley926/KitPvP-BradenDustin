package com.bradendustin.BDKitPvP.defaultkits;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.bradendustin.BDKitPvP.Main;

public class Flash implements CommandExecutor{
	
	 public Main plugin;
	 public Flash(Main instance){
	  plugin = instance;
	 }
	@Override
	 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
	   String[] args) {
	  Player p = (Player) sender;
	  if(cmd.getLabel().equalsIgnoreCase("Flash")){
	

		  if(p.hasPermission("level2kits.use")){
		  if(!plugin.Flash.contains(p.getName())){
	   if(!plugin.kitused.contains(p.getName())){
	   
		   plugin.Flash.add(p.getName());
	    plugin.kitused.add(p.getName());
	    p.sendMessage(ChatColor.RED + "You have recieved the Flash kit!");
	    p.getInventory().clear();
	    
	    ItemStack Helmet = new ItemStack(Material.LEATHER_HELMET);
	    LeatherArmorMeta HMeta = (LeatherArmorMeta) Helmet.getItemMeta();
	    HMeta.setColor(Color.RED);
	    Helmet.setItemMeta(HMeta);
	    
	    
	    ItemStack Chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
	    LeatherArmorMeta CMeta = (LeatherArmorMeta) Chestplate.getItemMeta();
	    CMeta.setColor(Color.RED);
	    Chestplate.setItemMeta(CMeta);
	    
	    ItemStack Leggings = new ItemStack(Material.LEATHER_LEGGINGS);
	    LeatherArmorMeta LMeta = (LeatherArmorMeta) Leggings.getItemMeta();
	    LMeta.setColor(Color.RED);
        Leggings.setItemMeta(LMeta);
	    
	    ItemStack Boots = new ItemStack(Material.LEATHER_BOOTS);
	    LeatherArmorMeta BMeta = (LeatherArmorMeta) Boots.getItemMeta();
	    BMeta.setColor(Color.RED);
	    Boots.setItemMeta(BMeta);
	    
	    p.getInventory().clear();
	    p.getInventory().setHelmet(Helmet);
	    p.getInventory().setChestplate(Chestplate);
	    p.getInventory().setLeggings(Leggings);
	    p.getInventory().setBoots(Boots);
	    
	    p.getInventory().addItem(new ItemStack(Material.GOLD_SWORD));
	    
	    for(int i = 0; i<25; i++)
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 4));
	 
	   
	   }else{
		   p.sendMessage(ChatColor.RED + "You haven't unlocked this kit!");
	   }
	   
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
