package com.kodewala.thread6.interthreadcomm;

public class Task {
	private int num;
	boolean isDataPresent = false;

	public  synchronized void producer(int num) throws InterruptedException {
		while (isDataPresent) {
			wait();
		}
		this.num = num;
		isDataPresent=true;
		System.out.println("data is produced: " + num);
		notify();

	}

	public synchronized void consumer() throws InterruptedException {
		while(!isDataPresent) {
			wait();

		}
		System.out.println("data is consumed: "+num);
		isDataPresent=false;
		notify();

	}

}
