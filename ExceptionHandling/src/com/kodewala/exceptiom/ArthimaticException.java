package com.kodewala.exceptiom;

public class ArthimaticException {

	public static void main(String[] args) {
		String name= args[0];
		System.out.println();
		try {
			System.out.println(name); 
			//array index out of bound of 
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e ){
			System.err.println(e.toString());
		}

	}

}
