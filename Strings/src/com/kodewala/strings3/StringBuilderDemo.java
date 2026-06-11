package com.kodewala.strings3;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Kodewala ");// scp+ heap
		System.out.println(sb);

		sb.append("Academy"); // scp append changing the contents of string

		System.out.println(sb);
	}

}
