package com.kodewala.hashset2;

import java.util.HashSet;
import java.util.Set;

class Student{
	String name;
	public Student(String name){
		this.name=name;}
	@Override
	public int hashCode(){
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student obj1= (Student)obj;
		// down casting
		return this.name.equals(obj1.name);
	}
	
	
}
public class Rehashing {
public static void main(String[] args) {
	// less flexiable
//	HashSet<Student> hs1 = new HashSet<>(); 
	
	Set<Student> hs1 = new HashSet<Student>(); // highly flexiable
	
	hs1.add(new Student("A"));
	System.out.println(hs1.size());
	hs1.add(new Student("Z"));
	System.out.println(hs1.size());
	hs1.add(new Student("C"));
	System.out.println(hs1.size());
	hs1.add(new Student("D"));
	System.out.println(hs1.size());
	hs1.add(new Student("E"));
	System.out.println(hs1.size());
	hs1.add(new Student("F"));
	System.out.println(hs1.size());
	hs1.add(new Student("G"));
	System.out.println(hs1.size());
	hs1.add(new Student("H"));
	System.out.println(hs1.size());
	hs1.add(new Student("I"));
	System.out.println(hs1.size());
	hs1.add(new Student("JAJA1"));
	System.out.println(hs1.size());
	hs1.add(new Student("JAJA2"));
	System.out.println(hs1.size());
	hs1.add(new Student("JAJA4"));
	System.out.println(hs1.size());
	hs1.add(new Student("JAJA5"));
	System.out.println(hs1.size());
	hs1.add(new Student("JAJA6"));
	System.out.println(hs1.size());
	
	
	
	
}
}
