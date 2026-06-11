//multilevel inheritance
package com.kodewala.typecasting;
class Grandparent9{
	void show() {
		System.out.println("grand parent");
	}
	
}

class Parent9 extends Grandparent9{
	void show() {
		System.out.println("parent");
	}
	
}	

class Child9 extends Parent9{
	void show() {
		System.out.println("child");
	}
	
}
public class Main9 { 

	public static void main(String[] args) {
		Grandparent9  obj1 = new Child9();// child or grandparent if static 
		obj1.show(); 
		Parent9 obj2 = (Parent9)obj1; //child or grandparent if static
		obj1.show();
		Child9 obj3 = (Child9) obj2; // child or grandparent if static
		obj1.show();
	

	}

}
