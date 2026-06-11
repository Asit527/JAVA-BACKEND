package com.kodewala.markerinf;

interface Enterable {
	// marker interface
	// empty
}

class Employee implements Enterable {

}

class Visitor {

}

public class Gate {
	public static void allowAccess(Object o) {
		if (o instanceof Enterable)
			System.out.println("allowed");
		else
			System.out.println("not allowed");
	}

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Gate.allowAccess(obj1);
		Visitor obj2 = new Visitor();
		Gate.allowAccess(obj2);

	}

}
