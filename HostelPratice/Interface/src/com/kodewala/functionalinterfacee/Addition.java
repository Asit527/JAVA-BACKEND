package com.kodewala.functionalinterfacee;
//@FunctionalInterface
interface ICalculator{
	 int doCalculation(int num1, int num2); 
	 // abstract method
}
public class Addition {
	public static void compute(int x ,int y ,ICalculator calc ) {
		System.out.println(calc.doCalculation(x, y));
		
	}
	public static void main(String[] args) {
		compute(1,2,(num1,num2)->num1+num2);
		
	}

}
