package com.kodewala.thread4.v1;

public class Task {
	public static void printEven() {

		for (int i = 0; i < 10; i = i + 2) {
			synchronized (Task.class) {
				System.out.println(i + " : " + Thread.currentThread().getName());
			}

		}

	}

	public static void printOdd() {

		for (int i = 0; i < 10; i++) {
			synchronized (Task.class) {
				if (i % 2 != 0)
					System.out.println(i + " : " + Thread.currentThread().getName());
			}
		}

	}

}
