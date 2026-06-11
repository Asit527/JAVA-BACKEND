package com.p1;

public class CalculatePricee {
	private int totalPr;
	CalculatePricee( int quantity,int price ){
		this.totalPr=quantity*price;
	}
	

	public static void main(String[] args) {
		
		CalculatePricee obj1= new CalculatePricee(12,100);
		System.out.println("total price: "+obj1.totalPr);
		
	}

}
