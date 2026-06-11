package com.pratice;

class A6 {
    static { System.out.println("A-SIB"); }// we are not using
}

class B6 extends A6 {
    static { System.out.println("B-SIB"); }// we are not using
}

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Main");
    }
}

//imp
//main