package com.p1;

public class Q8 {
private static int x=5;// cant be acessed form another class


}
class Q8Inner{
	public static void main(String[] args) {
		System.out.println(Q8.x);

	}
}