package fr.guams.projetplugin;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class EventKillerQueen implements Listener
{
    @EventHandler
    public void onInteract(PlayerInteractEvent event)
    {
        Player player = event.getPlayer();
        World world = player.getWorld();
        Action action = event.getAction();
        ItemStack it = event.getItem();

        if(it != null && it.getType() == Material.BLAZE_ROD && it.getItemMeta().getDisplayName().equals("§4Killer queen"))
        {
            if(action == Action.RIGHT_CLICK_BLOCK)
            {
                world.createExplosion(event.getClickedBlock().getLocation(), 15, false );
            }

        }

    }
}
