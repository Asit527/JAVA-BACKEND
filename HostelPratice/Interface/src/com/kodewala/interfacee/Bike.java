package com.kodewala.interfacee;
interface Vechile{
	void start();
}
class Car implements Vechile {
	public void start() {
		System.out.println("Car starts");
	}
}

public class Bike implements Vechile {
	public void start() {
		System.out.println("Bike starts");
	}
	
public static void main(String[] args) {
	
}
}
