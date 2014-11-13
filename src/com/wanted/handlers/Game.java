package com.wanted.handlers;

import com.wanted.GameState;
import com.wanted.GameState;
import com.wanted.utils.ChatUtilities;
import com.wanted.utils.LocationUtilities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import me.libraryaddict.disguise.disguisetypes.watchers.VillagerWatcher;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class Game {

    private static boolean canStart = false;
    private static boolean hasStarted = false;
    public static List<String> players = new ArrayList<String>();
    private static List<String> roles = new ArrayList<String>();
    
    public static void start() {
        GameState.setState(GameState.IN_GAME);
        new Role("Farmer");
        new Role("Librarian");
        new Role("Priest");
        new Role("Blacksmith");
        new Role("Butcher");
        roles.add("Farmer");
        roles.add("Librarian");
        roles.add("Priest");
        roles.add("Blacksmith");
        roles.add("Butcher");
        Item.setMetas();
        Disguises.initializeVillagers();
        for (int i = 0; i < players.size(); i++) {
            if (!Role.hasRole(Bukkit.getPlayer(players.get(i))) == true) {
                Role.getRole(roles.get(i)).add(Bukkit.getPlayer(players.get(i)));
                DisguiseAPI.disguiseToAll(Bukkit.getPlayer(players.get(i)), Disguises.DisguiseList.get(i));
                if (i == 0) {
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(0, Item.hoe);
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(1, Item.wheat);
                    ChatUtilities.onePlayer("Your role is: " + ChatColor.RED + roles.get(i), Bukkit.getPlayer(players.get(i)));
                    //Disguises.disguiseAsFarmer(Bukkit.getPlayer(players.get(i)));
                } else if (i == 1) {
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(0, Item.book);
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(1, Item.paper);
                    ChatUtilities.onePlayer("Your role is: " + ChatColor.RED + roles.get(i), Bukkit.getPlayer(players.get(i)));
                    //Disguises.disguiseAsLibrarian(Bukkit.getPlayer(players.get(i)));
                } else if (i == 2) {
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(0, Item.blaze);
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(1, Item.poison);
                    ChatUtilities.onePlayer("Your role is: " + ChatColor.RED + roles.get(i), Bukkit.getPlayer(players.get(i)));
                    //Disguises.disguiseAsPriest(Bukkit.getPlayer(players.get(i)));
                } else if (i == 3) {
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(0, Item.axe);
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(1, Item.bow);
                    ChatUtilities.onePlayer("Your role is: " + ChatColor.RED + roles.get(i), Bukkit.getPlayer(players.get(i)));
                    //Disguises.disguiseAsBlacksmith(Bukkit.getPlayer(players.get(i)));
                } else {
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(0, Item.knife);
                    Bukkit.getPlayer(players.get(i)).getInventory().setItem(1, Item.tknife);
                    ChatUtilities.onePlayer("Your role is: " + ChatColor.RED + roles.get(i), Bukkit.getPlayer(players.get(i)));
                    //Disguises.disguiseAsButcher(Bukkit.getPlayer(players.get(i)));
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Bukkit.shutdown();
            }
            LocationUtilities.teleportToGame(Bukkit.getPlayer(players.get(i)));
        }
        //Disguises.setDisguise();
        hasStarted = true;
    }

    public static void stop() {
        hasStarted = false;
    }

    public static boolean canStart() {
        return canStart;
    }

    public static boolean hasStarted() {
        return hasStarted;
    }

    public static void setCanStart(boolean b) {
        canStart = b;
    }
}
