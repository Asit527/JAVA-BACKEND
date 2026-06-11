package com.kodewala.interfacee;
interface Shape{
	public void area() ;
		
	
}
public class Circle implements Shape {
	@Override
	public void area() {
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		 Shape []arr1= {new Circle(),new Rectangle()};
		 for(Shape o:arr1) {
			 o.area();
		 }
		 
	}

}

class Rectangle  implements Shape{
	@Override
	public void area() {
		System.out.println("Rectangle");
	}
	
}
