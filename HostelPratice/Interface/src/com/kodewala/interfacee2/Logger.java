package com.kodewala.interfacee2;

public interface Logger{
	void log(String msg);
	default void logInfo(String msg) {
		System.out.println("--");
	}
}