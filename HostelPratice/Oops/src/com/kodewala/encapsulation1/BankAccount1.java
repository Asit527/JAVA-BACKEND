package com.kodewala.encapsulation1;

public class BankAccount1 {
	
	private int balance;
	 public void deposit(int depositBalance) {
		 balance=depositBalance;
		 
	 }
	 public void withdrwal(int amount) {
		 if(amount<=balance) {
			 balance=balance-amount;
			 
		 }
		 else {
			 System.out.println("in sufficent amount");
		 }
		 
	 }


	public static void main(String[] args) {
		BankAccount1 obj1= new BankAccount1();
		obj1.deposit(100);
		obj1.withdrwal(80);
		System.out.println(obj1.balance);

	
	
}
}
