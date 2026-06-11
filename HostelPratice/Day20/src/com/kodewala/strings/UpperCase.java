package com.kodewala.strings;

public class UpperCase {

	public static void main(String[] args) {
		String s ="JaVa ProGraM";
		int uppercCase=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<95&&s.charAt(i)>65) {
				uppercCase++;
			}
		}
		System.out.println(uppercCase);
		
				

	}

}
//65 to 90 