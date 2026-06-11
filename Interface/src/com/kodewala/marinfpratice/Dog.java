package com.kodewala.marinfpratice;
class Human{
	
}
class Animal implements Copyable {
	String name;
	String color;

	public Animal(String name, String color) {
		this.name= name;
		this.color=color;
		
	}
	
	public void copy(Object o) {
		Copy c= new Copy();
		c.copy(o);
	}
	

}

public class Dog {
	public static void main(String[] args) {
		Animal obj1 = new Animal("Cat", "Black");
		Human obj2 = new Human();
		obj1.copy(obj2);
		
	}
}
