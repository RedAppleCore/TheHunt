package com.wanted.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class LocationUtilities {
    
    public static Location lobby = new Location(Bukkit.getWorld("hellodgas"), 196.5, 4, -1919.5);
    
    public static Location game = new Location(Bukkit.getWorld("hellodgas"), 215.5, 4, -1930.5);
    
    public static void teleportToLobby(Player p){
        p.teleport(lobby);
    }
    
    public static void teleportToGame(Player p){
        p.teleport(game);
    }
    
}
