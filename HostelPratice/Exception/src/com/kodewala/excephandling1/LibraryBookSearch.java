package com.kodewala.excephandling1;

import java.util.Scanner;

public class LibraryBookSearch {
	public static void main(String[] args) {
		String books []= new String[10]; // 10 books from 0 -9
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter book index : ");
		int bookIndex = sc.nextInt();
		
		
		
		try {
			System.out.println(books[bookIndex]);
			System.out.println(books[bookIndex].toString());
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.err.println("Book is not prsent in database.");
			
		}
		catch(NullPointerException e2) {
			System.err.println("Book information not found.");
		}
		
	}

}
