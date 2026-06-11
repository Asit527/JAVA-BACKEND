package com.kodewala.switchpratice;
import java.util.Scanner;
public class SwitchCalculator {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("+ for addition"+ "\n- for substraction"+" \n* for multiplication\n"+ "\\ for division+\n" );
		String c =sc.next();
		switch (c) {
		case "+":
			System.out.println(a+b);
			break;
case "-":
	System.out.println(a-b);
			break;
case "*":
	System.out.println(a*b);
	break;
case "/":
	System.out.println(a/b);	
	break;

		default:
			System.out.println("invalid choice");
			break;
		}
		sc.close();
	}

}
