package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleUp {
	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(1,2,3);
		List<Integer>numsModified=nums.stream().map(e->e*2).collect(Collectors.toList());
		System.out.println(numsModified);
	}

}
