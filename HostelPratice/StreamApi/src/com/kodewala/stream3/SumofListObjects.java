package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

class Employee{
	int salary;
	public Employee(int salary) {
		this.salary=salary;
	}
}
class It extends Employee{
	It(int salary){
		super(salary);
		
	}
	
}
public class SumofListObjects {
	public static void main(String[] args) {

		List<Employee>salaries= Arrays.asList(new It(1),new It(2),new It(3));
		System.out.println(salaries.stream().mapToInt(e->e.salary).sum());
		
		
	}

}
