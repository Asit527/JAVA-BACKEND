package com.kodewala.thread7.callable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Driver {
public static void main(String[] args) throws Exception {



ExecutorService es =Executors.newCachedThreadPool();
try {
	for(int i=1;i<=1000;i++) {
		Task task = new Task(i);
		Future<String> future=es.submit(task);
		System.out.println(future.get());
	}

} catch (Exception e) {
	e.printStackTrace();
}

finally {
	es.shutdown();
}


}
}
