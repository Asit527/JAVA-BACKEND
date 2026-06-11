package com.kodewala.typecasting;
class Parent5{
	int x=5;
}

class Child5 extends Parent5{
	int x=7;
}
public class Main5 {

	public static void main(String[] args) {
		
		
		// in Java, polymorphism only applies to instance methods,
		// not to variables. This is called Field Hiding.
		
		
		Parent5  obj1 = (Parent5)new Child5();  // depend of ref type
		System.out.println(obj1.x); // parent value 🥲
		Child5 obj2= (Child5)obj1;  // depend of ref type
		System.out.println(obj2.x); // Child value 🥲
		
	}

}
