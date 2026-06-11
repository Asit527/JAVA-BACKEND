package com.pratice;

class A3 {
    { System.out.println("A-IIB"); }//first
    A3() { System.out.println("A-Cons"); }//second
}

class B3 extends A3 {
    { System.out.println("B-IIB"); }//3rd
    B3() { System.out.println("B-Cons"); }//last
}

public class Q3 {
    public static void main(String[] args) {
        new B3();
    }
}


// A-IIB
//A-Cons
//B-IIB
//B-CONS