package com.kodewala.interfacee;
interface Payment{
	void pay(double amount);
}

 class CreditCardPayment  implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("CreditCardPayment : "+amount);
		
	}
	 
}
public class UPIPayment  implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("UPI Payment : "+amount);
		
	}

	public static void main(String[] args) {
		Payment obj1 = new UPIPayment();
		Payment obj2 = new CreditCardPayment();
		obj1.pay(0);
		obj1.pay(2);
		

	}

}
