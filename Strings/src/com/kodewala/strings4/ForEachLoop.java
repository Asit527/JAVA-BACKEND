package com.kodewala.strings4;

public class ForEachLoop {

	public static void main(String[] args) {
		String str = "i am from ba  ngalore india";
		String arr[]=str.split(" ");
		System.out.println(arr.length);
		int length=0;
		for(String word:arr) {
			System.out.println(word);
			length=length+word.length();
			
		}
		System.out.println("length is: "+length);

	}

}
