package com.kodewala.abstrctclass;

interface Inf3 {
	default void log() {
	}
}

public class Q4 implements Inf3 {
// its not mandatory to implement default ()
// it is considered as instance method bcz it take part in object creation or method overriding	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
