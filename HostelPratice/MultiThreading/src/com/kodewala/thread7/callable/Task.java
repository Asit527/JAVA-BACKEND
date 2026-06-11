package com.kodewala.thread7.callable;

import java.util.concurrent.Callable;


public class Task implements Callable<String> {
	private int task;
	public Task(int task) {
		this.task=task;

	}
	@Override
	public String call() throws Exception {

		return "Task: "+ task +" is exicuted by : "+Thread.currentThread().getName();
	}

}
