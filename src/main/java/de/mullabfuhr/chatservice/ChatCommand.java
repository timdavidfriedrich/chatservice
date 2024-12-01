package de.mullabfuhr.chatservice;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ChatCommand implements CommandExecutor {

    @Override
    public boolean onCommand(
        @NotNull CommandSender sender,
        @NotNull Command command,
        @NotNull String label,
        String[] args
    ) {
        sender.sendMessage(ChatService.getPrefix() + "Success!");
        return true;
    }
}
