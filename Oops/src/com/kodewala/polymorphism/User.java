package com.kodewala.polymorphism;

public class User {

	public static void main(String[] args) {
		PaymentProcessor obj1= new CCPayment(); 
		// parent can refer child object
		
		
		obj1.pay();
		// first check whether the parent class have pay() if not compile time error
		
		// second -- jvm will call the method on actual obj new CCPayment();
		
		
		
		PaymentProcessor obj2= new CashPayment();
		obj2.pay();
		
		
		PaymentProcessor obj3= new UPIPayment();
		obj3.pay();

	}

}
