package com.kodewala.oops.abstraction;
interface IPayment{
	public abstract void pay() ;
	void cancelPay();
}
class Payment implements IPayment{
	@Override
	public void pay() { // overriding the implement
		 dbConect();// method calls in a order
		 validateUser();
		 checkBalance();
		 doTras();
	}
	public void cancelPay() {
		
	}
	// steps required to perform payment
	
	//1.connect to db
	private void dbConect(){ // using private so other can't access it 
		
	}
	
	//2. pin validation
	
	private void validateUser() {// make sure method is private
		
	}
	//3.Check Balance
	private void checkBalance() {
		
	}
	//4.do txn
	private void doTras() {
		
	}
	
	
	
	
}
public class PaymentProcesor {

	public static void main(String[] args) {
		Payment obj1= new Payment();
		obj1.pay();

	}

}
