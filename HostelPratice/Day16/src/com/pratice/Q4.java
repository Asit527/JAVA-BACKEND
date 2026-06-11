package com.pratice;

class A4 {
    A4() { System.out.println("A"); }
}

class B4 extends A4 {
    B4() {
        this(10);
        System.out.println("B-Default");
    }

    B4(int x) {
        System.out.println("B-Param");
    }
}

public class Q4 {
    public static void main(String[] args) {
        new B4();
    }
}

// A 
// B-Param
//B-Default