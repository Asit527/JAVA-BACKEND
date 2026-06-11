package com.kodewala.thread3.v2;

public class PrintEven extends Thread {
	Task task;
	public PrintEven(Task task) {
this.task=task;
	}
	@Override
	public void run() {
task.printEven();
	}


}
