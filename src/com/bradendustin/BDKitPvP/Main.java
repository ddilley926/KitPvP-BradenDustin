package com.bradendustin.BDKitPvP;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import com.bradendustin.BDKitPvP.defaultkits.Archer;
import com.bradendustin.BDKitPvP.defaultkits.Fisherman;
import com.bradendustin.BDKitPvP.defaultkits.Grandpa;
import com.bradendustin.BDKitPvP.defaultkits.Knight;
import com.bradendustin.BDKitPvP.level2kits.Chemist;
import com.bradendustin.BDKitPvP.level2kits.*;
import com.bradendustin.BDKitPvP.listeners.Events;

public class Main extends JavaPlugin {
	
	//*********************************************//
	//***************Level 1 ArrayLists***********//
	//********************************************//
	
	public ArrayList<String> Knight = new ArrayList<String>();
	public ArrayList<String> Archer = new ArrayList<String>();
	public ArrayList<String> Fisherman = new ArrayList<String>();
	public ArrayList<String> Grandpa = new ArrayList<String>();
	
	//*****************************************//
	//*************Level 2 ArrayLists*********//
	//****************************************//
	public ArrayList<String> Flash = new ArrayList<String>();
	public ArrayList<String> Chemist = new ArrayList<String>();
	public ArrayList<String> Tank = new ArrayList<String>();
	public ArrayList<String> Wizard = new ArrayList<String>();
	
	//*****************************************//
	//*************Level 3 ArrayLists*********//
	//****************************************//
	
	public ArrayList<String> Boxer = new ArrayList<String>();
	public ArrayList<String> Enderman = new ArrayList<String>();
	public ArrayList<String> Thor = new ArrayList<String>();
	
	//*****************************************//
	//*************Level 4 ArrayLists*********//
	//****************************************//
	
	public ArrayList<String> ExplosiveArcher = new ArrayList<String>();
	public ArrayList<String> Shadow = new ArrayList<String>();
	public ArrayList<String> Viper = new ArrayList<String>();
	
	//*****************************************//
	//*************Level 5 ArrayLists*********//
	//****************************************//
		
		public ArrayList<String> ChemicalArcher = new ArrayList<String>();
		public ArrayList<String> HorseRider = new ArrayList<String>();
		public ArrayList<String> Titan = new ArrayList<String>();
		public ArrayList<String> UltraFlash = new ArrayList<String>();
		
		//*****************************************//
		//**********Donator ArrayLists*********//
		//****************************************//
		public ArrayList<String> Advanced = new ArrayList<String>();
		public ArrayList<String> Expert = new ArrayList<String>();
		public ArrayList<String> Demon = new ArrayList<String>();
		public ArrayList<String> Veteran = new ArrayList<String>();
		public ArrayList<String> God = new ArrayList<String>();
		
	public ArrayList<String> kitused = new ArrayList<String>();
	
	
	public void onEnable(){
		commands();

		
		PluginManager pm = getServer().getPluginManager();
		  pm.registerEvents(new Events(this), this);
		  
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		 Objective kills = board.registerNewObjective("kills", "playerKillCount");
		 kills.setDisplaySlot(DisplaySlot.SIDEBAR);
		 kills.setDisplayName(ChatColor.RED + "Kills"); 
		 
		 Objective showhealth = board.registerNewObjective("showhealth", "health");
		 showhealth.setDisplaySlot(DisplaySlot.BELOW_NAME);
		 showhealth.setDisplayName("/ 20");
		
	
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		Scoreboard board = p.getScoreboard();
		p.setScoreboard(board);
	}
	
	
	public void commands(){
		
		//*****************************************//
		//*************Level 1 Executors*********//
		//****************************************//
		getCommand("Knight").setExecutor(new Knight(this));
		getCommand("Archer").setExecutor(new Archer(this));
		getCommand("Fisherman").setExecutor(new Fisherman(this));
		getCommand("Grandpa").setExecutor(new Grandpa(this));
		
		//*****************************************//
		//*************Level 2 Executors*********//
		//****************************************//
		getCommand("Chemist").setExecutor(new Chemist(this));
		getCommand("Flash").setExecutor(new Flash(this));
<<<<<<< HEAD
		getCommand("Fisherman").setExecutor(new Fisherman(this));
		getCommand("Grandpa").setExecutor(new Grandpa(this));
=======
		getCommand("Tank").setExecutor(new Tank(this));
		getCommand("Wizard").setExecutor(new Wizard(this));
		//*****************************************//
		//*************Level 3 Executors*********//
		//****************************************//
		getCommand("Boxer").setExecutor(new Boxer(this));
		getCommand("Enderman").setExecutor(new Enderman(this));
		getCommand("Thor").setExecutor(new Thor(this));
		//*****************************************//
		//*************Level 4 Executors*********//
		//****************************************//
		getCommand("Shadow").setExecutor(new Shadow(this));
		getCommand("Viper").setExecutor(new Viper(this));
		//*****************************************//
		//*************Level 5 Executors*********//
		//****************************************//
		getCommand("HorseRider").setExecutor(new HorseRider(this));
		getCommand("Titan").setExecutor(new Titan(this));
>>>>>>> origin/master
	}
	
	
}
