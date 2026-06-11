package com.kodewala.thread6.interthreadcomm;

public class ProducerThread  extends Thread{
	 Task task;
	public ProducerThread(Task task) {
		this.task=task;
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				sleep(1000);
				task.producer(i);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}


}
