package com.kodewala.stream4;
// second highest
import java.util.Arrays;
import java.util.List;

public class Driver1 {
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(1,2,3,4,15,7,6,3,77);

		int high=list.stream()
				.distinct()
				.sorted((a,b)->b-a)
				.skip(1)
				.findFirst()
				.get();
		System.out.println(high);
	}

}
