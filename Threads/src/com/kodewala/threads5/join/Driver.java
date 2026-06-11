package com.kodewala.threads5.join;

class Task extends Thread {
	@Override
	public void run() {
		try { System.out.println("Cooking of food started");
		Thread.currentThread().sleep(1000);
		System.out.println("Cooking ended");
		}
		catch ( InterruptedException e) {

		}
	}

}
public class Driver {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Waiter taking order");
		Thread.currentThread().setName("Waiter");

		Task t1= new Task();
			t1.start();
			t1.join();
			System.out.println("waiter serving oreder");

	}

}
