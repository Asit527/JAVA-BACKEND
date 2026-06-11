package com.kodewala.hashset2;

import java.util.HashSet;
import java.util.Set;

class Employees{
	String name;
	public Employees(String name) {
		this.name=name;
	}
	// vvvvvvimp
	@Override
	public int hashCode(){
		return this.name.hashCode();
	}
	// vvvvvimp
	@Override
	public boolean  equals(Object obj) {
		
		Employees e1 =(Employees) obj;
		return this.name.equals(e1.name);
	}
}
public class HashSetDemo1 {
	public static void main(String[] args) {
		Set<Employees> hashSet= new HashSet<Employees>(); // highly flexiable
		Employees e1 = new Employees("deepak");
		Employees e2 = new Employees("deepak");
		hashSet.add(e1);
		System.out.println(e1.hashCode());
		hashSet.add(e2);
		System.out.println(e2.hashCode());
		System.out.println(hashSet.size()); // showing 2 but it must be 1
		
		
	}

}
// when we are creating coustm obj override hashCode() and equals(Object obj)
