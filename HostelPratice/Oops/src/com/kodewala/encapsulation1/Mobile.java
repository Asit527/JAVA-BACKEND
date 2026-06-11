package com.kodewala.encapsulation1;

public class Mobile {
private int batteryCapacity;
public void usePhone(int batteryCapacity ) {
	this.batteryCapacity=batteryCapacity;
}

	public static void main(String[] args) {
		Mobile obj1= new Mobile();
		obj1.usePhone(20);
		System.out.println(obj1.batteryCapacity);

	}

}
