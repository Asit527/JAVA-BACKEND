package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(273, 1887, 1000, 2000, 200, 300, 3000, 4000);

		// .max() --max finding
		long output1 = nums.stream().max((a, b) -> a - b).get();
		System.out.println(output1);

		// .min() --min finding
		long output2 = nums.stream().min((a, b) -> a - b).get();
		System.out.println(output2);

		// collectors.counting()
		System.out.println(nums.stream().collect(Collectors.counting()));

		// collectors.partitionBy()

		Map<Boolean, List<Integer>> map = nums.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
		System.out.println(map);



		//groupBy() length
		List<String>cities=Arrays.asList("Hyderbad","Delhi","Bangalore","Indore","noida","Mysore","ggn");

	Map<Integer,List<String> >cities1=	cities.stream().collect(Collectors.groupingBy(w->w.length()));
	System.err.println(cities1);

	//groupBy() length

//	cities.stream().collect(Collectors.groupingBy(w->w.))

	}

}

// // .get - optional
