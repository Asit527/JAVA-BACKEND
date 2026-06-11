package com.kodewala.polymorphism3;

class A {
	A show() {  // Return object of A
		return new A();
	}
}

class B extends A {
	@Override
	B show() {  // Return child of A
		return new B();
	}
}

class C extends A {

	@Override
	C show() { // Return child of A
		return new C();
	}
}

public class Covariant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// added in 1.5v -- imp
