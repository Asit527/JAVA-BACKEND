package com.kodewala.threads1;
class Even extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i=i+2) {
			System.out.println(i+" : Even");
			System.out.println("");

		}
	}
}

class Odd extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2!=0) {
				System.out.println(i+" : odd");
				System.out.println("");
			}
		}
	}
}

public class Driver2 {
	public static void main(String[] args) {
		Thread t1 = new Even();
		t1.start();
		Thread t2 = new Odd();
		t2.start();

	}

}
