package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumCheck {
	public static void main(String[] args) {
		List<List<Integer>> nums = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
		List<Integer> numsEven = nums.stream().flatMap(e -> e.stream()).filter(f -> f % 2 == 0)
				.collect(Collectors.toList());

		System.out.println(numsEven);
	}

}
