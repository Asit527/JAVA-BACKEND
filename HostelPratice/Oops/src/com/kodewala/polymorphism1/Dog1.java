package com.kodewala.polymorphism1;
class Animal1{
	public void sound() {
		System.out.println("Sound");
	}
}
class  Cat extends Animal1{
	@Override
	public void sound() {
		System.out.println("Meow");
	}
}
public class Dog1  extends Animal1{
	@Override
	public void sound() {
		System.out.println("Bark");}
	public void run() {
		System.out.println("Dog running");
	}
		public static void main(String[]args) {
			Animal1 [] animals= {new Cat(),new Dog1()};
			for(int i=0;i<animals.length;i++) {
				animals[i].sound();
			}
			Animal1 obj2 = new Dog1();
			obj2.run();
					
			
			
		}
	

}
