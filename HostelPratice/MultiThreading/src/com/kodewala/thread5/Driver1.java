package com.kodewala.thread5;

public class Driver1 {
public static void main(String[] args)  {
	Task1 task1 = new Task1("sipu");
EvenThread1 t1 = new EvenThread1(task1);
OddThread1 t2= new OddThread1(task1);
t2.start();
t1.start();


try {
	t1.join();

	t2.join();


} catch (InterruptedException e) {

	e.printStackTrace();
}
System.out.println("main end");


}
}
