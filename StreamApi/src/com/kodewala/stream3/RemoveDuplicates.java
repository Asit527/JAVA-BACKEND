package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("i", "am", "from", "Bangalore", "Bangalore");
		// remove dupicates
		words.stream().distinct().forEach(e -> System.out.println(e));

		// find the first element .findFirst()

		String output1 = words.stream().findFirst().get();
		System.out.println(output1);

		// skip element .skip(1) -- intermediate

		String output2 = words.stream().skip(1).findFirst().get();
		System.out.println(output1);

		System.out.println("--------------------------------");
		// limit
		words.stream().limit(2).forEach(e -> System.err.println(e));
		System.out.println("--------------------------------");

		// sort()

		words.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println("--------------------------------");

		//coustmSort
		
		words.stream().sorted((a,b)->a.length()-b.length()).forEach(e->System.err.println(e));
		
		
	}
}
