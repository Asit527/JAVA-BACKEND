package com.kodewala.encapsulation1;

 class Q2 {
	private String name;
	private int age;
	Q2(String name,int age){super();
		this.name=name;
		this.age=age;
	}
	public void setName(String name,int age) {
		this.name=name;
		if(age>0) {this.age=age;}
		
	}
	public void getName() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}}
public class Student1{
public static void main(String[] args) {
	Q2 obj1= new Q2(null,0);
	obj1.setName("Asit",-22);
	obj1.getName();
	
	
	
}
}
