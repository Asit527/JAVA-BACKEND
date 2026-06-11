package com.kodewala.encapsulation1;

public class Atm {
	private int pin=1234;
	void verifyPin(int pin){
		if(this.pin==pin) {
			System.out.println("correct pin");
		}
		else {
			System.out.println("incorrect pin");
		}
	}

	public static void main(String[] args) {
		Atm obj1=new Atm();
		obj1.verifyPin(1234);
		

	}

}
