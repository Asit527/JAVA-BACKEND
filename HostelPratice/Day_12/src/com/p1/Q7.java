package com.p1;

public class Q7 {
	public int age;
}
class Q7Inner {
	public static void main(String[]args) {
		Q7 q= new Q7();
		q.age=-100; // bad design bcz any one can change the value
		System.out.println(q.age);
	}
	
}