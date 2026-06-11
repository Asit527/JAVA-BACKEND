package com.kodewala.threads7.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Callable<String>{

	@Override
	public String call() throws Exception {

		System.out.println(Thread.currentThread().getName() );
		return "Hello from call()";
	}

}
public class Driver {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		MyThread task = new MyThread();
		Future<String> future = executorService.submit(task);
		String msg = future.get();
		System.out.println(msg);
		executorService.shutdown();

	}

}
