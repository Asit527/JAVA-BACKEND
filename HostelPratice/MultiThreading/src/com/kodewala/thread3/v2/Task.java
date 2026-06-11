package com.kodewala.thread3.v2;

public class Task {
public  synchronized void printEven() {
for(int i=0;i<=20;i=i+2) {
	System.out.println(Thread.currentThread().getName());
	System.out.println("Task.printEven() :"+i);

}
}
public synchronized void printOdd() {
	for(int i=0;i<=20;i++) {
		if(i%2!=0) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Task.printOdd() : "+i);
		}
	}
}
}
