package com.kodewala.polymorphism2;
class Parent1{
	void showMethodName() {
		System.out.println("Parent class method -1");
	}
}
class Child1 extends Parent1{
	@Override
	void showMethodName() {
		System.out.println("Child class method -1");
	}
	void showMethodName1() {
		System.out.println("Child class method -2");
	}
}
public class DownCasting {

	public static void main(String[] args) {
		Parent1 obj1 = new Child1();
		obj1.showMethodName();
	//	obj1.showMethodName1();
	
		Child1 obj2 =(Child1) obj1;
		obj2.showMethodName();
		obj2.showMethodName1();
		
		
		

	}

}
