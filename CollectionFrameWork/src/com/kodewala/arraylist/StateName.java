package com.kodewala.arraylist;

import java.util.ArrayList;

public class StateName {
	public static void main(String[] args) {

		// duplicates allowed
		// order is preserved
		// multiple null allowded
		// collection vs collections
		// default capacity -10
		// increased by 50 %

		ArrayList<String> name = new ArrayList<String>();
		name.add("a");
		name.add("b");
		name.add("c");
		name.add("c");
		name.add("a");
		name.add("b");
		name.add("c");
		name.add("c");
		name.add("a");
		name.add("b");
		
		// grow 50%
		// control + shift +t
		
		// capacity - total avaliablezie
		// size - total value we put
		name.add("cd");

		
		System.out.println(name);

	}
}
