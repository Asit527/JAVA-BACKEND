package com.kodewala.controlflow;
import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter your number : ");
		int num=sc.nextInt();
		
		for(int counter=1;counter<11;counter++) {
			System.out.println(num+" X "+counter+" = "+(num*counter));
		}
		
	}

}
