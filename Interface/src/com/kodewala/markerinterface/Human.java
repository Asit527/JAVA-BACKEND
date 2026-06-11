package com.kodewala.markerinterface;

public class Human   implements Copyable{
	String name;

	public Human(String name) {
		super();
		this.name = name;
	}
	
	

}

class Student extends Copy{
	public static void main(String[] args) {
		Human obj1 = new Human("Asit");
		
		 Copy.copyDocument(obj1);
		 
		 Copy c= new  Copy();
		 Copy.copyDocument(c);
		
		
	}
	
}
//3
