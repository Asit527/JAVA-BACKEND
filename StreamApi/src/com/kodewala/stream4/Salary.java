package com.kodewala.stream4;

import java.util.Arrays;
import java.util.List;

public class Salary {
public static void main(String[] args) {
	List<Integer>nums= Arrays.asList(1,2,3,5,4,6,8,7,7);

//	nums.stream().distinct().sorted().skip(2).limit(1).forEach(e->System.out.println(e));


	Integer high=nums.stream()
			.distinct()
			.sorted()
			.skip(2)
			.findFirst()
			.get();

	System.out.println("third highest: "+high);

}
}
