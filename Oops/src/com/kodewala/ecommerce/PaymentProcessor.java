package com.kodewala.ecommerce;
class CorePayment{
	void payment() {
		
	}
}

class CreditCard extends CorePayment{
	@Override
void payment() {
	System.out.println("Payment metod : Credit Card");
		
	}
}
class UPI extends CorePayment{
	@Override
void payment() {
	System.out.println("Payment metod : UPI");
	}
}
class Wallet extends CorePayment{
	@Override
void payment() {
		System.out.println("Payment metod : Wallet");	
	}
}



public class PaymentProcessor {
	public static void main(String[] args) {
		CorePayment obj1 = new CreditCard(); // credit card
		CorePayment obj2 = new UPI(); // upi
		CorePayment obj3 = new Wallet();// wallet
		obj1.payment();
		obj2.payment();
		obj3.payment();
		
		CorePayment obj4= new NewTypeOfPayment();
		obj4.payment();
	}
	
	

}

class NewTypeOfPayment extends CorePayment{ // new type of payment method
	@Override
void payment() {
		System.out.println("Payment metod : Other");
	}
}

