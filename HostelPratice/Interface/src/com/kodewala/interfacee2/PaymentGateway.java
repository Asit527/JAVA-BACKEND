package com.kodewala.interfacee2;

public interface PaymentGateway {
	public abstract void pay();

	public default void refund() {
		System.out.println("refunding...");
	}
}

class Razorpay implements PaymentGateway {
	@Override
	public void pay() {
		System.out.println("Paying...");
	}
	// code will not break without implementation of refund

}