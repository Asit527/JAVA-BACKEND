package com.kodewala.interfacee2;

public interface Validator {
	public   static  boolean isEmail(String email) {
		return email.contains("@");
		
	}
}
