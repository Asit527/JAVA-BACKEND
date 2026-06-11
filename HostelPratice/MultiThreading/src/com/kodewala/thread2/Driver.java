package com.kodewala.thread2;
class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}
}

public class Driver {
	public static void main(String[] args) {
		MyThread t1 =  new MyThread();
		Thread t2= new Thread(t1);
		t2.start();
		System.out.println(Thread.currentThread().getName());

	}

}
