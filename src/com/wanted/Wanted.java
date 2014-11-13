package com.wanted;

import com.wanted.handlers.Game;
import com.wanted.listeners.player.AsyncPlayerPreLogin;
import com.wanted.listeners.player.PlayerJoin;
import com.wanted.listeners.player.PlayerQuit;
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
    }
    
}
