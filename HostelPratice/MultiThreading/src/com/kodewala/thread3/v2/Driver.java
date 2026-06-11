package com.kodewala.thread3.v2;

public class Driver {
	public static void main(String[] args) {
		Task t = new Task();
		PrintEven t1 = new PrintEven(t);
		PrintOdd t2 = new PrintOdd(t);

		t2.start();
		t1.start();
	}

}
