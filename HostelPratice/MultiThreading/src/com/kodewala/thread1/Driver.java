package com.kodewala.thread1;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class Driver {
	public static void main(String[] args) {
		
		Thread t1= new MyThread();
		t1.start();
		System.out.println(Thread.currentThread().getName());

	}

}
