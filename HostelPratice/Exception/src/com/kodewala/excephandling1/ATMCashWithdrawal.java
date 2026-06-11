package com.kodewala.excephandling1;
import java.util.Scanner;
public class ATMCashWithdrawal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Amount: ");
		String withdrawAmount=sc.next();
		try {
			int amount = Integer.parseInt(withdrawAmount);
			
		}
		catch(NumberFormatException e){
			System.err.println("enter Withdral Amount in Numbers: ");
		}
		System.out.println("-------");
		
	}

}
