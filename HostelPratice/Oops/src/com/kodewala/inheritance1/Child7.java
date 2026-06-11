package com.kodewala.inheritance1;
class Parent7{
	static void show() {
		System.out.println("parent method");
	}
}
public class Child7 extends Parent7 {
	static void show() {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		Parent7 obj1= new Child7();
		obj1.show();// parent method
		show();
		// Static methods use reference
	   // type (method hiding).
		

	}

}
