package com.kodewala.threads3;

public class Task {
public synchronized void printEven() {
	System.out.println("Even Start");
	for(int i=0;i<10;i++) {
		if(i%2==0) {
			System.out.println(i+" : print by "+Thread.currentThread().getName());
		}
	}
	System.out.println("Even End");
}

public synchronized void printOdd() {
	System.out.println("Odd Start");
	for(int i=0;i<10;i++) {
		if(i%2!=0) {
			System.out.println(i+" : print by "+Thread.currentThread().getName());
		}
}
	System.out.println("Odd End");
}}
