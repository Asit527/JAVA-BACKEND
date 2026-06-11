package com.kodewala.interfacee2;

interface Payment {
public abstract void  pay(double amount);
public  default boolean  validateAmount(double amount) {
	return false;
}
}
