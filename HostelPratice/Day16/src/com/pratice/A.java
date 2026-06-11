package com.pratice;

public class A {
    static { System.out.println("A-SIB"); } // static runs once
    { System.out.println("A-IIB"); }
    A() { System.out.println("A-Cons"); }
}

 class Test {
    public static void main(String[] args) {
        new A();
        new A();
    }
}
