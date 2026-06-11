package com.kodewala.iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Test4 {
public static void main(String[] args) {
	Map<Integer,String>treeMap= new TreeMap<Integer,String>();
	treeMap.put(2141014080, "Asit Kuamr Nayak");
	treeMap.put(2141014081, "Patik Piyush Nayak");
	treeMap.put(2141014079, "Asmita  Nayak");
//	System.out.println(treeMap);
	Set<Entry<Integer,String>>entrySet= treeMap.entrySet();
	Iterator<Entry<Integer,String>>entrySet1= entrySet.iterator();
	
	while(entrySet1.hasNext()) {
		Entry<Integer,String> entrySet3=entrySet1.next();
		System.out.println("Id: "+entrySet3.getKey()+" Name: "+entrySet3.getValue());
	}
	
}
}
