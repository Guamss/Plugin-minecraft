package fr.guams.projetplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandBC implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args)
    {
        if(sender instanceof Player)
        {
            Player player = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("alert"))
            {
                if (args.length == 0)
                {
                    player.sendMessage(ChatColor.DARK_RED + "Il manque au moins un argument...");
                }
                if (args.length >= 1)
                {
                    StringBuilder broadcast = new StringBuilder();
                    for (String part : args)
                    {
                        broadcast.append(part + " ");
                    }
                    Bukkit.broadcastMessage("§c[Administrateur]" + " §e" + broadcast.toString());
                }
                return true;
            }
        }
        return false;
    }
}

