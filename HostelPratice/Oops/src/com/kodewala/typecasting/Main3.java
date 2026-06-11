package com.kodewala.typecasting;
class Animal3{
	void show() {
		System.out.println("Animal");
	}
}
class Dog3 extends Animal3{
	void bark() {
		System.out.println("barking");
	}
}

class Cat3 extends Animal3{
	void meow() {
		System.out.println("meow");
	}
}
public class Main3 {

	public static void main(String[] args) {
		Animal3 obj1 = new Cat3();
		
	if (obj1 instanceof Dog3) { // instance of
		Dog3 obj2= (Dog3)obj1;
		obj2.bark();
			
			
		}
	else {
		System.out.println("Safety Check: obj1 is not a Dog. Casting aborted to prevent crash.");
	}
	if(obj1 instanceof Cat3) {
		Cat3 obj3 =(Cat3) obj1;
		obj3.meow();
	}
		

	}

}
