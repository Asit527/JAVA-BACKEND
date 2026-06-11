package com.kodewala.polymorphism;

class CashPayment extends PaymentProcessor {
	@Override
	void pay() {
		System.out.println("Cash");
	}
}
