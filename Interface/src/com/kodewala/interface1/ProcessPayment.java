package com.kodewala.interface1;
interface Payment{
	//v1.8
	// variable + methods
	// only constants are supported
	
	int NUM=5;
	void pay();
}
class UPI implements Payment{
	@Override
	public void pay() {
		System.out.println("UPI");
	}
}
class CreditCard implements Payment{
	@Override
	public void pay() {
		System.out.println("Credit Card");
	}
}
public class ProcessPayment {
	public static void main(String[] args) {
		Payment obj1 = new CreditCard();
		Payment obj2 = new UPI();
		
		obj1.pay();
		obj2.pay();
		
		System.out.println(obj1.NUM+1); // this is taking the value and adding 1 not changing NUM
		System.out.println(obj1.NUM);
		
	}

}
