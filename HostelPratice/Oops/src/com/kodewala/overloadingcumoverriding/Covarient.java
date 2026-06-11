package com.kodewala.overloadingcumoverriding;
class Parent1{
	Object show() {
		return new Object();
	}
}

class Child1 extends Parent1{
	@Override
	String show() {
		return new String();
	}
}
public class Covarient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
// child class returning the same or child class object
// is called covarient return type
