package com.kodewala.inheritance1;

public class Animal {
	void sound() {}

}
class Dog extends Animal{
	void sound() {
		System.out.println("bark");
	}
	
}

class Cat extends Animal{
	void sound() {
		System.out.println("meow");
	}
	public static void main(String[] args) {
		Animal obj1= new Cat(); // i override the parent method so it calls 
		obj1.sound(); // runtime poly
		
	}
	
}