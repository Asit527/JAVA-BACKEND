package com.kodewala.functionalinterfacee;

@FunctionalInterface
interface IStringOperation {
//	default void print(int x) {}
//	default void print(int x,int j) {}
	String doOperation(String str1, String str2);
}

public class StringConcatenation {
	public static void main(String[] args) {
		processString("Hello", "World", (s1, s2) -> s1 + " " + s2);
	}

	static void processString(String s1, String s2, IStringOperation o) {
		System.out.println(o.doOperation(s1, s2));
	}

}
