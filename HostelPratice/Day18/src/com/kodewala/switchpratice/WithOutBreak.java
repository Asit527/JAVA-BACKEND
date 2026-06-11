package com.kodewala.switchpratice;

public class WithOutBreak { //fall-through concept

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("Sunday");
			
			
		case 2:
			System.out.println("Monday");
			

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wednesday");
			

		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;			

		default:
			System.out.println("Enter a valid number of day.");			
			break;
		}
		 

	}

}
