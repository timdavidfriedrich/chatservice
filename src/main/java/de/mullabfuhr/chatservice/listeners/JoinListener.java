package de.mullabfuhr.chatservice.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(
                ChatColor.BOLD.toString() + ChatColor.GREEN + "+ " + ChatColor.GRAY + player.getName() + " ist hier!"
        );
    }

}
