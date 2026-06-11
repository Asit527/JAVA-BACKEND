package com.kodewala.threads3;

public class  Driver1 {
	public static void main(String[] args) {
		Task task1 = new Task();
		EvenThread t1= new EvenThread(task1);
		t1.setName("Even Thread");

		//Task task2 = new Task();
		OddThread t2= new OddThread(task1);
		t2.setName("Odd Thread");

		t1.start();
		t2.start();
	}

}
