package com.kodewala.objectcreation;

public class Animal {
public void makeSound() {
	// Generic class
}
public  static void hearSound(Animal a) {
	a.makeSound();
}
public static void main(String[] args) {
	Animal obj1 = new Lion();
	Animal obj2 = new Duck();
	Animal []arr= {obj1,obj2};
	for(int i=0;i<arr.length;i++) {
		arr[i].makeSound(); // imp
		
	}
	
	
}


}



class Lion extends Animal{
	@Override
	public void makeSound() {
		System.out.println("roars");
	}
}

class Duck extends Animal{
	@Override
	public void makeSound() {
		System.out.println("quacks");
		
	}
	
}