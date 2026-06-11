package com.kodewala.interfacee2;

public interface Payment2 {
void 	pay();
static void  validate(double amount) {}
default void safePay(double amount) {
	validate(amount);
	pay();
	
}
}
