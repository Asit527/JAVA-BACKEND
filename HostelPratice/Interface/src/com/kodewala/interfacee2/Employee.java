package com.kodewala.interfacee2;

public interface Employee {
	public abstract void salary();

//	public static    void bonus() {
//
//	}

	public default void bonus() {

	}// backward compatibility
}

class FullTimeEmployee implements Employee {
	public void salary() {

	}
}
