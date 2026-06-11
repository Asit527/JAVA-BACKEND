package com.kodewala.objectcreation;
class Cust{
	void show() {
		System.out.println("Cust");
	}
	
}
class GoldCust  extends Cust{ // is a relationship
	@Override
	void show() {
		System.out.println("GOld Cust");
	}

}
public class SilverCust {

	public static void main(String[] args) {
		Cust obj1= new GoldCust();// Auto up casting 
		// it always check if show() is present in parent class or not
		// parent reference , child object
		obj1.show();
	

	}

}
