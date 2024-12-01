package de.mullabfuhr.chatservice.listeners;

import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        event.setQuitMessage(
                ChatColor.BOLD.toString() + ChatColor.RED + "- " + ChatColor.GRAY + player.getName() + " ist weg."
        );
    }

}
