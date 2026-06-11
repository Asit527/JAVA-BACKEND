package com.kodewala.exception3;

public class Finally {
	double devide(int a, int b){
		try {
			return a/b;
		}
		catch(ArithmeticException e) {
			System.err.println("b cant be 0");
		}
		finally {
			return (a/b)+100; // override result
		}
		// finally always override 
	}
	public static void main(String[] args) {
		
		Finally obj1 = new Finally();
		System.out.println(obj1.devide(1, 1));
	}

}
