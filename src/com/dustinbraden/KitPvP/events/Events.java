package com.dustinbraden.KitPvP.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.dustinbraden.KitPvP.Main;

public class Events implements Listener {
	public Main plugin;
	public Events(Main instance){
	plugin = instance;
	}
	
	
	public void onDeathEvent(PlayerDeathEvent e){
		Player p = e.getEntity();
		Entity killer = p.getKiller();
			
		if(p instanceof Player){
			e.setDeathMessage(ChatColor.RED + "You have been killed by" + ChatColor.RED + killer + ChatColor.RED + "!");
		     
			if(plugin.kitused.contains(p.getName())){
		     plugin.kitused.remove(p.getName());
		     }
		     
		    if(plugin.Archer.contains(p.getName())){
		    	plugin.Archer.remove(p.getName());
		    }
		    if(plugin.Knight.contains(p.getName())){
		    	plugin.Knight.remove(p.getName());
		    }
		     
		     
		}
		     }
		}
	


