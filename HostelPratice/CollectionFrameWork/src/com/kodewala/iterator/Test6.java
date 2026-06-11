package com.kodewala.iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test6 {
	public static void main(String[] args) {
		Map<String,Integer >treeMap= new TreeMap<String, Integer>();
		treeMap.put("Asit", 70);
		treeMap.put("Amit", 31);
		treeMap.put("Ajit",9 );
		treeMap.put("Alok",90 );
		treeMap.put("Aman",78 );
		
		Set<Entry<String,Integer>> entrySet1= treeMap.entrySet();
		Iterator<Entry<String,Integer>>entrySet2= entrySet1.iterator();
		
		while(entrySet2.hasNext()) {
			Entry<String,Integer>entrySet3=entrySet2.next();
			if(entrySet3.getValue()>=70) {
				System.out.println(entrySet3.getKey());
			}
		}
		
		
		
		
		
		
		 	
			
		
	}

}
