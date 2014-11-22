package com.wanted.listeners.player;

import com.wanted.Wanted;
import com.wanted.handlers.Item;
import com.wanted.listeners.WListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class PlayerInteract extends WListener{
    
    public PlayerInteract(Wanted pl){
        super(pl);
    }
    
    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        Action action = e.getAction();
        Player p = e.getPlayer();
        if(action.equals(Action.RIGHT_CLICK_AIR)){
            e.setCancelled(false);
            if(p.getItemInHand().getType() == Material.WHEAT){
                p.getWorld().dropItem(p.getLocation().add(new Vector(0, 1.5, 0)), new ItemStack(Material.WHEAT)).setVelocity(p.getEyeLocation().getDirection().multiply(2));
                int amount = p.getItemInHand().getAmount();
                p.getItemInHand().setAmount(amount - 1);
                if (amount == 1) {
                p.getInventory().removeItem(p.getItemInHand());
                }
            }else if(p.getItemInHand().getType() == Material.PAPER){
                                
            }else if(p.getItemInHand().getType() == Material.WOOD_SWORD){
            
            }else if(p.getItemInHand().getType() == Material.GOLD_INGOT){
            
            }else if(p.getItemInHand().getType() == Material.IRON_BARDING){
                p.launchProjectile(Arrow.class, p.getEyeLocation().getDirection().multiply(2));
                p.getInventory().removeItem(p.getItemInHand());
            }else{
                e.setCancelled(true);
            }
        }else if(action == Action.RIGHT_CLICK_BLOCK){
            e.setCancelled(false);
            if(p.getItemInHand().getType() == Material.WHEAT){
                p.getWorld().dropItem(p.getLocation().add(new Vector(0, 1.5, 0)), new ItemStack(Material.WHEAT)).setVelocity(p.getEyeLocation().getDirection().multiply(2));
                int amount = p.getItemInHand().getAmount();
                p.getItemInHand().setAmount(amount - 1);
                if (amount == 1) {
                p.getInventory().removeItem(p.getItemInHand());
                }
            }else if(p.getItemInHand().getType() == Material.PAPER){
                                
            }else if(p.getItemInHand().getType() == Material.WOOD_SWORD){
            
            }else if(p.getItemInHand().getType() == Material.GOLD_INGOT){
            
            }else if(p.getItemInHand().getType() == Material.IRON_BARDING){
                p.launchProjectile(Arrow.class, p.getEyeLocation().getDirection().multiply(2));
                p.getInventory().removeItem(p.getItemInHand());
            }else{
                e.setCancelled(true);
            }
        }else{
            e.setCancelled(true);
        }
        Bukkit.broadcastMessage("-----PlayerInteract-----");
        Bukkit.broadcastMessage("Action Type: " + e.getAction().name());
        Bukkit.broadcastMessage("Holding: " + e.getPlayer().getItemInHand().getType().name());
        Bukkit.broadcastMessage("Cancelled: " + e.isCancelled());
    }
    
}
