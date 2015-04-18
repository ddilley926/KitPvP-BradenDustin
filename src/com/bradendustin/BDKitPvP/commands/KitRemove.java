package com.bradendustin.BDKitPvP.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

import com.bradendustin.BDKitPvP.Main;

public class KitRemove implements CommandExecutor{

	public Main plugin;
	public KitRemove(Main instance){
	plugin = instance;
	}
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2,
			String[] arg3) {
		if(arg1.getName().equalsIgnoreCase("kitremove")){
			Player p = (Player) arg0;
		p.getInventory().clear();
		for (PotionEffect effect : p.getActivePotionEffects())
		{
			p.removePotionEffect(effect.getType());
		}
			if(p.hasPermission("kitremove.use")){
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
		}
		return false;
	}

	}
	
	

