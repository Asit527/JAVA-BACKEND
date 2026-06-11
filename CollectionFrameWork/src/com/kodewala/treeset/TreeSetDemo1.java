package com.kodewala.treeset;

import java.util.Set;
import java.util.TreeSet;
class Employee implements Comparable<Employee>{
	
	String name;
	public Employee(String name) {
		super();
		this.name=name;
	}

	@Override
	public int compareTo(Employee o) {
		int result=this.name.compareTo(o.name);
		System.out.println(result);
		// 0 or +ve or -ve
		
		  // result = o.name.compareTo(this.name);
			// for changeinh the order
		return result;
	}
	
}

public class TreeSetDemo1 {
	public static void main(String[] args) {
		Set<Employee>treeSet = new TreeSet<> ();
		//treeSet.add("Kodewala");
		//treeSet.add("Academy");
		// if put null we get nullpointerException
		
		treeSet.add(new Employee("Kodewala"));
		//System.out.println(treeSet);
		
	}

}
