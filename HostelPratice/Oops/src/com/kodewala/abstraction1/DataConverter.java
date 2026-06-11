package com.kodewala.abstraction1;
class Converter{
	void convert(int i) {	
		System.out.println(Integer.toString(i)); 
	}
	void convert(double d){
		
			System.out.println(Math.round(d));
		
	}
	void convert(String s){
		System.out.println(s.toUpperCase());
	}
}
public class DataConverter {
public static void main(String[] args) {
	
	Converter obj1 = new Converter();
	obj1.convert(12.4);
	obj1.convert(12.49);
	obj1.convert(12.5);
	obj1.convert(12.6);
	
	obj1.convert(12);
	
	obj1.convert("Asit");
	
	
}
}
