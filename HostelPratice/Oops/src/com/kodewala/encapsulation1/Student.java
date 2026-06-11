package com.kodewala.encapsulation1;

 class Q1 {
	private String name;
	private int age;
	Q1(String name,int age)
	{super();
		this.name=name;
		this.age=age;
	}
	public void setName(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void getName() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}}
public class Student{
public static void main(String[] args) {
	Q1 obj1= new Q1(null,0);
	obj1.setName("Asit",22);
	obj1.getName();
	
	
	
}
}
