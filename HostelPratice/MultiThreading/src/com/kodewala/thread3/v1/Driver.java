package com.kodewala.thread3.v1;

public class Driver {
	public static void main(String[] args) {
		Task t = new Task();
		Thread t1 = new EvenThread(t);
		Thread t2 = new OddThread(t);
		t1.start();
		t2.start();
	}

}
