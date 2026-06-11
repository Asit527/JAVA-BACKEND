package com.kodewala.typecasting;
class Vechile{
	
}
class Car extends Vechile{
	
}
public class Main1 {

	public static void main(String[] args) {
		
		Vechile obj1= new Car();
		Car obj2 = (Car)new Vechile(); // runtime error class cast exception
		

	}

}
