//Use the interface as a "Contract."
package com.kodewala.abstraction1;
interface Engine{
	void start(); // public by default
}
class ElectricCar implements Engine{
	public void start() {
		System.err.println("Silent start...");
	}
}

class GasolineCar implements Engine{
public void start() {
	System.err.println("Vroom! Engine roaring...");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		Engine obj1= new ElectricCar() ;
		obj1.start();
		Engine obj2= new GasolineCar() ;
		obj2.start();	
			
		

	}

}
