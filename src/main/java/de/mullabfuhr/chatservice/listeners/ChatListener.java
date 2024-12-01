package de.mullabfuhr.chatservice.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        if(player.isSleeping()){
            event.setFormat("%1$s" + ChatColor.BLUE + " .zZ"+ ChatColor.GRAY + " » %2$s");
            return;
        }
        event.setFormat("%1$s" + ChatColor.GRAY + " » %2$s");
    }

}
