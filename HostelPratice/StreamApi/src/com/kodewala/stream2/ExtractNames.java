package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User {
	String name;

	User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

}

public class ExtractNames {
	public static void main(String[] args) {
		List<User> names = Arrays.asList(new User("Alice"), new User("Bob"));
		System.out.println(names.stream().map(e -> e.getName()).collect(Collectors.toList()));
	}

}

//User::getName 
//		vs 
//e->e.name 
//		vs
//e -> e.getName()
