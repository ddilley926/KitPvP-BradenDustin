package com.dustinbraden.KitPvP.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.dustinbraden.KitPvP.Main;

public class Archer implements CommandExecutor{
	public Main plugin;
	public Archer(Main instance){
	plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("Archer")){
			if(!plugin.Archer.contains(p.getName())){
				if(!plugin.kitused.contains(p.getName())){
					plugin.Archer.add(p.getName());
					plugin.kitused.add(p.getName());
					
					
					
					
					//TODO FINISH ADDING THE ON DEATH EVENT IN THE EVENTS CLASS
			ItemStack ArcherBow = new ItemStack(Material.BOW);
			ArcherBow.addEnchantment(Enchantment.ARROW_INFINITE, 2);
			ArcherBow.addEnchantment(Enchantment.ARROW_DAMAGE, 3 );
			
			
			ItemMeta ArcherMeta = ArcherBow.getItemMeta();
			ArcherMeta.setDisplayName(ChatColor.GOLD + "ArcherBow");
			
			
			p.sendMessage(ChatColor.RED + "You have recieved the Archer kit!");
			p.sendMessage(ChatColor.RED + "Now go have some fun!");
			
				
			
			
			p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
			p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
			p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
			
			
			p.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
			p.getInventory().addItem(ArcherBow);
			
			for(int i = 0; i<25; i++)
				p.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP));
			
		}
		
		
		
	
	}else{
		p.sendMessage(ChatColor.RED + "You already have a kit!");
	}
	
	}else{
		p.sendMessage(ChatColor.RED + "You already have a kit!");
	}
		return false;
	}
}
