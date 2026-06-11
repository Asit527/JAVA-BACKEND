package com.kodewala.exception2;

public class ClassNotFound {
public static void main(String[] args) {
	try {
		Class.forName("com.kodewala.Driver11.java");
		// for class loading
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}

//checked exception - ClassNotFoundException