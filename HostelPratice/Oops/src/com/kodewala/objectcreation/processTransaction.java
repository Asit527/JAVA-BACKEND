package com.kodewala.objectcreation;

class Payment {
	public void pay() {
		System.out.println("Processing generic payment");
	}
	

}
class CreditCard extends Payment {
	@Override
	public void pay() {
		System.out.println("Paying with Credit Card");
	}
	
	
}

class PayPal extends Payment {
	@Override
	public void pay() {
		System.out.println("Paying with PayPal");
	}
	
}
public class processTransaction{
	static void processTransaction(Payment p) {
		p.pay();
	}
	public static void main(String[] args) {
		Payment p = new CreditCard();
		processTransaction(p);
		
	}
}

