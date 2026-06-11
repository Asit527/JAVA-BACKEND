package com.kodewala.threads1;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Hello  -- this task is exicuted by:  "+Thread.currentThread().getName());
	}
}

public class ThreadsDemo {
	public static void main(String[] args) {
		System.out.println("Hii -- this task is exicuted by: "+Thread.currentThread().getName()); // main thread

		Thread t1 = new MyThread(); // main thread
		t1.start(); 	// t1 thread - (Thread-0)


		Thread t2 = new MyThread(); // main thread
		t2.start(); 	// t2 thread - (Thread-1)



	}

}


