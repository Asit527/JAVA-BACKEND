package com.kodewala.markerinterface;
class Account implements Cloneable{
	public String name;
	public Account(String name){
		this.name=name;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
public class Car {
	public static void main(String[] args) throws CloneNotSupportedException{
		Account acc1 = new Account("ABC");
		Account acc2 = (Account) acc1.clone();
		System.out.println(acc2.name);
	}

}
// first program of class
//cloning