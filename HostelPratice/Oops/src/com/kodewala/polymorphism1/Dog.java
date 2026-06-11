package com.kodewala.polymorphism1;
class Animal{
	public void sound() {
		System.out.println("Animal class method");
	}
	public void eat() {
		System.out.println("eating");
	}
}
public class Dog  extends Animal{//is a 
	
public void sound() {
	System.out.println("Animal class method overloaded");
}
	public static void main(String[] args) {
		Animal obj1= new Dog();
		obj1.sound();
		obj1.eat();
		
		

	}

}
