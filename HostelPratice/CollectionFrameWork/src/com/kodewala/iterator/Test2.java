//Q1.
//Create a TreeMap<Integer, String> with 5 entries and use an Iterator to print all keys only.


package com.kodewala.iterator;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		Map<Integer, String>student = new  TreeMap<>();
		
		student.put(1, "Asit");
		student.put(1, "Ajit");
		student.put(2, "Alok");
		student.put(3, null);
		
		
//		System.out.println(student);
		
		Set<Entry<Integer,String>> entrySet= student.entrySet();
		Iterator<Entry<Integer,String>>entryset1 = entrySet.iterator();
		while(entryset1.hasNext()) {
			Entry<Integer,String> itr2= entryset1.next();
			System.out.println(itr2.getKey()+" " +itr2.getValue());
			
		}
		
		
		
		
	}

}
