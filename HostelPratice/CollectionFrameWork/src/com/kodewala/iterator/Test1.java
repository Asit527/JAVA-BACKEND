
package com.kodewala.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		Set<Character> alphabets = new HashSet<>();
		alphabets.add('A');
		alphabets.add('Z');
		alphabets.add('B');
		alphabets.add('C');
		alphabets.add('D');
		
		// System.out.println(alphabets);
		
		Iterator<Character>alpha = alphabets.iterator();
		while(alpha.hasNext()) {
			System.out.println(alpha.next());
		}
		
	}

}
