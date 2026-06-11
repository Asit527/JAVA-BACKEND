package com.kodewala.thread3.v1;

public class Task {

	public synchronized void  printEven() {
		for (int i=0;i<10;i=i+2)
			System.out.println(i+" print by Even");

	}

	public synchronized void printOdd() {
		for (int i=0;i<10;i++)
			if(i%2!=0)
				System.out.println(i+" print by Odd");


	}

}
