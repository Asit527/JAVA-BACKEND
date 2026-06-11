package com.kodewala.threads7.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String> {

	private int taskNo;

	public Task(int taskNo) {
		this.taskNo = taskNo;

	}

	@Override
	public String call() throws Exception {

		return "The task number "+taskNo+ " has been completed by "+Thread.currentThread().getName();
	}

}

public class Driver1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// create 10 fixed Threads


//		ExecutorService es= Executors.newFixedThreadPool(10);

		// jvm decide how many threads to create


		ExecutorService es= Executors.newCachedThreadPool();


		// only one thread will be created
//		ExecutorService es= Executors.newSingleThreadExecutor();




		for(int i=0;i<=1000;i++) { // 1000 task created
			Task task = new Task(i);
			Future<String> future= es.submit(task);
			String output= future.get();
			System.out.println(output);
		}
		es.shutdown();

	}

}
