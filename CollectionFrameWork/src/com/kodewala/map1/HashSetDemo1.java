package com.kodewala.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		// hashSet internally use HashMap
		// the value is used as key in hashmap
		// and value is a default common obj
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(0);
		System.out.println(hashSet);

		// key should be unique
		Map<Integer, Character> hashMap = new HashMap<>();
		hashMap.put(1, 'A');
		hashMap.put(2, 'B');

		hashMap.put(0, 'A'); // value updated
		hashMap.put(1, 'B'); // value updated
		hashMap.put(2, 'C'); // value updated

		System.out.println(hashMap);
	}
}
