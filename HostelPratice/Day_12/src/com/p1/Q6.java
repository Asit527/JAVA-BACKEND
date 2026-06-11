package com.p1;

public class Q6 {
	private int age;// we can acess only inside class

}
class Q6Inner{
	public static void main(String[]args) {
		Q6 q = new Q6();
		System.out.println(q.age);
	}
}
