package com.kodewala.inheritance1;

class Parent1 {
	int x = 10;

	void display() {
		System.out.println(x);
	}
}

public class Child1 extends Parent1 {
	int x = 20;
	public static void main(String[] args) {
		
		Parent1 p = new Child1();
		p.display();
//Variables use reference type, not object type. No polymorphism for
	   // variables.
	}

}
