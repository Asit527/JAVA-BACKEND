package com.kodewala.typecasting;
class Bird{
	void fly(){
		System.out.println("i can fly");
	}
}
class Pengiun extends Bird{
	@Override
	void fly(){
		System.out.println("i can't fly");
	}
}
public class Main10 {

	public static void main(String[] args) {
		Bird obj1 = (Bird)new Pengiun(); // call based on obj type for non static methods 
		obj1.fly();

	}

}
