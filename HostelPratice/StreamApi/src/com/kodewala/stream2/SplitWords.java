package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitWords {
	public static void main(String[] args) {
		List<String> phrases = Arrays.asList("hello world", "goodbye moon");
		System.out.println(phrases.stream().flatMap(e->Arrays.stream(e.split(" "))).collect(Collectors.toList()));
	}

}
