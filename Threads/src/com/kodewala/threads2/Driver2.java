package com.kodewala.threads2;
class MyThread1 implements Runnable{

	@Override
	public void run() { // Running
		System.out.println("running");

	} // Dead

}
public class Driver2 {
	public static void main(String[] args) {
		MyThread1 myThread1= new MyThread1();
		Thread t1 = new Thread(myThread1); // New Thread creation
		t1.start(); // Runable

	}

}
