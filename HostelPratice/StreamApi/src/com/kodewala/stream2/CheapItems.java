package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheapItems {
	public static void main(String[] args) {
		List<Integer>price= Arrays.asList(100, 45, 10, 80);
		System.out.println(price.stream().filter(e->e<50).collect(Collectors.toList()));
	}

}
