package com.kodewala.polymorphism3;

class Account {
	 void doTransfer(int amount) {

	}
}

class SavingsAccount extends Account {
	@Override
	public void doTransfer(int amount) { 
		System.out.println("intrest : " + (amount / 100) * 5);

	}
}

class CurrentAccount extends Account {
	@Override
	protected void doTransfer(int amount) {
		System.out.println("intrest : " + 0);
	}
}

public class Intrest {

	public static void main(String[] args) {
		Account obj1 = new CurrentAccount();// non static method
		Account obj2 = new SavingsAccount();// non static method
		obj1.doTransfer(100);
		obj2.doTransfer(100);

	}

}
//covarient return types