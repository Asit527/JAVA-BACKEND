package com.kodewala.polymorphism2;
class Employee{
	void doTask() {
		System.out.println("Employee class");
	}
}
class Mannager extends Employee{
	 @Override
	void doTask() {
		 System.out.println("Mannager class");
	}
}
public class Driver {

	public static void main(String[] args) {
		
		Employee obj1 = (Employee)new Mannager();
		obj1.doTask(); /// auto up casting
		
		// Mannager obj2 =(Mannager) new Employee();// class cast exception
		// obj2.doTask();// down casting
// child cant refer parent X
		
		Mannager obj3 = (Mannager)obj1; // here we can use downcasting
		
		obj3.doTask();
		
		
	}

}
