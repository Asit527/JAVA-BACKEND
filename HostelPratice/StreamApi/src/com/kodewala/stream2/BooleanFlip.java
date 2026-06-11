package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BooleanFlip {
	public static void main(String[] args) {
		List<Boolean> values = Arrays.asList(true, false, true);
		System.out.println(values.stream().map(e -> e = !e).collect(Collectors.toList()));

	}

}
