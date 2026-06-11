package com.kodewala.stream4;



// first non repeting character
public class Q2 {
	public static void main(String[] args) {


		String input= "Hheeloo";
		char output=input.chars().mapToObj(n->(char)n).filter(n->input.indexOf(n)==input.lastIndexOf(n)).findFirst().get();
		System.out.println(output);
	}

}
