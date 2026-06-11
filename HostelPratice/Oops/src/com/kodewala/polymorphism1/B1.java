package com.kodewala.polymorphism1;
class A1{
	void show() {
		System.out.println("--");
	}
	
}
public class B1 extends A1 {
	
	public static void main(String[] args) {
	A1 obj1 = new B1();
	//obj1.show();
	B1 obj2 = (B1)obj1;
	obj2.show();
	

	}

}
