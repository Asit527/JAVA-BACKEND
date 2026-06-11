package com.kodewala.abstrctclass;

interface Inf1{
	 default void m1() {
		 System.out.println("inf1");
	 }
}
interface Inf2{
	 default void m1() {
		 System.out.println("inf2");
	 }
}
class Main implements Inf1, Inf2 {
	
	@Override
	public void m1() {
		System.out.println("...");
		
	}

	public static void main(String[] args) {
		Main obj1 = new Main();
		obj1.m1();
		
	}
		
		

	}

// if there is two  default methods with same then we have to Override one
	


