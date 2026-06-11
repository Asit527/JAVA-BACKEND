package com.kodewala.encapsulation1;

public class Rectangle {
	
private int length;
private int width;
Rectangle(int length,int width){
	this.length=length;
	this.width=width;
}
public int area() {
	int area =this.length*this.width;
	return area;
	
}
public static void main(String[] args) {
	Rectangle obj1= new Rectangle(12,13);
	System.out.println(obj1.area());
}

}
