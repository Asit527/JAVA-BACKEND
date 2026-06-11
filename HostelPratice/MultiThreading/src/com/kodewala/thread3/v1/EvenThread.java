package com.kodewala.thread3.v1;

public class EvenThread extends Thread  {
	Task task;
	public EvenThread(Task task) {
		this.task=task;

	}

	@Override
	public void run() {
		task.printEven();


	}

}
