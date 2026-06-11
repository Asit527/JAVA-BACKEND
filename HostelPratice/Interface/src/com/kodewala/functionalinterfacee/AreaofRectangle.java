package com.kodewala.functionalinterfacee;
interface IShapeCalculator{
	double IShapeCalculator(double length,double breadth);
}
public class AreaofRectangle {
	static void computeArea(double length,double breadth,IShapeCalculator ic) {
		System.out.println(ic.IShapeCalculator(length, breadth));
	}
	
	public static void main(String[] args) {
		computeArea(10.5,5.5,(length,breadth)->length*breadth);
		
	}

}
