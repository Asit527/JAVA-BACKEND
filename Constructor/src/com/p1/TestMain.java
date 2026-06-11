package com.p1;

class Test{
	String firstName;
	String lastName;
	 int rollNo;
	
	Test(int rollNo){
		this.rollNo=rollNo;
	}
}

public class TestMain extends Test {

	TestMain(String firstName,String lastName){
		super(22);
		this.firstName=firstName;
		this.lastName=lastName;
		
		
		
	}
	public static void main(String[] args) {
		
		
		TestMain obj1= new TestMain("Asit", "Nayak");
		System.out.println(obj1.rollNo);
		

	}

}
