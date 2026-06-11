package com.p1;

public class Parent extends Object  {
	String  name;
	
	
	Parent(String  name){
		super(); // calls Object class no args constructor
		this.name=name;
		
		
	}
	Parent(){
		super();
	}

}
class Child extends Parent{
	String  name;
	int age;
	
	Child(String  name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	
	Child(){
		super();
		
	}
	
}
class GrandChild extends Child{
	String  name;
	int age;
	
	GrandChild(String  name,int age){
		super();
		this.name=name;
		this.age=age;
	}
		
	
	
	GrandChild(){
		super();
		
	}
public static void main(String[]args) {
	GrandChild obj1= new GrandChild();
	
}
	
	
}