package com.kodewala.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<List<String>>cities= Arrays.asList(Arrays.asList("Bangalore","Chennai"),				Arrays.asList("Delhi","Hyderbad","Mumbai"),Arrays.asList("Jaipur"),
				Arrays.asList("Ahemdbad","Surat","Raipur"));
		List<String>citieesName= cities.stream().flatMap(list->list.stream()).filter(e->e.length()>7).collect(Collectors.toList());
		System.out.println(citieesName);
	}

}
