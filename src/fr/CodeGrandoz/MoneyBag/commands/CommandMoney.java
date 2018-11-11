package fr.CodeGrandoz.MoneyBag.commands;

import org.bukkit.command.*;

import fr.CodeGrandoz.json.JSONReader;
import fr.CodeGrandoz.json.variables.Player;
import net.md_5.bungee.api.ChatColor;

public class CommandMoney implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("money")) {
			
			if(sender.hasPermission("MoneyBag.money")) {
				
				Player p = JSONReader.getPlayer(sender.getName());
				
				sender.sendMessage(ChatColor.YELLOW + "Vous avez: " + p.getMoney() + " $.");
			} else {
				
				 sender.sendMessage(ChatColor.DARK_RED + "[Permissions] " + ChatColor.RED + "Vous n'avez pas les permissions pour accedez à cette commande!");
			}
			return true;
		} else
			return false;
	}

}
