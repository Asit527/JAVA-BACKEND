package com.kodewala.inheritance1;


class Animall extends Object{// parent
	public void bark(String sound) {
		System.out.println("cat makes sound: "+sound);
	}
private void walk(boolean b) {
		
	}
	
	
}



public class Cat  extends Animall{//child

	public static void main(String[] args) {
	Cat c = new Cat();// creating child class obj
	c.bark("meow"); 
	//c.walk(true);//cant acess because of private
	}

}
