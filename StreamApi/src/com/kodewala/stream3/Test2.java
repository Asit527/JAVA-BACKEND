package com.kodewala.stream3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("banbagalore","delhi","banbagalore","hyderbad");
		Set<String> hashSet= new HashSet<>();
		// add() -- returns boolean
		names.stream().filter(e-> !hashSet.add(e)).forEach(e->System.out.println(e));
		
	}

}
