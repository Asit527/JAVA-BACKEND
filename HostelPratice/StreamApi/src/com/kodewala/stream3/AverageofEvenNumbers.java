package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageofEvenNumbers {
	public static void main(String[] args) {
		List<Integer>nums= Arrays.asList(1, 3, 5, 7, 2,4, 13, 15, 17);
		
		int result=0;
		// even num colect
		List<Integer>evenNums=nums.stream().filter(e->e%2==0).collect(Collectors.toList());
		//if even num present
		if(evenNums.size()>0) {
			for(int element:evenNums) {
				result=result+element;
			}
			System.out.println(result/evenNums.size());
			
			}
		// if not present
		else {System.out.println(result);}
	}

}
