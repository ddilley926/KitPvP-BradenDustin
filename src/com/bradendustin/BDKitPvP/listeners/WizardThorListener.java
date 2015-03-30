package com.bradendustin.BDKitPvP.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.bradendustin.BDKitPvP.Main;

public class WizardThorListener implements Listener {
	public Main plugin;
	public WizardThorListener(Main instance){
	plugin = instance;
	}
	
	@EventHandler
	public void onWizard(PlayerInteractEvent e){
		Player p = e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
        	ItemStack Wand = new ItemStack(Material.STONE_SWORD);
    	    ItemMeta WandMeta = Wand.getItemMeta();
    	    WandMeta.setDisplayName(ChatColor.RED + "Right click to shoot fireballs!"); {
    	    	if(p.getItemInHand() == Wand){
    	    		p.launchProjectile(Fireball.class).setVelocity(p.getLocation().getDirection().multiply(2));
    	    	}
	}
        }
	}
	@EventHandler
    public void onAttack(EntityDamageByEntityEvent p){
        Entity attacker = p.getDamager();
        Entity defender = p.getEntity();
 if(plugin.Thor.contains(attacker)){
        if(attacker instanceof Player ){
        World world = defender.getWorld();
       
        Location location = defender.getLocation();
        world.strikeLightning(location);
           }
    }
    	    		
    	    			
    	    		
    	    	}
}
    	    	
    	    		
    	    	
    	    	
    	    	
    	 
    	    	
    	    	
    	    
    	    	
    	    
    	    		
    	          
    
		
    	    			
    	    			
    	    			
    	    			
    	    	
	
        
        


