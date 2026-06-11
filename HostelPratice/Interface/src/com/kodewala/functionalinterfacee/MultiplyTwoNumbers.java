package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface IMultiplier {
    int doMultiply(int num1, int num2);
}

public class MultiplyTwoNumbers {
static void computeMultiply(int a ,int b,IMultiplier obj1) {
	System.out.println(obj1.doMultiply(a, b));
}
	public static void main(String[] args) {
		MultiplyTwoNumbers.computeMultiply(10,5,(num1,num2)->num1*num2);
		
	}

}
