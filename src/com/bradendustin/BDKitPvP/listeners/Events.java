package com.bradendustin.BDKitPvP.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.bradendustin.BDKitPvP.Main;

public class Events implements Listener {
	
	
	
	public Main plugin;
	public Events(Main instance){
	plugin = instance;
	}	@EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
            if(player.getItemInHand().getType() == Material.MUSHROOM_SOUP) {
            	double health = ((Damageable)player).getHealth();
                int foodlvl = player.getFoodLevel();
                if(health == 20 && foodlvl >= 13) {
                    player.setFoodLevel(20);
                    player.setItemInHand(new ItemStack(Material.AIR));
                }
                
                else if(health == 20 && foodlvl < 13) {
                    player.setFoodLevel(foodlvl + 7);
                    player.setItemInHand(new ItemStack(Material.AIR));
                }
                
                else {
                    if(health < 20 && health >= 13) {
                            player.setHealth(20);
                            player.setItemInHand(new ItemStack(Material.AIR));
                        } 
                    
             else if(health < 20 && health < 13) {
                            player.setHealth(health + 7);
                            player.setItemInHand(new ItemStack(Material.AIR));
                    }
                }
            }
        }
    }
	
	 @EventHandler
	 public void onDeath(PlayerDeathEvent e){
		 Player p = e.getEntity();
		 e.getDrops().clear();
       
		 if(plugin.kitused.contains(p.getName())){
        	 plugin.kitused.remove(p.getName());
        	 
        	 if(plugin.Knight.contains(p.getName())){
        		 plugin.Knight.remove(p.getName());
        	 }   
        	 if(plugin.Archer.contains(p.getName())){
        			   plugin.Archer.remove(p.getName());
        		   }
        	 if(plugin.Fisherman.contains(p.getName())){
  			   plugin.Fisherman.remove(p.getName());
  		   }
        	 if(plugin.Grandpa.contains(p.getName())){
    			   plugin.Grandpa.remove(p.getName());
    		   }
        	 if(plugin.Chemist.contains(p.getName())){
  			   plugin.Chemist.remove(p.getName());
        	 
        	 }
        	 }
         }
	 
	 @EventHandler 
	 public void onFish(PlayerFishEvent e){
		 Player p = e.getPlayer();
		  Entity c = e.getCaught();
		 
		  if(c instanceof Player){
			  c.teleport(p);
		  }
		 
	 }
	 
}
