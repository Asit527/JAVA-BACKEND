package com.kodewala.linkedlist;
class Employee{
	static int age;
	String firstName;
	String lastName;
	public Employee(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	@Override
	//present in Object class
	public boolean equals(Object obj) {
		Employee e2 = (Employee)obj;
		return this.firstName.equals(e2.firstName)&& this.lastName.equals(e2.lastName);
	}
	// if you are overriding equals() always override hashCode() as well bcz some time jvm assibn same hash code to two diifernt objects
	// this is called hash collision 
	// to avoid this we override hashCode()
	@Override
	public int hashCode() {
		return (this.firstName+this.lastName).hashCode();
	}
	
	
}

public class Comp {

	public static void main(String[] args) {
		Employee obj1 = new Employee("A","B");
		Employee obj2 = new Employee("A","B");
		
		
		System.out.println(obj1==obj2); // compare the contents
		System.out.println(obj1.equals(obj2)); // compare the reference
		
		System.out.println("hashcode for obj1 : "+ obj1.hashCode());
		System.out.println("hashcode for obj2 : "+ obj2.hashCode());
		
		
	}

}
