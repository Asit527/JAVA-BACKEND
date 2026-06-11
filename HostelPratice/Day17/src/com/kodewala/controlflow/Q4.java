package com.kodewala.controlflow;

public class Q4 {
	public static void main(String[] args) {
		float grade=69.999f;
		if(grade>=90) {
			System.out.println("A");
			
		}
		else if(grade>=70 && grade <90) {
			System.out.println("B");
			
		}
		else if(grade>=50 && grade <70) {
			System.out.println("C");
			
		}
		else {
			System.out.println("Fail");
		}
		
	}
}
