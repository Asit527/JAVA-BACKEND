package com.kodewala.encapsulation1;

public class GameCharacter {
	private int health=100;
	void takeDamage(int d){
		this.health=health-d;
	}

	public static void main(String[] args) {
		GameCharacter obj1= new GameCharacter();
		System.out.println(obj1.health);
		obj1.takeDamage(10);
		System.out.println(obj1.health);
		

	}

}
