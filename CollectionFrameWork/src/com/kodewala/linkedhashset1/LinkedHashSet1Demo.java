// LinkedHashSet
	// preserve order
	// and all other features is same as HashSet
package com.kodewala.linkedhashset1;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSet1Demo {
	public static void main(String[] args) {
		Set<String> linkedhs = new LinkedHashSet<String>();
		linkedhs.add("A");
		linkedhs.add("A");
		linkedhs.add("B");
		linkedhs.add("C");
		linkedhs.add("C");
		linkedhs.add(null);
		linkedhs.add(null);
		System.out.println(linkedhs);
		
		
		

	}
}
