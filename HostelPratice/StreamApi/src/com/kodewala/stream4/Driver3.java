package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver3 {
	public static void main(String[] args) {
	List<String>name= 	Arrays.asList("a","b","c","d","E","ee");

	Map<Boolean,List<String>> map1= name.stream().collect(Collectors.partitioningBy(n->n.length()>1));
	System.out.println(map1);


	Map<Boolean, List<String>> map2= name.stream().collect(Collectors.partitioningBy(n->n.startsWith("a")));
	System.out.println(map2);




	}

}
