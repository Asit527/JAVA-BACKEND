package com.kodewala.encapsulation1;

public class Company {
	private int  employeeCount;
	void hireEmployee(int employee) {
		this.employeeCount=this.employeeCount+employee;
	}
	
	public static void main(String[] args) {
		Company obj1 = new Company();
		System.out.println(obj1.employeeCount);
		obj1.hireEmployee(19);
		System.out.println(obj1.employeeCount);
	}

}
