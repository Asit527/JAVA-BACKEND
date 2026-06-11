package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface IMinFinder {
    int findMinimum(int num1, int num2);
}

public class FindMinimum {
	static void getMinimum(int a ,int b,IMinFinder obj1) {
	System.out.println(obj1.findMinimum(a, b));	
		
	}
	public static void main(String[] args) {
		FindMinimum.getMinimum(2,1,(a,b)->{
			if(a>b) return b;
			else if(b>a) return a;
			else return -1;
			});
	}

}
