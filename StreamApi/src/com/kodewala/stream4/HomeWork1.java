package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;

class Employee {
	 String name;
	 int salary;



	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;

	}
}

public class HomeWork1 {
	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee("Asit", 1), new Employee("Amit", 2), new Employee("Alok" , 4),
				new Employee("Alok", 3));

		Employee output = emp.stream().sorted((a,b)->b.salary-a.salary).skip(1).findFirst().get();

		System.out.println(output.salary+" "+output.name);
		}

	}


