package com.kodewala.polymorphism;

class CCPayment extends PaymentProcessor {
	@Override
	void pay() {
		System.out.println("credit card");
	}
}
