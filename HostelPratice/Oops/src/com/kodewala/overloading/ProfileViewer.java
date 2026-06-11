package com.kodewala.overloading;

public class ProfileViewer {
	void printInfo(String name) {// no of parameter matter
		System.out.println(name);
	}
void printInfo(String name , int age) { // type of parameters matter
		System.out.print(name+" ");
		System.out.println(age);
	}
void printInfo( int age ,String name ) { // order of parameters matter
	System.out.print(age+" ");
	System.out.println(name);
	
}
	
	public static void main(String[] args) {
		
		ProfileViewer obj1 = new ProfileViewer();
		obj1.printInfo("Asit");
		obj1.printInfo("Asit",22);
		obj1.printInfo(22,"Asit");
		
		

	}

}
