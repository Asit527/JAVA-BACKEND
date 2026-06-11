package com.kodewala.overloading;

public class SmartPhone {
	//constructor overloading
	SmartPhone(String s){ // exact  match
		System.out.println("SmartPhone.SmartPhone(String s)");
	}
	SmartPhone(Object o){
		System.out.println("SmartPhone.SmartPhone(Object o)");
	}
	public static void main(String[] args) {
		SmartPhone obj1 = new SmartPhone('a'); 

	}

}
