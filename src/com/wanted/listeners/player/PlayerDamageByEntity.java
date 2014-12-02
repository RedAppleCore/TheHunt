package com.wanted.listeners.player;

import com.wanted.Wanted;
import com.wanted.handlers.Item;
import com.wanted.handlers.Role;
import com.wanted.listeners.WListener;
import com.wanted.utils.ChatUtilities;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerDamageByEntity extends WListener {

    public PlayerDamageByEntity(Wanted pl) {
        super(pl);
    }

    @EventHandler
    public void DamageByPlayer(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            Player d = (Player) e.getDamager();

            if (d.getItemInHand().equals(Item.hoe) || d.getItemInHand().equals(Item.book) || d.getItemInHand().equals(Item.blaze) || d.getItemInHand().equals(Item.axe) || d.getItemInHand().equals(Item.knife)) {
                p.setHealth(0.0);
                ChatUtilities.onePlayer("You killed " + p.getName() + "! They were a " + Role.getRole(p).getName() + ".", d);
                ChatUtilities.onePlayer("You were slain by " + d.getName() + "!", p);
            } else {
                e.setCancelled(true);
            }
        }
    }
}
