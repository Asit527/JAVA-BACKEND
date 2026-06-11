package com.kodewala.stream4;

import java.util.Map;
import java.util.stream.Collectors;

// find the frequency of each char in given string
public class Q1 {
	public static void main(String[] args) {
		String s= "Bangalore";

	Map<Character,Long> frequency=	s.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(n->n,Collectors.counting()));
	System.out.println(frequency);
	}

}
