package com.kodewala.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class City {
	public static void main(String[] args) {
		List <String>cityName= new ArrayList<>();
		cityName.add("Bangalore");
		cityName.add("Chennai");
		cityName.add("Hyderbad");
		cityName.add("Delhi");
		
		
		//1- convert the collectio toString
		
	Stream<String> stream = cityName.stream();
		 
		//2-perfrom operation
		
		Stream<String> convertStream= cityName.stream().map(word->word.toUpperCase());
		
		
		// 3- collect the data
		
		List<String>output=convertStream.collect(Collectors.toList());
		System.out.println(output);
		
		
	}

}
