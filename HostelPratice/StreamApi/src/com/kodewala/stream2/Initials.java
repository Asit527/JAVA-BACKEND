package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Initials {
	public static void main(String[] args) {
		List<String>names= Arrays.asList("John Doe", "Jane Smith");
		System.out.println(names.stream().map(e->e.toUpperCase().charAt(0)).collect(Collectors.toList()));
	}

}
