package com.kodewala.objectcreation;

public class Vehicle {
void service() {
	
}

static void  inspect(Vehicle v) {
	v.service();
}
public static void main(String[] args) {
	inspect(new Car()); // Anonymous Object Creation.
	inspect(new Motorcycle()); // Anonymous Object Creation.
}

}


class Car extends Vehicle{
	@Override
	void service() {
		System.out.println("Changing 4 tires");
		
	}
}
class Motorcycle extends Vehicle{
	@Override
	void service() {
		System.out.println("Lubricating chain");
		
	}
}