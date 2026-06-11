package com.kodewala.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class StateName1 {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("a");
		name.add("b");
		name.add("c");
		name.add("d");
		
		name.add(0,"z");
		
		System.out.println(name);
		name.add(2,"z");
		System.out.println(name);
		name.remove(2);

		//---------------------itreator-----------
		
		Iterator <String> itr = name.iterator();
		System.out.println("using itreator");
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
			
		
		}
	}
}
