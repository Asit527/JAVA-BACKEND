package com.kodewala.excephandling1;
import java.util.Scanner;
public class FlightSeatSelector {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int availableSeats[]= {1,2,3,4,5,6};
		System.out.print("Eneter your prefered seat : ");
		int a = sc.nextInt();
		
		try {
			
				System.out.println("seat "+availableSeats[a-1]+" available.");
			
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("seat is not available");
		}
	}

}
