package com.kodewala.iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test7 {
	public static void main(String[] args) {
		Map<Integer, String>treeMap= new TreeMap<>();
		treeMap.put(1, "ONE");
		treeMap.put(2, "TWO");
		treeMap.put(3, "THREE");
		treeMap.put(4, "FOUR");
		treeMap.put(5, "FIVE");
		Set<Entry<Integer,String>> entrySet1= treeMap.entrySet(); 
		// entrySet()
		Iterator<Entry<Integer,String>> entrySet2= entrySet1.iterator();
		
		while(entrySet2.hasNext()) {
			Entry<Integer,String>entrySet3=entrySet2.next();
			if(entrySet3.getKey()==3) {
				entrySet2.remove();
				
			}
			
			
				
			}
		}

		
		
	}
//wrong

