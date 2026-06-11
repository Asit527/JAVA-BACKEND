package com.kodewala.functionalinterfacee;

@FunctionalInterface
interface ICircleCalculator {
	double computePerimeter(double radius);
}

public class CalculatePerimeterofCircle {
	final static double VALUE_PIE = 3.14159265359;

	public static void computePerimeter(double r, ICircleCalculator obj1) {
		System.out.println(obj1.computePerimeter( r));

	}

	public static void main(String[] args) {

		CalculatePerimeterofCircle.computePerimeter(2, (r) -> (2 * VALUE_PIE) * r);
	}

}
