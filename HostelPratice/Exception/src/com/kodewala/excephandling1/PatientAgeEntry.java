package com.kodewala.excephandling1;

import java.util.Scanner;

public class PatientAgeEntry {
	
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	System.out.print("Enter the patients Age: ");
	String age = sc.next();
	int age1;
	
	try {
		  age1= Integer.parseInt(age);

		
	}
	catch(NumberFormatException e) {
		System.err.println("Enter age is numbers");
		
		
	}
	
}

}
