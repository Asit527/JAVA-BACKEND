package com.kodewala.polymorphism2;
class Parent{
	int x=5;
	void show() {
		System.out.println("Parent Class show()");
	}
}

class Child extends Parent{
	@Override
	void show() {
		System.out.println("Child Class show()");
	}
	void showw() {
		System.out.println("Child Class show1()");
	}
}
public class Casting {

	public static void main(String[] args) {
		Parent obj1 = new Child(); // auto up casting
		obj1.show();
		
		
		 // Child obj2 =(Child) new Parent();
		 //-- class cast exception
		
		
		Child obj3 = (Child)obj1; // down casting
		obj3.show();
		// downcasting is alowed if obj type was orginally the new refrered type
		
		
		Parent obj4 = new Child();
		obj4.show(); // compile time error

	}

}
