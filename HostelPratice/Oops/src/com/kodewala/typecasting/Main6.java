package com.kodewala.typecasting;
class Parent6{
	int x=5;
	static void whoAmI() {
		System.out.println("Parent");
	}
}

class Child6 extends Parent6{
	int x=7;
	
	static void whoAmI() {
		System.out.println("Child");
	}
}
public class Main6 {

	public static void main(String[] args) {
		
		
		// in Java, polymorphism only applies to instance methods,
		// not to variables. This is called Field Hiding.
		Parent6 obj1 = new Child6(); // static method depnds on ref type
		obj1.whoAmI();
		Child6 obj2= (Child6)obj1; // static method depnds on ref type
		obj2.whoAmI();
		
		
		
	}

}
