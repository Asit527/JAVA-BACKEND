package com.kodewala.abstraction1;
 abstract class BankAccount{
	 
	 
	protected  double balance;
	protected void deposit(double amount){
		balance = balance+amount;
	}
	
	
	protected void getBalance() {
		System.out.println(balance);
	}
	
	protected abstract  void withdraw(double amount);
}
 //-----------
 class SavingsAccount extends BankAccount{
	 @Override
	 protected void withdraw(double amount) {
		 if (balance<=5000l) {
			 System.out.println("Minimum balance must be maintained");
		 }
	 }
 }
 class CheckingAccount extends BankAccount{
	 @Override
	 protected void withdraw(double amount) {
		 if(balance+(balance/100)*10<amount) {
			 System.out.println("overdraft allowed");
		 }
	 }
 }
public class PaymentProcessor {

	public static void main(String[] args) {
		
		BankAccount obj1 = new SavingsAccount();
		BankAccount obj2 = new CheckingAccount();
		
		obj1.deposit(10000);
		obj2.getBalance();
		obj2.withdraw(10000);

	}

}
