package com.bradendustin.BDKitPvP.listeners;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIListener implements Listener {
	public Inventory inv;
	public Inventory l1;
	public Inventory l2;
	public Inventory l3;
	public Inventory l4;
	public Inventory l5;

	ArrayList<String> Archerlore = new ArrayList<String>();
	ArrayList<String> Fisherlore = new ArrayList<String>();
	ArrayList<String> Grandpalore = new ArrayList<String>();
	ArrayList<String> Knightlore = new ArrayList<String>();
	ArrayList<String> Chemistlore = new ArrayList<String>();
	ArrayList<String> Flashlore = new ArrayList<String>();
	ArrayList<String> Tanklore = new ArrayList<String>();
	ArrayList<String> Wizardlore = new ArrayList<String>();
	ArrayList<String> Boxerlore = new ArrayList<String>();
	ArrayList<String> Endermanlore = new ArrayList<String>();
	ArrayList<String> Thorlore = new ArrayList<String>();
	ArrayList<String> Shadowlore = new ArrayList<String>();
	ArrayList<String> Viperlore = new ArrayList<String>();
	ArrayList<String> Horseriderlore = new ArrayList<String>();
	ArrayList<String> Titanlore = new ArrayList<String>();
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("kit")){
			if(sender instanceof Player){
				((Player) sender).openInventory(inv);
			}else if(cmd.getName().equalsIgnoreCase("kits")){
				((Player)sender).openInventory(inv);
			}else if(cmd.getName().equalsIgnoreCase("kitgui")){
				((Player)sender).openInventory(inv);
			}
		}
		return true;
	}

	@EventHandler 
	public void InventoryClick(InventoryClickEvent e){
		inv.getName().equals("Kits");
		l1.getName().equals("Kits - Level 1");
		l2.getName().equals("Kits - Level 2");
		l3.getName().equals("Kits - Level 3");
		l4.getName().equals("Kits - Level 4"); 
		l5.getName().equals("Kits - Level 5"); 
		ItemStack Knight = new ItemStack(Material.BOW);
		ItemMeta KnightMeta = Knight.getItemMeta();
		KnightMeta.setDisplayName(ChatColor.RED + "Knight");

		ItemStack Archer = new ItemStack(Material.BOW);
		ItemMeta AMeta = Archer.getItemMeta();
		AMeta.setDisplayName(ChatColor.RED + "Archer");
		Archerlore.add(ChatColor.BLUE + "Snipe all of your enemies!");

		ItemStack Fisherman = new ItemStack(Material.FISHING_ROD);
		ItemMeta FishMeta = Fisherman.getItemMeta();
		FishMeta.setDisplayName(ChatColor.RED + "Fisherman");
		Fisherlore.add(ChatColor.BLUE + "Reel in your enemies to attack them easier!");

		ItemStack Grandpa = new ItemStack(Material.FISHING_ROD);
		ItemMeta GrandpaMeta = Grandpa.getItemMeta();
		GrandpaMeta.setDisplayName(ChatColor.RED + "Grandpa");
		Grandpalore.add(ChatColor.BLUE + "Knock away those darn kids with your cane!");

		Knight.setItemMeta(KnightMeta);
		Grandpa.setItemMeta(GrandpaMeta);
		Fisherman.setItemMeta(FishMeta);
		Archer.setItemMeta(AMeta);

		l1.setItem(0, Knight);
		l1.setItem(1, Archer);
		l1.setItem(2, Fisherman);
		l1.setItem(3, Grandpa);
		
		ItemStack Chemist = new ItemStack(Material.POTION);
		ItemMeta ChemistMeta = Chemist.getItemMeta();
		ChemistMeta.setDisplayName(ChatColor.RED + "Chemist");
		Chemistlore.add(ChatColor.BLUE + "Use magical chemicals to murder your enemies, Walter White style.");

		ItemStack Flash = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta FlashMeta = Flash.getItemMeta();
		FlashMeta.setDisplayName(ChatColor.RED + "Flash");
		Flashlore.add(ChatColor.BLUE + "Run super fast to catch your enemies off guard!");

		ItemStack Tank = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta TankMeta = Tank.getItemMeta();
		TankMeta.setDisplayName(ChatColor.RED + "Tank");
		Tanklore.add(ChatColor.BLUE + "Take so many hits and still be standing!");
		Tanklore.add(ChatColor.BLUE + "You deal out less damage although.");

		ItemStack Wizard = new ItemStack(Material.STICK);
		ItemMeta WizardMeta = Wizard.getItemMeta();
		WizardMeta.setDisplayName(ChatColor.RED + "Wizard");
		Wizardlore.add(ChatColor.BLUE + "Cast spells to launch fireballs at your enemy!");

		Chemist.setItemMeta(ChemistMeta);
		Flash.setItemMeta(FlashMeta);
		Tank.setItemMeta(TankMeta);
		Wizard.setItemMeta(WizardMeta);

		l2.setItem(0, Chemist);
		l2.setItem(1, Flash);
		l2.setItem(2, Tank);
		l2.setItem(3, Wizard);

		ItemStack Boxer = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemMeta BoxerMeta = Boxer.getItemMeta();
		BoxerMeta.setDisplayName(ChatColor.RED + "Boxer");
		Boxerlore.add(ChatColor.BLUE + "Pack a punch like Muhammad Ali!");

		ItemStack Enderman = new ItemStack(Material.ENDER_PEARL);
		ItemMeta EndermanMeta = Enderman.getItemMeta();
		EndermanMeta.setDisplayName(ChatColor.RED + "Enderman");
		Endermanlore.add(ChatColor.BLUE + "Teleport around with no one knowing where you'll come from!");


		ItemStack Thor = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta ThorMeta = Thor.getItemMeta();
		ThorMeta.setDisplayName(ChatColor.RED + "Thor");
		Thorlore.add(ChatColor.BLUE + "Every twenty seconds lightning will strike your enemy!");

		Boxer.setItemMeta(BoxerMeta);
		Enderman.setItemMeta(EndermanMeta);
		Thor.setItemMeta(ThorMeta);

		l3.setItem(0, Boxer);
		l3.setItem(1, Enderman);
		l3.setItem(2, Thor);
		
		ItemStack Shadow = new ItemStack(Material.EYE_OF_ENDER);
		ItemMeta ShadowMeta = Shadow.getItemMeta();
		ShadowMeta.setDisplayName(ChatColor.RED + "Shadow");
		Shadowlore.add(ChatColor.BLUE + "Invisibly hunt down prey. Murder them without them ever knowing you were there!");

		ItemStack Viper = new ItemStack(Material.WOOD_SWORD);
		ItemMeta ViperMeta = Viper.getItemMeta();
		ViperMeta.setDisplayName(ChatColor.RED + "Viper");
		Viperlore.add(ChatColor.BLUE + "Poison your enemies!");

		Shadow.setItemMeta(ShadowMeta);
		Viper.setItemMeta(ViperMeta);

		l4.setItem(0, Shadow);
		l4.setItem(1, Viper);
		
		ItemStack HorseRider = new ItemStack(Material.MONSTER_EGG, (short)100);
		ItemMeta HorseMeta = HorseRider.getItemMeta();
		HorseMeta.setDisplayName(ChatColor.RED + "Horse rider");
		Horseriderlore.add(ChatColor.BLUE + "Hunt down your enemies on horse!");

		ItemStack Titan = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta TitanMeta = Titan.getItemMeta();
		TitanMeta.setDisplayName(ChatColor.RED + "Titan");
		Titanlore.add(ChatColor.BLUE + "The strongest kit of them all.");

		Titan.setItemMeta(TitanMeta);
		HorseRider.setItemMeta(HorseMeta);

		l5.setItem(0, HorseRider);
		l5.setItem(1, Titan);
		
		ItemStack L1 = new ItemStack(Material.WOOD_SWORD);
		ItemMeta L1M = L1.getItemMeta();
		L1M.setDisplayName(ChatColor.RED + "Level 1 Kits");
		ItemStack L2 = new ItemStack(Material.GOLD_SWORD);
		ItemMeta L2M = L2.getItemMeta();
		L2M.setDisplayName(ChatColor.RED + "Level 2 Kits");
		L2.setItemMeta(L2M);
		ItemStack L3 = new ItemStack(Material.STONE_SWORD);
		ItemMeta L3M = L3.getItemMeta();
		L3M.setDisplayName(ChatColor.RED + "Level 3 Kits");
		L3.setItemMeta(L3M);
		ItemStack L4 = new ItemStack(Material.IRON_SWORD);
		ItemMeta L4M = L4.getItemMeta();
		L4M.setDisplayName(ChatColor.RED + "Level 4 Kits");
		L4.setItemMeta(L4M);
		
		ItemStack L5 = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta L5M = L5.getItemMeta();
		L5M.setDisplayName(ChatColor.RED + "Level 5 Kits");
		L5.setItemMeta(L5M);
		inv.setItem(0, L1);
		inv.setItem(1,L2);
		inv.setItem(2, L3);
		inv.setItem(3, L4);
		inv.setItem(4, L5);
		Player p = (Player) e.getWhoClicked();  

		if(e.getInventory().getTitle().contains("Kits") || 
				e.getInventory().getTitle().contains("Kits - Level 1") || 
				e.getInventory().getTitle().contains("Kits - Level 2") || 
				e.getInventory().getTitle().contains("Kits - Level 3")|| 
				e.getInventory().getTitle().contains("Kits - Level 4")||
				e.getInventory().getTitle().contains("Kits - Level 5")){
			e.setCancelled(true); 

			if(e.getCurrentItem() == null){
				return;
			}

			else if(e.getCurrentItem().getType().equals(L1)){
				p.openInventory(l1);
			}else if(e.getCurrentItem().getType().equals(L2)){
				p.openInventory(l2);
			}else if(e.getCurrentItem().getType().equals(L3)){
				p.openInventory(l3);
			}else if(e.getCurrentItem().getType().equals(L4)){
				p.openInventory(l4);
			}else if(e.getCurrentItem().getType().equals(L5)){
				p.openInventory(l5);
			}else if(e.getCurrentItem().getType().equals(Knight)){
				Bukkit.dispatchCommand(p, "knight");
			}else if(e.getCurrentItem().getType().equals(Archer)){
				Bukkit.dispatchCommand(p, "archer");
			}else if(e.getCurrentItem().getType().equals(Fisherman)){
				Bukkit.dispatchCommand(p, "fisherman");
			}else if(e.getCurrentItem().getType().equals(Grandpa)){
				Bukkit.dispatchCommand(p, "grandpa");
		}else if(e.getCurrentItem().getType().equals(Chemist)){
			Bukkit.dispatchCommand(p, "chemist");
		}else if(e.getCurrentItem().getType().equals(Flash)){
			Bukkit.dispatchCommand(p, "flash");
		}else if(e.getCurrentItem().getType().equals(Tank)){
			Bukkit.dispatchCommand(p, "tank");
		}else if(e.getCurrentItem().getType().equals(Wizard)){
			Bukkit.dispatchCommand(p, "wizard");
		}else if(e.getCurrentItem().getType().equals(Boxer)){
			Bukkit.dispatchCommand(p, "boxer");
		}else if(e.getCurrentItem().getType().equals(Enderman)){
			Bukkit.dispatchCommand(p, "enderman");
		}else if(e.getCurrentItem().getType().equals(Thor)){
			Bukkit.dispatchCommand(p, "thor");
		}else if(e.getCurrentItem().getType().equals(Shadow)){
			Bukkit.dispatchCommand(p, "shadow");
		}else if(e.getCurrentItem().getType().equals(Viper)){
			Bukkit.dispatchCommand(p, "viper");
		}else if(e.getCurrentItem().getType().equals(HorseRider)){
			Bukkit.dispatchCommand(p, "horserider");
		}else if(e.getCurrentItem().getType().equals(Titan)){
			Bukkit.dispatchCommand(p, "titan");
		}
		}
	}
	 @EventHandler
	 public void signs(PlayerInteractEvent e){
		 if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
			 Block block = e.getClickedBlock();
			 if(block.getType().equals(Material.SIGN) || block.getType().equals(Material.SIGN_POST) || block.getType().equals(Material.WALL_SIGN)){
				 Sign sign = (Sign) e.getClickedBlock().getState();
				 if(sign.getLine(1).equals("CosmicPvP")){
					 sign.setLine(1, ChatColor.BLUE + "[CosmicPvP]");
					 sign.setLine(2, ChatColor.RED + "Select a kit by right clicking here!");
				 }
				 if(sign.getLine(1).contains(ChatColor.BLUE + "[CosmicPvP]") && sign.getLine(2).equals(ChatColor.RED + "Select a kit by right clicking here!")){
					 Player p = e.getPlayer();
					 p.openInventory(inv);
				 }
			 }
			 
		 }
	 }
}