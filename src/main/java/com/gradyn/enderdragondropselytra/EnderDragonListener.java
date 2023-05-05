package com.gradyn.enderdragondropselytra;

import com.destroystokyo.paper.event.entity.EntityRemoveFromWorldEvent;
import io.papermc.paper.event.block.DragonEggFormEvent;
import org.bukkit.Material;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

public class EnderDragonListener implements Listener {
    @EventHandler
    public final void onDragonEggFormEvent(DragonEggFormEvent event) {
        event.getDragonBattle().getEnderDragon().getWorld().dropItem(event.getDragonBattle().getEnderDragon().getLocation(), new ItemStack(Material.ELYTRA, 1));
    }
}
