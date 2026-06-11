package com.kodewala.inheritance1;

 class Parent  {
 private void  show(){
	System.out.println("this is parent method");
}
}
public class Child extends Parent{
	private  void  show(){
		System.out.println("this is child method"); // method hiding bcz parent method is private
	}
	public static void main(String[] args) {
		Child obj1 =new Child();
		obj1.show();
	}
	
}