package com.kodewala.functionalinterfacee;

@FunctionalInterface
interface IArmstrongChecker {
	boolean checkArmstrong(int number);
}

public class CheckArmstrongNumber {
	static void validateArmstrong(int number, IArmstrongChecker obj1) {
		System.out.println(obj1.checkArmstrong(number));

	}

	public static void main(String[] args) {
		CheckArmstrongNumber.validateArmstrong(153, (n) -> {
			int sum = 0, temp = n;
			while (temp != 0) {
				int digit = temp % 10;
				sum += digit * digit * digit;
				temp /= 10;
			}
			return sum == n;
		});

	}
}
// 0mis Armstrong number
//153
//Total digits = 3
//
//1³ + 5³ + 3³
//= 1 + 125 + 27
//= 153 ✅ Armstrong!