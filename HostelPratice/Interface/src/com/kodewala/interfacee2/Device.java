package com.kodewala.interfacee2;

public interface Device {
	 public abstract void Connect();
	  default void disconnect() {
		
	 }
	 
}

class Keyboard implements Device{
	@Override
	public  void Connect() {
		System.out.println("Keyboard Connected...");
	}
	public  void disconnect() {
		System.out.println("Keyboard Disconnected...");
	 }
	
}