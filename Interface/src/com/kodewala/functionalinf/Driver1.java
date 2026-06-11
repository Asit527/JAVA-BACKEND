package com.kodewala.functionalinf;
@FunctionalInterface
interface ICalc{
public abstract int doCalculation(int x,int y); // keep an eye
} 

public class Driver1 {
	
public static void main(String[] args) {
	// support + ,-,/,*
	caculate(20,12,(i,j)->i-j); //caller willl decide
	
	
}
public static void caculate(int x, int y,ICalc calc) {
	System.out.println(calc.doCalculation(x,y));
}
}
