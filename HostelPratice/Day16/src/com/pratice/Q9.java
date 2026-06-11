package com.pratice;

class A9 {
    static { System.out.println("A-SIB"); }
    { System.out.println("A-IIB"); }
    A9() { System.out.println("A-Cons"); }
}

class B9 extends A9 {
    static { System.out.println("B-SIB"); }
    { System.out.println("B-IIB"); }
    B9() { System.out.println("B-Cons"); }
}

public class Q9 {
    public static void main(String[] args) {
        new B9();
    }
}
//A-sib
//b-sib

//a-iib
//a-cons



//b-iib
//b-cons