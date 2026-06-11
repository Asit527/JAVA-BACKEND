package com.kodewala.hashset;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> cityName = new HashSet<>();
		cityName.add("A");// 1
		cityName.add("B");// 2
		cityName.add("C");// 3
		cityName.add("D");// 4
		cityName.add("E");// 5
		cityName.add("F");// 6
		cityName.add("G");// 7
		cityName.add("H");// 8
		cityName.add("I");// 9
		cityName.add("J");// 10
		cityName.add("K");// 11
		cityName.add("l");// 12
		// 12 elements added
		
		
		cityName.add("M");// 13
		System.out.println(cityName);
		//13th element
		

	}
}
