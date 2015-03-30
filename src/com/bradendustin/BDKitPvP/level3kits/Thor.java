package com.bradendustin.BDKitPvP.level3kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.bradendustin.BDKitPvP.Main;

public class Thor implements CommandExecutor{
	
	 public Main plugin;
	 public Thor(Main instance){
	  plugin = instance;
	 }
	@Override
	 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
	   String[] args) {
	  Player p = (Player) sender;
	  if(cmd.getLabel().equalsIgnoreCase("Thor")){
	

		  if(p.hasPermission("level3kits.use")){
		  if(!plugin.Thor.contains(p.getName())){
	   if(!plugin.kitused.contains(p.getName())){
	   
		   plugin.Thor.add(p.getName());
	    plugin.kitused.add(p.getName());
	    p.sendMessage(ChatColor.RED + "You have recieved the Thor kit!");
	    p.getInventory().clear();	    
	    ItemStack Wand = new ItemStack(Material.IRON_AXE);
	    ItemMeta WandMeta = Wand.getItemMeta();
	    WandMeta.setDisplayName(ChatColor.RED + "Thor's Hammer. Everytime you get a kill, this special hammer gives you more strengh!");
	    Wand.setItemMeta(WandMeta);
	   
	    p.getInventory().clear();
	    p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
	    p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
	    p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
	    p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
	    p.getInventory().addItem(Wand);
	    for(int i = 0; i<25; i++)
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
	    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
	   
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
