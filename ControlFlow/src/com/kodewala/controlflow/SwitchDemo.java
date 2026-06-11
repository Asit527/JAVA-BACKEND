package com.kodewala.controlflow;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);
		switch (x) {
		case 1:
			 System.out.println("Pass");
			break;
		
		case 0:
			 System.out.println("fail");
			break;	

		default:
			System.out.println("Enter a  valid input");
			break;
		}

	}
	
}