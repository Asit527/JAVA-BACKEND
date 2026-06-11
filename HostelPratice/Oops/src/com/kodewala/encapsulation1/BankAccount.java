package com.kodewala.encapsulation1;

public class BankAccount {
	private int balance;
	 public void deposit(int depositBalance) {
		 balance=depositBalance;
		 
	 }

	public static void main(String[] args) {
		BankAccount obj1= new BankAccount();
		obj1.deposit(100);

	}

}
