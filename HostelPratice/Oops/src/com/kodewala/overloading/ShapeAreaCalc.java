package com.kodewala.overloading;

public class ShapeAreaCalc {
	final static  double VALUE_PIE= 3.14159265359;
	
	void calculateArea(double length) {
		System.out.println("Area of circle "+(VALUE_PIE*(length*length)));
			
	}
	void calculateArea(int length,int width) {
		System.out.println("Area of rectangle "+(length*width));
			
	}
	void calculateArea(float length) {
		System.out.println("Area of square "+(length*length));
			
	}
	
	public static void main(String[] args) {
		ShapeAreaCalc obj1 = new ShapeAreaCalc();
		obj1.calculateArea(123);
		obj1.calculateArea(123,12);
		obj1.calculateArea(12);
		
		
	}
	
	

}
