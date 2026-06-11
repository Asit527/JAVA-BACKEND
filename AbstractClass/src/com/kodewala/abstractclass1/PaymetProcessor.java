package com.kodewala.abstractclass1;
abstract class Payment{
	 abstract void send();
	 abstract void recive();
	 void notification() {
		 System.out.println("Sending Notofication...");
	 }
}

class UPI extends Payment{
	@Override
	void send() {
		System.out.println("Sending..");
		
	}
	@Override
	void recive() {
		System.out.println("Reciving..");
	}
	
}
public class PaymetProcessor {
	public static void main(String[] args) {
		Payment obj1 = new UPI();
		obj1.send();

	}
}

// we cant create obj for abstract class , we can call abstract class constructor through child class constructor by super()