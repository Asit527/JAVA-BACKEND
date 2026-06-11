package com.pratice;

class A8 {
    { System.out.println("A-IIB"); }
    A8() { System.out.println("A-Cons"); }
}

class B8 extends A8 {
    B8() { System.out.println("B-Cons"); }
}

public class Q8 {
    public static void main(String[] args) {
        new B8();
    }
}

//A-iib
//A-cons
//b-cons