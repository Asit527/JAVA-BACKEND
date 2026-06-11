package com.kodewala.thread3.v1;

public class OddThread extends Thread {
	Task task;
	public OddThread(Task task) {
		this.task=task;
	}
	@Override
	public void run() {
		task.printOdd();

	}

}
