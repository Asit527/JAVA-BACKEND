package com.kodewala.inheritance1;
class Vehicle{
	void show() {
		 int x=7;// object wont inherit datatype
		System.out.println("This is vechile method");
	}
}
class Car extends Vehicle{
	void show() {
		
		System.out.println("this is car method");
	}
	
}
public class ElectricCar {
	void show() {
		System.out.println("this is electriccar method");
	}

	public static void main(String[] args) {
		ElectricCar obj1= new ElectricCar();
		obj1.show();
		System.out.println(obj1.x);// x not found
		

	}

}
