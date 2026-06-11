package com.kodewala.interfacee;

interface Logger {
	void log(String msg);
}

class ConsoleLogger implements Logger{
	public void log(String msg) {
		System.out.println("ConsoleLogger");
	}
}

class FileLogger implements Logger{
	public void log(String msg) {
		System.out.println("FileLogger");
	}
}
public class CoreLogger{
	void anyLogger(Logger l) {
		
	}
	public static void main(String[] args) {
		
	}
}