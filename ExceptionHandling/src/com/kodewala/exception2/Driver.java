package com.kodewala.exception2;

public class Driver {
public static void main(String[] args) {
	
	
	try {
		String name= args[0];
		name="Hari";
		System.out.println(name.length());
		
		
	}
	catch(ArrayIndexOutOfBoundsException e1){

		e1.printStackTrace();
	}
	catch(NullPointerException e2) {
		System.out.println("e2");
		e2.printStackTrace();
		
	}
}
}
