package com.kodewala.strings;

public class Q5 {

	public static void main(String[] args) {
		String s ="Education";
		int consonants=0;
		char c;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(!(c=='a'||c=='A'
			   ||c=='e'||c=='E'
			   ||c=='i'||c=='I'
			   ||c=='o'||c=='O'
			   ||c=='u'||c=='U'
			   )){
				consonants++;
				
				
			}
			
		}
System.out.println(consonants++);
	}

}
