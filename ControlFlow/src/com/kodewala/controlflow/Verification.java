package com.kodewala.controlflow;
import java.util.Scanner;

public class Verification {
	static int minAge=18;
	public static void main(String args[]) {
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter your age : ");
		int age= sc.nextInt();
		
		if(age>=minAge) {
			System.out.println("You are eligiable");
		}
		else {
			System.out.println("You are not eligiable");
		}

		
	}
		
}
