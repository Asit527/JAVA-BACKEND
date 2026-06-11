package com.kodewala.inheritance1;
class Parent2{
	Parent2 (){
		System.out.println("parent class constructor");
	}
}
public class Child2 extends Parent2 {
	Child2 (){
		super();
		System.out.println("child class constructor");
}

	public static void main(String[] args) {
		Child2 obj1 = new Child2();

	}

}
