package com.kodewala.threads3;

public class EvenThread extends Thread {
	Task task;

	public EvenThread(Task task) {

		this.task = task;
	}
	@Override
	public void run() {
		task.printEven();
	}


}
