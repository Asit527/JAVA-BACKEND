package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveThinking {
	public static void main(String[] args) {
		List<Integer>nums= Arrays.asList(-10, 5, 0, 2);
		System.out.println(nums.stream().filter(e->e>0).collect(Collectors.toList()));
	}

}
