package com.kodewala.functionalinterfacee;

@FunctionalInterface
interface IDiscountCalculator {
	double calculateDiscount(double price, double discountPercent);
}

public class CalculateDiscount {
	static void computeDiscount(double price, double discountPercent, IDiscountCalculator obj1) {
		System.out.println(obj1.calculateDiscount(price, discountPercent));
	}

	public static void main(String[] args) {
		CalculateDiscount.computeDiscount(100, 10,(price,discount)->price-(price/100)*10);
	}

}
