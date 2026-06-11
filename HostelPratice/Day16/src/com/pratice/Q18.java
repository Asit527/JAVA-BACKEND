package com.pratice;

class A18 {
    { System.out.println("A-IIB"); }
}

class B18 extends A18 {
    { System.out.println("B-IIB"); }
}

public class Q18 {
    public static void main(String[] args) {
        new B18();
    }
}

// A-iib
//B-iib