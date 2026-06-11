package com.kodewala.abstrctclass;

interface Payment {
	default void pay() {
		validate();
		process();
	}

	private void validate() {
		System.out.println("Validating");
	}

	private void process() {
		System.out.println("Processing");
	}
}

public class Q3 implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment done");
	}

	public static void main(String[] args) {
		Payment obj1 = new Q3();
		obj1.pay();
	}

}
