package com.kodewala.thread4.v2;

public class DeadlockDemo {

	// Two shared objects used as locks
	private static final Object LockA = new Object();
	private static final Object LockB = new Object();

	// Thread1
	static class ThreadA implements Runnable {
		@Override
		public void run() {

			// Step 1: Thread A picks up LockA (Key A)
			synchronized (LockA) {
				System.out.println("Thread A : Got LockA");

				// Step 2: Sleeps 100ms → gives Thread B time to pick up LockB
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				// Step 3: Now Thread A wants LockB too
				// BUT Thread B already holds LockB → WAITS HERE FOREVER
				System.out.println("Thread A : Waiting for LockB...");
				synchronized (LockB) {
					System.out.println("Thread A : Got both! (never prints)");
				}

			} // LockA is released only AFTER getting LockB → never happens
		}
	}

	// Thread2
	static class ThreadB implements Runnable {
		@Override
		public void run() {

			// Step 1: Thread B picks up LockB (Key B)
			synchronized (LockB) {
				System.out.println("Thread B : Got LockB");

				// Step 2: Sleeps 100ms → gives Thread A time to pick up LockA
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}

				// Step 3: Now Thread B wants LockA too
				// BUT Thread A already holds LockA → WAITS HERE FOREVER
				System.out.println("Thread B : Waiting for LockA...");
				synchronized (LockA) {
					System.out.println("Thread B : Got both! (never prints)");
				}

			} // LockB is released only AFTER getting LockA → never happens
		}
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadA(), "Thread-A");
		Thread t2 = new Thread(new ThreadB(), "Thread-B");

		t1.start(); // Thread A grabs LockA immediately
		t2.start(); // Thread B grabs LockB immediately

		// Program hangs here — both threads wait forever
		System.out.println("Main: both threads started (will hang now)");
	}
}