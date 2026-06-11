package com.kodewala.objectcreation;

class GameCharacter{
	void attack() {
		
	}
}

class Warrior extends GameCharacter{
	@Override
void attack() {
		System.out.println("swings sword");
	}
}

class Wizard extends GameCharacter{
	@Override
void attack() {
		System.out.println("casts spell");
	}
}
public class BattleArena {
	static void performTurn(GameCharacter c) {
		c.attack();
	}
	public static void main(String[] args) {
		GameCharacter obj1= new Warrior();
		GameCharacter obj2= new Wizard();
		performTurn(obj1);
		performTurn(obj2);

	}

}
