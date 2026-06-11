package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface IComparator {
    int findMax(int num1, int num2);
}
public class FindMaximum {
public void getMax(int num1,int num2,IComparator ic ) {
	System.out.println(ic.findMax(num1,num2));
	
}
	public static void main(String[] args) {
		new FindMaximum().getMax(1,2,(a,b)-> a > b ? a : b);
		
		
	}

}
