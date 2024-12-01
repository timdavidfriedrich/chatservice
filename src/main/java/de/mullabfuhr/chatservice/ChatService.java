package de.mullabfuhr.chatservice;

import de.mullabfuhr.chatservice.listeners.ChatListener;
import de.mullabfuhr.chatservice.listeners.JoinListener;

import de.mullabfuhr.chatservice.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class ChatService extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "CHAT-SERVICE ENABLED");
        listenerRegistration();
        commandRegistration();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "CHAT-SERVICE DISABLED");
    }

    public static String getPrefix(){
        return ChatColor.GOLD + "Chat-Service" + ChatColor.GRAY + " >> ";
    }

    private void listenerRegistration(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(), this);
        pm.registerEvents(new QuitListener(), this);
        pm.registerEvents(new ChatListener(), this);
    }

    private void commandRegistration(){
        PluginCommand chatCommand = getCommand("chat");
        if (chatCommand != null) {
            chatCommand.setExecutor(new ChatCommand());
        }
    }
}
