package com.kodewala.encapsulation1;

public class ContactDetails {
	private String name="Amit";
	private int age=32;
	
	public void getDetails() { // getter method
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	

	public static void main(String[] args) {
		ContactDetails obj1 = new ContactDetails();
		
		obj1.getDetails(); // only read(anyone)
		
		// Can't access instance variable outside class
	}

}
