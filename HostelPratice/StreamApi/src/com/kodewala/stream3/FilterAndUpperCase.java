package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

public class FilterAndUpperCase {
	public static void main(String[] args) {
		List<String>cities=Arrays.asList("Hyderbad","Bhubaneswar","Bangalore");
		
	cities.stream()
	.filter(e->!e.startsWith("B"))
	.map(e->e.toUpperCase())
	.forEach(e->System.out.println(e));
		
	}

}
