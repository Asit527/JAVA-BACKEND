package com.kodewala.functionalinf;
//annn to make sure its functional interface so that no one have the confusion
@FunctionalInterface
interface IPay {
	public void pay(); // single abstract method interface( SAM Interface)
	
	// only one abstract method
	// interdouced in java 1.8
	// to use lamda function
	// it can conatain default or private or static methods(but only one abstract method)
	public default void collect() {
		
	}
	

}

public class Driver {

}
