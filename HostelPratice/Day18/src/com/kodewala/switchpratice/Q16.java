package com.kodewala.switchpratice;
import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int passCount=0;
		
		while(true) {
			if(passCount>=3)break;
			System.out.print("Enter your password : ");
			int input=sc.nextInt();
			if(input!=1234) {
				passCount++;
			}
			
		}
		sc.close();

	}

}
