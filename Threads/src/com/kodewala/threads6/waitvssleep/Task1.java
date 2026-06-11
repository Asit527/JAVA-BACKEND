package com.kodewala.threads6.waitvssleep;



public class Task1 {

	public synchronized void doSomething() throws InterruptedException {
		for (int i = 0; i < 10; i++) {

			System.out.println("Task1.doSomething(): "+Thread.currentThread().getName());
//			Thread.sleep(1000);
			wait(1000); // Object class 
			// if we remove synchronized the code will break and give Exception
		}

	}

}
