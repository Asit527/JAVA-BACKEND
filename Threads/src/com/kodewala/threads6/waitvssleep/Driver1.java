package com.kodewala.threads6.waitvssleep;

public class Driver1 {
public static void main(String[] args) {
Task1 task1 = new Task1();
Thread1 t1= new Thread1(task1);
t1.start();

}



}
