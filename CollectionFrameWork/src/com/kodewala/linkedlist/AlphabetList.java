package com.kodewala.linkedlist;

import java.util.LinkedList;

public class AlphabetList {
	public static void main(String[] args) {
		LinkedList<String> alpha = new LinkedList<>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");
		System.out.println(alpha);

		// insertion head and tail - O(1)
		// insertion middle - O(1) + O(n) for reaching
		// Random access - O(n)
		// no deafult capacity
		

		alpha.add(1, "B");
		System.out.println(alpha);

	}

}
