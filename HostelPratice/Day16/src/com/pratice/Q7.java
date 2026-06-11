package com.pratice;

class A7 {
    static { System.out.println("A7"); }
    A7() { System.out.println("A7-Cons"); }
}

public class Q7 {
    public static void main(String[] args) {
        A7 a = null;
    }
}
// no A7 loading so no sib
