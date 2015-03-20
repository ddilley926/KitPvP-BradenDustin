package com.dustinbraden.KitPvP;

import java.util.ArrayList;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.dustinbraden.KitPvP.kits.*;
import com.dustinbraden.KitPvP.events.*;

public class Main extends JavaPlugin{
	public static Main plugin;
	
public ArrayList<String> Knight = new ArrayList<String>();
public ArrayList<String> kitused = new ArrayList<String>();
public ArrayList<String> Archer = new ArrayList<String>();

public void onEnable(){
	commands();
	PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(new Events(this), this);
}

public void commands(){
	getCommand("Archer").setExecutor(new Archer(this));
	getCommand("Knight").setExecutor(new Knight(this));
}

}









