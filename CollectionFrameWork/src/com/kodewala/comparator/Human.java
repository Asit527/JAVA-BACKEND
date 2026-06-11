package com.kodewala.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int age;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	
	

}

public class Human {
	public static void main(String[] args) {
		List<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(0,"Asit"));
		arrayList.add(new Student(3,"Jagdish"));
		arrayList.add(new Student(5,"Sujit"));
		arrayList.add(new Student(8,"Ajit"));
		
		Collections.sort(arrayList,new NameComparator());
		// what to sort , how to sort
		for(Student s1 :arrayList) {
		System.out.println(s1.age+" | "+s1.getName());}
		
		System.out.println("____________age sorting_______");
		Collections.sort(arrayList,new AgeComparator());
		// what to sort , how to sort
		for(Student s1 :arrayList) {
		System.out.println(s1.age+" | "+s1.getName());}

	}

}

