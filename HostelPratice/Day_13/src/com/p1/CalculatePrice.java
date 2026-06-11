package com.p1;

public class CalculatePrice {
	int totalPr;
	CalculatePrice(int quantity,int price ){
		this.totalPr=quantity*price;
	}
	

	public static void main(String[] args) {
		
		CalculatePrice obj1= new CalculatePrice(12,99);
		System.out.println("total price: "+obj1.totalPr);
		
	}

}
