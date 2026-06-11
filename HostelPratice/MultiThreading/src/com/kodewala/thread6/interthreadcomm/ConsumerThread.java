package com.kodewala.thread6.interthreadcomm;

public class ConsumerThread extends Thread {
	 Task task;
	public ConsumerThread(Task task) {
		this.task=task;
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {

				task.consumer();

			} catch (InterruptedException e) {
				e.getStackTrace();
			}
		}

	}

}
