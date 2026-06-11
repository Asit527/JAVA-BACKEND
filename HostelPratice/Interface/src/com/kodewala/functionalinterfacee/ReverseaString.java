package com.kodewala.functionalinterfacee;

@FunctionalInterface
interface IStringReverser {
	String reverseString(String inputString);
}

public class ReverseaString {
	static void doReverse(String s, IStringReverser obj1) {
		System.out.println(obj1.reverseString(s));
	}

	public static void main(String[] args) {
		ReverseaString.doReverse("ASIT",(s)->new StringBuilder(s).reverse().toString());
		// () bracket for lambda expression
	}
}
