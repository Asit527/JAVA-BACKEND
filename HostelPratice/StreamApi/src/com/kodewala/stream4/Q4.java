package com.kodewala.stream4;
// reverse all words
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
public static void main(String[] args) {
	List<String> input= 	Arrays.asList("Hyderbad","Chennai","Bangalore","Bhubanesear");
	List<StringBuilder>output= input.stream().map(n->new StringBuilder(n).reverse()).collect(Collectors.toList());
	System.out.println(output);
}
}
