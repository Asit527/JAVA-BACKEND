package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map;

public class Driver2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-1, 2, 3, 4, 15, 7, 6, 3, 77);

//		find max
		Integer max = list.stream().max((a, b) -> a - b).get();
		System.out.println(max);

//		find min
		Integer min = list.stream().max((a, b) -> b - a).get();
		System.out.println(min);

//		Collectors.counting()

		long count = list.stream().collect(Collectors.counting());
		System.out.println(count);

//	    Collectors.partitioningBy((n->n%2==0))

		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0) );

		System.out.println(map);




	}

}
