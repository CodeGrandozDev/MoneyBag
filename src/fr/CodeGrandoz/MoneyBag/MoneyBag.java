package fr.CodeGrandoz.MoneyBag;

import org.bukkit.plugin.java.JavaPlugin;

import fr.CodeGrandoz.MoneyBag.commands.CommandMoney;

public class MoneyBag extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		preInit();
		init();
	}
	
	@Override
	public void onDisable() {
		
		cleanUp();
	}
	
	private void preInit() {
		
		System.out.println("Le plugin MoneyBag s'initialise !");
	}
	
	private void init() {
		
		this.getCommand("money").setExecutor(new CommandMoney());
		
		System.out.println("Le plugin MoneyBag est initialiser !");
	}
	
	private void cleanUp() {
		
		try {
			
			System.out.println("Le plugin MoneyBag c'est bien éteint !");
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
