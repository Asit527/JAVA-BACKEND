package com.kodewala.threads5.reenteredlock;
import java.util.concurrent.locks.ReentrantLock;

class Task {
	ReentrantLock rl = new ReentrantLock(); // shared lock

	public void printEven() {

		rl.lock();
		System.out.println("Even Thread Aquires lock");

		for (int i = 0; i < 10; i++) {


			// we can give time limit
			if (i % 2 == 0) {


				System.out.println("Even : " + i);

			}


		}
		rl.unlock();



	}

	public void printOdd() {
		rl.lock();
		System.out.println("Odd Thread Aquires lock");


		for (int i = 0; i < 10; i++) {
			rl.lock();
			if (i % 2 != 0) {

				System.out.println("Odd : " + i);

			}

		}



	}
}
//				end task


class EvenThread extends Thread{
	Task task;
	public EvenThread(Task task) {
		this.task=task;

	}
	@Override
	public void run() {
		task.printEven();
	}
}

class OddThread extends Thread{
	Task task;
	public OddThread(Task task) {
		this.task=task;

	}
	@Override
	public void run() {
		task.printOdd();
	}
}


public class Driver1 {
	public static void main(String[] args) {
		Task shredTask= new Task();
		Thread t1 = new EvenThread(shredTask);
		Thread t2 = new OddThread(shredTask);

		t2.start(); // odd
		t1.start(); // Even



	}

}
