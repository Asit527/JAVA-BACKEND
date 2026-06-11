package com.kodewala.threads6.waitvssleep;

public class Thread1  extends Thread{
	private Task1 task1;
	public Thread1(Task1 task1) {
		this.task1=task1;
	}
public void run() {
		try {
			task1.doSomething();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
