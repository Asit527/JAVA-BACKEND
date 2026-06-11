package com.kodewala.iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test3 {
	public static void main(String[] args) {
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("India", "New Delhi");
		treeMap.put("Afganisthan", "Kabul");
		treeMap.put("China", "Bejing");
		treeMap.put("Nepal", "Kathmandu");
		treeMap.put("Pakistan", "Islamabad");
		
		Set<Entry<String,String>> treeSet1= treeMap.entrySet();
		Iterator<Entry<String,String>> treeset2= treeSet1.iterator();
		while(treeset2.hasNext()) {
			Entry<String,String>treeSet3= treeset2.next();
			String country=treeSet3.getKey();
			String capital=treeSet3.getValue();
			System.out.println("Country: "+country+"\tCapital: "+capital);
			
			
		}
		
	}

}
