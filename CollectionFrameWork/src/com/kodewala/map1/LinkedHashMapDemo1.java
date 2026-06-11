package com.kodewala.map1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {
	public static void main(String[] args) {
		Map<Integer, Character> linkedHashMap= new LinkedHashMap<>();
		
		
		linkedHashMap.put(1, 'A');
		linkedHashMap.put(2, 'B');

		linkedHashMap.put(0, 'A'); // value updated
		linkedHashMap.put(1, 'B'); // value updated
		linkedHashMap.put(2, 'C'); // value updated
		
		
		System.out.println(linkedHashMap);
		
	}

}
