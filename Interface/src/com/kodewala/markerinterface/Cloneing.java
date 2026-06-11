//		Cloneable
package com.kodewala.markerinterface;
class Animal implements Cloneable {
	String legs;
	Animal(String legs){
		this.legs=legs;
	}
	@Override
	public Object clone() throws CloneNotSupportedException  {
		return super.clone();
		
	}
}
public class Cloneing {

	public static void main(String[] args)  throws CloneNotSupportedException{
		Animal obj1 = new Animal("Dog");
		System.out.println(obj1.legs);
		Animal obj2 =(Animal) obj1.clone();
					//type casting
		System.out.println(obj2.legs);
	}

}



