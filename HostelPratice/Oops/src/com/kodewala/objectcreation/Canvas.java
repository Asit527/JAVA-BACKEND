package com.kodewala.objectcreation;
class Shape{
	void draw() {
		
	}
}

class Circle extends Shape{
	@Override
void draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape{
	@Override
void draw() {
		System.out.println("Rectangle");
	}
}


public class Canvas {
	static void  render(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		
		Shape s = new Circle();
		render( s) ;
	}

}
