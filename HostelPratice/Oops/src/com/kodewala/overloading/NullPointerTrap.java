package com.kodewala.overloading;

public class NullPointerTrap {
void process(String s) {
	System.out.println("NullPointerTrap.process(String s)");
}
void process(Object o){
	System.out.println("NullPointerTrap.process(Object o)");
}
	public static void main(String []args) {
		
		NullPointerTrap obj1= new NullPointerTrap();
		obj1.process(null); // compiler choose exact match

	}

}
