package com.pratice;

class A17 {
    static { System.out.println("A"); }
}

class B17 extends A17 {
	
}

public class Q17 {
    public static void main(String[] args) {
        new B17();
    }
}

// A