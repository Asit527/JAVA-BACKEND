package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface IPowerCalculator {
    double calculatePower(double base, double exponent);
}
public class FindPower {
	static void computePower(int x,int y,IPowerCalculator obj1) {
		System.out.println(obj1.calculatePower(x, y));
	}
	public static void main(String[] args) {
		FindPower.computePower(2, 3,(x,y)->Math.pow(x, y));
		FindPower.computePower(2, 3,(y,x)->Math.pow(x, y));
	}

}
