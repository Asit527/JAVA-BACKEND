package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
	public static void main(String[] args) {
		List<String>word= Arrays.asList("hi","bye");
		System.out.println(word.stream().map(e->e.toUpperCase()).collect(Collectors.toList()));
	}

}
