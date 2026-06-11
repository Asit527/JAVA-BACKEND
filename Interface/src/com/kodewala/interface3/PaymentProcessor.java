package com.kodewala.interface3;

interface Payment {
	public void send();

	public void recive();

	public default void checkTxnLimit() { // backward compatibility
		databaseConnection();

	}

	public static void sendNotification() {

	}

	private void databaseConnection() { // to prevent code duplicacy inside interface

	}

}

class CreditCard implements Payment {
	@Override
	public void send() {
	}

	@Override
	public void recive() {
	}

	public void checkTxnLimit() {

	}
}

class UPI implements Payment {
	@Override
	public void send() {
	}

	@Override
	public void recive() {
	}
}

class PaymentProcessor {

}
