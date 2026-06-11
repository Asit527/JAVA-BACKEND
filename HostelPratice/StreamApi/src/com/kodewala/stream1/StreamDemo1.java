package com.kodewala.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<String>river= new ArrayList<String>();
		river.add("BoaT");
		river.add("Fish");
		river.add("swimmer");
		
//		Stream<String>elemets= river.stream().map(t -> t.toUpperCase() );
		
		
		
//		List<String>river1 =elemets.collect(Collectors.toList());
		
		
		
		List <String>elemets= river.stream().map(t -> t.toUpperCase() ).collect(Collectors.toList());
		
		System.out.println(elemets);
		
	}

}
