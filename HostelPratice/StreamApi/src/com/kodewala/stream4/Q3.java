package com.kodewala.stream4;
// arrange by  string length
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
	public static void main(String[] args) {

	List<String> input= 	Arrays.asList("Hyderbad","Chennai","Bangalore","Bhubanesear");

	List<String>output= input.stream().sorted((a,b)->a.length()-b.length()).collect(Collectors.toList());
	System.out.println(output);


	}

}
