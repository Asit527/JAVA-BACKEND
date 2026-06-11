package com.kodewala.typecasting;
class Animal{
	
}
class Dog extends Animal{
	
}

class Cat extends Animal{
	
}
public class Main2 {

	public static void main(String[] args) {
		Animal obj1 = new Cat();
		Dog obj2 =(Dog) obj1; // class cast exception

	}

}
