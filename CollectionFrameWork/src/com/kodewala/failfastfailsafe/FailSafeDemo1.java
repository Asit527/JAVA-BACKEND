
package com.kodewala.failfastfailsafe;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo1 {
	public static void main(String[] args) {
		//List<String> names = new CopyOnWriteArrayList<>();
		List<String> names = new ArrayList<>();
		names.add("a");
		names.add("b");
		names.add("x");
		names.add("y");
		names.add("z");

	Iterator<String> name = names.iterator();
		
		while (name.hasNext()) {
			if (name.next().equals("z")) {
				
				name.remove();
			}
			

		}
		System.out.println(names);
		
		

	}

}
