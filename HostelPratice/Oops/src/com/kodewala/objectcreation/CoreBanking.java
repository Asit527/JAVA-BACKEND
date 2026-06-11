package com.kodewala.objectcreation;

class BankAccount {
	void applyInterest() {

	}
}

class SavingsAccount extends BankAccount {
	@Override
	void applyInterest() {
		System.out.println("Adding 5% interest to balance");
	}
}

class CurrentAccount extends BankAccount {
	@Override
	void applyInterest() {
		System.out.println("No interest applied (Standard checking)");
	}
}

public class CoreBanking {
	static void performEndOfMonth(BankAccount account) { // meta space
		account.applyInterest();
	}

	public static void main(String[] args) {
		BankAccount obj1 = new SavingsAccount();
		obj1.applyInterest();
	}

}
