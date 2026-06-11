package com.kodewala.abstraction1;

abstract class Shape {
	final static double VALUE_PI = 3.141592653589793;

	abstract double calculateArea();

	abstract double calculatePerimeter();

	void draw() {
		System.out.println("Drawing shape");
	}

	void draw(String color) {
		System.out.println("Drawing " + color + " Shape");
	}

}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return (VALUE_PI * (radius * radius));
	}

	@Override
	double calculatePerimeter() {
		return 2 * (VALUE_PI * radius);
	}

}

class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {
		return length * width;
	}

	@Override
	double calculatePerimeter() {
		return 2 * (length + width);
	}

}

public class ShapeDrawing {

	public static void main(String[] args) {
		Shape obj1 = new Circle(4);
		Shape obj2 = new Rectangle(2, 3);

		System.out.println(obj1.calculateArea());
		System.out.println(obj1.calculatePerimeter());

		System.out.println(obj2.calculateArea());
		System.out.println(obj2.calculatePerimeter());

	}

}
