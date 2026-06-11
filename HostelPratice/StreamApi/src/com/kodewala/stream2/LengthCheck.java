package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthCheck {
public static void main(String[] args) {
	List<String>fruits= Arrays.asList("Apple","orange");
	System.out.println(fruits.stream().map(e->e.length()).collect(Collectors.toList()));
}
}
