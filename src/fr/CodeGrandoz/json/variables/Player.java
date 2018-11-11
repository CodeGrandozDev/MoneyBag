package fr.CodeGrandoz.json.variables;

public class Player {
	
	private String pseudo;
	private int money;
	
	public Player(String pseudo, int money) {
		
		this.pseudo = pseudo;
		this.money = money;
	}
	
	public String getPseudo() {
		
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		
		this.pseudo = pseudo;
	}
	public int getMoney() {
		
		return money;
	}
	public void setMoney(int money) {
		
		this.money = money;
	}
}
