//2. Square of Primes
//Given a list of integers, find the first 3 prime numbers and return a list of their squares.
//
//Key Tool: filter(), map(), limit()

package com.kodewala.stream3;

import java.util.Arrays;
import java.util.List;

public class SquareofPrimes {
	public static void main(String[] args) {
		List<Integer>nums= Arrays.asList(4, 6, 8, 9, 10,2, 3, 5, 7);
		nums.stream().filter(e->e.valueOf(1));
	}

}

