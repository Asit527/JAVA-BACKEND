package com.kodewala.failfastfailsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	public static void main(String[] args) {
		List<String>names= new ArrayList<>();
		names.add("a");
		names.add("b");
		names.add("x");
		names.add("y");
		names.add("z");
		
		Iterator<String>name= names.iterator();
		while(name.hasNext()) {
			// can't add or remove (do modification at same time)
			names.remove(1);
			//java.util.ConcurrentModificationException
			// mod count should not different
			// mod count - modification count
			
			System.out.println(name.next());
		}
		
		
		
		
	}

}
