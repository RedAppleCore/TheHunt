package com.wanted.listeners.player;

import com.wanted.Wanted;
import static com.wanted.handlers.Game.players;
import com.wanted.handlers.Item;
import com.wanted.handlers.Role;
import com.wanted.listeners.WListener;
import com.wanted.utils.LocationUtilities;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawn extends WListener {

    public PlayerRespawn(Wanted pl) {
        super(pl);
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {
        Player p = e.getPlayer();
        if (Role.getRole(p).equals(Role.getRole("Farmer"))) {
            p.getInventory().setItem(0, Item.hoe);
            p.getInventory().setItem(1, Item.wheat);
        } else if (Role.getRole(p).equals(Role.getRole("Librarian"))) {
            p.getInventory().setItem(0, Item.book);
            p.getInventory().setItem(1, Item.paper);
        } else if (Role.getRole(p).equals(Role.getRole("Priest"))) {
            p.getInventory().setItem(0, Item.blaze);
            p.getInventory().setItem(1, Item.poison);
        } else if (Role.getRole(p).equals(Role.getRole("Blacksmith"))) {
            p.getInventory().setItem(0, Item.axe);
            p.getInventory().setItem(1, Item.tknife);
        } else if (Role.getRole(p).equals(Role.getRole("Butcher"))) {
            p.getInventory().setItem(0, Item.knife);
            p.getInventory().setItem(1, Item.tknife);
        }
        e.setRespawnLocation(LocationUtilities.game);
    }
}
