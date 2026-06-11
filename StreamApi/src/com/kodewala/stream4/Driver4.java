package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Driver4 {
	public static void main(String[] args) {
		List<String>cities=Arrays.asList("Hyderbad","Delhi","Bangalore","Indore","noida","Mysore","ggn");

	List<String>cities1=	cities.stream().sorted((a,b)->a.length()-b.length()).collect(Collectors.toList());

	System.out.println(cities1.stream().map(e->new StringBuilder(e).reverse()).collect(Collectors.toList()));
	}

}
