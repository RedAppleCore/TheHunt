package com.wanted.threads;

import com.wanted.Wanted;
import com.wanted.GameState;
import com.wanted.handlers.Game;
import com.wanted.utils.ChatUtilities;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class StartCountdown implements Runnable {

    private static int timeUntilStart;
    
    @Override
    public void run() {
        while (true) {
            if (GameState.isState(GameState.IN_LOBBY)) {
                if (Game.canStart() == true) {
                    ChatUtilities.broadcast("Minimum players reached! Countdown starting!");
                    timeUntilStart = 30;
                    for (; timeUntilStart >= 0; timeUntilStart--) {
                        
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.setLevel(timeUntilStart);
                        }
                        
                        if(Game.canStart() == false){
                            ChatUtilities.broadcast("Not enough players! Countdown stopped!");
                            break;
                        }
                        if (timeUntilStart == 0) {
                            Game.start();
                            break;
                        }

                        if (timeUntilStart % 10 == 0 || timeUntilStart < 6) {
                            ChatUtilities.broadcast(timeUntilStart + " seconds until the game starts!");
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            Bukkit.shutdown();
                        }
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Bukkit.shutdown();
                }
            }
        }
    }
}
