package com.kodewala.interface1;


interface NationalBank{
	int MAX_LIMIT=100000;
	void payment();
	void stopChque();
	void cancelTxn();
	void changeLimit();
	
	}
class PNB implements NationalBank{
	int setLimit; // initialize through constructor
	PNB(int setLimit){
		this.setLimit=setLimit;
		}
	
	
	@Override
	public  void payment() {
		System.out.println("PNB Bank Payment");
	}
	@Override
	public void stopChque(){
		System.out.println("PNB Bank Stop Chque");
	}
	@Override
	public void cancelTxn(){
		System.out.println("PNB Bank Cancel Txn");
	}
	@Override
	public void changeLimit(){
		if(NationalBank.MAX_LIMIT>=setLimit) {
			System.out.println("PNB Bank New  Limit  : "+setLimit);
			
		}
	}
	}


class HDFC implements NationalBank{
	int setLimit; // initialize through constructor
	HDFC(int setLimit){
		this.setLimit=setLimit;
		
	}
	@Override
	public  void payment() {
		System.out.println("HDFC Bank Payment");
	}
	@Override
	public void stopChque(){
		System.out.println("HDFC Bank Stop Chque");
	}
	@Override
	public void cancelTxn(){
		System.out.println("HDFC Bank Cancel Txn");
	}
	@Override
	public void changeLimit(){
		if(NationalBank.MAX_LIMIT>=setLimit) {
			System.out.println("HDFC Bank New  Limit : "+setLimit);
			
		}
	}
	
}

class SBI implements NationalBank{
	int setLimit; // initialize through constructor
	SBI(int setLimit){
		this.setLimit=setLimit;
		
	}
	@Override
	public  void payment() {
		System.out.println("SBI Bank Payment");
	}
	@Override
	public void stopChque(){
		System.out.println("SBI Bank Stop Chque");
	}
	@Override
	public void cancelTxn(){
		System.out.println("SBI Bank Cancel Txn");
	}
	@Override
	public void changeLimit(){
		if(NationalBank.MAX_LIMIT>=setLimit) {
			System.out.println("SBI Bank New  Limit : "+setLimit);
			
		}
	}
}

public class PaymentProcessor {
	public static void main(String[] args) {
		NationalBank obj1= new HDFC(1000);
		obj1.changeLimit();
	}
	

}
