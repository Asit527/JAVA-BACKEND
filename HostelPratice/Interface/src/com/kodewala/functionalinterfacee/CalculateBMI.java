package com.kodewala.functionalinterfacee;
@FunctionalInterface
interface BMI{
	double calculate(double weightKG,double heightMeter);
}
public class CalculateBMI {
	static void calBMI(double weightKG,double heightMeter,BMI obj1) {
		System.out.println(obj1.calculate(weightKG, heightMeter));
	}
	public static void main(String[] args) {
		CalculateBMI.calBMI(55,5.5,(x,y)->x/(Math.pow(y, 2)));
	}

}
