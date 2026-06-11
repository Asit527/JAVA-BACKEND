package com.kodewala.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add1ToEach {
public static void main(String[] args) {
	List<Integer>nums= new ArrayList<>();
	nums.add(5);
	nums.add(10);
	nums.add(15);
	
	System.out.println(nums.stream().map(e->e+1).collect(Collectors.toList()));
}
}
