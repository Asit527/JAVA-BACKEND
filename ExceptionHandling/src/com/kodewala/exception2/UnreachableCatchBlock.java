package com.kodewala.exception2;

public class UnreachableCatchBlock {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}
	catch(Exception e) { // alreday caugtht here
		e.printStackTrace();
	}
//	catch(ArithmeticException e) {
//		e.printStackTrace();
//	}
	// unreachable
}
}

// we should maintain hirarchy
// child - first
// parent - last
