package com.kodewala.thread4.v2;

class Task{
	public final static Task lock1= new Task();
	public final static 	Task lock2= new Task();
}
class Thread1 extends Thread{
	@Override
	public void run() {
			synchronized (Task.lock1) {
				System.out.println("Thread1 : lock1");
				try {

					Thread.currentThread().sleep(1000);

				} catch (InterruptedException e) {
					System.out.println(e.getStackTrace());

				}
				System.out.println("Thread1  : Waiting... for lock2");

				synchronized (Task.lock2) {
					System.out.println("Thread1 : lock2");
				}
			}
	}

}
class Thread2 extends Thread{
	@Override
public void run() {
		synchronized (Task.lock2) {
			System.out.println("Thread2 : lock2");
			try {

				Thread.currentThread().sleep(1000);

			} catch (InterruptedException e) {
				System.out.println(e.getStackTrace());

			}
			System.out.println("Thread2  : Waiting... for lock1");

			synchronized (Task.lock1) {
				System.out.println("Thread2 : lock1");
			}
		}
}


	}

public class Driver1 {
	public static void main(String[] args) {
		Thread t1= new Thread1();
		Thread t2= new Thread2();

		t1.start();
		t2.start();


	}

}
