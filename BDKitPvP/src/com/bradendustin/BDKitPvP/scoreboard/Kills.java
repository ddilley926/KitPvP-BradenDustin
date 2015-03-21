package com.bradendustin.BDKitPvP.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;


public class Kills implements Listener {
	 @EventHandler
	 public void onJoin(PlayerJoinEvent e){
 Player p = e.getPlayer();
		 team.addPlayer(p);
	 }
	 
	 
	
	
}
