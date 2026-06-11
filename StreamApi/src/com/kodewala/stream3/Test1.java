package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	List<Integer>salaries=Arrays.asList(5,3,1,2,4,6,6);
	// second highest
	System.out.println(salaries.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().get());
}
}
