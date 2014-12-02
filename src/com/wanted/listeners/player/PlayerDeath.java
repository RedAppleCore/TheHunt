package com.wanted.listeners.player;

import com.wanted.Wanted;
import com.wanted.listeners.WListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath extends WListener{
    
    public PlayerDeath(Wanted pl) {
        super(pl);
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        e.setDeathMessage("");
        e.getDrops().clear();
    }
    
}
