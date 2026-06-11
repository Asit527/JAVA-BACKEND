
package com.pratice;
class A19 {
    A19() { System.out.println("A"); }
}

class B19 extends A19 {
    B19() {
        this(10);
        System.out.println("B1");
    }
    B19(int x) {
        System.out.println("B2");
    }
}

public class Q19 {
public static void main(String args) {
	
}
}


//Nothing