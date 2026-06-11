package com.kodewala.functionalinterfacee;

public class CheckPositiveorNegative {
	@FunctionalInterface
	interface ISignChecker {
		String checkSign(int number);

	}

	static void validateSign(int num, ISignChecker obj1) {
		System.out.println(obj1.checkSign(num));
	}

	public static void main(String[] args) {
		CheckPositiveorNegative.validateSign(20,x->x>0?"Positive":"Negative");
		// Call: validateSign(-10, (n) -> n > 0 ? "Positive" : "Negative")
		//?:  ternary operator
	}

}
