package com.kodewala.markerinf;



  class Car extends Object implements Cloneable {
String brandName;

	public Car(String brandName) {
	super();
	this.brandName = brandName;
}

// this method belongs to object class
	//its proteced so can acess outside package only throuh subclass
@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}

class MarkerInterfaceTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car obj1 = new Car("BMW");
		System.out.println(obj1.brandName);
		Car obj2 = (Car) obj1.clone();
		System.out.println(obj2.brandName);
	}

}