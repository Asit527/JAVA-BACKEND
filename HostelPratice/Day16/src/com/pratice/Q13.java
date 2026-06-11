package com.pratice;

class A13 {
    { System.out.println("IIB-1"); }
    { System.out.println("IIB-2"); }
    A13() { System.out.println("Cons"); }
}



public class Q13 {

	public static void main(String[] args) {
		 new A13();

	}

}
// iib1
//iib2
//cons
