package com.kodewala.objectcreation;
class Employee{
	final int FIXED_SALARY=8000;
	final int HOURLY_RATE=1000;
	
	public  void  calculateSalary() {
		
	}
}
class FullTimeEmployee extends Employee{// full time
	@Override
public  void  calculateSalary() {
		System.out.println(FIXED_SALARY);
	}
	
}
class Intern extends Employee{ //intern
	@Override
	public  void  calculateSalary() {
			System.out.println(HOURLY_RATE);
		}
}
public class PayrollProcessor{
	public static  void printSlip(Employee e) {
		e.calculateSalary();
	}
	public static void main(String[] args) {
		Employee obj1= new FullTimeEmployee();
		Employee obj2= new Intern();
		
		Employee arr1[]= new Employee[2];
		arr1[0]= obj1;
		arr1[1]=obj2;
		
		
		for(int i=0;i<arr1.length;i++) {
			printSlip(arr1[i]);
		}
		
	}

}
