package com.kodewala.abstraction1;

interface Toggleable {
	public void turnOn();

	public void turnOff();

}

class LightBulb implements Toggleable {
	public void turnOn() {
		System.out.println("LightBulb on");
	}

	public void turnOff() {
		System.out.println("LightBulb off");
	}
}

class Fan implements Toggleable {
	public void turnOn() {
		System.out.println("Fan on");
	}

	public void turnOff() {
		System.out.println("Fan off");
	}
}

class Television implements Toggleable {
	public void turnOn() {
		System.out.println("Television on");
	}

	public void turnOff() {
		System.out.println("Television off");
	}
}

public class Main {
	public static void main(String[] args) {
		Toggleable[] arr1 = { new LightBulb(), new Fan(), new Television() };
		for (Toggleable device : arr1) { // for each loop
			device.turnOn();
		}
		for (Toggleable device : arr1) { // for each loop
			device.turnOff();
		}
	}
}
