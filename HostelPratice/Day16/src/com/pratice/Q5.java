package com.pratice;

class A5 {
    A5() { System.out.println("A"); }
}

class B5 extends A5 {
    B5() {
        super();
        System.out.println("B");
    }
}

public class Q5{
	public static void main(String[]args) {
		new B5();
		
	}
}
//A
//B