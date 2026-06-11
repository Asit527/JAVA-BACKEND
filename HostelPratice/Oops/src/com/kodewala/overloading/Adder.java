package com.kodewala.overloading;

public class Adder {
	
	int add(int a , int b) {
		return a+b;
	}
	int add(int a , int b, int c ) {
		return a+b+c;
	}
	double add(double a , double b ) {
		return a+b;
	}
	
	
	
	
	public static void main(String[] args) {
		Adder obj1 = new Adder();
		System.out.println(obj1.add(1,2));
		System.out.println(obj1.add(1,2,3));
		System.out.println(obj1.add(1.5,2.7));
	}

}
