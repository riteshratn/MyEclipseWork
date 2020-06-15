package com.TimBuchulka;

public class EnhancedPlayer {
	private String name;
	private int health;
	private String weapon;
	public EnhancedPlayer(String name, int health, String weapon) {
		//super();
		this.name = name;
		if(health>=1&&health<=100) {
			this.health = health;	
		}
		this.weapon = weapon;
	}	
	public void looseHealth(int damage) {
		this.health=this.health-damage;
		if(this.health<=0) {
			System.out.println("player knocked out");
		}
	}
	public int getHealth() {
		return health;
	}

}
