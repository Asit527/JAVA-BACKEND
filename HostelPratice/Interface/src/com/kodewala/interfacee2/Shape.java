package com.kodewala.interfacee2;

public interface Shape {
	public abstract int  area() ; // must implement in child class
	public default void  printArea(){ // optional to override
		System.out.println("Area =");
	}
}
