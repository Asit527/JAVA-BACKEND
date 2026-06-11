package com.kodewala.excephandling1;

import java.util.Scanner;

public class StudentGradeCalculator {
	int totalMarks = 0; // if i change data type from float to int the error resolves
	int totalStudents;
	float avrMarks;

	public static void main(String[] args) {
		StudentGradeCalculator obj1 = new StudentGradeCalculator();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter total marks : ");
			obj1.totalMarks = sc.nextInt();

			System.out.print("Enter total number of students : ");
			obj1.totalStudents = sc.nextInt();
			
			obj1.avrMarks= obj1.totalMarks/obj1.totalStudents;
			System.out.println("Avg marks : " +obj1.avrMarks);

		} catch (ArithmeticException e) {
			System.err.println("Enter valid student Numbers.");
		}

	}

}
