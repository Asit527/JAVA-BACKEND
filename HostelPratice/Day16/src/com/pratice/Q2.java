package com.pratice;

class Q2 {
    static { System.out.println("A-SIB"); }   // sib
    
    Q2() { System.out.println("A-Cons"); }
}

class B extends Q2 {
    static { System.out.println("B-SIB"); }
    B() { System.out.println("B-Cons"); }
}

 class Test1 {
    public static void main(String[] args) {
        new B();
    }
}

 // A-SIB
 //	B-SIB
 // A-CONS
 //B-CONS
 