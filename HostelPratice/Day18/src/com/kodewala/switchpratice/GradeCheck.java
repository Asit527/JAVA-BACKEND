package com.kodewala.switchpratice;

public class GradeCheck {
public 	GradeCheck(){
		super();
	}
public char grade(int marks) {
	char g=' ';
	if(marks>=90) {return g='A';}
	else if(marks>=90) {return g='B';}
	else if(marks>=70) {return g='C';}
	else if(marks>=60) {return g='D';}
	else if(marks<=50) {return g='F';}
	
	return g;
}
	public static void main(String[] args) {
		GradeCheck obj1 = new GradeCheck();
		char grade= obj1.grade(30);
		System.out.println(grade);

	}

}
