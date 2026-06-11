package com.kodewala.threads4;

import com.kodewala.threads3.Task;

public class OddThread extends Thread {
	Task task;

	public OddThread(Task task) {

		this.task = task;

	}
	@Override
	public void run() {
		task.printOdd();

	}

}
