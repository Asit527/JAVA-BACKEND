package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongWords {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe");
		System.out.println(words.stream().filter(e->e.length()>3).collect(Collectors.toList()));

	}

}

//collect
// Collectors -- class