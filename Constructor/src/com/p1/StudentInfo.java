package com.p1;

public class StudentInfo {
	
	String fullName;
	int age;
	String qualification;
	
	StudentInfo(String fullName,int age ,String qualification){
		this.fullName=fullName;
		this.age=age;
		this.qualification=qualification;
	}

	public static void main(String[] args) {
	
		StudentInfo student1= new StudentInfo("Asit Kumar Nayak",22,"Btech");
	
		System.out.println("Student Name : "+student1.fullName+"\nAge : "+student1.age+"\nQualification : "+student1.qualification);
		
		//only one object created
	}

}
