package com.kodewala.controlflow;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	int luckyNumber =10;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your number: ");
	int userEntered=0;
	
	while(userEntered!=luckyNumber) {
		userEntered=sc.nextInt();
		if(luckyNumber!=userEntered) {
			System.out.println("Try Again");
		}
		
		
		
	}
	System.out.println("You Won");
	sc.close();
	

	}

}
