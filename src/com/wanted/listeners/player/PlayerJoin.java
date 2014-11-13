package com.wanted.listeners.player;

import com.wanted.Wanted;
import com.wanted.handlers.Game;
import com.wanted.listeners.WListener;
import com.wanted.utils.ChatUtilities;
import com.wanted.utils.LocationUtilities;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffectType;

public class PlayerJoin extends WListener{
    
    public PlayerJoin(Wanted pl){
        super(pl);
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoinEvent(PlayerJoinEvent e) {
            e.setJoinMessage("");
            Player p = e.getPlayer();
            Game.players.add(p.getName());
            p.setHealth(20.0);
            p.setExp(0);
            ChatUtilities.broadcast(e.getPlayer().getDisplayName() + " has joined!");
            p.removePotionEffect(PotionEffectType.INVISIBILITY);
            p.setGameMode(GameMode.ADVENTURE);
            p.getInventory().clear();
            p.getInventory().setHelmet(null);
            Game.setCanStart(Bukkit.getOnlinePlayers().length >= 1);
            LocationUtilities.teleportToLobby(p);
    }
    
}
