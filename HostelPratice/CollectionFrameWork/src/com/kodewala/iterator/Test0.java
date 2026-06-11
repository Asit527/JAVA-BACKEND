package com.kodewala.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test0  {
public static void main(String[] args) {
	List<String>cityName= new ArrayList<>();
	cityName.add("BLR");
	cityName.add("BBSR");
	cityName.add("DEL");
	
	Iterator<String>cityName1= cityName.iterator();
	while(cityName1.hasNext()) {
		System.out.print(cityName1.next()+" ");
	}
	
	
	
	// System.out.println(cityName);
	
}
}
