package com.kodewala.polymorphism1;
class Vechile{
	void show() {
		System.out.println("Vechile class");
	}
}
class Car extends Vechile{
	void show() {
		System.out.println("car class");
	}
}
public class ElectricCar extends Car {
	void show() {
		System.out.println("ElectricCar class");
	}

	public static void main(String[] args) {
		Vechile v = new ElectricCar();
		v.show();

	}

}
