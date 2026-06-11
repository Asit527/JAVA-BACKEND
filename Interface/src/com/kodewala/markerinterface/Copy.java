package com.kodewala.markerinterface;

public class Copy {
	public static  void copyDocument(Object o) {
		if (o instanceof Copyable)
			System.out.println("Copy allowed");
		else
			System.out.println("Copy not allowed");
		
	}

}
//2
