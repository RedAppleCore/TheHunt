package com.wanted;

import com.wanted.handlers.Game;
import com.wanted.listeners.WListener;
import com.wanted.listeners.item.ItemDrop;
import com.wanted.listeners.player.AsyncPlayerPreLogin;
import com.wanted.listeners.player.PlayerDamageByEntity;
import com.wanted.listeners.player.PlayerDeath;
import com.wanted.listeners.player.PlayerInteract;
import com.wanted.listeners.player.PlayerJoin;
import com.wanted.listeners.player.PlayerQuit;
import com.wanted.listeners.player.PlayerRespawn;
import com.wanted.threads.StartCountdown;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Wanted extends JavaPlugin{
    
    @Override
    public void onEnable(){
        GameState.setState(GameState.IN_LOBBY);
        Game.setCanStart(false);
        new Thread(new StartCountdown()).start();
        registerListeners();
    }
    
    public void registerListeners(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoin(this), this);
        pm.registerEvents(new PlayerQuit(this), this);
        pm.registerEvents(new AsyncPlayerPreLogin(this), this);
        pm.registerEvents(new PlayerDamageByEntity(this), this);
        pm.registerEvents(new PlayerDeath(this), this);
        pm.registerEvents(new PlayerRespawn(this), this);
        pm.registerEvents(new PlayerInteract(this), this);
        pm.registerEvents(new ItemDrop(this), this);
        pm.registerEvents(new WListener(this), this);
    }
    
}
