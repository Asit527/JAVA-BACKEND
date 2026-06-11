package com.kodewala.threads2;
class Task{
	public void performTask() {
		for(int i=0;i<10;i++) {
			System.out.println(i +" : this task is performed by - "+Thread.currentThread().getName());
		}
	}
}
class MyThread implements  Runnable {
	Task task;
	MyThread(Task task){
		this.task=task;
	}
	@Override
	public void run() {
		System.out.println("My thread Run:  "+Thread.currentThread().getName());
		task.performTask();

	}
}

public class Driver1 {
public static void main(String[] args) {
	Task task = new Task();
	MyThread myThread = new MyThread(task);
	Thread t1= new Thread(myThread);
	t1.start();
	
	 // t1.run();
	// no new thread created all work done by main Thread
	
	
	//t1.start();
	// java.lang.IllegalThreadStateException


	Thread t2= new Thread(myThread);
	 t2.start();
	

}
}
