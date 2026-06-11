package com.kodewala.strings4;

public class CharCount {

	public static void main(String[] args) {
		String s1 = "i am from bangalore india";
		int x = s1.length();
		for (int i = 0; i < x; i++) {
			if (s1.charAt(i) == ' ') {
				x--;
			}
		}
		System.out.println(x);

	}

}
