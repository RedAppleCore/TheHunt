package com.wanted.listeners;

import com.wanted.Wanted;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class WListener implements Listener{
    
    Wanted plugin;
    
    public WListener(Wanted pl){
        plugin = pl;
    }
    
    @EventHandler
    public void MobSpawn(CreatureSpawnEvent e){
    	e.setCancelled(true);
    	
    }
}
