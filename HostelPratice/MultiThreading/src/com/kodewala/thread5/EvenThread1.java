package com.kodewala.thread5;

public class EvenThread1 extends Thread {
	Task1 task1;
public EvenThread1(Task1 task1) {
	this.task1=task1;
}
@Override
public void run() {
	task1.printEven();
}

}
