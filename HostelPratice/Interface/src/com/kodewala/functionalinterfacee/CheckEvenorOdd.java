package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface INumberChecker {
    boolean checkNumber(int number);
}
public class CheckEvenorOdd {
	static void validateNumber(int num,INumberChecker iN) {
		System.out.println(iN.checkNumber(num));
	}
	public static void main(String[] args) {
		CheckEvenorOdd.validateNumber(1, (i)->i%2==0);
		CheckEvenorOdd.validateNumber(2, (i)->i%2==0);
		
	}

}
