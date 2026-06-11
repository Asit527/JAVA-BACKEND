package com.kodewala.polymorphism;

class UPIPayment extends PaymentProcessor{
	@Override
	void pay() {
		System.out.println("UPI");
	}
}
