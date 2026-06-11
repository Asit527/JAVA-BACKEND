package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvensOnly {
	public static void main(String[] args) {
		List<Integer>nums= Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(nums.stream().filter(e->e%2==0).collect(Collectors.toList()));
		
	}

}
