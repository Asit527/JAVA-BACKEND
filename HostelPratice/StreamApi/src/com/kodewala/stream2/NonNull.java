package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class NonNull {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, null, 3, null, 5);

		// by method reference (recommended)
		System.out.println(nums.stream().filter(Objects::nonNull).collect(Collectors.toList()));

		// by stram Api
		System.out.println(nums.stream().filter(e -> e != null).collect(Collectors.toList()));

	}
}
