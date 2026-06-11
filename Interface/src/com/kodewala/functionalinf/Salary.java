package com.kodewala.functionalinf;
@FunctionalInterface
interface Calculator{
	void calcSalary(int x);
	public  default void show() {
		System.out.println("showing salary");
	}
}
public class Salary {
	public static void main(String[] args) {
		Calculator obj1 = (int y)->{ // we can use differnt variable name without data type
			System.out.println("your salary is"+y);
			
		}; // semicolon bcz we are writing funcational interfaceimplmentation
		obj1.calcSalary(1000);
		obj1.show();
		//You did create an object.
		//The lambda created it for you.
		
		}
	

}
