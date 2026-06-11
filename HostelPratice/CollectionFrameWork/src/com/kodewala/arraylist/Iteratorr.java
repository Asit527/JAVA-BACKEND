package com.kodewala.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {

	public static void main(String[] args) {
		ArrayList<String> stateName= new ArrayList<>();
		stateName.add("Odisha");
		
		stateName.add("karnataka");
		

		System.out.println(stateName);
		
		Iterator<String> name = stateName.iterator();
		
		while(name.hasNext()){
			System.out.println(name.next());
		}
		
	

	}

}
