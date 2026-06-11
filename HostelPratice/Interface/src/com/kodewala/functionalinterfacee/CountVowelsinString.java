package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface IVowelCounter {
    int countVowels(String inputString);
}
//getVowelCount("Hello World", (s) -> s.replaceAll("[^aeiouAEIOU]", "").length())
public class CountVowelsinString {
static void getVowelCount(String s ,IVowelCounter obj1) {
	System.out.println(obj1.countVowels(s));
}
public static void main(String[] args) {
	CountVowelsinString.getVowelCount("Hello World", (s)->s.replaceAll("[^aeiouAEIOU]", "").length());
	//^ means NOT
}
}
