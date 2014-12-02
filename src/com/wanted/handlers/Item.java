package com.wanted.handlers;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class Item {
    
    //farmer decleration
    public static ItemStack hoe = new ItemStack(Material.IRON_HOE);
    private static ItemMeta hoem = (ItemMeta) hoe.getItemMeta();
    public static ItemStack wheat = new ItemStack(Material.WHEAT, 2);
    private static ItemMeta wheatm = (ItemMeta) wheat.getItemMeta();
    
    //librarian decleration
    public static ItemStack book = new ItemStack(Material.BOOK);
    private static ItemMeta bookm = (ItemMeta) book.getItemMeta();
    public static ItemStack paper = new ItemStack(Material.PAPER, 2);
    private static ItemMeta paperm = (ItemMeta) paper.getItemMeta();
    
    //priest decleration
    public static ItemStack blaze = new ItemStack(Material.BLAZE_ROD);
    private static ItemMeta blazem = (ItemMeta) blaze.getItemMeta();
    private static Potion potion = new Potion(PotionType.POISON, 1);
    public static ItemStack poison = potion.toItemStack(1);
    private static ItemMeta poisonm = (ItemMeta) poison.getItemMeta();
    
    //blacksmith decleration
    public static ItemStack axe = new ItemStack(Material.IRON_AXE);
    private static ItemMeta axem = (ItemMeta) axe.getItemMeta();
    public static ItemStack bow = new ItemStack(Material.IRON_BARDING);
    private static ItemMeta bowm = (ItemMeta) bow.getItemMeta();
    
    //butcher decleration
    public static ItemStack knife = new ItemStack(Material.IRON_SWORD);
    private static ItemMeta knifem = (ItemMeta) knife.getItemMeta();
    public static ItemStack tknife = new ItemStack(Material.WOOD_SWORD);
    private static ItemMeta tknifem = (ItemMeta) tknife.getItemMeta();
    
    //generic decleration
    public static ItemStack stick = new ItemStack(Material.STICK);
    private static ItemMeta stickm = (ItemMeta) stick.getItemMeta();
    public static ItemStack gold = new ItemStack(Material.GOLD_INGOT);
    private static ItemMeta goldm = (ItemMeta) gold.getItemMeta();
            
    public static void setMetas(){
        
        //farmer edit
        hoem.setDisplayName(ChatColor.DARK_RED + "Weapon:" + ChatColor.RED + " Iron Hoe");
        hoe.setItemMeta(hoem);
        wheatm.setDisplayName(ChatColor.DARK_RED + "Perk:" + ChatColor.RED + " Blindness Wheat");
        wheat.setItemMeta(wheatm);
        
        //librarian edit
        bookm.setDisplayName(ChatColor.DARK_RED + "Weapon:" + ChatColor.RED + " Book");
        book.setItemMeta(bookm);
        paperm.setDisplayName(ChatColor.DARK_RED + "Perk:" + ChatColor.RED + " Speed Read");
        paper.setItemMeta(paperm);
        
        //priest edit
        blazem.setDisplayName(ChatColor.DARK_RED + "Weapon:" + ChatColor.RED + " Blaze Rod");
        blaze.setItemMeta(blazem);
        poisonm.setDisplayName(ChatColor.DARK_RED + "Perk:" + ChatColor.RED + " Poison Phial");
        poison.setItemMeta(poisonm);
        
        //blacksmith edit
        axem.setDisplayName(ChatColor.DARK_RED + "Weapon:" + ChatColor.RED + " Iron Axe");
        axe.setItemMeta(axem);
        bowm.setDisplayName(ChatColor.DARK_RED + "Perk:" + ChatColor.RED + " Concealed Weapon");
        bow.setItemMeta(bowm);
        
        //butcher edit
        knifem.setDisplayName(ChatColor.DARK_RED + "Weapon:" + ChatColor.RED + " Butcher's Knife");
        knife.setItemMeta(knifem);
        tknifem.setDisplayName(ChatColor.DARK_RED + "Perk:" + ChatColor.RED + " Throwing Knife");
        tknife.setItemMeta(tknifem);
        
        //generic edit
        stickm.setDisplayName(ChatColor.DARK_RED + "Weapon:" + ChatColor.RED + " Stick");
        stick.setItemMeta(stickm);
        goldm.setDisplayName(ChatColor.DARK_RED + "Perk:" + ChatColor.RED + " Influence");
        gold.setItemMeta(goldm);
        
    }
}