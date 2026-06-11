package com.kodewala.encapsulation1;

public class Employee {
final private int salary=200000;
public int getSalary() {
	return salary;
}
public static void main(String[] args) {
	Employee obj1= new Employee();
	System.out.println(obj1.salary);
}
}
