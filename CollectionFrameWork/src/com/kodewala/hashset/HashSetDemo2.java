package com.kodewala.hashset;

import java.util.HashSet;


class Employee{
	
	String name;
	public Employee(String name) {
		this.name=name;
	} 
	// Hardcoiding hashcode method
	@Override
	public int hashCode(){
		return 12;
		
	}
}
// added in 1.8
public class HashSetDemo2 {
	
	public static void main(String[] args) {
		HashSet<Employee>emp= new HashSet<>(128);
		
		Employee obj1 =new Employee("A");
		emp.add(obj1);
		Employee obj2 =new Employee("B");
		emp.add(obj2);
		Employee obj3 =new Employee("C");
		emp.add(obj3);
		Employee obj4 =new Employee("D");
		emp.add(obj4);
		Employee obj5 =new Employee("E");
		emp.add(obj5);
		Employee obj6 =new Employee("F");
		emp.add(obj6);
		
		
		
		
		
		emp.add(new Employee("G"));
		emp.add(new Employee("H"));
		
		emp.add(new Employee("I")); //9
		
		emp.remove(obj1);
		emp.remove(obj2);
		emp.remove(obj3);
		emp.remove(obj4);
		emp.remove(obj5);
		emp.remove(obj6);
		
		
		
		
		
		
	
		System.out.println(emp);
		
	
		
		
	}

}













