package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithA {
	public static void main(String[] args) {
		List<String>words= Arrays.asList("Apple", "Banana", "Apricot");
		System.out.println(words.stream().filter(e->e.startsWith("A")).collect(Collectors.toList()));
	}

}
