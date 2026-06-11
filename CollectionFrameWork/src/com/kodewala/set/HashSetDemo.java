package com.kodewala.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String>cityName= new HashSet<String>(16);
		// default  bucket capacity - 16
		// hash internally use map
		// resize at 75%
		cityName.add("BLR");
		cityName.add("CH");
		cityName.add("HYD");
		cityName.add("MUM");
		cityName.add("DEL");
		cityName.add("AHM");
		// XOR OR BITWISE AND
		
		
		cityName.add("AHM"); 
		//duplicates not allowed
		// only one null  allowed 
		// insertion order is not preserveed
		cityName.add(null); // go to first
		System.out.println(cityName);
		System.out.println("AHM".hashCode()); // O(1)
		// it do hashing and find where to search
		
		
		System.out.println(cityName.contains(""));
		
		
	}

}
