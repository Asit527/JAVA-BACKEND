package com.kodewala.markerinf;
interface Cacheable{}
class DatabaseConnection{}
class ImageThumb implements Cacheable{}
public class Cache {
	static void store(Object o) {
		if(o instanceof Cacheable)
			System.out.println("allowed");
		else
			System.out.println("not allowed");
	}
	public static void main(String[] args) {

		Cache.store(new DatabaseConnection()) ;
		Cache.store(new ImageThumb()) ;
		
	}
}
