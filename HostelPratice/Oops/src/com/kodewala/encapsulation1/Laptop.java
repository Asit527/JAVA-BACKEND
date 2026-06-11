package com.kodewala.encapsulation1;

public class Laptop {
private boolean isOn;

public void turnOn() {
	isOn=true;
}

public void turnOff() {
	isOn=false;
}
public void status(){
	System.out.println(isOn);
}
public static void main(String[] args) {
	Laptop obj1= new Laptop();
	obj1.status();
	obj1.turnOn();
	obj1.status();
}

}
