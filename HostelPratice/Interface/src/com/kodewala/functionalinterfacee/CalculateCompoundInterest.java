package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface ICompoundInterestCalculator {
    double calculateCompoundInterest(double principal, double rate, double time);
}
// Call: computeCompoundInterest(1000, 5, 2, (p, r, t) -> p * Math.pow((1 + r / 100), t) - p)
public class CalculateCompoundInterest {
static void computeCompoundInterest(double principal, double rate, double time,ICompoundInterestCalculator obj1) {
	System.out.println(obj1.calculateCompoundInterest(principal, rate, time));
	
}
public static void main(String[] args) {
	CalculateCompoundInterest.computeCompoundInterest(100, 10, 1, (p,t,r)->p * Math.pow((1 + r / 100), t) - p);
//	CalculateCompoundInterest.computeCompoundInterest(0100, 010, 01, (p,t,r)->p * Math.pow((1 + r / 100), t) - p);
}
}


//In Java, any number starting with 0 is treated as octal.
//0100  →  64  (in decimal)
//010   →  8   (in decimal)
//01    →  1   (in decimal)