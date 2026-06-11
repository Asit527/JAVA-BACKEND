package com.p1;

public class Customer {
	String name, email;
	 Customer(String name,String email){
		this.name=name;
		this.email=email;
		System.out.println("Name : "+name+"\nEmail : "+email);
	}
	public static void main(String[] args) {
		Customer obj1= new Customer("Asit Kaumar Nayak","asitkumarnayak630@gmail.com");

	}

}
