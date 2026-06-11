package com.kodewala.thread5;

public class Task1 {
String name;
public Task1(String name) {
	this.name=name;

}

		public  void printEven() {
			synchronized (this.name) {
				for(int i=0;i<10;i=i+2) {
					System.out.println(i);
				}

			}
		}

		public  void printOdd() {
			synchronized (this.name) {
				for(int i=0;i<10;i++) {

					if(i%2!=0) {
						System.out.println(i);
					}
				}
			}


		}

}
