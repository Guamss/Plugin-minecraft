package fr.guams.projetplugin;

import fr.guams.projetplugin.commands.CommandBC;
import fr.guams.projetplugin.commands.CommandBTD;
import gnu.trove.impl.sync.TSynchronizedShortByteMap;
import org.bukkit.command.Command;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Le plugin est en marche");
        getCommand("alert").setExecutor(new CommandBC());
        getCommand("btd").setExecutor(new CommandBTD());
        getServer().getPluginManager().registerEvents((Listener) new EventKillerQueen(),this);
    }

    @Override
    public void onDisable() {
        System.out.println("Le plugin n'est plus en marche");
    }
}
