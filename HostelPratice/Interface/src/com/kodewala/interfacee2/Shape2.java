package com.kodewala.interfacee2;

public interface Shape2 {
void area();
 static void print(String name,double area) {}
 default void display() {
	 print(null, 0);
 }
}
