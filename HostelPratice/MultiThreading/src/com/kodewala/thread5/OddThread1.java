package com.kodewala.thread5;

public class OddThread1 extends Thread {
	Task1 task1;

	public OddThread1(Task1 task1) {
		this.task1 = task1;

	}
	@Override
	public void run() {
		task1.printOdd();
	}
}
