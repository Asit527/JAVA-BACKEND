package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver4 {
	public static void main(String[] args) {

Map<Integer,List<String>> map	=		    Arrays.asList("Hyderbad","Chennai","Bangalore","Bhubanesear").stream().collect(Collectors.groupingBy(n->n.length()));
System.out.println(map);
	}

}
