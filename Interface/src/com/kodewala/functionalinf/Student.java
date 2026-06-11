package com.kodewala.functionalinf;
@FunctionalInterface // not mandatory but i can use it
interface Show{
	void show(int marks);
}
public class Student {

	public static void main(String[] args) {
		Show obj1 = (x)->System.out.println("your marks: "+ x);
		obj1.show(100);

	}

}
