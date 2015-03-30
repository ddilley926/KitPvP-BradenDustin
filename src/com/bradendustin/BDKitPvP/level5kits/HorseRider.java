package com.bradendustin.BDKitPvP.level5kits;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.bradendustin.BDKitPvP.Main;

public class HorseRider implements CommandExecutor{
	
	 public Main plugin;
	 public HorseRider(Main instance){
	  plugin = instance;
	 }
	@Override
	 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
	   String[] args) {
	  Player p = (Player) sender;
	  if(cmd.getLabel().equalsIgnoreCase("HorseRider")){
	

		  if(p.hasPermission("level5kits.use")){
		  if(!plugin.HorseRider.contains(p.getName())){
	   if(!plugin.kitused.contains(p.getName())){
	   
		   plugin.HorseRider.add(p.getName());
	    plugin.kitused.add(p.getName());
	    p.sendMessage(ChatColor.RED + "You have recieved the HorseRider kit!");
	    p.getInventory().clear();
	    Horse horse = (Horse) p.getWorld().spawnEntity(p.getLocation(), EntityType.HORSE);
	    horse.setTamed(true);
	    horse.setAdult();
	    horse.setPassenger(p);
	    horse.getInventory().setSaddle(new ItemStack(Material.SADDLE));
	    
	    p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
	    p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS)); 
	    p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
	    p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
	    p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
	    p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
	    
	    
	    for(int i = 0; i<25; i++)
	    p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
		p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
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
