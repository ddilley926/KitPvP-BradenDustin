package com.bradendustin.BDKitPvP.listeners;

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
import org.bukkit.event.vehicle.VehicleExitEvent;
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
        	 
        	 } if(plugin.Flash.contains(p.getName())){
    			   plugin.Flash.remove(p.getName());
        	 
        	 
        	 }
        	 if(plugin.Tank.contains(p.getName())){
    			   plugin.Tank.remove(p.getName());
        	 }
        	 if(plugin.Wizard.contains(p.getName())){
    			   plugin.Wizard.remove(p.getName());
        	 }        	 if(plugin.Boxer.contains(p.getName())){
  			   plugin.Boxer.remove(p.getName());
      	 }        	 if(plugin.Enderman.contains(p.getName())){
			   plugin.Enderman.remove(p.getName());
  	 }        	 if(plugin.Thor.contains(p.getName())){
		   plugin.Thor.remove(p.getName());
	 }        	 if(plugin.ExplosiveArcher.contains(p.getName())){
		   plugin.ExplosiveArcher.remove(p.getName());
	 }        	 if(plugin.Shadow.contains(p.getName())){
		   plugin.Shadow.remove(p.getName());
	 }        	 if(plugin.Viper.contains(p.getName())){
		   plugin.Viper.remove(p.getName());
	 }        	 if(plugin.HorseRider.contains(p.getName())){
		   plugin.HorseRider.remove(p.getName());
	 }        	 if(plugin.Titan.contains(p.getName())){
		   plugin.Titan.remove(p.getName());
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
	 @EventHandler
	 public void horseRider(VehicleExitEvent e){
		 Entity p = e.getExited();
		 if(p.eject())
		 e.setCancelled(true);
		 
	 }
	 
}
