package com.kodewala.excephandling1;

import java.util.Scanner;

public class PizzaOrderQuantity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Quantity : ");
		String quantity= sc.next();
		int verifyQuantity;
		try {
			verifyQuantity = Integer.parseInt(quantity);
			
		}
		catch(NumberFormatException e) {
			System.err.println("Enter a  valid  Quantity");
		}
		
	}

}
