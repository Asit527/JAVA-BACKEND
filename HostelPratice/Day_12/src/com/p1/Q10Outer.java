package com.p1;

public class Q10Outer {

	public static void main(String[] args) {
		Q10Inner q=  new Q10Inner();
		q.printNum();
	}

}
class Q10Inner{
	private int x=10;
	public  void printNum() {
		System.out.println(x);
	}
	
}