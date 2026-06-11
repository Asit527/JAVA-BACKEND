package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityNameVerifier {
	public static void main(String[] args) {
		List<String> input = Arrays.asList("Bangalore", "Chennai", "Hyderbad", "Delhi", "Bombay", "Bhubaneswar");
		List<String> output = input.stream().filter(i -> i.length() > 7).map(j -> j.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(output);
	}

}
