package com.kodewala.excephandling1;

import java.util.Scanner;

public class BankAccountTransfer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intrest = 0;
		System.out.print("Enter Transfer Amount : ");
		String transferAmount = sc.next();
		try {
			System.out.println("Transforable Amount : " + Integer.parseInt(transferAmount));
			
			System.out.println("your intrest Amount : " + 1000 / intrest);
			
		} catch (NumberFormatException e1) {
			System.err.println("trenferable Amount is not valid.");
			
		} catch (ArithmeticException e2) {
			System.err.println("Intrest can't be 0.");
		}
	}

}
