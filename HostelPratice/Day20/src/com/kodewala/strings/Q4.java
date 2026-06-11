package com.kodewala.strings;

public class Q4 {

	public static void main(String[] args) {
		String s = "Education";
		int vowelCount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A') {
				vowelCount++;
			}
		
			else if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				vowelCount++;
			}

			else if(s.charAt(i)=='i'||s.charAt(i)=='I') {
				vowelCount++;
			}
			else if(s.charAt(i)=='o'||s.charAt(i)=='O') {
				vowelCount++;
			}
			else if(s.charAt(i)=='u'||s.charAt(i)=='U') {
				vowelCount++;
			}			
}
		System.out.println(vowelCount);
}}