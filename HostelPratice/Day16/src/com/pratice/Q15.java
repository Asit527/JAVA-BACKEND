package com.pratice;



class A15 {
    A15() {
        this(10);
        System.out.println("Default");
    }
    A15(int x) {
        System.out.println("Param");
    }
}

public class Q15 {
    public static void main(String[] args) {
        new A15();
    }
}


// param
//default