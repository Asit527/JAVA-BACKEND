package com.kodewala.controlflow;

public class Discount {
	int mrp;
	
	//public void finalAmount(int mrp,int )
	

	public static void main(String[] args) {
	
		int discount=0;
			switch (args[0]) {
			case "Gold":
				discount=discount+10;
				break;

			case "Silver":
				discount=discount+5;
				break;
				
			case "Platinum":
				discount=discount+15;
				break;	

			default:
				
				break;
			}
			
			
			if(discount>0)
				System.out.println(discount);
			
			else System.out.println("No discount but we found a new type.");
	}
	

}
