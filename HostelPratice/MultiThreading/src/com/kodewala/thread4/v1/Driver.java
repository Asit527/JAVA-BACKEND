package com.kodewala.thread4.v1;

public class Driver {
public static void main(String[] args) {
	Task t= new Task();
	EvenThread t1 = new EvenThread(t);
	OddThread t2 = new OddThread(t);


	t1.start();
	t2.start();
}


}
