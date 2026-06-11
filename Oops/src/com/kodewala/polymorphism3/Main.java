package com.kodewala.polymorphism3;
class Parent{
	void show() {
		System.out.println("This is parent");
	}
}
class Child extends Parent{

	@Override
	void show() {
		
		System.out.println("This is child");
	}
	
}
public class Main {

	public static void main(String[] args) {
		Parent obj1 = new Child();
		obj1.show();
		

	}

}
