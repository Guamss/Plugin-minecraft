package fr.guams.projetplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;


public class CommandBTD implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args)
    {
        Player player = (Player) sender;
        ItemStack blaze_btd = new ItemStack(Material.BLAZE_ROD);
        ItemMeta btdM = blaze_btd.getItemMeta();
        btdM.setDisplayName("§4Killer queen");
        btdM.setLore(Arrays.asList("Killer queen !", "Bite za dust !"));
        btdM.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        btdM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        blaze_btd.setItemMeta(btdM);

        player.setItemInHand(blaze_btd);

        return false;
    }
}
