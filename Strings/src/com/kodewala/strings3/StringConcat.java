package com.kodewala.strings3;

public class StringConcat {

	public static void main(String[] args) {

		String s1 = "Hello"; // one in scp

		String s2 = "World";// one in scp

		String s3 = s1 + s2; // one in heap (because it has some special kind of treatments over concat)

		String s4 = s3.intern(); // s3 is copied from heap and one object is created in scp
	}

}
