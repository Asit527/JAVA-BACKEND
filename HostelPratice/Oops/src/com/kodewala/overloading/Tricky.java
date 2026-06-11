package com.kodewala.overloading;

public class Tricky {
	void sum(int []arr ) {
		System.out.println("array");	
		System.out.println(arr.length);
	}
void sum(String label,int... nums) {
 System.out.println("var agrs");	
		
	}

	public static void main(String[] args) {
	
		Tricky obj1 = new Tricky();
		obj1.sum(new int []{1,2,3});
		obj1.sum("number",1,2,3,3,4 );
	}

}
