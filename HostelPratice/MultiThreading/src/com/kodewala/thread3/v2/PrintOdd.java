package com.kodewala.thread3.v2;

public class PrintOdd extends Thread{
	Task task;
	public PrintOdd(Task task) {
		this.task=task;
	}
	@Override
	public void run() {
		task.printOdd();

	}

}
