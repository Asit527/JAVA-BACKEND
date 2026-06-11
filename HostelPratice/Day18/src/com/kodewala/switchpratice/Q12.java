package com.kodewala.switchpratice;

public class Q12 {
	public void menu(int value) {
		switch (value) {
		case 1:
			System.out.println("Add");
			break;
case 2:
			System.out.println("Subtract");
			break;
case 3:
	System.out.println("Exit");
	break;

		default:
			System.out.println("invalid");
			break;
		}
		
	}
	public static void main(String[] args) {
		Q12 obj1 = new Q12();
		obj1.menu(1);
		
	}

}
