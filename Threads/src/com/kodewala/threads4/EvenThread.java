package com.kodewala.threads4;

import com.kodewala.threads3.Task;

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
