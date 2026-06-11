package com.kodewala.thread6.interthreadcomm;

public class Driver {
	public static void main(String[] args) {
		Task task = new Task();
		ProducerThread t1 = new ProducerThread(task);
		ConsumerThread t2 = new ConsumerThread(task);

		t1.start();
		t2.start();
	}

}
