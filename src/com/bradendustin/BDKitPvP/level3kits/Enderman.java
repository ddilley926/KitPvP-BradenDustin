package com.bradendustin.BDKitPvP.level3kits;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import com.bradendustin.BDKitPvP.Main;

public class Enderman implements CommandExecutor{
	
	 public Main plugin;
	 public Enderman(Main instance){
	  plugin = instance;
	 }
	@Override
	 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
	   String[] args) {
	  Player p = (Player) sender;
	  if(cmd.getLabel().equalsIgnoreCase("Enderman")){
	

		  if(p.hasPermission("level2kits.use")){
		  if(!plugin.Enderman.contains(p.getName())){
	   if(!plugin.kitused.contains(p.getName())){
	   
		   plugin.Enderman.add(p.getName());
	    plugin.kitused.add(p.getName());
	    p.sendMessage(ChatColor.RED + "You have recieved the Enderman kit!");
	    p.getInventory().clear();
	    
	    ItemStack Helmet = new ItemStack(Material.LEATHER_HELMET);
	    LeatherArmorMeta HMeta = (LeatherArmorMeta) Helmet.getItemMeta();
	    HMeta.setColor(Color.BLACK);
	    Helmet.setItemMeta(HMeta);
	    
	    
	    ItemStack Chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
	    LeatherArmorMeta CMeta = (LeatherArmorMeta) Chestplate.getItemMeta();
	    CMeta.setColor(Color.BLACK);
	    Chestplate.setItemMeta(CMeta);
	    
	    ItemStack Leggings = new ItemStack(Material.LEATHER_LEGGINGS);
	    LeatherArmorMeta LMeta = (LeatherArmorMeta) Leggings.getItemMeta();
	    LMeta.setColor(Color.BLACK);
        Leggings.setItemMeta(LMeta);
	    
	    ItemStack Boots = new ItemStack(Material.LEATHER_BOOTS);
	    LeatherArmorMeta BMeta = (LeatherArmorMeta) Boots.getItemMeta();
	    BMeta.setColor(Color.BLACK);
	    Boots.setItemMeta(BMeta);
	    
	
	    
	    
	    p.getInventory().clear();
	    p.getInventory().setHelmet(Helmet);
	    p.getInventory().setChestplate(Chestplate);
	    p.getInventory().setLeggings(Leggings);
	    p.getInventory().setBoots(Boots);
	    
      ItemStack EnderSword = new ItemStack(Material.IRON_SWORD);
      EnderSword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
	    
	  ItemStack Enderpearls = new ItemStack(Material.ENDER_PEARL, 8);
	  p.getInventory().addItem(EnderSword);
	  p.getInventory().addItem(Enderpearls);
      p.getInventory().addItem(Enderpearls);
      p.getInventory().addItem(Enderpearls);
      p.getInventory().addItem(Enderpearls);
	    
	    for(int i = 0; i<25; i++)
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	 
	   
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
