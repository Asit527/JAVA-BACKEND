package com.kodewala.abstraction1;
//abstraction
abstract class Payment{
	double amount; // get default value
	abstract void processPayment();
		
	
}
class CreditCard extends  Payment{

	@Override
	void processPayment() {
		System.out.println("Enter your card number: ");
		
	}
	
}
class Crypto extends Payment{
	@Override
	 void processPayment() {
		 System.out.println("Enter your wallet address");
	 }
}
public class CorePayment {

	public static void main(String[] args) {
		Payment obj1 = new CreditCard();
		Payment obj2 = new Crypto();
		
	
		
		obj1.processPayment();
		obj2.processPayment();
		System.out.println(obj1.amount);
		
		

	}

}
