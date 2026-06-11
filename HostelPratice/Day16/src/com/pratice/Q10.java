package com.pratice;


class A10 {
    A10() { System.out.println("A"); }
}

class B10 extends A10 {
    B10() {
        this(5);
    }
    B10(int x) {
        super();
        System.out.println("B");
    }
}

public class Q10 {

}

//nothing