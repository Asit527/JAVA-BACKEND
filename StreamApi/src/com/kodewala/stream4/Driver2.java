package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {
	public static void main(String[] args) {
		String cities = "Bangalore";

		Map<Character, Long> cities1 = cities.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(cities1);

	}

}
