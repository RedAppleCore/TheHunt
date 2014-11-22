package com.wanted.listeners.item;

import com.wanted.Wanted;
import com.wanted.listeners.WListener;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.ItemSpawnEvent;

public class ItemDrop extends WListener {

    public ItemDrop(Wanted pl) {
        super(pl);
    }

    @EventHandler
    public void onItemDrop(ItemSpawnEvent e) {
        
    }
}
