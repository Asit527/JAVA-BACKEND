package com.kodewala.interfacee2;

public interface Vehicle {
	public abstract void start();//backward compatibility

	public default void stop() { // it is not mandatory to give implementation

	}
}
