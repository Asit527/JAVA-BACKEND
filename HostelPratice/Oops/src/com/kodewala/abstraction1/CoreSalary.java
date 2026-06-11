package com.kodewala.abstraction1;

abstract class Employee {
	String name;
	String id;

	final static int HOURLY_PRICE = 1000;
	int hoursWorked;

	Employee(String name, String id) {
		this.name = name;
		this.id = id;

	}

	abstract int calculateSalary();

}

class FullTimeEmployee extends Employee {

	FullTimeEmployee(String name, String id) {

		super(name, id);
	}

	int calculateSalary() {
		return 5000;

	}
}

class Contractor extends Employee {

	Contractor(String name, String id, int hoursWorked) {
		super(name, id);
		this.hoursWorked=hoursWorked;
		
	}

	int calculateSalary() {
		return this.hoursWorked * HOURLY_PRICE;

	}
}

public class CoreSalary {
	public static void main(String[] args) {

	}

}
