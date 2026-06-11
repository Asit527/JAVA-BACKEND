package com.kodewala.switchpratice;

public class Q5 {

	public static void main(String[] args) {
		for(int i=1;i>0;i++) {// Infinite loop
			if(i%7==0) {
				System.out.print(i);
				break;
			}
		}
		
		System.out.println(" : found the number ");

	}

}
