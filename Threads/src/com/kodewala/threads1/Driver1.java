package com.kodewala.threads1;



class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}


public class Driver1 {
	public static void main(String[] args) {
		System.out.println("START OF MAIN");
		Thread t1 = new MyThread1();
		t1.start();
		Thread t2 = new MyThread1();
		t2.start();
		System.out.println("END OF MAIN");

	}

}
