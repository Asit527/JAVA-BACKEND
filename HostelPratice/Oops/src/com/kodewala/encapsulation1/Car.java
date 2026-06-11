package com.kodewala.encapsulation1;

public class Car {
	private int speed;
	public void accelerate(int speed) {
		this.speed =speed;
		System.out.println("Speed :  "+speed+" ");
		
	}
	public static void main(String[] args) {
		Car obj1= new Car();
		for(int i=0;i<300;i++) {
			obj1.accelerate(i);
		}
				
		
	}

}
